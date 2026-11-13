# NexClean Screen 在线参数深挖

样本：`com.nexclean.junkclean.phoneclean` 1.3.5 / 10305；base SHA-256 `777986bd4381674a7c2afda682847daabc5daa27789b0671e411411d504c054a`。日期：2026-11-13，北京时间。继承上一轮APK样本，本轮未连接手机。

## 结论

**已追清9个Firebase业务键的客户端消费链，但这次没有取得线上返回值。** 当前可确认的控制面是：归因门控覆盖、负一屏广告开关/间隔、Home提示入口、桌面内浮层开关，以及只对Samsung判定组生效的4个通知参数。业务代码里没有据此9键远程改广告单元ID、订阅价格或金币权益的证据。

| 本轮新增确认 | 实际含义 |
|---|---|
| 9个命令，只有4个键写入Firebase默认表 | 强制归因和4通知键另有SDK缺省/业务回退；不能把全部9键称显式远端默认表 |
| Samsung厂商分支已用字节码补全 | manufacturer/brand忽略大小写等于Samsung，或MODEL大小写敏感以SM-开头；4通知键只在该组写入/消费 |
| 失败时参数分两类处理 | 4个默认表内键失败回调跳过；其他5命令继续读当前激活配置/缺省，可能改写业务缓存 |
| 常驻刷新5秒是“缺失通知”特例 | 归因门控成立且查询到ID126666、null tag通知不存在时走5秒；不是每5秒给全体用户发送通知 |
| 23份placement回退均有局部上限-1 | 不能解释成全局无限广告；业务门控、10分钟初始等待、5分钟负一屏冷却等独立存在 |
| 本地应用级reader不消费a_c | 已解出的app_st_param/国家码不能当作该路径生效策略 |
| 在线请求在建立连接阶段失败 | HTTP=000，无响应体；不能判断服务是否要安装认证，也不能判断参数缺失、接口失效或全局配置 |

读取入口：[9键完整表](在线参数深挖_9键完整消费链.csv)、[23份SDK回退策略](广告SDK回退策略_23位.csv)、[53条网络记录](广告SDK回退策略_53条网络记录.csv)、[证据索引](在线参数深挖_证据索引.csv)。这些表中的值按“包内默认/静态记录”标注。

## 先用通俗的话理解这些参数

这些参数相当于开发者留在服务器上的“开关和旋钮”：有的决定某个广告或提示能不能进入流程，有的决定至少隔多久、一天最多多少次。手机拿到并采用新值后，相关规则才可能变化。

**下面解释的是已追到的客户端用途。当前服务器实际下发什么，本轮仍未取得。调整例子只是帮助理解，不是线上快照，也没有改动手机。**



### 放宽广告、提示和通知的用户资格检查

原始键：`KEY_NEEEEX_FORCE_ATTR`；包内默认：**false（关闭）**。

**控制什么：** 它不是买量数据本身，而是一个“直接放行”的开关。打开后，即使来源状态尚未让用户通过检查，也可通过这一层资格门槛。

**如果调整：** 如果线上下发 true，原本因来源未知等未通过该门槛的用户，也可能进入相关广告、桌面提示或通知流程。

**要注意：** 关闭不等于所有广告关闭：来源 channel_id 只要不是 -1，仍能通过。打开也不等于马上出广告，后面还有各场景条件。



### 桌面工具面板是否允许触发广告

原始键：`key_neeeex_minus_one_open_ad_enabled`；包内默认：**true（允许）**。

**控制什么：** 控制桌面旁工具面板（负一屏）的广告资格。可以理解为这个入口的广告开关。

**如果调整：** 如果下发 false，这一负一屏广告入口会被挡住；改回 true 后，重新具备继续检查的资格。

**要注意：** 不是全 App 去广告开关。还要来源条件满足、广告已准备好、首次启动满 10 分钟，并达到冷却时间。



### 负一屏广告成功展示后的最短间隔

原始键：`key_neeeex_minus_one_open_ad_interval_seconds`；包内默认：**300 秒 = 5 分钟**。

**控制什么：** 上一次成功展示后，需要至少隔多久，负一屏才有机会再出广告。

**如果调整：** 例如改成 600 秒，表示这个入口的展示冷却拉长到 10 分钟；通常会减少短时间重复打断的机会。

**要注意：** 它不决定第一次广告的等待时间；首次满 10 分钟是另一条限制。0、负数或越界值会回退到 300 秒，不表示关闭。



