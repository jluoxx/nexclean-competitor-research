package com.neeeex.eraser.module.main;

import android.content.Context;
import com.neeeex.eraser.R$string;
import java.util.ArrayList;
import p003kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f65386a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fl.t[] f65387b = {fl.z.a(com.neeeex.eraser.m0.a("alrapUzh\n", "GSOp0SmMP90=\n"), null), fl.z.a(com.neeeex.eraser.m0.a("yFM=\n", "rT0X9M7Mou0=\n"), com.neeeex.eraser.m0.a("UHCm9z3SFA==\n", "FR7Bm1ShfNU=\n")), fl.z.a(com.neeeex.eraser.m0.a("4Ds=\n", "hUjZYN+s3Lk=\n"), com.neeeex.eraser.m0.a("qFY8zfZaac0=\n", "7SVMrDXrBqE=\n")), fl.z.a(com.neeeex.eraser.m0.a("T+g=\n", "JIeUMre7gn8=\n"), com.neeeex.eraser.m0.a("4STEJED0zvS0\n", "DLFYzvVZImk=\n")), fl.z.a(com.neeeex.eraser.m0.a("pDY=\n", "zldBNa+wcJU=\n"), com.neeeex.eraser.m0.a("EaHwV3885y1p\n", "9zZVseOQD4c=\n")), fl.z.a(com.neeeex.eraser.m0.a("Y30=\n", "EwnNYX4PID4=\n"), com.neeeex.eraser.m0.a("rqqk8UhpPGlUtg==\n", "/sXWhT0OSao=\n")), fl.z.a(com.neeeex.eraser.m0.a("QZI=\n", "J+AXXYFW/9c=\n"), com.neeeex.eraser.m0.a("JVgLcFB1gycQ\n", "YypqHpPS4k4=\n")), fl.z.a(com.neeeex.eraser.m0.a("3PQ=\n", "uJExUjBbL/o=\n"), com.neeeex.eraser.m0.a("UInESQSMGg==\n", "FOyxPXfvckE=\n")), fl.z.a(com.neeeex.eraser.m0.a("fbM=\n", "FMfcRftDNRA=\n"), com.neeeex.eraser.m0.a("spZjCTXpu1c=\n", "++ICZVyI1Tg=\n")), fl.z.a(com.neeeex.eraser.m0.a("fEg=\n", "EiS6UrSXb1I=\n"), com.neeeex.eraser.m0.a("jiC+VSRWz9ikNg==\n", "wEXaMFY6rrY=\n")), fl.z.a(com.neeeex.eraser.m0.a("nVo=\n", "9DTBPfQD+zE=\n"), com.neeeex.eraser.m0.a("VKOTbjA9Vol4ppRhJi8foQ==\n", "FsL7D0NcdsA=\n")), fl.z.a(com.neeeex.eraser.m0.a("0Eo=\n", "vTlfdAZZUxo=\n"), com.neeeex.eraser.m0.a("xR3zJWV+\n", "iHifRBwLszA=\n")), fl.z.a(com.neeeex.eraser.m0.a("nwo=\n", "62Lp+8OVdIY=\n"), com.neeeex.eraser.m0.a("66PbnydhKXyp\n", "Cxpff5/2ycQ=\n")), fl.z.a(com.neeeex.eraser.m0.a("KX0=\n", "XxQM5YGi2aA=\n"), com.neeeex.eraser.m0.a("PX9yyIayYUI/f3LJvqg=\n", "aRaTcjncBmI=\n")), fl.z.a(com.neeeex.eraser.m0.a("6Dk=\n", "nEspBQrX72I=\n"), com.neeeex.eraser.m0.a("kDdsPFo=\n", "xPTQTjGi2VM=\n")), fl.z.a(com.neeeex.eraser.m0.a("f6Fxgkr5\n", "Bclc8Am3ld0=\n"), com.neeeex.eraser.m0.a("3hFrdbyUptCUWX0W\n", "Ob/rkQEHQmg=\n")), fl.z.a(com.neeeex.eraser.m0.a("n7KvQIkI\n", "5dqCMt1fWmo=\n"), com.neeeex.eraser.m0.a("2gevsw90146QWLjd\n", "Pb4uWqTgMzY=\n"))};

    public static String a() {
        String string;
        Context contextA = com.neeeex.eraser.y.Companion.a();
        return (contextA == null || (string = contextA.getString(R$string.lang_neeeex_system)) == null) ? com.neeeex.eraser.m0.a("jwTr1kicPnG5G/nXQYU=\n", "3H2Yoi3xHhU=\n") : string;
    }

    public static final String c(fl.n nVar) {
        return (String) nVar.getValue();
    }

    public final ArrayList b() {
        fl.n nVarB = fl.o.b(new Function0() { // from class: com.neeeex.eraser.module.main.u
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v.a();
            }
        });
        fl.t[] tVarArr = f65387b;
        ArrayList arrayList = new ArrayList(tVarArr.length);
        for (fl.t tVar : tVarArr) {
            String str = (String) tVar.getFirst();
            String strC = (String) tVar.getSecond();
            if (strC == null) {
                strC = c(nVarB);
            }
            arrayList.add(new q(str, strC));
        }
        return arrayList;
    }
}