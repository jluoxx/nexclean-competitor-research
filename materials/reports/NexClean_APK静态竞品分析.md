# NexClean Screen：APK 静态竞品分析

分析日期：2026-11-13（北京时间）｜包名 `com.nexclean.junkclean.phoneclean`｜1.3.5（10305）

## 先看结论

**这个样本的商业化核心是“清理工具 + Launcher 桌面 + 通知召回”，广告被嵌入首次体验、日常工具操作与桌面负一屏。** 仅按包名把它理解成垃圾清理器，会漏掉默认桌面引导、负一屏广告和桌面内浮层这些重要机制。此结论来自 APK 实现，不代表已验证商店转化或实际留存。[E01：AndroidManifest.xml:206](../sources/AndroidManifest.xml)

| 要回答的问题 | 静态结论 | 证据边界 |
|---|---|---|
| 怎么赚钱 | 已追到插屏、开屏场景广告、原生及横幅展示/回退；SDK聚合与业务分数选择并存 | 展示调用不等于曝光；无法推算收入、平台份额 |
| 买量和自然用户有区别吗 | 多处以 `force_attr || channel_id != -1` 决定能否走广告/通知分支 | 未知归因状态也可能落在 -1；远端可覆盖，不能二分所有用户 |
| 能远控什么 | 强制归因、负一屏广告开关和间隔、桌面提示、桌面浮层及部分通知参数 | 已追客户端读写和消费者；没有当前线上快照 |
| 怎么让用户回来 | 默认桌面、负一屏工具、开机/更新恢复、系统通知和桌面内浮层、点击回工具 | 送达、后台存活与实际回流未实测 |
| 是否订阅/奖励解锁 | 未在此次DEX类定义审计中命中 BillingClient；未建立业务层订阅/金币/奖励到账链 | 不排除Web支付、动态代码或未覆盖路径 |
| 监控了什么 | 安装归因、campaign/channel、工具/桌面漏斗、默认桌面状态；业务初始化有GAID/token/随机设备ID等字段 | 代码组装/SDK事件调用不等于服务端已接收 |

本报告按用户最新要求只完成静态研究。此前已从设备提取完整安装分包；设备断开后未继续连接、启动或修改手机。没有录屏、交互截图、广告曝光回调或抓包证据。文中所有“展示”“上传”均应按具体语境理解为代码能力或调用分支。

## 1. 样本身份与研究范围