### 是否允许出现默认桌面选择提示

原始键：`key_neeeex_home_clear_default_enabled`；包内默认：**true（允许）**。

**控制什么：** 控制收到 Home 相关信号时，是否允许进入提示用户选择桌面的流程。

**如果调整：** 下发 false 可挡住这一提示入口；true 时，还要检查用户来源、是否已经是默认桌面等条件。

**要注意：** 虽然键名带 clear_default，已追代码不能证明它会清掉系统默认桌面，更不表示强制替换。生产代码还有 8 小时间隔。



### 是否允许显示应用桌面内的提醒浮层

原始键：`key_neeeex_launcher_view_notification_enabled`；包内默认：**true（允许）**。

**控制什么：** 控制 Launcher 桌面里显示的小提醒浮层，不是系统通知栏的总开关。

**如果调整：** 下发 false 可挡住这一桌面浮层；true 时，仍要符合首次安装时间、间隔和当天次数限制。

**要注意：** 包内另有安装满 3 小时、两次至少隔 40 分钟、每日 7 次等限制；不能仅修改此开关就绕过它们。



### 三星（Samsung） 特定通知发送流程的每日上限

原始键：`key_neeeex_max_one_day_ss`；包内默认：**20 次**。

**控制什么：** 限制 三星（Samsung） 判定组中，代码 p() 这条通知发送流程一天最多调用多少次。

**如果调整：** 例如改成 10，该流程当天计数到 10 后就会被挡住；这只是静态逻辑示例，不是当前线上配置。

**要注意：** 仅对 三星（Samsung） 分支及这条流程有效，不是整个 App 所有通知合计 20 次。计数增加也不证明系统已经展示；0 会按缺值回退到 20。



### 三星（Samsung） 常驻通知的普通刷新间隔

原始键：`key_neeeex_ongoing_interval_ss`；包内默认：**180 分钟 = 3 小时**。

**控制什么：** 控制 三星（Samsung） 上常驻通知在普通情况下隔多久可以刷新一次。刷新已有通知不一定等于新增一条通知。

**如果调整：** 例如改成 60，普通分支达到 1 小时间隔后才有机会刷新；仍要满足其他资格。

**要注意：** 明确查询到常驻通知缺失、且门控成立时，另有 5 秒补缺失特例。其他设备普通分支为 30 分钟；0 回退 180 分钟。



### 三星（Samsung） 广播相关通知流程的最短间隔

原始键：`key_neeeex_broadcast_notify_interval_ss`；包内默认：**18 分钟**。

**控制什么：** 控制 三星（Samsung） 分支中的广播相关通知流程，距离上次记录的通知发送时间至少隔多久。

**如果调整：** 例如改成 30，广播这层间隔就按 30 分钟检查；间隔变大通常会减少触发机会。

**要注意：** 对特定触发类型（代码 type=2），还必须同时满足 trigger 那个间隔。不是每 18 分钟必发一次；权限、日预算等仍会阻止发送。



### 三星（Samsung） 特定触发通知的额外间隔

原始键：`key_neeeex_trigger_notify_interval_ss`；包内默认：**18 分钟**。

**控制什么：** 给特定触发类型（代码 type=2）再加一道间隔检查，并且与 broadcast 使用同一上次发送时间。

**如果调整：** 例如 broadcast 为 18、trigger 为 30 分钟，type=2 需等到较长的 30 分钟门槛；不会各发一条。

**要注意：** 两项都满足才有资格继续，不是二选一。仅对 三星（Samsung） 对应分支有效；0 回退到 18 分钟，不表示关闭通知。



### 怎么理解“取到参数”和“真的生效”

可以把它理解成“取回新规则 → 启用新规则 → 保存到手机 → 进入对应场景 → 再检查其他条件”。取回成功不等于已经显示广告或通知；取回失败也不一定全部保留旧值，这个版本会按参数类型分别处理。精确的缓存、失败、单位转换规则见下方技术章节。



## 1. 配置来源与真实调用链

```text
应用初始化调度 com.neeeex.eraser.y.b
  → ni.i.G → u（Firebase实例、3600秒最小拉取间隔、默认表、更新监听）
  → s → fg.k.j（fetch成功后activate）
  → ni.i.a（根据任务成功状态筛选命令）
  → q里9个命令 → 类型转换 / 单位变换 → b0（默认MMKV）
  → 场景getter → 归因/厂商/生命周期/冷却条件 → 广告或通知调用

实时配置更新
  → fg.c回调 updatedKeys → ni.i.B
  → 只保留q中命中的业务键 → activate → ni.i.e筛选后应用
```

