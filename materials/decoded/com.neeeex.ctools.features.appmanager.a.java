package com.neeeex.ctools.features.appmanager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.m0;
import gl.w;
import java.util.Iterator;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends androidx.recyclerview.widget.n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f64194c;

    /* JADX INFO: renamed from: com.neeeex.ctools.features.appmanager.a$a, reason: collision with other inner class name */
    public static final class C0734a extends androidx.recyclerview.widget.h.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0734a f64195a = new C0734a();

        @Override // androidx.recyclerview.widget.h.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(bi.g gVar, bi.g gVar2) {
            "oldItem" /* decoded XOR */;
            gVar.getClass();
            "newItem" /* decoded XOR */;
            gVar2.getClass();
            return v.c(gVar.d(), gVar2.d());
        }

        @Override // androidx.recyclerview.widget.h.f
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean b(bi.g gVar, bi.g gVar2) {
            "oldItem" /* decoded XOR */;
            gVar.getClass();
            "newItem" /* decoded XOR */;
            gVar2.getClass();
            return gVar.c().compareTo(gVar2.c()) == 0;
        }
    }

    public static final class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function1 f64196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final fl.n f64197c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final fl.n f64198d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final fl.n f64199e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public bi.g f64200f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewGroup viewGroup, Function1 function1) {
            super(viewGroup);
            "root" /* decoded XOR */;
            viewGroup.getClass();
            "onUninstallClick" /* decoded XOR */;
            function1.getClass();
            this.f64196b = function1;
            this.f64197c = l(viewGroup, R$id.neeeex_app_manager_icon);
            this.f64198d = l(viewGroup, R$id.neeeex_app_manager_label);
            this.f64199e = l(viewGroup, R$id.neeeex_app_manager_uninstall);
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.appmanager.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.b.b(this.f64205a, view);
                }
            });
            j().setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.appmanager.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.b.c(this.f64206a, view);
                }
            });
        }

        public static void b(b bVar, View view) {
            bVar.k();
        }

        public static void c(b bVar, View view) {
            bVar.k();
        }

        public static fl.m0 d(b bVar, bi.g gVar) {
            bVar.h().setImageDrawable(gVar.a());
            return fl.m0.f80959a;
        }

        public static View e(ViewGroup viewGroup, int i10) {
            return viewGroup.findViewById(i10);
        }

        public static fl.m0 f(b bVar, bi.g gVar) {
            bVar.i().setText(gVar.b());
            return fl.m0.f80959a;
        }

        public final void g(final bi.g gVar) {
            "item" /* decoded XOR */;
            gVar.getClass();
            this.f64200f = gVar;
            Iterator it = w.p(new Function0() { // from class: com.neeeex.ctools.features.appmanager.b
                @Override // p003kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.b.d(this.f64201a, gVar);
                }
            }, new Function0() { // from class: com.neeeex.ctools.features.appmanager.c
                @Override // p003kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.b.f(this.f64203a, gVar);
                }
            }).iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).invoke();
            }
        }

        public final ImageView h() {
            Object value = this.f64197c.getValue();
            "getValue(...)" /* decoded XOR */;
            value.getClass();
            return (ImageView) value;
        }

        public final TextView i() {
            Object value = this.f64198d.getValue();
            "getValue(...)" /* decoded XOR */;
            value.getClass();
            return (TextView) value;
        }

        public final TextView j() {
            Object value = this.f64199e.getValue();
            "getValue(...)" /* decoded XOR */;
            value.getClass();
            return (TextView) value;
        }

        public final void k() {
            bi.g gVar = this.f64200f;
            if (gVar != null) {
                this.f64196b.invoke(gVar);
            }
        }

        public final fl.n l(final ViewGroup viewGroup, final int i10) {
            return fl.o.a(fl.q.NONE, new Function0() { // from class: com.neeeex.ctools.features.appmanager.f
                @Override // p003kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.b.e(viewGroup, i10);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Function1 function1) {
        super(C0734a.f64195a);
        "onUninstallClick" /* decoded XOR */;
        function1.getClass();
        this.f64194c = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        "holder" /* decoded XOR */;
        bVar.getClass();
        Object objG = g(i10);
        "getItem(...)" /* decoded XOR */;
        objG.getClass();
        bVar.g((bi.g) objG);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        "parent" /* decoded XOR */;
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_neeeex_app_manager, viewGroup, false);
        "null cannot be cast to non-null type android.view.ViewGroup" /* decoded XOR */;
        viewInflate.getClass();
        return new b((ViewGroup) viewInflate, this.f64194c);
    }
}