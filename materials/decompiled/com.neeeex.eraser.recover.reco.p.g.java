package com.neeeex.eraser.recover.reco.p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.p002lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.neeeex.eraser.h0 f65835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f65836b;

    public interface a {
        void a(int i10);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f65838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f65839c;

        public b(int i10, String str, List list) {
            com.neeeex.eraser.m0.a("aVtzKyQ=\n", "HTIHR0Ec6NY=\n");
            str.getClass();
            com.neeeex.eraser.m0.a("Bs7xDbnj0AQ=\n", "dryUe9CGp3c=\n");
            list.getClass();
            this.f65837a = i10;
            this.f65838b = str;
            this.f65839c = list;
        }

        public final List a() {
            return this.f65839c;
        }

        public final int b() {
            return this.f65837a;
        }

        public final String c() {
            return this.f65838b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f65837a == bVar.f65837a && p003kotlin.jvm.internal.v.c(this.f65838b, bVar.f65838b) && p003kotlin.jvm.internal.v.c(this.f65839c, bVar.f65839c);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f65837a) * 31) + this.f65838b.hashCode()) * 31) + this.f65839c.hashCode();
        }

        public String toString() {
            return "FolderRow(sourceIndex=" + this.f65837a + ", title=" + this.f65838b + ", previews=" + this.f65839c + ")";
        }
    }

    public static final class c extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ji.t0 f65840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f65841c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f65842d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f65843e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ImageView f65844f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ImageView f65845g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ji.t0 t0Var) {
            super(t0Var.getRoot());
            com.neeeex.eraser.m0.a("jpvQp76S7Q==\n", "7PK+w9f8iqk=\n");
            t0Var.getClass();
            this.f65840b = t0Var;
            AppCompatTextView appCompatTextView = t0Var.f85687f;
            com.neeeex.eraser.m0.a("39weAA5GRoDtxTwBDlFtmcbP\n", "q6pQZWsjI/g=\n");
            appCompatTextView.getClass();
            this.f65841c = appCompatTextView;
            AppCompatTextView appCompatTextView2 = t0Var.f85686e;
            com.neeeex.eraser.m0.a("H+UuIYbNoB0t/AwghtqDDAf2IyuWxrE=\n", "a5NgROOoxWU=\n");
            appCompatTextView2.getClass();
            this.f65842d = appCompatTextView2;
            AppCompatImageView appCompatImageView = t0Var.f85683b;
            com.neeeex.eraser.m0.a("mHxyY1SZ6ZOheFlwWJn72w==\n", "8Qo8BjH8jOs=\n");
            appCompatImageView.getClass();
            this.f65843e = appCompatImageView;
            AppCompatImageView appCompatImageView2 = t0Var.f85684c;
            com.neeeex.eraser.m0.a("lRe/mVoOhOOsE5SKVg6Wqg==\n", "/GHx/D9r4Zs=\n");
            appCompatImageView2.getClass();
            this.f65844f = appCompatImageView2;
            AppCompatImageView appCompatImageView3 = t0Var.f85685d;
            com.neeeex.eraser.m0.a("Cc5g5z9UPb0wykv0M1Qv9w==\n", "YLgugloxWMU=\n");
            appCompatImageView3.getClass();
            this.f65845g = appCompatImageView3;
        }

        public final ImageView b() {
            return this.f65843e;
        }

        public final ImageView c() {
            return this.f65844f;
        }

        public final ImageView d() {
            return this.f65845g;
        }

        public final TextView e() {
            return this.f65842d;
        }

        public final TextView f() {
            return this.f65841c;
        }
    }

    public g(com.neeeex.eraser.h0 h0Var, a aVar) {
        com.neeeex.eraser.m0.a("V/R2uGEYTa5Q6265diZluUX+dLl2\n", "MZsa3ARqDMo=\n");
        aVar.getClass();
        this.f65835a = h0Var;
        this.f65836b = aVar;
    }

    public static void g(g gVar, b bVar, View view) {
        gVar.f65836b.a(bVar.b());
    }

    private final String h(int i10) {
        return "(" + i10 + ")";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return i().size();
    }

    public final List i() {
        MutableLiveData mutableLiveDataB;
        com.neeeex.eraser.h0 h0Var = this.f65835a;
        List listM = (h0Var == null || (mutableLiveDataB = h0Var.B()) == null) ? null : (List) mutableLiveDataB.getValue();
        if (listM == null) {
            listM = gl.w.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(gl.x.x(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                gl.w.w();
            }
            ii.b bVar = (ii.b) obj;
            String strA = bVar.a();
            List listB = bVar.b();
            ArrayList arrayList2 = new ArrayList(gl.x.x(listB, 10));
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ii.c) it.next()).h());
            }
            arrayList.add(new b(i10, strA, arrayList2));
            i10 = i11;
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c cVar, int i10) {
        com.neeeex.eraser.m0.a("h9x4VsHi\n", "77MUMqSQYEY=\n");
        cVar.getClass();
        final b bVar = (b) gl.g0.s0(i(), i10);
        if (bVar == null) {
            return;
        }
        cVar.f().setText(bVar.c());
        cVar.e().setText(h(bVar.a().size()));
        for (fl.t tVar : n(l(cVar), bVar.a())) {
            m(cVar, (ImageView) tVar.component1(), (String) tVar.component2());
        }
        cVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.g(this.f65831a, bVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup viewGroup, int i10) {
        com.neeeex.eraser.m0.a("65kcHmof\n", "m/huewRrWv0=\n");
        viewGroup.getClass();
        ji.t0 t0VarC = ji.t0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        com.neeeex.eraser.m0.a("ILiI0Ixg2f1n+MCV\n", "SdbuvO0UvNU=\n");
        t0VarC.getClass();
        return new c(t0VarC);
    }

    public final List l(c cVar) {
        return gl.w.p(cVar.b(), cVar.c(), cVar.d());
    }

    public final void m(c cVar, ImageView imageView, String str) {
        if (str == null) {
            imageView.setImageDrawable(null);
            fl.m0 m0Var = fl.m0.f80959a;
        } else {
            q9.j jVarG0 = com.bumptech.glide.b.t(cVar.itemView.getContext()).s(new File(str)).G0(imageView);
            com.neeeex.eraser.m0.a("sDj8r8WTjc/w\n", "2VaIwO29o+E=\n");
            jVarG0.getClass();
        }
    }

    public final List n(List list, List list2) {
        List list3 = list;
        ArrayList arrayList = new ArrayList(gl.x.x(list3, 10));
        int i10 = 0;
        for (Object obj : list3) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                gl.w.w();
            }
            arrayList.add(fl.z.a((ImageView) obj, gl.g0.s0(list2, i10)));
            i10 = i11;
        }
        return arrayList;
    }
}