[C01 9个配置命令](../decoded/ni.i.java) [C02 拉取失败的应用筛选](../decoded/ni.i.java) [C06 fetch后activate](../decompiled/fg.k.java) [C08 业务缓存是MMKV](../decoded/com.neeeex.eraser.utils.b0.java)

3600秒是Firebase正常拉取最小间隔设置，不是应用在后台每小时必拉取的定时器，也不能覆盖实时更新链。`AtomicBoolean`防止s()并发进入，finally释放；初始化后的再次G调用可跳过u重复初始化但继续尝试s。普通fetch有SDK缓存/退避，`Firebase internal.d`记录ETag、最后拉取/模板版本、失败次数和退避时间；只有请求成功、激活、业务MMKV应用、场景采用均有运行证据，才能说某值实际生效。

缓存分两层：Firebase自己的fetched/activated/default状态；业务又把选中的值落到默认MMKV。上轮报告中“偏好缓存”是统称，本轮已定位实际MMKV实现。Home提示时间、桌面浮层日计数另在SharedPreferences，不属于这9个配置值的默认MMKV缓存。

## 2. 全部9个业务键

下表省略共同前缀`key_neeeex_`；`KEY_NEEEEX_FORCE_ATTR`保留原样。全部线上值为“本轮未取得”。

| 键 | 包内默认 | 实际作用及额外条件 |
|---|---|---|
| KEY_NEEEEX_FORCE_ATTR | false | `force || channel_id!=-1`；true覆盖归因门控；false不代表所有广告关闭 |
| minus_one_open_ad_enabled | true | 负一屏广告总资格开关；另需归因、广告就绪、first_start_time正值且满10分钟 |
| minus_one_open_ad_interval_seconds | 300秒 | 冷却秒值，getter×1000；成功展示回调记上次时间；不是首次等待10分钟 |
| home_clear_default_enabled | true | Home信号提示入口；8小时生产间隔，随后再查门控且尚非默认桌面；未证明清除系统默认桌面 |
| launcher_view_notification_enabled | true | 桌面DragLayer浮层；安装满3小时、40分钟间隔、日7次仍独立限制 |
| max_one_day_ss | 20次 | Samsung组、push.l.p()发送路径，比较n_count_日期；不是整个App所有通知总上限 |
| ongoing_interval_ss | 180分钟 | Samsung组普通常驻刷新；缺失通知特例可先走5秒 |
| broadcast_notify_interval_ss | 18分钟 | Samsung组；setter×60存秒、getter×1000毫秒；D比较另减1000毫秒 |
| trigger_notify_interval_ss | 18分钟 | Samsung组且触发类型i10==2时，除broadcast条件外再满足这个条件 |

[C04 0按缺值回退](../decoded/ni.i.java) [C05 负一屏间隔有效范围](../decoded/ni.i.java) [C11 通知参数分钟转秒](../decoded/com.neeeex.eraser.push.h.java) [C12 broadcast和trigger共同限制](../decoded/com.neeeex.eraser.push.c.java) [C13 日上限读取](../decoded/com.neeeex.eraser.push.l.java)

精确字段名、方法、回退和缓存见[完整参数表](在线参数深挖_9键完整消费链.csv)。业务显式Firebase默认表y()只有3个boolean=true及负一屏间隔300；force的false来自读取缺省，通知参数从push.i提供业务默认并通过A处理。

## 3. 人群、厂商与场景组合

### 归因不是简单自然/买量二选一

`attribution.a.k()`不直接判断campaign，也不识别Google名称，而是读取MMKV：force默认为false；channel_id默认为-1。SolarEngine成功回调写channel，Firebase force写相同MMKV开关。

| force | channel_id | 最终门控 |
|---|---|---|
| false | -1（自然/未知/尚无结果均可能） | false |
| false | 任何非-1 | true |
| true | 任意值 | true |

这证明存在对自然/未知状态覆盖门控的能力；当前在线force、真实归因回调和时序未知，不能声称线上自然用户都被开启或都被关闭。异步归因与配置激活先后会使同一用户在不同时间走不同分支；需同时记录两条状态来源。

### Samsung分支已经补齐

