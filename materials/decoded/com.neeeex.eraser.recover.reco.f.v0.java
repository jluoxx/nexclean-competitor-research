package com.neeeex.eraser.recover.reco.f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.p002lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class v0 extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.neeeex.eraser.h0 f65696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f65697b;

    public interface a {
        void a(int i10);
    }

    public static final class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ji.s0 f65698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f65699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f65700d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ji.s0 s0Var) {
            super(s0Var.getRoot());
            "binding" /* decoded XOR */;
            s0Var.getClass();
            this.f65698b = s0Var;
            AppCompatTextView appCompatTextView = s0Var.f85675c;
            "tvNeeeexFolderName" /* decoded XOR */;
            appCompatTextView.getClass();
            this.f65699c = appCompatTextView;
            AppCompatTextView appCompatTextView2 = s0Var.f85674b;
            "tvNeeeexFolderFileCount" /* decoded XOR */;
            appCompatTextView2.getClass();
            this.f65700d = appCompatTextView2;
        }

        public final TextView b() {
            return this.f65700d;
        }

        public final TextView c() {
            return this.f65699c;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f65702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f65703c;

        public c(String str, int i10, int i11) {
            "title" /* decoded XOR */;
            str.getClass();
            this.f65701a = str;
            this.f65702b = i10;
            this.f65703c = i11;
        }

        public final int a() {
            return this.f65702b;
        }

        public final int b() {
            return this.f65703c;
        }

        public final String c() {
            return this.f65701a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p003kotlin.jvm.internal.v.c(this.f65701a, cVar.f65701a) && this.f65702b == cVar.f65702b && this.f65703c == cVar.f65703c;
        }

        public int hashCode() {
            return (((this.f65701a.hashCode() * 31) + Integer.hashCode(this.f65702b)) * 31) + Integer.hashCode(this.f65703c);
        }

        public String toString() {
            return "RowModel(title=" + this.f65701a + ", count=" + this.f65702b + ", sourceIndex=" + this.f65703c + ")";
        }
    }

    public v0(com.neeeex.eraser.h0 h0Var, a aVar) {
        "folderAdapterListener" /* decoded XOR */;
        aVar.getClass();
        this.f65696a = h0Var;
        this.f65697b = aVar;
    }

    public static void g(v0 v0Var, c cVar, View view) {
        v0Var.f65697b.a(cVar.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return k().size();
    }

    public final String h(int i10) {
        return "(" + i10 + ')';
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        "holder" /* decoded XOR */;
        bVar.getClass();
        final c cVar = (c) gl.g0.s0(k(), i10);
        if (cVar == null) {
            cVar = new c("", 0, i10);
        }
        bVar.c().setText(cVar.c());
        bVar.b().setText(h(cVar.a()));
        bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.u0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v0.g(this.f65694a, cVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        "parent" /* decoded XOR */;
        viewGroup.getClass();
        ji.s0 s0VarC = ji.s0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        "inflate(...)" /* decoded XOR */;
        s0VarC.getClass();
        return new b(s0VarC);
    }

    public final List k() {
        MutableLiveData mutableLiveDataB;
        List list;
        com.neeeex.eraser.h0 h0Var = this.f65696a;
        if (h0Var == null || (mutableLiveDataB = h0Var.B()) == null || (list = (List) mutableLiveDataB.getValue()) == null) {
            return gl.w.m();
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(gl.x.x(list2, 10));
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                gl.w.w();
            }
            ii.b bVar = (ii.b) obj;
            arrayList.add(new c(bVar.a(), bVar.b().size(), i10));
            i10 = i11;
        }
        return arrayList;
    }
}