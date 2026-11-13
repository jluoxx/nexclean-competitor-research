package com.neeeex.eraser.launcher;

import android.os.Bundle;
import com.neeeex.eraser.m0;
import gl.v0;
import java.util.Map;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0003J\u001d\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0003J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0012J\u0015\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u0012J\u0015\u0010 \u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b \u0010\u0012¨\u0006!"}, d2 = {"Lcom/neeeex/eraser/launcher/LauncherReport;", "", "<init>", "()V", "", "name", "", "Lfl/t;", "fields", "Lfl/m0;", "event", "(Ljava/lang/String;[Lfl/t;)V", "", "status", "scene", "reportDefaultHomeStatus", "(ILjava/lang/String;)V", "reportToolModuleUse", "(Ljava/lang/String;)V", "reportDefaultHomeGuideShow", "source", "surface", "reportDefaultHomeSettingsShow", "(Ljava/lang/String;Ljava/lang/String;)V", "reportFirstDefaultHomeSelected", "reportDefaultHomeSelected", "", "isDefaultHome", "reportDesktopFirstScreenShow", "(Z)V", "entryPath", "reportFirstMinusOneShow", "reportPushShow", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LauncherReport {
    public static final LauncherReport INSTANCE = new LauncherReport();

    private LauncherReport() {
    }

    public final void event(String name, fl.t... fields) {
        "name" /* decoded XOR */;
        name.getClass();
        "fields" /* decoded XOR */;
        fields.getClass();
        Map mapX = v0.x(fields);
        String str = "NEEEEX_" + name;
        Bundle bundle = new Bundle();
        for (Map.Entry entry : mapX.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                bundle.putInt(str2, ((Number) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(str2, ((Number) value).longValue());
            } else {
                bundle.putString(str2, value.toString());
            }
        }
        ni.a.d(str, bundle);
        com.neeeex.eraser.module.report.bytedance.c.e("NEEEEX_" + name, mapX);
    }

    public final void reportDefaultHomeGuideShow() {
        event("first_default_home_guide_show" /* decoded XOR */, new fl.t[0]);
    }

    public final void reportDefaultHomeSelected(String source) {
        "source" /* decoded XOR */;
        source.getClass();
        event("default_home_selected" /* decoded XOR */, fl.z.a("source" /* decoded XOR */, source));
    }

    public final void reportDefaultHomeSettingsShow(String source, String surface) {
        "source" /* decoded XOR */;
        source.getClass();
        "surface" /* decoded XOR */;
        surface.getClass();
        event("first_default_home_settings_show" /* decoded XOR */, fl.z.a("source" /* decoded XOR */, source), fl.z.a("surface" /* decoded XOR */, surface));
    }

    public final void reportDefaultHomeStatus(int status, String scene) {
        "scene" /* decoded XOR */;
        scene.getClass();
        event("default_home_status" /* decoded XOR */, fl.z.a("is_default_home" /* decoded XOR */, Integer.valueOf(status)), fl.z.a("scene" /* decoded XOR */, scene));
    }

    public final void reportDesktopFirstScreenShow(boolean isDefaultHome) {
        event("first_desktop_first_screen_show" /* decoded XOR */, fl.z.a("is_default_home" /* decoded XOR */, Integer.valueOf(isDefaultHome ? 1 : 0)));
    }

    public final void reportFirstDefaultHomeSelected() {
        event("first_default_home_selected" /* decoded XOR */, new fl.t[0]);
    }

    public final void reportFirstMinusOneShow(String entryPath) {
        "entryPath" /* decoded XOR */;
        entryPath.getClass();
        event("first_minus_one_show" /* decoded XOR */, fl.z.a("entry_path" /* decoded XOR */, entryPath));
    }

    public final void reportPushShow(String source) {
        "source" /* decoded XOR */;
        source.getClass();
        event("push_show" /* decoded XOR */, fl.z.a("source" /* decoded XOR */, source));
    }

    public final void reportToolModuleUse(String scene) {
        "scene" /* decoded XOR */;
        scene.getClass();
        event("module_use" /* decoded XOR */, fl.z.a("scene" /* decoded XOR */, scene));
    }
}