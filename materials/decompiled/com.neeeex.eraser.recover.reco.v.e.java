package com.neeeex.eraser.recover.reco.v;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p003kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends RecyclerView.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f65990e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f65991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f65992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f65993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fl.n f65994d;

    public static final class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ji.x0 f65995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CheckBox f65996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f65997d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ji.x0 x0Var) {
            super(x0Var.getRoot());
            com.neeeex.eraser.m0.a("vCye9IqvKQ==\n", "3kXwkOPBTqw=\n");
            x0Var.getClass();
            this.f65995b = x0Var;
            AppCompatCheckBox appCompatCheckBox = x0Var.f85738b;
            com.neeeex.eraser.m0.a("XloxAR5bRW15WQsB\n", "PTh/ZHs+IBU=\n");
            appCompatCheckBox.getClass();
            this.f65996c = appCompatCheckBox;
            AppCompatTextView appCompatTextView = x0Var.f85740d;
            com.neeeex.eraser.m0.a("wzgGBkcdz2HzLzwG\n", "t05IYyJ4qhk=\n");
            appCompatTextView.getClass();
            this.f65997d = appCompatTextView;
        }

        public final CheckBox b() {
            return this.f65996c;
        }

        public final TextView c() {
            return this.f65997d;
        }
    }

    public interface c {
        void a();
    }

    public interface d {

        public static final class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f65998a = new a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1892389160;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("KUCjR8LcwvACUQ==\n", "bDbGNbuoqpk=\n");
            }
        }

        public static final class b implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f65999a;

            public b(int i10) {
                this.f65999a = i10;
            }

            public final int a() {
                return this.f65999a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f65999a == ((b) obj).f65999a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f65999a);
            }

            public String toString() {
                return "Row(index=" + this.f65999a + ")";
            }
        }

        public static final class c implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f66000a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f66001b;

            public c(String str, boolean z10) {
                com.neeeex.eraser.m0.a("XSz3ag==\n", "OU2DD3uVBRI=\n");
                str.getClass();
                this.f66000a = str;
                this.f66001b = z10;
            }

            public final String a() {
                return this.f66000a;
            }

            public final boolean b() {
                return this.f66001b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return p003kotlin.jvm.internal.v.c(this.f66000a, cVar.f66000a) && this.f66001b == cVar.f66001b;
            }

            public int hashCode() {
                return (this.f66000a.hashCode() * 31) + Boolean.hashCode(this.f66001b);
            }

            public String toString() {
                return "Section(date=" + this.f66000a + ", selected=" + this.f66001b + ")";
            }
        }
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.v.e$e, reason: collision with other inner class name */
    public static final class C0800e extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ji.a1 f66002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CheckBox f66003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final FrameLayout f66004d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f66005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f66006f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0800e(ji.a1 a1Var) {
            super(a1Var.getRoot());
            com.neeeex.eraser.m0.a("XCwTCi+eIw==\n", "PkV9bkbwREw=\n");
            a1Var.getClass();
            this.f66002b = a1Var;
            AppCompatCheckBox appCompatCheckBox = a1Var.f85312b;
            com.neeeex.eraser.m0.a("8FMagUzSN/7AVDiBSsMf4/dYNQ==\n", "kzFU5Cm3UoY=\n");
            appCompatCheckBox.getClass();
            this.f66003c = appCompatCheckBox;
            FrameLayout frameLayout = a1Var.f85315e;
            com.neeeex.eraser.m0.a("CRG3MSJvUlw8GJUxJH56QQsUmA==\n", "b335VEcKNyQ=\n");
            frameLayout.getClass();
            this.f66004d = frameLayout;
            AppCompatImageView appCompatImageView = a1Var.f85316f;
            com.neeeex.eraser.m0.a("BiyEgFyeceImLq+IaZN77gA=\n", "b1rK5Tn7FJo=\n");
            appCompatImageView.getClass();
            this.f66005e = appCompatImageView;
            AppCompatTextView appCompatTextView = a1Var.f85317g;
            com.neeeex.eraser.m0.a("B9MB5OuLZOM30D3g+odu9Q==\n", "c6VPgY7uAZs=\n");
            appCompatTextView.getClass();
            this.f66006f = appCompatTextView;
        }

        public final CheckBox b() {
            return this.f66003c;
        }

        public final FrameLayout c() {
            return this.f66004d;
        }

        public final ImageView d() {
            return this.f66005e;
        }

        public final TextView e() {
            return this.f66006f;
        }
    }

    public e(List list, boolean z10, c cVar) {
        com.neeeex.eraser.m0.a("RdzvAIEpcT0=\n", "I7WDZc1AAkk=\n");
        list.getClass();
        com.neeeex.eraser.m0.a("ux5GuZ+1LYC+C0a9hJUFl6seXL2E\n", "33sy2PbZbOQ=\n");
        cVar.getClass();
        this.f65991a = list;
        this.f65992b = z10;
        this.f65993c = cVar;
        this.f65994d = fl.o.b(new Function0() { // from class: com.neeeex.eraser.recover.reco.v.b
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.g();
            }
        });
    }

    public static SimpleDateFormat g() {
        return new SimpleDateFormat(com.neeeex.eraser.m0.a("9T/ZXYgEYUvBC+0=\n", "uHKUfexgTzI=\n"));
    }

    public static final void m(e eVar, ii.c cVar, View view) {
        eVar.q(new d.c(cVar.b(), !cVar.i()));
    }

    public static final void o(ii.c cVar, C0800e c0800e, String str, e eVar, View view) {
        String strB = com.neeeex.eraser.utils.d.b(cVar.f(), 0, 2, null);
        VideoPreviewNEEEEXActivity.Companion aVar = VideoPreviewNEEEEXActivity.INSTANCE;
        Context context = c0800e.itemView.getContext();
        com.neeeex.eraser.m0.a("YUjT8/Q81dB+WY+etXyI\n", "Bi2nsJtSobU=\n");
        context.getClass();
        aVar.a(context, cVar.e(), cVar.h(), cVar.c(), strB, str, cVar.b(), eVar.f65992b);
    }

    public static final void p(e eVar, int i10, View view) {
        eVar.q(new d.b(i10));
    }

    private final SimpleDateFormat r() {
        return (SimpleDateFormat) this.f65994d.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f65991a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return !((ii.c) this.f65991a.get(i10)).j() ? 1 : 0;
    }

    public final void k(int i10, boolean z10, List list) {
        if (((ii.c) this.f65991a.get(i10)).i() == z10) {
            return;
        }
        ((ii.c) this.f65991a.get(i10)).m(z10);
        list.add(Integer.valueOf(i10));
    }

    public final void l(b bVar, final ii.c cVar) {
        bVar.c().setText(r().format(Long.valueOf(cVar.a())));
        bVar.b().setChecked(cVar.i());
        bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.m(this.f65969a, cVar, view);
            }
        });
    }

    public final void n(final C0800e c0800e, final int i10, final ii.c cVar) {
        c0800e.b().setChecked(cVar.i());
        com.bumptech.glide.b.t(c0800e.itemView.getContext()).s(new File(cVar.h())).G0(c0800e.d());
        final String strB = com.neeeex.eraser.utils.c.f66140a.b(cVar.d());
        c0800e.e().setText(strB);
        c0800e.d().setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.o(cVar, c0800e, strB, this, view);
            }
        });
        c0800e.c().setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.p(this.f65987a, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.g0 g0Var, int i10) {
        com.neeeex.eraser.m0.a("68z6CJFT\n", "g6OWbPQhel0=\n");
        g0Var.getClass();
        if (g0Var instanceof b) {
            l((b) g0Var, (ii.c) this.f65991a.get(i10));
        } else if (g0Var instanceof C0800e) {
            n((C0800e) g0Var, i10, (ii.c) this.f65991a.get(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        com.neeeex.eraser.m0.a("exWN3SVg\n", "C3T/uEsU44w=\n");
        viewGroup.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i10 == 0) {
            ji.x0 x0VarC = ji.x0.c(layoutInflaterFrom, viewGroup, false);
            com.neeeex.eraser.m0.a("D9Kaogsq61xIktLn\n", "Zrz8zmpejnQ=\n");
            x0VarC.getClass();
            return new b(x0VarC);
        }
        ji.a1 a1VarC = ji.a1.c(layoutInflaterFrom, viewGroup, false);
        com.neeeex.eraser.m0.a("iUxhptHd6r/ODCnj\n", "4CIHyrCpj5c=\n");
        a1VarC.getClass();
        return new C0800e(a1VarC);
    }

    public final void q(d dVar) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        int i10 = 0;
        if (p003kotlin.jvm.internal.v.c(dVar, d.a.f65998a)) {
            List list = this.f65991a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                } while (((ii.c) it.next()).i());
            } else {
                z10 = false;
                break;
            }
            Iterator it2 = gl.w.n(this.f65991a).iterator();
            while (it2.hasNext()) {
                k(((gl.q0) it2).nextInt(), z10, arrayList);
            }
        } else if (dVar instanceof d.c) {
            for (Object obj : this.f65991a) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    gl.w.w();
                }
                d.c cVar = (d.c) dVar;
                if (p003kotlin.jvm.internal.v.c(((ii.c) obj).b(), cVar.a())) {
                    k(i10, cVar.b(), arrayList);
                }
                i10 = i11;
            }
        } else {
            if (!(dVar instanceof d.b)) {
                coil.util.j.a();
                return;
            }
            d.b bVar = (d.b) dVar;
            ii.c cVar2 = (ii.c) this.f65991a.get(bVar.a());
            k(bVar.a(), true ^ cVar2.i(), arrayList);
            s(cVar2.b(), arrayList);
        }
        Iterator it3 = gl.g0.f0(arrayList).iterator();
        while (it3.hasNext()) {
            notifyItemChanged(((Number) it3.next()).intValue());
        }
        this.f65993c.a();
    }

    public final void s(String str, List list) {
        Object next;
        boolean z10;
        Iterable iterableM1 = gl.g0.m1(this.f65991a);
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterableM1) {
            if (p003kotlin.jvm.internal.v.c(((ii.c) ((gl.n0) obj).d()).b(), str)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ii.c) ((gl.n0) next).d()).j());
        gl.n0 n0Var = (gl.n0) next;
        if (n0Var != null) {
            int iC = n0Var.c();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ii.c cVar = (ii.c) ((gl.n0) it2.next()).b();
                if (!cVar.j() && !cVar.i()) {
                    z10 = false;
                    k(iC, z10, list);
                }
            }
            z10 = true;
            k(iC, z10, list);
        }
    }

    public final void t() {
        q(d.a.f65998a);
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public a() {
        }
    }
}