package com.neeeex.eraser.launcher;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.neeeex.ctools.features.appmanager.AppManagerNEEEEXActivity;
import com.neeeex.ctools.features.device.DeviceStatusNEEEEXActivity;
import com.neeeex.ctools.features.loading.CtoolsLoadingNEEEEXActivity;
import com.neeeex.ctools.features.networkspeed.NetworkSpeedNEEEEXActivity;
import com.neeeex.ctools.features.permission.UsagePermissionActivity;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.main.CapacityNEEEEXActivity;
import com.neeeex.eraser.module.main.SettingNEEEEXActivity;
import com.neeeex.eraser.recover.reco.f.FileScanNEEEEXActivity;
import com.neeeex.eraser.recover.reco.p.PhotoFullPreviewNEEEEXActivity;
import com.neeeex.eraser.recover.reco.p.PhotoScanNEEEEXActivity;
import com.neeeex.eraser.recover.reco.v.VideoScanNEEEEXActivity;
import com.neeeex.eraser.recover.recod.RecoveredNEEEEXActivity;
import com.neeeex.similar3p.ScanNEEEEXActivity;
import com.neeeex.similar3p.junk.ui.JunkScanNEEEEXActivity;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/neeeex/eraser/launcher/LauncherActionNavigator;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lei/b;", "permission", "Lcom/neeeex/ctools/features/loading/a;", "target", "Landroid/content/Intent;", "usageIntent", "(Landroid/content/Context;Lei/b;Lcom/neeeex/ctools/features/loading/a;)Landroid/content/Intent;", "Lcom/neeeex/similar3p/y;", "type", "scanIntent", "(Landroid/content/Context;Lcom/neeeex/similar3p/y;)Landroid/content/Intent;", "Lcom/neeeex/eraser/launcher/LauncherActionNavigator$Action;", "action", "intent", "(Landroid/content/Context;Lcom/neeeex/eraser/launcher/LauncherActionNavigator$Action;)Landroid/content/Intent;", "scanType", "(Lcom/neeeex/eraser/launcher/LauncherActionNavigator$Action;)Lcom/neeeex/similar3p/y;", "Landroid/os/Bundle;", "payload", "fromNotification", "(Landroid/content/Context;Landroid/os/Bundle;)Landroid/content/Intent;", "Action", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LauncherActionNavigator {
    public static final LauncherActionNavigator INSTANCE = new LauncherActionNavigator();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/neeeex/eraser/launcher/LauncherActionNavigator$Action;", "", "<init>", "(Ljava/lang/String;I)V", "SETTINGS", "CAPACITY", "JUNK", "VIRUS", "PHOTOS", "VIDEOS", "FILES", "RECOVERED", "SCREENSHOTS", "SIMILAR", "LARGE_MEDIA", "DUPLICATE_MEDIA", "LARGE_DOCS", "DUPLICATE_DOCS", "COMPRESS", "RECENT_APPS", "TRAFFIC", "APP_MANAGER", "DEVICE", "SPEED", "NOTIFICATION_PERMISSION", "DEFAULT_HOME", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum Action {
        SETTINGS,
        CAPACITY,
        JUNK,
        VIRUS,
        PHOTOS,
        VIDEOS,
        FILES,
        RECOVERED,
        SCREENSHOTS,
        SIMILAR,
        LARGE_MEDIA,
        DUPLICATE_MEDIA,
        LARGE_DOCS,
        DUPLICATE_DOCS,
        COMPRESS,
        RECENT_APPS,
        TRAFFIC,
        APP_MANAGER,
        DEVICE,
        SPEED,
        NOTIFICATION_PERMISSION,
        DEFAULT_HOME;

        private static final /* synthetic */ ml.a $ENTRIES = ml.b.a(values());

        public static ml.a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Action.values().length];
            try {
                iArr[Action.SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Action.CAPACITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Action.PHOTOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Action.VIDEOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Action.FILES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Action.RECOVERED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Action.APP_MANAGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Action.DEVICE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Action.SPEED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Action.RECENT_APPS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Action.TRAFFIC.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Action.COMPRESS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Action.VIRUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Action.NOTIFICATION_PERMISSION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Action.DEFAULT_HOME.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Action.JUNK.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Action.SCREENSHOTS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[Action.SIMILAR.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[Action.LARGE_MEDIA.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[Action.DUPLICATE_MEDIA.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[Action.LARGE_DOCS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[Action.DUPLICATE_DOCS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private LauncherActionNavigator() {
    }

    private final Intent scanIntent(Context context, com.neeeex.similar3p.y type) {
        if (type == com.neeeex.similar3p.y.JUNK_FILES) {
            return new Intent(context, (Class<?>) JunkScanNEEEEXActivity.class);
        }
        Intent intentPutExtra = new Intent(context, (Class<?>) ScanNEEEEXActivity.class).putExtra("SCAN_TYPE" /* decoded XOR */, type.name());
        "putExtra(...)" /* decoded XOR */;
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    private final Intent usageIntent(Context context, ei.b permission, com.neeeex.ctools.features.loading.a target) {
        return new yh.a(context).b() ? CtoolsLoadingNEEEEXActivity.INSTANCE.a(context, target) : UsagePermissionActivity.INSTANCE.a(context, permission);
    }

    public final Intent fromNotification(Context context, Bundle payload) {
        Action action;
        Uri uri;
        "context" /* decoded XOR */;
        context.getClass();
        if (payload == null) {
            return null;
        }
        int i10 = payload.getInt("action" /* decoded XOR */);
        if (i10 == 17) {
            String string = payload.getString("screenshotUri" /* decoded XOR */);
            if (string == null || (uri = Uri.parse(string)) == null) {
                return null;
            }
            if (!p003kotlin.jvm.internal.v.c(uri.getScheme(), "content" /* decoded XOR */) || !p003kotlin.jvm.internal.v.c(uri.getAuthority(), "media" /* decoded XOR */)) {
                uri = null;
            }
            if (uri == null) {
                return null;
            }
            Intent intent = new Intent(context, (Class<?>) PhotoFullPreviewNEEEEXActivity.class);
            intent.putExtra("extra_media_uri" /* decoded XOR */, uri.toString());
            intent.setData(uri);
            intent.addFlags(1);
            return intent;
        }
        switch (i10) {
            case 1:
                action = Action.PHOTOS;
                break;
            case 2:
                action = Action.VIDEOS;
                break;
            case 3:
                action = Action.FILES;
                break;
            case 4:
                action = Action.RECOVERED;
                break;
            case 5:
                action = Action.SIMILAR;
                break;
            case 6:
                action = Action.LARGE_MEDIA;
                break;
            case 7:
                action = Action.DUPLICATE_MEDIA;
                break;
            case 8:
                action = Action.LARGE_DOCS;
                break;
            case 9:
                action = Action.DUPLICATE_DOCS;
                break;
            case 10:
                action = Action.CAPACITY;
                break;
            case 11:
                action = Action.JUNK;
                break;
            case 12:
                action = Action.SCREENSHOTS;
                break;
            case 13:
                action = Action.RECENT_APPS;
                break;
            case 14:
                action = Action.TRAFFIC;
                break;
            case 15:
                action = Action.COMPRESS;
                break;
            case 16:
                action = Action.VIRUS;
                break;
            default:
                return null;
        }
        return intent(context, action);
    }

    public final Intent intent(Context context, Action action) {
        "context" /* decoded XOR */;
        context.getClass();
        "action" /* decoded XOR */;
        action.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[action.ordinal()]) {
            case 1:
                return new Intent(context, (Class<?>) SettingNEEEEXActivity.class);
            case 2:
                return new Intent(context, (Class<?>) CapacityNEEEEXActivity.class);
            case 3:
                return new Intent(context, (Class<?>) PhotoScanNEEEEXActivity.class);
            case 4:
                return new Intent(context, (Class<?>) VideoScanNEEEEXActivity.class);
            case 5:
                return new Intent(context, (Class<?>) FileScanNEEEEXActivity.class);
            case 6:
                Intent intentPutExtra = new Intent(context, (Class<?>) RecoveredNEEEEXActivity.class).putExtra("extra_init_pager_index" /* decoded XOR */, 0);
                "putExtra(...)" /* decoded XOR */;
                intentPutExtra.getClass();
                return intentPutExtra;
            case 7:
                return new Intent(context, (Class<?>) AppManagerNEEEEXActivity.class);
            case 8:
                return new Intent(context, (Class<?>) DeviceStatusNEEEEXActivity.class);
            case 9:
                return new Intent(context, (Class<?>) NetworkSpeedNEEEEXActivity.class);
            case 10:
                return usageIntent(context, ei.b.RECENT_APPS, com.neeeex.ctools.features.loading.a.RECENT_APPS);
            case 11:
                return usageIntent(context, ei.b.NETWORK_TRAFFIC, com.neeeex.ctools.features.loading.a.NETWORK_TRAFFIC);
            case 12:
            case 13:
            case 14:
            case 15:
                Intent intentPutExtra2 = new Intent(context, (Class<?>) LauncherActionActivity.class).putExtra("com.neeeex.eraser.launcher.ACTION" /* decoded XOR */, action.name());
                "putExtra(...)" /* decoded XOR */;
                intentPutExtra2.getClass();
                return intentPutExtra2;
            default:
                return scanIntent(context, scanType(action));
        }
    }

    public final com.neeeex.similar3p.y scanType(Action action) {
        "action" /* decoded XOR */;
        action.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[action.ordinal()]) {
            case 16:
                return com.neeeex.similar3p.y.JUNK_FILES;
            case 17:
                return com.neeeex.similar3p.y.SCREEN_CAPTURE_FILES;
            case 18:
                return com.neeeex.similar3p.y.SIMILAR_IMAGES;
            case 19:
                return com.neeeex.similar3p.y.LARGE_MEDIA;
            case 20:
                return com.neeeex.similar3p.y.DUPLICATE_MEDIA;
            case 21:
                return com.neeeex.similar3p.y.LARGE_DOCS;
            case 22:
                return com.neeeex.similar3p.y.DUPLICATE_DOCS;
            default:
                uo.d.a("Not a scan action: ", action);
                return null;
        }
    }
}