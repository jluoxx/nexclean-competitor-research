package com.neeeex.virus;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.neeeex.eraser.R$color;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.m0;
import java.io.File;
import ji.n1;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends androidx.recyclerview.widget.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f66706c;

    public static final class a extends androidx.recyclerview.widget.h.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f66707a = new a();

        @Override // androidx.recyclerview.widget.h.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(e0 e0Var, e0 e0Var2) {
            m0.a("IKRVkqJ6wQ==\n", "T8gx29YfrOI=\n");
            e0Var.getClass();
            m0.a("rFIb3nseMQ==\n", "wjdslw97XD0=\n");
            e0Var2.getClass();
            return p003kotlin.jvm.internal.v.c(e0Var, e0Var2);
        }

        @Override // androidx.recyclerview.widget.h.f
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean b(e0 e0Var, e0 e0Var2) {
            m0.a("aB74gQS1YQ==\n", "B3KcyHDQDL8=\n");
            e0Var.getClass();
            m0.a("vd4n4JMb1w==\n", "07tQqed+uvM=\n");
            e0Var2.getClass();
            return p003kotlin.jvm.internal.v.c(e0Var.g(), e0Var2.g());
        }
    }

    public static final class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n1 f66708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Function1 f66709c;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f66710a;

            static {
                int[] iArr = new int[h0.values().length];
                try {
                    iArr[h0.MALWARE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h0.RISK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f66710a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n1 n1Var, Function1 function1) {
            super(n1Var.getRoot());
            m0.a("MY/6R60+Ag==\n", "U+aUI8RQZVk=\n");
            n1Var.getClass();
            m0.a("IbjlnXtMBkc=\n", "Ttak/g8laSk=\n");
            function1.getClass();
            this.f66708b = n1Var;
            this.f66709c = function1;
        }

        public static final void d(b bVar, e0 e0Var, View view) {
            bVar.f66709c.invoke(e0Var);
        }

        public final void c(final e0 e0Var) {
            String string;
            m0.a("HBgTPRyi\n", "aHBhWH3WsiU=\n");
            e0Var.getClass();
            n1 n1Var = this.f66708b;
            Context context = n1Var.getRoot().getContext();
            n1Var.f85604d.setText(f(e0Var));
            e(e0Var);
            TextView textView = n1Var.f85605e;
            int i10 = a.f66710a[e0Var.e().ordinal()];
            if (i10 == 1) {
                string = context.getString(R$string.virus_neeeex_malware);
            } else {
                if (i10 != 2) {
                    coil.util.j.a();
                    return;
                }
                string = context.getString(R$string.virus_neeeex_risk);
            }
            textView.setText(string);
            n1Var.f85605e.setTextColor(l2.a.getColor(context, e0Var.e() == h0.MALWARE ? R$color.virus_neeeex_scan_risk : R$color.virus_neeeex_risk_orange));
            n1Var.f85602b.setText(context.getString(e0Var.a() == f0.UNINSTALL ? R$string.virus_neeeex_uninstall : R$string.virus_neeeex_delete));
            n1Var.f85602b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.virus.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    m.b.d(this.f66711a, e0Var, view);
                }
            });
        }

        public final void e(e0 e0Var) {
            Object objM372constructorimpl;
            Drawable drawable = null;
            drawable = null;
            if (e0Var.a() == f0.UNINSTALL && !k0.r0(e0Var.d())) {
                try {
                    fl.u.a aVar = fl.u.Companion;
                    objM372constructorimpl = fl.u.m372constructorimpl(this.f66708b.getRoot().getContext().getPackageManager().getApplicationIcon(e0Var.d()));
                } catch (Throwable th2) {
                    fl.u.a aVar2 = fl.u.Companion;
                    objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
                }
                drawable = (Drawable) (fl.u.m377isFailureimpl(objM372constructorimpl) ? null : objM372constructorimpl);
            }
            n1 n1Var = this.f66708b;
            if (drawable != null) {
                n1Var.f85603c.setImageDrawable(drawable);
            } else {
                n1Var.f85603c.setImageResource(R$drawable.virus_neeeex_icon);
            }
        }

        public final String f(e0 e0Var) {
            String strC = e0Var.c();
            if (k0.r0(strC)) {
                strC = null;
            }
            if (strC != null) {
                return strC;
            }
            String strB = e0Var.b();
            if (k0.r0(strB)) {
                strB = null;
            }
            String name = strB != null ? new File(strB).getName() : null;
            return name == null ? e0Var.d() : name;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Function1 function1) {
        super(a.f66707a);
        m0.a("qRK5imDZpII=\n", "xnz46RSwy+w=\n");
        function1.getClass();
        this.f66706c = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        m0.a("LsWg6hwT\n", "RqrMjnlhKI0=\n");
        bVar.getClass();
        Object objG = g(i10);
        m0.a("1d5l/1lgihiclT+f\n", "srsRti0F5zA=\n");
        objG.getClass();
        bVar.c((e0) objG);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        m0.a("WZMSn+Q5\n", "KfJg+opNEEo=\n");
        viewGroup.getClass();
        n1 n1VarC = n1.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        m0.a("Du0GC5KWxlhJrU5O\n", "Z4NgZ/Pio3A=\n");
        n1VarC.getClass();
        return new b(n1VarC, this.f66706c);
    }
}