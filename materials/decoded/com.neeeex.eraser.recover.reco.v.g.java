package com.neeeex.eraser.recover.reco.v;

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
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.neeeex.eraser.h0 f66011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f66012b;

    public interface a {
        void a(int i10);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f66014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f66015c;

        public b(int i10, String str, List list) {
            "name" /* decoded XOR */;
            str.getClass();
            "files" /* decoded XOR */;
            list.getClass();
            this.f66013a = i10;
            this.f66014b = str;
            this.f66015c = list;
        }

        public final List a() {
            return this.f66015c;
        }

        public final String b() {
            return this.f66014b;
        }

        public final int c() {
            return this.f66013a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f66013a == bVar.f66013a && p003kotlin.jvm.internal.v.c(this.f66014b, bVar.f66014b) && p003kotlin.jvm.internal.v.c(this.f66015c, bVar.f66015c);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f66013a) * 31) + this.f66014b.hashCode()) * 31) + this.f66015c.hashCode();
        }

        public String toString() {
            return "FolderPresentation(sourcePosition=" + this.f66013a + ", name=" + this.f66014b + ", files=" + this.f66015c + ")";
        }
    }

    public static final class c extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ji.u0 f66016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f66017c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f66018d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f66019e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ImageView f66020f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ImageView f66021g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TextView f66022h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final TextView f66023i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TextView f66024j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ImageView f66025k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ImageView f66026l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final ImageView f66027m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ji.u0 u0Var) {
            super(u0Var.getRoot());
            "binding" /* decoded XOR */;
            u0Var.getClass();
            this.f66016b = u0Var;
            AppCompatTextView appCompatTextView = u0Var.f85706l;
            "tvNeeeexFolderName" /* decoded XOR */;
            appCompatTextView.getClass();
            this.f66017c = appCompatTextView;
            AppCompatTextView appCompatTextView2 = u0Var.f85705k;
            "tvNeeeexFolderFileCount" /* decoded XOR */;
            appCompatTextView2.getClass();
            this.f66018d = appCompatTextView2;
            AppCompatImageView appCompatImageView = u0Var.f85699e;
            "ivNeeeexPreview0" /* decoded XOR */;
            appCompatImageView.getClass();
            this.f66019e = appCompatImageView;
            AppCompatImageView appCompatImageView2 = u0Var.f85700f;
            "ivNeeeexPreview1" /* decoded XOR */;
            appCompatImageView2.getClass();
            this.f66020f = appCompatImageView2;
            AppCompatImageView appCompatImageView3 = u0Var.f85701g;
            "ivNeeeexPreview2" /* decoded XOR */;
            appCompatImageView3.getClass();
            this.f66021g = appCompatImageView3;
            AppCompatTextView appCompatTextView3 = u0Var.f85702h;
            "tvNeeeexDuration0" /* decoded XOR */;
            appCompatTextView3.getClass();
            this.f66022h = appCompatTextView3;
            AppCompatTextView appCompatTextView4 = u0Var.f85703i;
            "tvNeeeexDuration1" /* decoded XOR */;
            appCompatTextView4.getClass();
            this.f66023i = appCompatTextView4;
            AppCompatTextView appCompatTextView5 = u0Var.f85704j;
            "tvNeeeexDuration2" /* decoded XOR */;
            appCompatTextView5.getClass();
            this.f66024j = appCompatTextView5;
            AppCompatImageView appCompatImageView4 = u0Var.f85696b;
            "ivNeeeexPlay0" /* decoded XOR */;
            appCompatImageView4.getClass();
            this.f66025k = appCompatImageView4;
            AppCompatImageView appCompatImageView5 = u0Var.f85697c;
            "ivNeeeexPlay1" /* decoded XOR */;
            appCompatImageView5.getClass();
            this.f66026l = appCompatImageView5;
            AppCompatImageView appCompatImageView6 = u0Var.f85698d;
            "ivNeeeexPlay2" /* decoded XOR */;
            appCompatImageView6.getClass();
            this.f66027m = appCompatImageView6;
        }

        public final ImageView b() {
            return this.f66025k;
        }

        public final ImageView c() {
            return this.f66026l;
        }

        public final ImageView d() {
            return this.f66027m;
        }

        public final ImageView e() {
            return this.f66019e;
        }

        public final ImageView f() {
            return this.f66020f;
        }

        public final ImageView g() {
            return this.f66021g;
        }

        public final TextView h() {
            return this.f66022h;
        }

        public final TextView i() {
            return this.f66023i;
        }

        public final TextView j() {
            return this.f66024j;
        }

        public final TextView k() {
            return this.f66018d;
        }

        public final TextView l() {
            return this.f66017c;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f66028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f66029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f66030c;

        public d(ImageView imageView, TextView textView, ImageView imageView2) {
            "image" /* decoded XOR */;
            imageView.getClass();
            "duration" /* decoded XOR */;
            textView.getClass();
            "play" /* decoded XOR */;
            imageView2.getClass();
            this.f66028a = imageView;
            this.f66029b = textView;
            this.f66030c = imageView2;
        }

        public final TextView a() {
            return this.f66029b;
        }

        public final ImageView b() {
            return this.f66028a;
        }

        public final ImageView c() {
            return this.f66030c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p003kotlin.jvm.internal.v.c(this.f66028a, dVar.f66028a) && p003kotlin.jvm.internal.v.c(this.f66029b, dVar.f66029b) && p003kotlin.jvm.internal.v.c(this.f66030c, dVar.f66030c);
        }

        public int hashCode() {
            return (((this.f66028a.hashCode() * 31) + this.f66029b.hashCode()) * 31) + this.f66030c.hashCode();
        }

        public String toString() {
            return "PreviewSlot(image=" + this.f66028a + ", duration=" + this.f66029b + ", play=" + this.f66030c + ")";
        }
    }

    public g(com.neeeex.eraser.h0 h0Var, a aVar) {
        "folderAdapterListener" /* decoded XOR */;
        aVar.getClass();
        this.f66011a = h0Var;
        this.f66012b = aVar;
    }

    public static void g(g gVar, b bVar, View view) {
        gVar.f66012b.a(bVar.c());
    }

    private final String h(int i10) {
        return "(" + i10 + ")";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return k().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c cVar, int i10) {
        "holder" /* decoded XOR */;
        cVar.getClass();
        final b bVar = (b) gl.g0.s0(k(), i10);
        if (bVar == null) {
            return;
        }
        cVar.l().setText(bVar.b());
        cVar.k().setText(h(bVar.a().size()));
        int i11 = 0;
        for (Object obj : l(cVar)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                gl.w.w();
            }
            m(cVar, (d) obj, (ii.c) gl.g0.s0(bVar.a(), i11), i11);
            i11 = i12;
        }
        cVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.g(this.f66008a, bVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup viewGroup, int i10) {
        "parent" /* decoded XOR */;
        viewGroup.getClass();
        ji.u0 u0VarC = ji.u0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        "inflate(...)" /* decoded XOR */;
        u0VarC.getClass();
        return new c(u0VarC);
    }

    public final List k() {
        MutableLiveData mutableLiveDataB;
        com.neeeex.eraser.h0 h0Var = this.f66011a;
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
            arrayList.add(new b(i10, bVar.a(), bVar.b()));
            i10 = i11;
        }
        return arrayList;
    }

    public final List l(c cVar) {
        return gl.w.p(new d(cVar.e(), cVar.h(), cVar.b()), new d(cVar.f(), cVar.i(), cVar.c()), new d(cVar.g(), cVar.j(), cVar.d()));
    }

    public final void m(c cVar, d dVar, ii.c cVar2, int i10) {
        Integer num;
        if (i10 == 0) {
            num = null;
        } else {
            num = cVar2 == null ? 8 : 0;
        }
        if (num != null) {
            n(dVar, num.intValue());
        }
        if (cVar2 == null) {
            dVar.b().setImageDrawable(null);
        } else {
            com.bumptech.glide.b.t(cVar.itemView.getContext()).s(new File(cVar2.h())).G0(dVar.b());
            dVar.a().setText(com.neeeex.eraser.utils.c.f66140a.b(cVar2.d()));
        }
    }

    public final void n(d dVar, int i10) {
        dVar.c().setVisibility(i10);
        dVar.a().setVisibility(i10);
    }
}