package com.neeeex.eraser.recover.reco.p;

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
import gl.a1;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import ji.z0;
import p003kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends RecyclerView.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f65814e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f65815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f65816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f65817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fl.n f65818d;

    public static final class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ji.x0 f65819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CheckBox f65820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f65821d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ji.x0 x0Var) {
            super(x0Var.getRoot());
            com.neeeex.eraser.m0.a("hMoGN8a9cA==\n", "5qNoU6/TFzk=\n");
            x0Var.getClass();
            this.f65819b = x0Var;
            AppCompatCheckBox appCompatCheckBox = x0Var.f85738b;
            com.neeeex.eraser.m0.a("+2cluRJ8+V3cZB+5\n", "mAVr3HcZnCU=\n");
            appCompatCheckBox.getClass();
            this.f65820c = appCompatCheckBox;
            AppCompatTextView appCompatTextView = x0Var.f85740d;
            com.neeeex.eraser.m0.a("Tf8RaEPYRwh96Cto\n", "OYlfDSa9InA=\n");
            appCompatTextView.getClass();
            this.f65821d = appCompatTextView;
        }

        public final CheckBox b() {
            return this.f65820c;
        }

        public final TextView c() {
            return this.f65821d;
        }
    }

    public interface c {
        void a();
    }

    public static final class d extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final z0 f65822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CheckBox f65823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final FrameLayout f65824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f65825e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(z0 z0Var) {
            super(z0Var.getRoot());
            com.neeeex.eraser.m0.a("u2AcngwKZA==\n", "2Qly+mVkA3Q=\n");
            z0Var.getClass();
            this.f65822b = z0Var;
            AppCompatCheckBox appCompatCheckBox = z0Var.f85768b;
            com.neeeex.eraser.m0.a("FFpJjhfUgbskXWuOEcWpphNRZg==\n", "dzgH63Kx5MM=\n");
            appCompatCheckBox.getClass();
            this.f65823c = appCompatCheckBox;
            FrameLayout frameLayout = z0Var.f85771e;
            com.neeeex.eraser.m0.a("eKIW2qzbSzpNqzTaqspjJ3qnOQ==\n", "Hs5Yv8m+LkI=\n");
            frameLayout.getClass();
            this.f65824d = frameLayout;
            AppCompatImageView appCompatImageView = z0Var.f85772f;
            com.neeeex.eraser.m0.a("o+kSIJJKBEaD6zkop0cOSqU=\n", "yp9cRfcvYT4=\n");
            appCompatImageView.getClass();
            this.f65825e = appCompatImageView;
        }

        public final CheckBox b() {
            return this.f65823c;
        }

        public final FrameLayout c() {
            return this.f65824d;
        }

        public final ImageView d() {
            return this.f65825e;
        }
    }

    public e(List list, boolean z10, c cVar) {
        com.neeeex.eraser.m0.a("X41MRFlqf70=\n", "OeQgIRUDDMk=\n");
        list.getClass();
        com.neeeex.eraser.m0.a("Ut39L7/umXtXyP0rpM6xbELd5yuk\n", "NriJTtaC2B8=\n");
        cVar.getClass();
        this.f65815a = list;
        this.f65816b = z10;
        this.f65817c = cVar;
        this.f65818d = fl.o.b(new Function0() { // from class: com.neeeex.eraser.recover.reco.p.d
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e.j();
            }
        });
    }

    public static SimpleDateFormat j() {
        return new SimpleDateFormat(com.neeeex.eraser.m0.a("22nY7jCsFpnvXew=\n", "liSVzlTIOOA=\n"));
    }

    public static final void m(e eVar, ii.c cVar, View view) {
        eVar.k(new AbstractC0797e.b(cVar.b(), !cVar.i()));
    }

    public static final void o(d dVar, ii.c cVar, e eVar, View view) {
        PhotoPreviewNEEEEXActivity.Companion aVar = PhotoPreviewNEEEEXActivity.INSTANCE;
        Context context = dVar.itemView.getContext();
        com.neeeex.eraser.m0.a("OWtuC4Ltj5MmejJmw63S\n", "Xg4aSO2D+/Y=\n");
        context.getClass();
        aVar.a(context, cVar.e(), cVar.h(), cVar.c(), com.neeeex.eraser.utils.d.b(cVar.f(), 0, 2, null), cVar.b(), eVar.f65816b);
    }

    public static final void p(e eVar, int i10, View view) {
        eVar.k(new AbstractC0797e.c(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f65815a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        Integer num = ((ii.c) this.f65815a.get(i10)).j() ? 0 : null;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final void k(AbstractC0797e abstractC0797e) {
        boolean z10 = false;
        TreeSet treeSetE = a1.e(new Integer[0]);
        if (p003kotlin.jvm.internal.v.c(abstractC0797e, AbstractC0797e.a.f65826a)) {
            List list = this.f65815a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((ii.c) it.next()).i()) {
                        z10 = true;
                        break;
                    }
                }
            }
            Iterator it2 = gl.w.n(this.f65815a).iterator();
            while (it2.hasNext()) {
                t(((gl.q0) it2).nextInt(), z10, treeSetE);
            }
        } else if (abstractC0797e instanceof AbstractC0797e.b) {
            Iterator it3 = gl.w.n(this.f65815a).iterator();
            while (it3.hasNext()) {
                int iNextInt = ((gl.q0) it3).nextInt();
                AbstractC0797e.b bVar = (AbstractC0797e.b) abstractC0797e;
                if (p003kotlin.jvm.internal.v.c(((ii.c) this.f65815a.get(iNextInt)).b(), bVar.a())) {
                    t(iNextInt, bVar.b(), treeSetE);
                }
            }
        } else {
            if (!(abstractC0797e instanceof AbstractC0797e.c)) {
                coil.util.j.a();
                return;
            }
            AbstractC0797e.c cVar = (AbstractC0797e.c) abstractC0797e;
            ii.c cVar2 = (ii.c) this.f65815a.get(cVar.a());
            t(cVar.a(), !cVar2.i(), treeSetE);
            q(cVar2.b(), treeSetE);
        }
        Iterator it4 = treeSetE.iterator();
        while (it4.hasNext()) {
            notifyItemChanged(((Number) it4.next()).intValue());
        }
        this.f65817c.a();
    }

    public final void l(b bVar, final ii.c cVar) {
        bVar.c().setText(r().format(Long.valueOf(cVar.a())));
        bVar.b().setChecked(cVar.i());
        bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.m(this.f65802a, cVar, view);
            }
        });
    }

    public final void n(final d dVar, final ii.c cVar, final int i10) {
        dVar.b().setChecked(cVar.i());
        com.bumptech.glide.b.t(dVar.itemView.getContext()).s(new File(cVar.h())).G0(dVar.d());
        dVar.d().setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.o(dVar, cVar, this, view);
            }
        });
        dVar.c().setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.p(this.f65799a, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.g0 g0Var, int i10) {
        com.neeeex.eraser.m0.a("LvN1r6o4\n", "RpwZy89KkRc=\n");
        g0Var.getClass();
        if (g0Var instanceof b) {
            l((b) g0Var, (ii.c) this.f65815a.get(i10));
        } else if (g0Var instanceof d) {
            n((d) g0Var, (ii.c) this.f65815a.get(i10), i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        com.neeeex.eraser.m0.a("HX1NNfhZ\n", "bRw/UJYtPeA=\n");
        viewGroup.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i10 == 0) {
            ji.x0 x0VarC = ji.x0.c(layoutInflaterFrom, viewGroup, false);
            com.neeeex.eraser.m0.a("FKOw+nn0X8xT4/i/\n", "fc3WlhiAOuQ=\n");
            x0VarC.getClass();
            return new b(x0VarC);
        }
        z0 z0VarC = z0.c(layoutInflaterFrom, viewGroup, false);
        com.neeeex.eraser.m0.a("P/tzLM5DSwV4uztp\n", "VpUVQK83Li0=\n");
        z0VarC.getClass();
        return new d(z0VarC);
    }

    public final void q(String str, Set set) {
        boolean z10;
        Iterator it = gl.w.n(this.f65815a).iterator();
        Integer numValueOf = null;
        loop0: while (true) {
            z10 = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                int iNextInt = ((gl.q0) it).nextInt();
                ii.c cVar = (ii.c) this.f65815a.get(iNextInt);
                if (p003kotlin.jvm.internal.v.c(cVar.b(), str)) {
                    if (cVar.j()) {
                        numValueOf = Integer.valueOf(iNextInt);
                    } else if (!z10 || !cVar.i()) {
                        z10 = false;
                    }
                }
            }
        }
        if (numValueOf != null) {
            t(numValueOf.intValue(), z10, set);
        }
    }

    public final SimpleDateFormat r() {
        return (SimpleDateFormat) this.f65818d.getValue();
    }

    public final void s() {
        k(AbstractC0797e.a.f65826a);
    }

    public final void t(int i10, boolean z10, Set set) {
        if (((ii.c) this.f65815a.get(i10)).i() == z10) {
            return;
        }
        ((ii.c) this.f65815a.get(i10)).m(z10);
        set.add(Integer.valueOf(i10));
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.p.e$e, reason: collision with other inner class name */
    public static abstract class AbstractC0797e {

        /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.p.e$e$a */
        public static final class a extends AbstractC0797e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f65826a = new a();

            public a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 2019430195;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("uQwj\n", "+GBPSTewDTk=\n");
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.p.e$e$b */
        public static final class b extends AbstractC0797e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f65827a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f65828b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10) {
                super(null);
                com.neeeex.eraser.m0.a("mxWGIg==\n", "/3TyR5Lcg50=\n");
                str.getClass();
                this.f65827a = str;
                this.f65828b = z10;
            }

            public final String a() {
                return this.f65827a;
            }

            public final boolean b() {
                return this.f65828b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p003kotlin.jvm.internal.v.c(this.f65827a, bVar.f65827a) && this.f65828b == bVar.f65828b;
            }

            public int hashCode() {
                return (this.f65827a.hashCode() * 31) + Boolean.hashCode(this.f65828b);
            }

            public String toString() {
                return "Group(date=" + this.f65827a + ", value=" + this.f65828b + ")";
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.p.e$e$c */
        public static final class c extends AbstractC0797e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f65829a;

            public c(int i10) {
                super(null);
                this.f65829a = i10;
            }

            public final int a() {
                return this.f65829a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f65829a == ((c) obj).f65829a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f65829a);
            }

            public String toString() {
                return "Item(index=" + this.f65829a + ")";
            }
        }

        public /* synthetic */ AbstractC0797e(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public AbstractC0797e() {
        }
    }
}