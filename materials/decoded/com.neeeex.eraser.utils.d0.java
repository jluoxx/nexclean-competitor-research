package com.neeeex.eraser.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends RecyclerView.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66146a;

    public d0(int i10) {
        this.f66146a = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        "outRect" /* decoded XOR */;
        rect.getClass();
        "view" /* decoded XOR */;
        view.getClass();
        "parent" /* decoded XOR */;
        recyclerView.getClass();
        "state" /* decoded XOR */;
        c0Var.getClass();
        if (recyclerView.getChildAdapterPosition(view) > 0) {
            rect.set(rect.left, ti.c.a(this.f66146a), rect.right, rect.bottom);
        }
    }
}