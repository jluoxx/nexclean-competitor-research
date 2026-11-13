package com.neeeex.eraser.module.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import ji.w0;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f65379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f65380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65381c;

    public final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w0 f65382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f65383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CheckBox f65384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ s f65385e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar, w0 w0Var) {
            super(w0Var.getRoot());
            com.neeeex.eraser.m0.a("jRZJ0LmOCw==\n", "738ntNDgbLQ=\n");
            w0Var.getClass();
            this.f65385e = sVar;
            this.f65382b = w0Var;
            AppCompatTextView appCompatTextView = w0Var.f85727c;
            com.neeeex.eraser.m0.a("DtNDVR7yT9g2xGNXDvZNxQ==\n", "eqUNMHuXKqA=\n");
            appCompatTextView.getClass();
            this.f65383c = appCompatTextView;
            AppCompatCheckBox appCompatCheckBox = w0Var.f85726b;
            com.neeeex.eraser.m0.a("0P+FkYC3jVXw9a6XjrCHVQ==\n", "s53L9OXS6C0=\n");
            appCompatCheckBox.getClass();
            this.f65384d = appCompatCheckBox;
        }

        public final CheckBox b() {
            return this.f65384d;
        }

        public final TextView c() {
            return this.f65383c;
        }
    }

    public s(Context context, t tVar) {
        com.neeeex.eraser.m0.a("qzhihLOJ/Q==\n", "yFcM8NbxiWI=\n");
        context.getClass();
        com.neeeex.eraser.m0.a("bg6K+hxdp78=\n", "Amf5jnkzws0=\n");
        tVar.getClass();
        this.f65379a = tVar;
        this.f65380b = v.f65386a.b();
        this.f65381c = com.neeeex.eraser.utils.f.f66153a.b();
    }

    public static void g(s sVar, a aVar, View view) {
        sVar.j(aVar.getAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f65380b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final a aVar, int i10) {
        com.neeeex.eraser.m0.a("LmVvSF2/\n", "RgoDLDjNSAQ=\n");
        aVar.getClass();
        aVar.c().setText(((q) this.f65380b.get(i10)).b());
        aVar.b().setChecked(this.f65381c == i10);
        aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s.g(this.f65377a, aVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
        com.neeeex.eraser.m0.a("gj+tpp9H\n", "8l7fw/Ez69E=\n");
        viewGroup.getClass();
        w0 w0VarC = w0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        com.neeeex.eraser.m0.a("U0X6EkqvW88UBbJX\n", "OiucfivbPuc=\n");
        w0VarC.getClass();
        return new a(this, w0VarC);
    }

    public final void j(int i10) {
        if (i10 == -1) {
            return;
        }
        int i11 = this.f65381c;
        this.f65381c = i10;
        Iterator it = gl.s.k0(new int[]{i11, i10}).iterator();
        while (it.hasNext()) {
            notifyItemChanged(((Number) it.next()).intValue());
        }
        this.f65379a.a(i10);
    }
}