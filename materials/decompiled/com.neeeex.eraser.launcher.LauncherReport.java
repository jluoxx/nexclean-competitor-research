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
        m0.a("Fmp4uQ==\n", "eAsV3Ih+vzc=\n");
        name.getClass();
        m0.a("9hr713YH\n", "kHOeuxJ02LM=\n");
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
        event(m0.a("YUnOJuIGWqhhQck54gZWompF4zLjMFqoWFPUOuE=\n", "ByC8VZZZPs0=\n"), new fl.t[0]);
    }

    public final void reportDefaultHomeSelected(String source) {
        m0.a("aVCIalG6\n", "Gj/9GDLfK6g=\n");
        source.getClass();
        event(m0.a("BtGl7D4OblsK267oFBF/aAfXt+gv\n", "YrTDjUtiGgQ=\n"), fl.z.a(m0.a("00NXsZ2q\n", "oCwiw/7PHdI=\n"), source));
    }

    public final void reportDefaultHomeSettingsShow(String source, String surface) {
        m0.a("pq8IBvQK\n", "1cB9dJdvLnE=\n");
        source.getClass();
        m0.a("mmEYMig7DA==\n", "6RRqVElYadU=\n");
        surface.getClass();
        event(m0.a("YoCiTBCD/p5iiKVTEIPylGmMj0wBqO6Sao6jYBe09Yw=\n", "BOnQP2Tcmvs=\n"), fl.z.a(m0.a("m40T51D/\n", "6OJmlTOaGGI=\n"), source), fl.z.a(m0.a("gVt5nCvF6Q==\n", "8i4L+kqmjNk=\n"), surface));
    }

    public final void reportDefaultHomeStatus(int status, String scene) {
        m0.a("1sRd0DM=\n", "pac4vla4cto=\n");
        scene.getClass();
        event(m0.a("Lb9EZj4bweYhtU9iFATB2D2vUQ==\n", "SdoiB0t3tbk=\n"), fl.z.a(m0.a("qACOXegH8L2tB45R4gz0\n", "wXPROY1hkcg=\n"), Integer.valueOf(status)), fl.z.a(m0.a("8n9t4EQ=\n", "gRwIjiGqJoY=\n"), scene));
    }

    public final void reportDesktopFirstScreenShow(boolean isDefaultHome) {
        event(m0.a("1VSH7hdjEXTAVoHyE2MTeMFOgcIQXwd01lOq7gtTAg==\n", "sz31nWM8dRE=\n"), fl.z.a(m0.a("SqhYUpPnWZhPr1hemexd\n", "I9sHNvaBOO0=\n"), Integer.valueOf(isDefaultHome ? 1 : 0)));
    }

    public final void reportFirstDefaultHomeSelected() {
        event(m0.a("qyKtU/9ZM9arKqpM/1k/3KAugFPuajLQuS67\n", "zUvfIIsGV7M=\n"), new fl.t[0]);
    }

    public final void reportFirstMinusOneShow(String entryPath) {
        m0.a("avTXFnuzqh9n\n", "D5qjZALjy2s=\n");
        entryPath.getClass();
        event(m0.a("BUKE3pQKpkoNXoXyjzuufBBDmdo=\n", "Yyv2reBVyyM=\n"), fl.z.a(m0.a("iYDqo+Jf4MCYhg==\n", "7O6e0ZsAkKE=\n"), entryPath));
    }

    public final void reportPushShow(String source) {
        m0.a("tDgoSltM\n", "x1ddODgploI=\n");
        source.getClass();
        event(m0.a("w7pf4dUnXonE\n", "s88siYpUNuY=\n"), fl.z.a(m0.a("lX3vaAib\n", "5hKaGmv+j0A=\n"), source));
    }

    public final void reportToolModuleUse(String scene) {
        m0.a("O5xrBQ8=\n", "SP8Oa2rXWXs=\n");
        scene.getClass();
        event(m0.a("KR2ENOpvSrY3Fw==\n", "RHLgQYYKFcM=\n"), fl.z.a(m0.a("nTqDxTE=\n", "7lnmq1RTH00=\n"), scene));
    }
}