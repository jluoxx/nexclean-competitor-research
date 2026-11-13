package com.neeeex.ctools.features.recent;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.m0;
import java.util.Arrays;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.m;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f64811c;

    /* JADX INFO: renamed from: com.neeeex.ctools.features.recent.a$a, reason: collision with other inner class name */
    public static final class C0767a extends androidx.recyclerview.widget.h.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0767a f64812a = new C0767a();

        @Override // androidx.recyclerview.widget.h.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(gi.b bVar, gi.b bVar2) {
            m0.a("Kw+81VoC+Q==\n", "RGPYnC5nlIE=\n");
            bVar.getClass();
            m0.a("M1PSrRLjwA==\n", "XTal5GaGras=\n");
            bVar2.getClass();
            return v.c(bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.h.f
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean b(gi.b bVar, gi.b bVar2) {
            m0.a("Rb1oa2w5HA==\n", "KtEMIhhccSg=\n");
            bVar.getClass();
            m0.a("3F12T7i0pQ==\n", "sjgBBszRyGI=\n");
            bVar2.getClass();
            return v.c(bVar.f(), bVar2.f());
        }
    }

    public static final class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function1 f64813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f64814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f64815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f64816e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f64817f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TextView f64818g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TextView f64819h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public gi.b f64820i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, Function1 function1) {
            super(view);
            m0.a("AUYUmUeS9vg=\n", "aDJx9BH7k48=\n");
            view.getClass();
            m0.a("j4bMAntkRcWJi/Q=\n", "4OifdhQUBqk=\n");
            function1.getClass();
            this.f64813b = function1;
            View viewFindViewById = view.findViewById(R$id.neeeex_recent_app_icon);
            m0.a("3XIH36egAAv5YiDf2edLUpI=\n", "uxtpu/HJZXw=\n");
            viewFindViewById.getClass();
            this.f64814c = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R$id.neeeex_recent_app_title);
            m0.a("2zyDIp+p3FX/LKQi4e6XDJQ=\n", "vVXtRsnAuSI=\n");
            viewFindViewById2.getClass();
            this.f64815d = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R$id.neeeex_recent_launch_total);
            m0.a("2BVTIOFtsrr8BXQgnyr545c=\n", "vnw9RLcE180=\n");
            viewFindViewById3.getClass();
            this.f64816e = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R$id.neeeex_recent_launch_foreground);
            m0.a("W3EudbseAUp/YQl1xVlKExQ=\n", "PRhAEe13ZD0=\n");
            viewFindViewById4.getClass();
            this.f64817f = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R$id.neeeex_recent_launch_background);
            m0.a("ng0B9TxZpPS6HSb1Qh7vrdE=\n", "+GRvkWowwYM=\n");
            viewFindViewById5.getClass();
            this.f64818g = (TextView) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R$id.neeeex_recent_button_stop);
            m0.a("GY/6v1WPgWg9n92/K8jKMVY=\n", "f+aU2wPm5B8=\n");
            viewFindViewById6.getClass();
            this.f64819h = (TextView) viewFindViewById6;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.recent.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a.b.b(this.f64826a, view2);
                }
            });
        }

        public static void b(b bVar, View view) {
            bVar.f();
        }

        public static final void e(b bVar, View view) {
            bVar.f();
        }

        public final void d(gi.b bVar) {
            m0.a("ZpVgPg==\n", "D+EFU/lHi1k=\n");
            bVar.getClass();
            this.f64820i = bVar;
            C0768a c0768aA = C0768a.f64821e.a(bVar);
            this.f64814c.setImageDrawable(c0768aA.c());
            this.f64815d.setText(c0768aA.d());
            TextView[] textViewArr = {this.f64816e, this.f64817f, this.f64818g};
            int i10 = 0;
            int i11 = 0;
            while (i10 < 3) {
                textViewArr[i10].setText(c0768aA.b()[i11]);
                i10++;
                i11++;
            }
            TextView textView = this.f64819h;
            textView.setEnabled(c0768aA.a());
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.recent.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.b.e(this.f64827a, view);
                }
            });
        }

        public final void f() {
            gi.b bVar = this.f64820i;
            if (bVar != null) {
                if (!bVar.b()) {
                    bVar = null;
                }
                if (bVar != null) {
                    this.f64813b.invoke(bVar);
                }
            }
        }

        /* JADX INFO: renamed from: com.neeeex.ctools.features.recent.a$b$a, reason: collision with other inner class name */
        public static final class C0768a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final C0769a f64821e = new C0769a(null);

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Drawable f64822a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f64823b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String[] f64824c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final boolean f64825d;

            public C0768a(Drawable drawable, String str, String[] strArr, boolean z10) {
                m0.a("Ip5Iln8=\n", "Vvc8+hrUnIE=\n");
                str.getClass();
                m0.a("4rjPTTYG\n", "gde6I0J1nFU=\n");
                strArr.getClass();
                this.f64822a = drawable;
                this.f64823b = str;
                this.f64824c = strArr;
                this.f64825d = z10;
            }

            public final boolean a() {
                return this.f64825d;
            }

            public final String[] b() {
                return this.f64824c;
            }

            public final Drawable c() {
                return this.f64822a;
            }

            public final String d() {
                return this.f64823b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0768a)) {
                    return false;
                }
                C0768a c0768a = (C0768a) obj;
                return v.c(this.f64822a, c0768a.f64822a) && v.c(this.f64823b, c0768a.f64823b) && v.c(this.f64824c, c0768a.f64824c) && this.f64825d == c0768a.f64825d;
            }

            public int hashCode() {
                Drawable drawable = this.f64822a;
                return ((((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.f64823b.hashCode()) * 31) + Arrays.hashCode(this.f64824c)) * 31) + Boolean.hashCode(this.f64825d);
            }

            public String toString() {
                return "RowBinding(icon=" + this.f64822a + ", title=" + this.f64823b + ", counts=" + Arrays.toString(this.f64824c) + ", actionEnabled=" + this.f64825d + ")";
            }

            /* JADX INFO: renamed from: com.neeeex.ctools.features.recent.a$b$a$a, reason: collision with other inner class name */
            public static final class C0769a {
                public /* synthetic */ C0769a(m mVar) {
                    this();
                }

                public final C0768a a(gi.b bVar) {
                    m0.a("Xe9V8A==\n", "NJswnTvVwCk=\n");
                    bVar.getClass();
                    return new C0768a(bVar.d(), bVar.e(), new String[]{String.valueOf(bVar.g()), String.valueOf(bVar.c()), String.valueOf(bVar.a())}, bVar.b());
                }

                public C0769a() {
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Function1 function1) {
        super(C0767a.f64812a);
        m0.a("Y59wt8R1p/Vlkkg=\n", "DPEjw6sF5Jk=\n");
        function1.getClass();
        this.f64811c = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        m0.a("M7jzsckD\n", "W9ef1axxmqU=\n");
        bVar.getClass();
        Object objG = g(i10);
        m0.a("zQrAvyeCyXSEQZrf\n", "qm+09lPnpFw=\n");
        objG.getClass();
        bVar.d((gi.b) objG);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        m0.a("NuK6JDUq\n", "RoPIQVteGH4=\n");
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_neeeex_recent_app, viewGroup, false);
        viewInflate.getClass();
        return new b(viewInflate, this.f64811c);
    }
}