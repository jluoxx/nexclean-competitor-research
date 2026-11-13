package com.neeeex.eraser.recover.reco.f;

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
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ji.x0;
import ji.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f65639d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f65640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f65641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f65642c;

    public static final class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x0 f65643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CheckBox f65644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f65645d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x0 x0Var) {
            super(x0Var.getRoot());
            com.neeeex.eraser.m0.a("jQGuPkRLIQ==\n", "72jAWi0lRrM=\n");
            x0Var.getClass();
            this.f65643b = x0Var;
            AppCompatCheckBox appCompatCheckBox = x0Var.f85738b;
            com.neeeex.eraser.m0.a("5dL+igGHZBLC0cSK\n", "hrCw72TiAWo=\n");
            appCompatCheckBox.getClass();
            this.f65644c = appCompatCheckBox;
            AppCompatTextView appCompatTextView = x0Var.f85740d;
            com.neeeex.eraser.m0.a("Npf9Ro1XAPoGgMdG\n", "QuGzI+gyZYI=\n");
            appCompatTextView.getClass();
            this.f65645d = appCompatTextView;
        }

        public final CheckBox b() {
            return this.f65644c;
        }

        public final TextView c() {
            return this.f65645d;
        }
    }

    public interface c {
        void a();
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.f.d$d, reason: collision with other inner class name */
    public static final class C0790d extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y0 f65646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CheckBox f65647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final FrameLayout f65648d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f65649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f65650f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TextView f65651g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0790d(y0 y0Var) {
            super(y0Var.getRoot());
            com.neeeex.eraser.m0.a("yGSz/DnmSA==\n", "qg3dmFCIL+M=\n");
            y0Var.getClass();
            this.f65646b = y0Var;
            AppCompatCheckBox appCompatCheckBox = y0Var.f85747b;
            com.neeeex.eraser.m0.a("RkjfFShdKTt2T/0VLkwKKklP\n", "JSqRcE04TEM=\n");
            appCompatCheckBox.getClass();
            this.f65647c = appCompatCheckBox;
            FrameLayout frameLayout = y0Var.f85748c;
            com.neeeex.eraser.m0.a("Srn+bZXtXz5/sNxtk/x8L0Cw\n", "LNWwCPCIOkY=\n");
            frameLayout.getClass();
            this.f65648d = frameLayout;
            AppCompatImageView appCompatImageView = y0Var.f85749d;
            com.neeeex.eraser.m0.a("M/2Z4O5BsmUc4rvgwke4cw==\n", "WovXhYsk1x0=\n");
            appCompatImageView.getClass();
            this.f65649e = appCompatImageView;
            AppCompatTextView appCompatTextView = y0Var.f85751f;
            com.neeeex.eraser.m0.a("i/5P0kXIdC654W3Sbsx8Mw==\n", "/4gBtyCtEVY=\n");
            appCompatTextView.getClass();
            this.f65650f = appCompatTextView;
            AppCompatTextView appCompatTextView2 = y0Var.f85752g;
            com.neeeex.eraser.m0.a("guuoMUh4IbGw9IoxfnQ+rA==\n", "9p3mVC0dRMk=\n");
            appCompatTextView2.getClass();
            this.f65651g = appCompatTextView2;
        }

        public final CheckBox b() {
            return this.f65647c;
        }

        public final FrameLayout c() {
            return this.f65648d;
        }

        public final ImageView d() {
            return this.f65649e;
        }

        public final TextView e() {
            return this.f65650f;
        }

        public final TextView f() {
            return this.f65651g;
        }
    }

    public interface e {

        public static final class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f65652a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f65653b;

            public a(String str, boolean z10) {
                com.neeeex.eraser.m0.a("On/q\n", "URqTmWXS9R4=\n");
                str.getClass();
                this.f65652a = str;
                this.f65653b = z10;
            }

            public final String a() {
                return this.f65652a;
            }

            public final boolean b() {
                return this.f65653b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return p003kotlin.jvm.internal.v.c(this.f65652a, aVar.f65652a) && this.f65653b == aVar.f65653b;
            }

            public int hashCode() {
                return (this.f65652a.hashCode() * 31) + Boolean.hashCode(this.f65653b);
            }

            public String toString() {
                return "DateGroup(key=" + this.f65652a + ", selected=" + this.f65653b + ")";
            }
        }

        public static final class b implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f65654a = new b();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 882658269;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("iuSnj2kEiua767+JfA==\n", "z4rT5hthyYc=\n");
            }
        }

        public static final class c implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f65655a;

            public c(int i10) {
                this.f65655a = i10;
            }

            public final int a() {
                return this.f65655a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f65655a == ((c) obj).f65655a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f65655a);
            }

            public String toString() {
                return "Single(position=" + this.f65655a + ")";
            }
        }
    }

    public d(List list, boolean z10, c cVar) {
        com.neeeex.eraser.m0.a("J9t+BzgckHI=\n", "QbISYnR14wY=\n");
        list.getClass();
        com.neeeex.eraser.m0.a("h/k56aO0uSCC7DntuJSRN5f5I+24\n", "45xNiMrY+EQ=\n");
        cVar.getClass();
        this.f65640a = list;
        this.f65641b = z10;
        this.f65642c = cVar;
    }

    public static final void k(d dVar, ii.c cVar, View view) {
        dVar.p(new e.a(cVar.b(), !cVar.i()));
    }

    public static final void m(C0790d c0790d, ii.c cVar, d dVar, View view) {
        FilePreviewNEEEEXActivity.Companion aVar = FilePreviewNEEEEXActivity.INSTANCE;
        Context context = c0790d.itemView.getContext();
        com.neeeex.eraser.m0.a("dodP/s8S5JhplhOTjlK5\n", "EeI7vaB8kP0=\n");
        context.getClass();
        aVar.a(context, cVar.e(), cVar.h(), com.neeeex.eraser.utils.d.b(cVar.f(), 0, 2, null), cVar.b(), cVar.g(), dVar.f65641b);
    }

    public static final void n(d dVar, int i10, View view) {
        dVar.p(new e.c(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f65640a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return !((ii.c) this.f65640a.get(i10)).j() ? 1 : 0;
    }

    public final void j(b bVar, final ii.c cVar) {
        bVar.c().setText(new SimpleDateFormat(com.neeeex.eraser.m0.a("9sqzPq+OtrbC/oc=\n", "u4f+HsvqmM8=\n")).format(Long.valueOf(cVar.a())));
        bVar.b().setChecked(cVar.i());
        bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.k(this.f65635a, cVar, view);
            }
        });
    }

    public final void l(final C0790d c0790d, final ii.c cVar, final int i10) {
        c0790d.d().setImageResource(com.neeeex.eraser.utils.c.f66140a.d(cVar.g()));
        c0790d.e().setText(cVar.e());
        c0790d.f().setText(com.neeeex.eraser.utils.d.b(cVar.f(), 0, 2, null));
        c0790d.b().setChecked(cVar.i());
        c0790d.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.m(c0790d, cVar, this, view);
            }
        });
        c0790d.c().setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.n(this.f65631a, i10, view);
            }
        });
    }

    public final void o(int i10, boolean z10, Set set) {
        ii.c cVar = (ii.c) this.f65640a.get(i10);
        if (cVar.i() == z10) {
            return;
        }
        cVar.m(z10);
        set.add(Integer.valueOf(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.g0 g0Var, int i10) {
        com.neeeex.eraser.m0.a("67+T9KaY\n", "g9D/kMPqoeI=\n");
        g0Var.getClass();
        if (g0Var instanceof b) {
            j((b) g0Var, (ii.c) this.f65640a.get(i10));
        } else if (g0Var instanceof C0790d) {
            l((C0790d) g0Var, (ii.c) this.f65640a.get(i10), i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        com.neeeex.eraser.m0.a("i/vczWSi\n", "+5quqArW04E=\n");
        viewGroup.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i10 == 0) {
            x0 x0VarC = x0.c(layoutInflaterFrom, viewGroup, false);
            com.neeeex.eraser.m0.a("NfJfbFTv7vJyshcp\n", "XJw5ADWbi9o=\n");
            x0VarC.getClass();
            return new b(x0VarC);
        }
        y0 y0VarC = y0.c(layoutInflaterFrom, viewGroup, false);
        com.neeeex.eraser.m0.a("PaYnx4hAeut65m+C\n", "VMhBq+k0H8M=\n");
        y0VarC.getClass();
        return new C0790d(y0VarC);
    }

    public final void p(e eVar) {
        Object next;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        if (p003kotlin.jvm.internal.v.c(eVar, e.b.f65654a)) {
            Iterator it = this.f65640a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ii.c) next).i());
            boolean z10 = next != null;
            Iterator it2 = gl.w.n(this.f65640a).iterator();
            while (it2.hasNext()) {
                o(((gl.q0) it2).nextInt(), z10, linkedHashSet);
            }
        } else if (eVar instanceof e.a) {
            for (Object obj : this.f65640a) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    gl.w.w();
                }
                e.a aVar = (e.a) eVar;
                if (p003kotlin.jvm.internal.v.c(((ii.c) obj).b(), aVar.a())) {
                    o(i10, aVar.b(), linkedHashSet);
                }
                i10 = i11;
            }
        } else {
            if (!(eVar instanceof e.c)) {
                coil.util.j.a();
                return;
            }
            e.c cVar = (e.c) eVar;
            ii.c cVar2 = (ii.c) this.f65640a.get(cVar.a());
            o(cVar.a(), !cVar2.i(), linkedHashSet);
            q(cVar2.b(), linkedHashSet);
        }
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            notifyItemChanged(((Number) it3.next()).intValue());
        }
        this.f65642c.a();
    }

    public final void q(String str, Set set) {
        int i10 = -1;
        boolean z10 = true;
        int i11 = 0;
        for (Object obj : this.f65640a) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                gl.w.w();
            }
            ii.c cVar = (ii.c) obj;
            if (p003kotlin.jvm.internal.v.c(cVar.b(), str)) {
                if (cVar.j()) {
                    i10 = i11;
                } else if (!cVar.i()) {
                    z10 = false;
                }
            }
            i11 = i12;
        }
        if (i10 >= 0) {
            o(i10, z10, set);
        }
    }

    public final void r() {
        p(e.b.f65654a);
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public a() {
        }
    }
}