Craft `vendor.json`显示循环比较MANUFACTURER/BRAND与Samsung，命中直接return true；否则MODEL前缀SM-判断。Kotlin F/U/S实现进一步确认是忽略大小写相等与默认大小写敏感startsWith。这一结果替代上一轮“厂商反编译控制流不完整”的缺口。[C09 Samsung字节码](../online/craft/vendor.json) [C10 Samsung比较是忽略大小写相等](../decompiled/p003kotlin.text.e0.java)

| 参数族 | Samsung判定=true | false |
|---|---|---|
| max_one_day_ss | 读取远控缓存，默认20，p()发送前检查 | p()跳过该总量检查；h.c()虽回999，不能据此说其他机型统一限999 |
| ongoing_interval_ss | 普通分支×60000；默认180分钟 | 普通分支固定1800000毫秒=30分钟 |
| broadcast_notify_interval_ss | setter×60→秒，getter×1000，默认18分钟 | 改读brNtInterSeconds，默认300秒 |
| trigger_notify_interval_ss | setter×60→秒，getter×1000，默认18分钟 | 改读pNtInterSeconds，默认600秒 |

这4个setter本身也以Samsung判定为条件；不是把远端值先全用户写入再仅部分消费。未发现这4个值切换为“审核设备识别”的证据；厂商适配和来源分支不能独立证明审核规避。

## 4. 缺值、非法值、失败和热更新

| 时点/输入 | 客户端实际行为 | 影响 |
|---|---|---|
| 初始化u()，boolean或interval的SDK source=0 | H(...,false)/J(false)保留业务缓存，不强制写缺省 | 离线启动可能沿用旧MMKV |
| 初始化有非0源值 | 解析/回退后写MMKV，包括SDK defaults源 | 尚未完成新fetch也可能应用已有值；不能只看fetch时间 |
| 普通拉取成功 | 所有9命令执行；读取当前已激活Firebase值 | 不等于已经走到广告或通知 |
| 普通拉取失败 | y()默认表内4键跳过；force+4通知命令继续读SDK激活缓存/缺省 | 不能统一写成“失败全保留”或“失败全清零” |
| 实时更新updatedKeys | 只应用9键内命中的项，先activate；完成时仍按成功/默认表筛选 | 未命中的远端键不会被这段业务直接消费 |
| 通知long=0或SDK读到0 | A把0作为缺值，回退到20/180/18/18 | 0不能据字段名解释成关闭通知 |
| 通知long<0 | A未过滤；push.h也未统一范围检查 | max日计数可能立刻达限，间隔可能变短；仍有其他门控；不是当前线上事实 |
| 负一屏interval=0/负数/越界 | L回退300秒；范围1≤值<9223372036854776 | 与通知参数的0/负数规则不同 |
| boolean缺失/转换异常，且允许写入 | 三个键采用true回退；force走SDK boolean缺省 | 成功响应缺键不等同主动false |

[C02 拉取失败的应用筛选](../decoded/ni.i.java) [C03 初始化源值和保留条件](../decoded/ni.i.java) [C04 0按缺值回退](../decoded/ni.i.java) [C05 负一屏间隔有效范围](../decoded/ni.i.java)。负一屏上界保证正常×1000可表示；推送乘数路径未见同样范围过滤，极端远端值可能溢出。这是输入校验能力分析，没有实际异常配置快照。

## 5. 推送参数的最终消费者

### broadcast和trigger同时限制

`push.c.D(type, now)`先要求`now >= last_post_time + broadcast_interval -1000`，只有type=2再要求`now >= last_post_time + trigger_interval -1000`。因此type=2的实际门槛相当于两者较大者，不是分别每18分钟发送两次。它前面还查通知权限、屏幕交互、锁屏状态、全屏广告状态、归因门控等条件；到发送方法后还有日预算/scene频控。[C12 broadcast和trigger共同限制](../decoded/com.neeeex.eraser.push.c.java)

### 5秒是在补缺失的常驻通知

NotifyListener.n查询本应用activeNotifications，ID=126666且tag=null为存在。`qi.b.a`在门控=true且存在状态明确为Boolean.FALSE时用5000毫秒；否则Samsung用配置分钟×60000，其他用30分钟。查询异常产出null，null不会按FALSE走5秒。满足比较后调用qi.a.m并记录刷新时间。[C14 缺失常驻通知的状态来源](../decoded/com.neeeex.eraser.push.NotifyListener.java) [C15 常驻5秒特例](../decoded/qi.b.java)