| 项目 | 本次样本 |
|---|---|
| APK应用标签 | `NexClean Screen`（aapt2读取，标签前有窄空格） |
| 商店链接 | [Google Play 目标页](https://play.google.com/store/apps/details?id=com.nexclean.junkclean.phoneclean) |
| 商店完整标题、开发者、下载量、评分、更新时间 | 本轮未取得可用商店正文，不填猜测值 |
| 样本来源 | 用户已安装应用的ADB提取；设备序列见样本清单 |
| 分包 | base.apk + 24个配置分包，包括 arm64_v8a、xxhdpi 和语言分包；各ZIP校验通过 |
| base大小 | 70,283,870 bytes |
| base SHA-256 | `777986bd4381674a7c2afda682847daabc5daa27789b0671e411411d504c054a` |
| SDK版本 | minSdk 32；target/compileSdk 36 |
| 静态覆盖 | base内8个DEX、60,639个定义类；定向反编译业务和相关SDK类。不是全SDK逐方法审计 |

完整来源、文件大小和分包哈希见[样本清单](../sample-manifest.json)，Manifest见[提取结果](../sources/AndroidManifest.xml)。ABI分包已保留，尚未对其原生库进行逆向。APK来源记录不是独立验证当前商店上架状态的证据。

公开资料获取尝试：本轮Google Play打开、包名/Google广告关键词检索均返回工具上游 `Unsupported content type`；早前curl也未获得可用正文。因此公开资料维度未完成，不能写“查不到投放”或“没有投放”。本次不做违规认定，也不把未读取的现行政策作为结论依据。

## 2. 产品闭环：工具入口如何连接桌面与广告

代码中的入口不是单一路线：`StartupRoutePolicy.resolve` 对 HOME 直接去桌面；外部图标去负一屏；内部工具去工具；通知去通知目标，是否先运行冷启动取决于工具运行时是否就绪。首次流程未完成且开屏场景广告没有成功展示时，`shouldScanDevice` 返回true进入设备扫描；否则可直接完成首次流程并交给桌面导航。[E06：com.neeeex.eraser.launcher.StartupRoutePolicy.java:158](../decoded/com.neeeex.eraser.launcher.StartupRoutePolicy.java)

这使“设备扫描”同时承担首次体验的一部分，但不能据静态路线认定扫描只是动画。垃圾清理代码确实有目录枚举、目标文件和删除动作；最终有效释放空间需实测。

桌面保留机制包括：

- Manifest声明Lawnchair HOME入口、外部应用图标别名和桌面设置能力。[E01：AndroidManifest.xml:206](../sources/AndroidManifest.xml)
- `HomeBackPolicy.normalBack` 在归因门控成立且尚未成为默认桌面时选择ROLE或RESOLVER；Android版本和厂商影响路径。
- `HomeResolverPromptController` 在远端开关允许时处理Home信号；生产间隔函数明确返回28,800,000毫秒，即8小时。虽然类里保留10秒测试常量，生产函数没有使用它。写入上次提示时间后，再检查归因和当前默认桌面并尝试唤起Home解析。该逻辑不能称为“8小时强制换桌面”，也不能按键名宣称清除系统默认桌面。[E09：com.neeeex.eraser.launcher.startup.HomeResolverPromptController.java:60](../decoded/com.neeeex.eraser.launcher.startup.HomeResolverPromptController.java)
- `NexCleanLauncherHomeView.updateActive` 把resumed、visible、expanded合成活跃条件；展开接近1才激活工具面板和广告恢复，非活跃时暂停。记录 `panel_open`、`module_use`、首次负一屏和默认桌面状态。

**商业解释（推断）：** 工具需求负责首次触达，默认桌面和负一屏让工具获得更多日常入口，通知再把用户带回工具。此结构具备增加访问机会的可能性；没有留存和曝光数据，不能断言已经提高DAU或收入。

## 3. 归因与人群：真实判断条件

核心门控在 `com.neeeex.eraser.module.report.bytedance.a.k()`：

```text
KEY_NEEEEX_FORCE_ATTR（偏好默认 false）为 true
    或 channel_id（偏好默认 -1）不等于 -1
→ 门控成立
```

该判断已用Craft字节码与反编译交叉核对。[E02：com.neeeex.eraser.module.report.bytedance.a.java:164](../decoded/com.neeeex.eraser.module.report.bytedance.a.java) [E03：ni.i.java:307](../decoded/ni.i.java)

生产链：SolarEngine初始化并注册 `OnAttributionListener` → 成功回调读取 `channel_id` / `adplan_name` → `l()`持久化channel_id及channel标签 → 广告、默认桌面提示、通知等消费者调用 `k()`。campaign非空时写入偏好，并调用AppLog profile与SolarEngine super properties。失败回调记录一次失败事件；所读失败方法不会主动把已有channel重置成自然量。

| 输入/状态 | k()结果 | 支持的解释 |
|---|---|---|
| force=false，channel_id=-1 | false | 包括Organic、未归因或缺省；仅靠值不能区分这些时序 |
| force=false，channel_id为其他值 | true | 任意非-1都成立，不仅限已列出的广告网络 |
| force=true，channel_id=-1 | true | 远端开关能使门控成立，自然来源也存在进入该组的能力 |
| 原来存有非-1，后来归因失败 | 取决于原缓存/其他写入 | 本次失败回调不负责清零，不能假设立刻变回false |

枚举映射包含Organic=-1、Google=5305、Tiktok=5306、Mintegral=8221、Meta=19806、其他=Integer.MIN_VALUE。**这些映射证明客户端能识别来源标签，不证明当前在这些渠道买量。** 门控也不匹配campaign关键词；本次未确认与审核设备识别或审核规避有关的完整业务链。

## 4. 广告：场景、触发、回调和回退

| 场景 | 类型/标签 | 已确认触发与选择 | 回退/边界 |
|---|---|---|---|
| 冷启动 | OPEN_SPLASH；插屏和开屏候选 | Splash读取两个候选值，`J0`中插屏值较大走插屏，否则走开屏；另有前后台、生命周期、就绪与超时条件 | 不能推算数值是实际成交eCPM；调用前还有可达条件 |
| 通知启动 | NOTIFICATION_SPLASH / NOTIFICATION_BAR_SPLASH | sourceType区分通知和通知栏场景；与普通OPEN_SPLASH分开打标签 | 不代表每条通知点击都一定展示 |
| 语言结束 | FIRST_LAN_END_IN | 门控不成立或插屏不可用时直接继续；否则尝试插屏 | 继续函数仍需结合回调看完成 |
| 首次引导 | FIRST_FUN_NATIVE / FIRST_FUN_LASTNEXT_IN | 原生及末步插屏消费归因门控和广告状态 | 首次路线会因广告结果变化 |
| 负一屏滑动 | OPEN_SPLASH（复用标签） | 远端开关、10分钟门槛、归因、就绪及冷却共同决定 | show success才记录上次展示时间；失败/关闭分别回调 |
| 垃圾扫描 | neeeex_pdf_clean_scan / neeeex_pdf_clean_scan_end_fs | 扫描页原生/渲染；结束有归因条件插屏 | 不能把scan标签或加载当实际曝光 |
| 垃圾清理完成 | neeeex_pdf_clean_delete_complete_fs | `JunkCleanNEEEEXActivity.H0`归因门控后调用插屏 | 已用Craft复核；实际完成回调与曝光仍需真机 |
| 工具退出 | neeeex_pdf_clean_scan_exit_fs | `zi.l.b`门控/广告可用时展示；关闭或失败继续到FeatureRecommendationActivity | 门控不满足时立即继续；不是已证明的外部交叉推广 |
| 应用管理等操作 | CTOOLS_*_IN / *_SCAN_END_IN / *_RESULT_NATIVE | 卸载/管理动作由vh.a按业务偏好冷却分支选择展示或立即继续；扫描结束e()入口另走直接尝试 | 不能把动作冷却推广到全部工具入口 |
| 工具结果页 | 原生/横幅 | BaseAdActivity提供原生优先横幅回退和最高分选择两套规则 | 生命周期暂停/恢复刷新；不是全程后台刷广告的证明 |

启动选择证据：[E05：com.neeeex.eraser.module.main.SplashNEEEEXActivity.java:466](../decoded/com.neeeex.eraser.module.main.SplashNEEEEXActivity.java)；负一屏：[E07：com.neeeex.eraser.launcher.MinusOneAdPolicy.java:15](../decoded/com.neeeex.eraser.launcher.MinusOneAdPolicy.java) [E08：com.neeeex.eraser.launcher.OpenSceneAdPolicy.java:22](../decoded/com.neeeex.eraser.launcher.OpenSceneAdPolicy.java)；工具结果与退出：[E15：com.neeeex.similar3p.junk.ui.JunkCleanNEEEEXActivity.java:297](../decoded/com.neeeex.similar3p.junk.ui.JunkCleanNEEEEXActivity.java) [E16：zi.l.java:53](../decoded/zi.l.java) [E29：vh.a.java:227](../decoded/vh.a.java)；容器规则：[E17：com.neeeex.eraser.base.BaseAdActivity.java:339](../decoded/com.neeeex.eraser.base.BaseAdActivity.java)。

负一屏的精确规则是：开关开启；门控成立；广告管理器状态满足且开屏候选值>-0.1；`sp_neeeex_first_start_time`为正且当前时间不早于它；首次启动满600,000毫秒；如已有成功展示记录，还需时间不倒退且间隔达到冷却。包内冷却默认300秒，由远端秒值经校验再×1000；小于1或过大值回退300秒，不能通过把间隔设为负数直接解释成“关闭”。开关另有专门字段。

广告基础设施不止一个SDK：已确认TUSDK、TradPlus、Google Next Gen Ads初始化实现。[E18：hj.c3.java:35](../decoded/hj.c3.java) [E19：hj.e2.java:39](../decoded/hj.e2.java) [E20：hj.d0.java:41](../decoded/hj.d0.java) 聚合缓存代码包含过期清理和按分数降序处理；业务层也比较广告候选分数。SDK DEX审计还命中Mintegral、Pangle、Bigo、Liftoff/Vungle、Meta等定义类，清单见[SDK审计](SDK类定义审计.csv)。这些是打包存在证据，不能给每家分配线上份额、瀑布顺序、价格或收入。

广告场景扫描共记录136处标签引用、80个去重候选标签，见[逐行标签表](广告场景标签与调用位置.csv)。其中包括枚举、包装和重复使用，**80不是已配置广告位数、可曝光点位数或曝光次数**。扫描覆盖定向反编译集，不声称全包无遗漏。

## 5. 在线控制：三层来源不能混在一起

| 层 | 已追链路 | 可下结论 | 仍缺什么 |
|---|---|---|---|
| Firebase Remote Config | ni.i.u初始化/默认值 → s拉取激活 → 完成回调/实时更新 → 命令应用 → 偏好 → getter → 广告/推送/桌面消费者 | 存在完整客户端远控消费链，最小拉取间隔配置3600秒 | 本次实际拉取、激活值和条件人群 |
| 广告SDK策略 | 包内localStrategy → TUSDK策略路径与初始化；聚合广告适配器 | 有APK内回退配置与广告SDK联网能力 | 当前SDK返回策略、广告请求/竞价/展示 |
| 自有业务接口 | li.a组装并调用 app/init；响应方法仅optInt(code) | 初始化/注册数据发送入口 | 未证明该接口下发业务广告配置 |

详细字段、默认值、单位、parser/getter和消费者见[在线参数表](在线参数与包内默认值.csv)。[E03：ni.i.java:307](../decoded/ni.i.java) [E04：ni.i.java:363](../decoded/ni.i.java) [E21：li.a.java:131](../decoded/li.a.java) [E28：com.neeeex.eraser.push.h.java:84](../decoded/com.neeeex.eraser.push.h.java)

关键注意：带 `_ss` 的键不能统一读成秒。广播和trigger参数进入 `push.h.i/l` 后先乘60存成秒，getter再乘1000；默认18对应条件分支18分钟。ongoing参数沿 `qi.b`消费者乘60,000，默认180对应180分钟；max_one_day是次数，默认20。本轮在线参数深挖已用字节码补全 `c0.e()`：MANUFACTURER/BRAND忽略大小写等于Samsung，或MODEL大小写敏感以SM-开头时为true；这4个远控通知参数只在该组写入和消费。另一路广播300秒、trigger600秒、ongoing策略30分钟，以及特例5秒分支另列，不能拼成一套全用户统一通知策略。

Firebase读取long的 `A()`会把0按缺值处理并回退；负一屏间隔还有单独的有效范围校验。初始化应用已有值和首次缺省、实时更新、请求失败的命令筛选也分别处理，因此“包内默认=true”不等于“线上一直true”。

24份localStrategy已Base64解成JSON，保留[本地策略目录](../sources/localStrategyDecoded)。其中app_st_param继续解码/解压后为195字节的未定schema二进制，含32个国家码。没有schema和消费解释，不能判断是地域允许名单、屏蔽名单或监管人群规则；采样数字也不能按形状当CPM。该层始终是本地回退材料，不是线上快照。

## 6. 推送与召回：分开看四种机制

**桌面内浮层。** `push.b.a`同时检查远端开关和归因门控，使用firstInstallTime（读取失败有本地fallback）；安装满3小时，距上次至少40分钟，按本地日期每天少于7次才允许。展示时增加计数，8秒自动dismiss。View插在Launcher的DragLayer里，点击走NotificationRouter，不能把它直接写成覆盖其他App的系统悬浮窗。[E10：com.neeeex.eraser.push.b.java:33](../decoded/com.neeeex.eraser.push.b.java) [E11：com.neeeex.eraser.launcher.notification.LauncherFloatingNotification.java:31](../decoded/com.neeeex.eraser.launcher.notification.LauncherFloatingNotification.java)

**系统通知/常驻机制。** NotifyListener有归因、通知可用状态、心跳与间隔策略；心跳记录间隔至少1小时。`qi.b`存在门控成立且某布尔状态为false时5秒、厂商条件下ongoing分钟值及30分钟回退，需结合该状态生产者和运行时序判定实际可达性。没有将它认定为每5秒向所有用户推广告。

**Messaging入口。** `pi.d.a`允许6:00≤小时<24:00；检查全屏广告相关状态、首次启动满2小时、日计数和间隔。`c0.e()`为true一侧每天2次、间隔5小时；另一侧每天18次、间隔30分钟。2小时与30分钟已追到被引用SDK常量实际数值。计数在资格判断成功时即递增，不等同系统已成功显示或用户已看到。此表是一个messaging资格函数，不能代替桌面浮层7次上限，也不能与max_one_day=20相加成全局总量。[E12：pi.d.java:30](../decoded/pi.d.java)

**重启恢复与点击路由。** BOOT_COMPLETED/MY_PACKAGE_REPLACED receiver调用前台服务启动。[E13：com.neeeex.eraser.push.AppStartupReceiver.java:14](../decoded/com.neeeex.eraser.push.AppStartupReceiver.java) NotificationRouter为from/action/sceneId生成不同action和nexclean URI，嵌套目标Intent，校验同包及允许的业务类；无效目标回MainActivity。不同点击继续首次启动还是进入目标工具，由NotificationDelivery/Startup状态参与。[E14：com.neeeex.eraser.launcher.NotificationRouter.java:47](../decoded/com.neeeex.eraser.launcher.NotificationRouter.java) 这些是恢复和路由实现，不代表Android后台限制下必定存活。

通知文案来源涵盖重复/相似媒体、大文件、垃圾、截图录屏、近期应用、流量、压缩、病毒等资源组，并包含随机资源选择。仅凭随机提醒文案无法认定提醒对应真实扫描结果；需要运行时对照状态、文案与点击后的扫描结果。

## 7. 功能与权益：已追到什么

| 功能 | 代码动作 | 可以确认 | 无法确认 |
|---|---|---|---|
| 垃圾清理 | 扫描外部存储、listFiles、构建目标、file.delete、清理完成结果与广告 | 存在真实文件处理调用；UI含权限/等待/扫描/结束状态 | 实际释放量、误删率、OEM限制下可访问范围 |
| 类似/重复/大文件、截图、压缩 | 功能入口、结果页及广告/推荐串联 | 模块确实作为产品功能入口和召回落点 | 每模块算法准确率、压缩质量及耗时未逐项实测 |
| 病毒扫描 | Trustlook CloudScanClient，INTL区域，连接/读超时30秒，startComprehensiveScan(100, callback)，可cancel | 调用了第三方云查杀；结果包装包名/应用名/APK路径/评分/大小 | 请求实际上传字段、扫描准确性、误报率 |
| 文件恢复 | 文件系统扫描/枚举相关代码 | 有恢复相关页面和文件路径处理 | 没有建立原始块/已删除内容恢复证据，不能声称可恢复永久删除文件 |
| 结果推荐 | FeatureRecommendationActivity 接收已完成模块来源 | 工具结束后的站内功能推荐链 | 不等同已验证外部导流或实际转化 |
| 付费与奖励 | 未找到BillingClient定义与业务支付闭环；VPU相关业务所读实际走插屏 | 当前已识别的商业化主要是广告 | 不用类名推断激励视频；无奖励回调→权益到账证据 |

查杀证据：[E24：com.neeeex.virus.a.java:116](../decoded/com.neeeex.virus.a.java)；恢复边界：[E25：com.neeeex.eraser.h0.java:354](../decoded/com.neeeex.eraser.h0.java)。Trustlook同意对话框与链接也已定位在 `com.neeeex.virus.l`，但未对用户同意、拒绝、dismiss及实际网络先后顺序做动态验证，不能据对话框存在就断言合规或据单一回调判断违法。

## 8. 数据采集与后台监听

| 来源 → 加工 → 去向 | 静态字段/动作 | 证据层级和用途边界 |
|---|---|---|
| 业务初始化 → li.a.c/e → nexclean3.com/prod-api/app/init | base内随机持久化UUID deviceId、os、deviceModel（实际来自MANUFACTURER）、appLang、appVersion、sysVersion、timezone；外层push_token、gaid、package_name、nonce、timestamp、sign | 明确组装与请求入口；未确认实际非空值、发送次数、接收结果；不将随机UUID称硬件ID |
| SolarEngine归因回调 → 偏好 → 事件/用户属性 | channel_id、channel标签、adplan_name/campaign、归因耗时/结果 | 能支持来源分层和业务门控，不能据此证明某渠道真实投放 |
| LauncherTelemetry → FirebaseAnalytics | neeeex_事件、source、surface=launcher、default_home | 桌面行为与来源统计；未验证后台入库 |
| LauncherReport → Firebase/AppLog | NEEEEX_前缀，首次默认桌面引导/选择、默认桌面状态、首屏、首次负一屏entry_path、module_use(scene)、push_show(source) | 构成可分析首次漏斗的埋点设计；不是实际漏斗转化率 |
| AppLog统一包装 → onEventV3 | campaign、channel、usertype及业务map；profileSet；SolarEngine super properties | 事件SDK调用；完整实际网络内容未抓取 |
| Launcher3 NotificationListener → 桌面通知点/键数据 | posted/removed、PackageUserKey/NotificationKeyData相关处理 | 服务声明及本地监听处理，不证明通知正文被上传 |
| Trustlook扫描回调 → 本地风险结果 | 包名、appName、apkPath、score、size等 | 结果字段不等同请求上传字段 |

核心证据：[E21：li.a.java:131](../decoded/li.a.java) [E22：com.neeeex.eraser.launcher.LauncherTelemetry.java:17](../decoded/com.neeeex.eraser.launcher.LauncherTelemetry.java) [E23：com.neeeex.eraser.module.report.bytedance.c.java:64](../decoded/com.neeeex.eraser.module.report.bytedance.c.java) [E27：AndroidManifest.xml:350](../sources/AndroidManifest.xml)。

业务配置缓存b0已进一步定位为默认MMKV；Home提示与浮层计数另用SharedPreferences。完整9键、失败/热更新处理及在线取样记录见[在线参数深挖](NexClean_在线参数深挖.md)。

AppLog初始化显式关闭AutoTrack、MAC、IMEI、OAID、AndroidId采集开关，并启用加密压缩、设置gator.volces.com域名。这个事实只限定该初始化的AppLog配置，不能推广成“整个应用不采集设备标识”，因为自有请求仍有GAID/token等字段，其他SDK也有独立策略。

Manifest包含存储管理、使用情况访问、联系人、通知、AD_ID等权限及Launcher继承的一系列系统/签名级声明。**声明不等于已授予，也不等于普通安装能使用全部系统能力**。未验证联系人是否上传、使用统计的实际获取量、通知内容上传或用户媒体上传，不按权限清单直接下这些结论。

包内 `privacy_policy_setting` 是一份TradPlus个性化广告说明，列设备广告标识、位置、品牌型号和OS等声明；它不是完整隐私实践证据，也不证明位置权限已授予或坐标已上传。业务代码还链接NexClean与Trustlook政策，链接当前正文未成功核实。

## 9. 加固、许可检查与字符串保护

**已确认 Pairip 许可检查和 XOR 字符串混淆；本轮没有确认使用 360、爱加密等第三方整包壳，也没有确认自研整包加固。** 本轮补查全部 25 个 APK、8 个 DEX 类定义与 15 个原生库的文件名和部分标记。360、爱加密类、梆梆和腾讯乐固的所查常见特征均未命中，但有限特征筛查不能证明“完全没有加固”。

Pairip 启动入口会调用许可检查，并包含连接 Google Play 许可服务的代码；不能直接等同于 360 类整包加固或完整 VM 代码保护。XOR 只说明存在让字符串难读的处理，不能证明团队原创。带应用前缀的 `libneeeex_sm.so` 已追到 Bitmap / 图片哈希与相似图片分组链路，不能按名称当作自研壳。

具体厂商检查、方法和边界见[加固与保护核查全文](NexClean_加固与保护核查.md)，原始审计见[全部匹配规则与结果](../hardening/静态加固核查.json)。本次未做原生库逐函数反汇编、运行时加载追踪或许可绕过；实际运行效果和自研归属仍未确认。

## 10. 值得借鉴的设计（推断）

| 已观察机制 | 用户场景 | 可借鉴设计 | 需要验证的指标 |
|---|---|---|---|
| 结果后推荐其他工具 | 一次清理结束，用户准备离开 | 根据已完成模块给相关下一步，保留立即退出与失败继续能力 | 次功能使用率、退出率、任务完成时间 |
| 首次桌面漏斗埋点 | 用户从工具安装转到默认桌面/负一屏 | 分开记录引导展示、选择请求、实际默认状态与首次访问 | 各步转化、次日默认桌面保留、卸载率 |
| 面板活跃状态控制广告 | 工具面板可见/不可见频繁切换 | 用可见性与生命周期控制刷新，避免无效请求 | 有效曝光率、请求量、耗电与卡顿 |
| 通知分渠道频控 | 系统通知、桌面浮层、messaging并行 | 建立跨渠道总量预算，并保持具体功能落点一致 | 通知关闭率、增量回流、投诉/卸载率 |
| 负一屏初始等待与冷却 | 新装用户尚未理解产品 | 先验证核心价值，再测试用户主动打开场景的广告时机 | 新用户完成率、留存、每会话打断次数 |

这里的建议是机制推断，不是建议照搬来源差异策略，也没有证据证明该应用的做法已提升任何商业指标。

## 11. 后续验证清单（全部未执行）

| 优先级 | 要验证的事实 | 所需证据 |
|---|---|---|
| P0 | 自然、归因未知、非自然、force开关各自最终门控值 | 真实归因回调、远端拉取激活值、偏好与对应场景日志；不伪造归因 |
| P0 | 启动/通知/负一屏广告的可见时点与可关闭性 | 用户动作录屏 + SDK show/impression/close/fail 回调 + 业务继续证据 |
| P0 | 清理真实删除量与误删边界 | 测试文件清单、前后文件/空间差异、UI结果与广告回退 |
| P1 | 10分钟/5分钟和3小时/40分钟/7次是否按预期执行 | 同版本与激活配置、真实等待窗口、持久化计数和跨天记录；模拟改时不能代替真实等待 |
| P1 | 通知后台限制、重启恢复及点击目标 | 设备/系统/厂商条件、权限、重启日志、通知截图与目标页 |
| P1 | app/init及各SDK实际发送内容 | 合法可访问抓包/应用日志、请求时间和payload；区分客户端发出与服务端接收 |
| P1 | 拒绝通知、存储、默认桌面及Trustlook同意后的行为 | 连续交互录像、权限读回与功能结果 |
| P2 | 付费、动态功能及恢复能力遗漏 | 全入口遍历、商品/网络记录、构造的删除/恢复测试集 |
| P2 | Google实际买量和商店承诺 | 可核对包名的广告主/素材/地区/日期，以及商店开发者和正文 |

广告打断、桌面默认提示和通知文案与真实状态一致性都是运行核查重点；本报告不将它们定为已发生的违规行为。

## 12. 工具审计与证据入口

REA与Craft Anything均实际读取同一哈希的APK包/业务方法并做引用查询，关键归因、负一屏、远控、浮层频控与清理完成方法以Craft Dalvik和反编译交叉核对。REA审计29次中28次可用；保留初始失败。Craft方法审计8次中7次可用；首次误用清理方法名p1失败已保留，随后H0正确查询成功。引用查询返回0时只证明该工具未找到直接引用，不能推断入口不可达；Manifest与反射不在该计数范围。

实际调用数量用于审计，不代表研究深度或真机验证完成。定向反编译有部分控制流警告，本文未将不完整控制流补成确定事实。

- [主要发现、源文件、行号、短摘录与缺口](主要发现与证据索引.csv)
- [在线参数深挖与本次取样结果](NexClean_在线参数深挖.md)
- [9键完整消费链与边界](在线参数深挖_9键完整消费链.csv)
- [在线参数、默认值与消费者](在线参数与包内默认值.csv)
- [逐主题覆盖状态](研究覆盖与剩余缺口.csv)
- [广告标签候选及逐行引用](广告场景标签与调用位置.csv)
- [DEX SDK定义类审计](SDK类定义审计.csv)
- [REA有效性审计](REA有效性审计.csv)
- [Craft方法有效性及保留失败](../raw/craft_verification_audit.json)
- [Craft包解析](../raw/craft_package.json) / [Craft归因字节码](../raw/craft_attribution_gate.json) / [修正后清理完成字节码](../raw/craft_junk_complete_corrected.json)
- [REA可读结果目录](../readable) / [原始REA结果目录](../raw/com.nexclean.junkclean.phoneclean/rea)
- [原始反编译目录](../decompiled) / [解码注释目录](../decoded) / [字符串解码索引](../sources/decoded-strings.json)
- [分包清单与SHA-256](../sample-manifest.json)

交付状态：APK提取与静态主链研究已完成；公开商店/投放研究受工具失败限制；线上配置、真实广告曝光、功能效果和数据接收均未验证。本次没有对外发布报告。
