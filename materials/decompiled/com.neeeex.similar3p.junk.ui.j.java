package com.neeeex.similar3p.junk.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.m0;
import gl.b1;
import gl.c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends RecyclerView.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f66449e = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.neeeex.similar3p.junk.h0 f66450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tl.o f66451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f66452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f66453d;

    public interface a {

        /* JADX INFO: renamed from: com.neeeex.similar3p.junk.ui.j$a$a, reason: collision with other inner class name */
        public static final class C0814a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.neeeex.similar3p.junk.a f66454a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f66455b;

            public C0814a(com.neeeex.similar3p.junk.a aVar, boolean z10) {
                m0.a("MybDF19C0ko=\n", "UEe3cjgtoDM=\n");
                aVar.getClass();
                this.f66454a = aVar;
                this.f66455b = z10;
            }

            public final com.neeeex.similar3p.junk.a a() {
                return this.f66454a;
            }

            public final boolean b() {
                return this.f66455b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0814a)) {
                    return false;
                }
                C0814a c0814a = (C0814a) obj;
                return this.f66454a == c0814a.f66454a && this.f66455b == c0814a.f66455b;
            }

            public int hashCode() {
                return (this.f66454a.hashCode() * 31) + Boolean.hashCode(this.f66455b);
            }

            public String toString() {
                return "SelectCategory(category=" + this.f66454a + ", selected=" + this.f66455b + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f66456a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f66457b;

            public b(String str, boolean z10) {
                m0.a("1POS5w==\n", "pJLmj7ZFd1Q=\n");
                str.getClass();
                this.f66456a = str;
                this.f66457b = z10;
            }

            public final String a() {
                return this.f66456a;
            }

            public final boolean b() {
                return this.f66457b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p003kotlin.jvm.internal.v.c(this.f66456a, bVar.f66456a) && this.f66457b == bVar.f66457b;
            }

            public int hashCode() {
                return (this.f66456a.hashCode() * 31) + Boolean.hashCode(this.f66457b);
            }

            public String toString() {
                return "SelectItem(path=" + this.f66456a + ", selected=" + this.f66457b + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.neeeex.similar3p.junk.a f66458a;

            public c(com.neeeex.similar3p.junk.a aVar) {
                m0.a("FZgAwmE4Nn8=\n", "dvl0pwZXRAY=\n");
                aVar.getClass();
                this.f66458a = aVar;
            }

            public final com.neeeex.similar3p.junk.a a() {
                return this.f66458a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f66458a == ((c) obj).f66458a;
            }

            public int hashCode() {
                return this.f66458a.hashCode();
            }

            public String toString() {
                return "ToggleCategory(category=" + this.f66458a + ")";
            }
        }
    }

    public final class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CheckBox f66459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f66460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f66461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f66462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ j f66463f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar, View view) {
            super(view);
            m0.a("0TljEXGADXA=\n", "uE0GfCfpaAc=\n");
            view.getClass();
            this.f66463f = jVar;
            View viewFindViewById = view.findViewById(R$id.neeeex_junk_result_category_check);
            m0.a("36cC7ZclyD77tyXt6WKDZ5A=\n", "uc5sicFMrUk=\n");
            viewFindViewById.getClass();
            this.f66459b = (CheckBox) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R$id.neeeex_junk_result_category_title);
            m0.a("riYUQfTNbqqKNjNBiool8+E=\n", "yE96JaKkC90=\n");
            viewFindViewById2.getClass();
            this.f66460c = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R$id.neeeex_junk_result_category_summary);
            m0.a("wU+yX6KU8rjlX5Vf3NO54Y4=\n", "pybcO/T9l88=\n");
            viewFindViewById3.getClass();
            this.f66461d = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R$id.neeeex_junk_result_category_arrow);
            m0.a("+mcZEx4URAnedz4TYFMPULU=\n", "nA53d0h9IX4=\n");
            viewFindViewById4.getClass();
            this.f66462e = (ImageView) viewFindViewById4;
        }

        public static void b(List list, j jVar, com.neeeex.similar3p.junk.a aVar, View view) {
            if (list.isEmpty()) {
                return;
            }
            jVar.o(aVar);
        }

        public static void c(j jVar, com.neeeex.similar3p.junk.a aVar, CompoundButton compoundButton, boolean z10) {
            m0.a("hZusEsZf6ZHPj7BZ\n", "ue7CZ7U6jbE=\n");
            compoundButton.getClass();
            jVar.l(aVar, z10);
        }

        public final void d(final com.neeeex.similar3p.junk.a aVar, boolean z10) {
            m0.a("HYBPEvFAkxA=\n", "fuE7d5Yv4Wk=\n");
            aVar.getClass();
            final List listD = this.f66463f.f66450a.d(aVar);
            this.f66460c.setText(this.f66463f.n(aVar));
            TextView textView = this.f66461d;
            Iterator it = listD.iterator();
            long jE = 0;
            while (it.hasNext()) {
                jE += ((com.neeeex.similar3p.junk.b0) it.next()).e();
            }
            textView.setText(e0.a(jE));
            this.f66459b.setOnCheckedChangeListener(null);
            List list = listD;
            this.f66459b.setEnabled(!list.isEmpty());
            this.f66459b.setChecked(this.f66463f.f66450a.c(aVar));
            CheckBox checkBox = this.f66459b;
            final j jVar = this.f66463f;
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.neeeex.similar3p.junk.ui.k
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    j.b.c(jVar, aVar, compoundButton, z11);
                }
            });
            this.f66462e.setImageResource(z10 ? R$drawable.neeeex_junk_result_arrow_up : R$drawable.neeeex_junk_result_arrow_down);
            this.f66462e.setAlpha(!list.isEmpty() ? 1.0f : 0.35f);
            View view = this.itemView;
            final j jVar2 = this.f66463f;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.similar3p.junk.ui.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    j.b.b(listD, jVar2, aVar, view2);
                }
            });
        }
    }

    public final class d extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f66464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f66465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CheckBox f66466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j f66467e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(j jVar, View view) {
            super(view);
            m0.a("K7Pesro/VFk=\n", "Qse73+xWMS4=\n");
            view.getClass();
            this.f66467e = jVar;
            View viewFindViewById = view.findViewById(R$id.neeeex_junk_result_file_name);
            m0.a("tyOoyn6e4gGTM4/KANmpWPg=\n", "0UrGrij3h3Y=\n");
            viewFindViewById.getClass();
            this.f66464b = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R$id.neeeex_junk_result_file_size);
            m0.a("w9rAML3T1Qjnyucww5SeUYw=\n", "pbOuVOu6sH8=\n");
            viewFindViewById2.getClass();
            this.f66465c = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R$id.neeeex_junk_result_file_check);
            m0.a("3ZytcHlGrI/5jIpwBwHn1pI=\n", "u/XDFC8vyfg=\n");
            viewFindViewById3.getClass();
            this.f66466d = (CheckBox) viewFindViewById3;
        }

        public static void b(d dVar, View view) {
            CheckBox checkBox = dVar.f66466d;
            checkBox.setChecked(!checkBox.isChecked());
        }

        public static void c(j jVar, com.neeeex.similar3p.junk.b0 b0Var, CompoundButton compoundButton, boolean z10) {
            m0.a("xB3Mj4wFJvaOCdDE\n", "+Gii+v9gQtY=\n");
            compoundButton.getClass();
            jVar.m(b0Var.d(), z10);
        }

        public final void d(final com.neeeex.similar3p.junk.b0 b0Var) {
            m0.a("Fb5Plw==\n", "fMoq+k6nmQc=\n");
            b0Var.getClass();
            this.f66464b.setText(b0Var.c());
            this.f66465c.setText(e0.a(b0Var.e()));
            this.f66466d.setOnCheckedChangeListener(null);
            this.f66466d.setChecked(this.f66467e.f66450a.f().contains(b0Var.d()));
            CheckBox checkBox = this.f66466d;
            final j jVar = this.f66467e;
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.neeeex.similar3p.junk.ui.m
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    j.d.c(jVar, b0Var, compoundButton, z10);
                }
            });
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.similar3p.junk.ui.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j.d.b(this.f66481a, view);
                }
            });
        }
    }

    public interface e {

        public static final class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.neeeex.similar3p.junk.a f66468a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f66469b;

            public a(com.neeeex.similar3p.junk.a aVar, boolean z10) {
                m0.a("jmWmTL9AbOY=\n", "7QTSKdgvHp8=\n");
                aVar.getClass();
                this.f66468a = aVar;
                this.f66469b = z10;
            }

            public final com.neeeex.similar3p.junk.a a() {
                return this.f66468a;
            }

            public final boolean b() {
                return this.f66469b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f66468a == aVar.f66468a && this.f66469b == aVar.f66469b;
            }

            public int hashCode() {
                return (this.f66468a.hashCode() * 31) + Boolean.hashCode(this.f66469b);
            }

            public String toString() {
                return "CategoryRow(category=" + this.f66468a + ", expanded=" + this.f66469b + ")";
            }
        }

        public static final class b implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.neeeex.similar3p.junk.b0 f66470a;

            public b(com.neeeex.similar3p.junk.b0 b0Var) {
                m0.a("CI2gZQ==\n", "YfnFCE7hNgQ=\n");
                b0Var.getClass();
                this.f66470a = b0Var;
            }

            public final com.neeeex.similar3p.junk.b0 a() {
                return this.f66470a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p003kotlin.jvm.internal.v.c(this.f66470a, ((b) obj).f66470a);
            }

            public int hashCode() {
                return this.f66470a.hashCode();
            }

            public String toString() {
                return "FileRow(item=" + this.f66470a + ")";
            }
        }
    }

    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66471a;

        static {
            int[] iArr = new int[com.neeeex.similar3p.junk.a.values().length];
            try {
                iArr[com.neeeex.similar3p.junk.a.APK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.neeeex.similar3p.junk.a.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.neeeex.similar3p.junk.a.AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.neeeex.similar3p.junk.a.TEMP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.neeeex.similar3p.junk.a.CACHE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f66471a = iArr;
        }
    }

    public j(com.neeeex.similar3p.junk.h0 h0Var, tl.o oVar) {
        m0.a("OhfOAKU=\n", "V3iqZcmt42k=\n");
        h0Var.getClass();
        m0.a("f119J8JtuBd5XEABxmm1BHVX\n", "EDMuQq4I22M=\n");
        oVar.getClass();
        this.f66450a = h0Var;
        this.f66451b = oVar;
        this.f66452c = b1.f();
        this.f66453d = gl.w.m();
        j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f66453d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        e eVar = (e) this.f66453d.get(i10);
        if (eVar instanceof e.a) {
            return 0;
        }
        if (eVar instanceof e.b) {
            return 1;
        }
        coil.util.j.a();
        return 0;
    }

    public final void i() {
        this.f66451b.invoke(Integer.valueOf(this.f66450a.b()), Long.valueOf(this.f66450a.a()), this.f66450a.f());
    }

    public final void j() {
        List listE;
        List<com.neeeex.similar3p.junk.a> listA = f0.f66438a.a();
        ArrayList arrayList = new ArrayList();
        for (com.neeeex.similar3p.junk.a aVar : listA) {
            e.a aVar2 = new e.a(aVar, this.f66452c.contains(aVar));
            if (this.f66452c.contains(aVar)) {
                List listE2 = gl.v.e(aVar2);
                List listD = this.f66450a.d(aVar);
                ArrayList arrayList2 = new ArrayList(gl.x.x(listD, 10));
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new e.b((com.neeeex.similar3p.junk.b0) it.next()));
                }
                listE = gl.g0.L0(listE2, arrayList2);
            } else {
                listE = gl.v.e(aVar2);
            }
            gl.b0.D(arrayList, listE);
        }
        this.f66453d = arrayList;
    }

    public final void k(a aVar) {
        boolean z10 = aVar instanceof a.c;
        if (z10) {
            a.c cVar = (a.c) aVar;
            boolean zContains = this.f66452c.contains(cVar.a());
            Set set = this.f66452c;
            this.f66452c = zContains ? c1.m(set, cVar.a()) : c1.o(set, cVar.a());
            j();
        } else if (aVar instanceof a.C0814a) {
            a.C0814a c0814a = (a.C0814a) aVar;
            this.f66450a.g(c0814a.a(), c0814a.b());
        } else if (!(aVar instanceof a.b)) {
            coil.util.j.a();
            return;
        } else {
            a.b bVar = (a.b) aVar;
            this.f66450a.h(bVar.a(), bVar.b());
        }
        notifyDataSetChanged();
        if (z10) {
            return;
        }
        i();
    }

    public final void l(com.neeeex.similar3p.junk.a aVar, boolean z10) {
        m0.a("etZZErAGsZ0=\n", "Gbctd9dpw+Q=\n");
        aVar.getClass();
        k(new a.C0814a(aVar, z10));
    }

    public final void m(String str, boolean z10) {
        m0.a("39oq2g==\n", "r7tesgBNhes=\n");
        str.getClass();
        k(new a.b(str, z10));
    }

    public final int n(com.neeeex.similar3p.junk.a aVar) {
        int i10 = f.f66471a[aVar.ordinal()];
        if (i10 == 1) {
            return R$string.neeeex_junk_category_apk;
        }
        if (i10 == 2) {
            return R$string.neeeex_junk_category_log;
        }
        if (i10 == 3) {
            return R$string.neeeex_junk_category_ad;
        }
        if (i10 == 4) {
            return R$string.neeeex_junk_category_temp;
        }
        if (i10 == 5) {
            return R$string.neeeex_junk_category_cache;
        }
        coil.util.j.a();
        return 0;
    }

    public final void o(com.neeeex.similar3p.junk.a aVar) {
        m0.a("ehrrt7I312U=\n", "GXuf0tVYpRw=\n");
        aVar.getClass();
        k(new a.c(aVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.g0 g0Var, int i10) {
        m0.a("vs3hIfi9\n", "1qKNRZ3PTg4=\n");
        g0Var.getClass();
        e eVar = (e) this.f66453d.get(i10);
        if (eVar instanceof e.a) {
            e.a aVar = (e.a) eVar;
            ((b) g0Var).d(aVar.a(), aVar.b());
        } else if (eVar instanceof e.b) {
            ((d) g0Var).d(((e.b) eVar).a());
        } else {
            coil.util.j.a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        m0.a("7zK9U9go\n", "n1PPNrZcPAU=\n");
        viewGroup.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i10 == 0) {
            View viewInflate = layoutInflaterFrom.inflate(R$layout.neeeex_junk_item_result_category, viewGroup, false);
            m0.a("9YPr8czDGMayw6O0\n", "nO2Nna23fe4=\n");
            viewInflate.getClass();
            return new b(this, viewInflate);
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R$layout.neeeex_junk_item_result_file, viewGroup, false);
        m0.a("/mZ2R3rl1ca5Jj4C\n", "lwgQKxuRsO4=\n");
        viewInflate2.getClass();
        return new d(this, viewInflate2);
    }

    public static final class c {
        public /* synthetic */ c(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public c() {
        }
    }
}