### 日预算不是全部召回渠道共享

`push.l.p`在门控成立后，仅Samsung执行`m()`日上限检查；发送路径构建通知、调用通知包装，然后累加n_count_日期；from为1或2再记录last_post_time和today_post_count_id_scene。另一个`o()`通知路径不采用同一p()预算链，所以不能把20次写成全App硬上限。计数发生在调用发送后，仍不证明系统最终可见。

每场景还有ri.a自己的日计数和间隔。push.h.d(scene,limit)直接返回传入limit，h.e(scene,seconds)直接×1000；scenes/id/interSeconds/limit这些常量的存在不能证明有一张在线scene表正在覆盖它们。

FCM `NEEEEXFCMService.p`主要按priority处理服务恢复/事件，然后检查门控和pi.d资格，再由pi.e选择本地通知；所读回调没有把远端message data当作上述9键应用，也没有直接消费服务端正文。不能把“支持FCM”写成“这些开关通过FCM下发”。[C16 FCM回调触发本地通知而非直接消费远端文案](../decoded/com.neeeex.eraser.module.firebaseMessage.NEEEEXFCMService.java)

## 6. 广告SDK层：包内策略与线上策略拆开

本次24份localStrategy包含1份应用级与23份placement级。placement中有53条ug/hb/s2shb网络记录，16条network name为空，其他记录标签为Admob/Meta/Bigo/Pangle/Mintegral；统计对象是配置记录，可重复，不能作为实际平台占比。

| 静态字段 | 23份包内记录 | 能确认与不能确认 |
|---|---|---|
| ad_delivery_sw | 全部1 | parser对应n0m()==1；仍不证明在线启用 |
| unit_caps_d / unit_caps_h / unit_pacing | 全部-1 | 是该SDK配置层原值及缺省，不能推广成业务层无频控 |
| refresh / auto_refresh | 全部0 | 不能写成完全不刷新，BaseAdActivity另有刷新循环 |
| auto_refresh_time | 字段仍保留数值 | 开关、消费者和计时都须合看；不能直接说每15秒刷新 |
| ecpm等网络值 | 有配置原值 | 不等同实际竞价/成交、收入、底价或线上份额 |

[C19 SDK回退字段解析](../decompiled/com.thinkup.core.q.m0.java) [逐位原值表](广告SDK回退策略_23位.csv)

placement reader `q.nd`在读assets前检查上下文、路径、ID；解码后要求cs_cl=300000001，SDK版本不低于策略版本，若pl_id存在须与请求匹配，再读取pl_data并交m0解析。本次23份均通过这些静态基础兼容检查，但未执行SDK装载，所以不写“23位已实际采用”。[C18 placement assets兼容检查](../decompiled/com.thinkup.core.q.nd.java)

业务 `ads.h.k`硬编码6个聚合组：native、banner、inter、inter_open、app_open、app_open_pre，并配置Google、TUSDK等广告单元及初始化参数。这和80个业务场景候选标签、23份TUSDK placement、53条SDK network记录是不同口径，不相加。另有app_open_inner字符串，不能只凭常量当第7个已注册组。[C20 6个硬编码聚合组与SDK初始化](../decoded/com.neeeex.eraser.ads.h.java)

### 应用级嵌套内容的重要限制

TUSDK.setLocalStrategyAssetPath → common.o.nd.d → q.o/n0与q.mm/nd分别设置应用/placement读取路径。`q.n0.m(appId)`读取并解码本地应用JSON后只取`s_p_data`与`st`，构建m；所追这一路没有取`a_c`。[C17 应用级assets只读s_p_data/st](../decompiled/com.thinkup.core.q.n0.java)

因此应用JSON中`a_c.app_st_param`虽然可以Base64+Zstd解成195字节且含32个国家码，**不能作为该本地reader生效的地域策略**。也不能用`da_spl`、ser_cs等字段名猜人群比例；可能由其他SDK分支处理仍需找到消费者。原始及解码材料均保留；目前没有可证明该嵌套结构参与本次回退选择的链。

### SDK在线链已经追到请求包装，但未取到策略

