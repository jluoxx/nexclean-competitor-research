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
        m0.a("VwBX6nnR5w==\n", "OHUjuByyk/Y=\n");
        rect.getClass();
        m0.a("cRJO7A==\n", "B3srmzHacQs=\n");
        view.getClass();
        m0.a("S3P7jVcQ\n", "OxKJ6Dlk7/M=\n");
        recyclerView.getClass();
        m0.a("YluGyJk=\n", "ES/nvPx8Grs=\n");
        c0Var.getClass();
        if (recyclerView.getChildAdapterPosition(view) > 0) {
            rect.set(rect.left, ti.c.a(this.f66146a), rect.right, rect.bottom);
        }
    }
}