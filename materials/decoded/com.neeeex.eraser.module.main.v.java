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
    public static final fl.t[] f65387b = {fl.z.a("system" /* decoded XOR */, null), fl.z.a("en" /* decoded XOR */, "English" /* decoded XOR */), fl.z.a("es" /* decoded XOR */, "Español" /* decoded XOR */), fl.z.a("ko" /* decoded XOR */, "한국인" /* decoded XOR */), fl.z.a("ja" /* decoded XOR */, "日本語" /* decoded XOR */), fl.z.a("pt" /* decoded XOR */, "Português" /* decoded XOR */), fl.z.a("fr" /* decoded XOR */, "Français" /* decoded XOR */), fl.z.a("de" /* decoded XOR */, "Deutsch" /* decoded XOR */), fl.z.a("it" /* decoded XOR */, "Italiano" /* decoded XOR */), fl.z.a("nl" /* decoded XOR */, "Nederlands" /* decoded XOR */), fl.z.a("in" /* decoded XOR */, "Bahasa Indonesia" /* decoded XOR */), fl.z.a("ms" /* decoded XOR */, "Melayu" /* decoded XOR */), fl.z.a("th" /* decoded XOR */, "ไทย" /* decoded XOR */), fl.z.a("vi" /* decoded XOR */, "Tiếng Việt" /* decoded XOR */), fl.z.a("tr" /* decoded XOR */, "Türk" /* decoded XOR */), fl.z.a("zh-rCN" /* decoded XOR */, "简体中文" /* decoded XOR */), fl.z.a("zh-rTW" /* decoded XOR */, "繁體中文" /* decoded XOR */)};

    public static String a() {
        String string;
        Context contextA = com.neeeex.eraser.y.Companion.a();
        return (contextA == null || (string = contextA.getString(R$string.lang_neeeex_system)) == null) ? "System default" /* decoded XOR */ : string;
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