`q.o.n`构造appId/appKey和cached-map上下文 → dm.nm → q.n.m → common.m0.dq/dd → endpoint解析/网络层 → onLoadFinish → q.o处理；placement由q.mm组请求及返回。`common.dn`通过普通/安全域名和SDK状态选/v2/open/app、/placement等地址；不能仅凭常量确定该设备最终域名。[C22 SDK配置请求与返回回调](../decompiled/com.thinkup.core.q.o.java)

当前已还原客户端请求入口、回退reader、parser和业务组；尚未完整复现SDK通用上下文/签名与传输包装，也没有运行SDK或发起广告请求。因此本轮未向聚合平台试发不完整广告请求来假装取得配置，不能交付“当前在线广告路由/价格/完整瀑布”。

`hj.y`还维护每单元最近最多6个值的滚动均值并存在pp_mmkv；x0在部分分支把该均值赋给广告模型。这个本地值会影响业务评分，不是Firebase远程底价。[C21 本地滚动均值](../decoded/hj.y.java)

## 7. 实际在线取样记录

APK资源定位Firebase project=`nexclean-a0d07`，项目号295587597504，App ID=`1:295587597504:android:1477558da2469363d63125`。SDK请求协议来自包内ConfigFetchHttpClient，版本22.0.1；签名SHA-1由apksigner读出并用于X-Android-Cert。[C07 真实请求字段与SDK22.0.1](../decompiled/com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.java)

目标为`https://firebaseremoteconfig.googleapis.com/v1/projects/295587597504/namespaces/firebase:fetch`。仅按APK已有客户端协议请求配置；没有请求管理接口、枚举其他项目、注册Firebase安装或发送归因/统计/广告事件。

| 请求上下文 | 本次设置 |
|---|---|
| 身份 | 本地生成且明确标注synthetic的FID，不是手机FID或真实买量用户 |
| 包/版本 | 目标包、1.3.5、10305 |
| locale | countryCode=US，languageCode=en-US；只是请求字段，不代表美国出口IP |
| 系统/时区 | platformVersion=34；America/New_York |
| 用户属性 | 空analyticsUserProperties；未伪造campaign或付费状态 |
| 安装认证 | 未注册，未携带Firebase Installations Auth；若网络恢复服务是否接受仍待返回确认 |

| 尝试 | 结果 | 可下结论 |
|---|---|---|
| 沙箱内urllib | WinError10013 | 本机权限层失败，不是远端拒绝 |
| 经批准的沙箱外urllib | WinError10060连接超时 | 未收到HTTP响应 |
| 经批准的curl有界重试 | exit28，HTTP000，约10秒连接超时 | 网络连接阶段失败，未取得配置 |

取样UTC 08:50:20至08:50:32，即北京时间16:50:20至16:50:32，详见[请求上下文](../online/baseline_curl.request.json)、[结果与时间](../online/baseline_curl.result.json)。此前失败记录另保留。[C23 在线取样连接失败证据](../online/baseline_curl.result.json)

**所以本轮没有线上键数、templateVersion、AB实验或人群差异快照，未做多地区/多身份比较。** 同一个字段在代码中被使用，不代表服务器现在还返回它；空用户属性请求也不能代表真实归因后的用户群。即使后续HTTP200取得entries，仍需与激活状态及业务MMKV读回对照，才能证明手机采用。

## 8. 本轮结束位置与最小补证

| 分支 | 本轮完成 | 具体障碍/最小补证 |
|---|---|---|
| Firebase9键 | 字段、请求、默认/缓存、激活、热更新、消费者、厂商分支及边界 | 当前网络到Google连接超时；需可达网络重试，若返回认证错误再按客户端安装认证协议处理 |
| 真实用户分层 | 归因生产者和force消费者，时序影响 | 需要真实归因、Firebase激活结果与同窗口业务状态；不能用合成FID替代 |
| SDK策略 | 24份解码、23placement兼容条件、53记录、线上入口/回调、6业务组 | SDK请求上下文与签名包装尚未完整复现；可用真实SDK运行缓存/请求响应补证 |
| app_st_param | 内容可解压、所追本地reader不消费a_c | 若要主张生效，须找到另一条明确消费者及实际采用证据 |
| 场景最终动作 | 调用路径和回退已确认 | 手机运行/曝光/通知可见性未执行，维持静态边界 |

本轮新增Craft有效方法7项，全部可用：[审计](../online/craft/audit.json)。与原REA包/方法/引用证据复用同一APK；不把新增7次调用当作7个运行测试。主报告与参数表已同步修正Samsung分支、通知缺失特例及MMKV定位。
