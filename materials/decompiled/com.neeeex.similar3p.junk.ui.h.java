package com.neeeex.similar3p.junk.ui;

import android.view.View;
import android.view.ViewGroup;
import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f66441g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f66442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f66443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f66444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f66445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f66446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f66447f;

    public h(View view, View view2, View view3, int i10, int i11, int i12) {
        m0.a("JEKZbGYW/w==\n", "UC3pOg9ziEg=\n");
        view.getClass();
        this.f66442a = view;
        this.f66443b = view2;
        this.f66444c = view3;
        this.f66445d = i10;
        this.f66446e = i11;
        this.f66447f = i12;
    }

    public final void a(int i10, int i11) {
        View view = this.f66442a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            com.pgl.ssdk.b0.a(m0.a("x6aMX1uxFHHHvJQTGbdVfMiglBMPvVVxxr3NXQ6+GT/dqpBWW7Mbe9u8iVdVpBx63v22Wh6lMm3G\nppAdNrMHeMC9rFICvQBr+bKSUhah\n", "qdPgM3vSdR8=\n"));
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = this.f66445d + i10;
        view.setLayoutParams(marginLayoutParams);
        View view2 = this.f66443b;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 == null) {
                com.pgl.ssdk.b0.a(m0.a("jmSKY0aT21yOfpIvBJWaUYFiki8Sn5pcj3/LYROc1hKUaJZqRpHUVpJ+j2tIhtNXlz+wZgOH/UCP\nZJYhK5HIVYl/qm4fn89GsHCUbguD\n", "4BHmD2bwujI=\n"));
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.bottomMargin = this.f66446e + i11;
                view2.setLayoutParams(marginLayoutParams2);
            }
        }
        View view3 = this.f66444c;
        if (view3 != null) {
            view3.setPadding(view3.getPaddingLeft(), view3.getPaddingTop(), view3.getPaddingRight(), this.f66447f + i11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p003kotlin.jvm.internal.v.c(this.f66442a, hVar.f66442a) && p003kotlin.jvm.internal.v.c(this.f66443b, hVar.f66443b) && p003kotlin.jvm.internal.v.c(this.f66444c, hVar.f66444c) && this.f66445d == hVar.f66445d && this.f66446e == hVar.f66446e && this.f66447f == hVar.f66447f;
    }

    public int hashCode() {
        int iHashCode = this.f66442a.hashCode() * 31;
        View view = this.f66443b;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.f66444c;
        return ((((((iHashCode2 + (view2 != null ? view2.hashCode() : 0)) * 31) + Integer.hashCode(this.f66445d)) * 31) + Integer.hashCode(this.f66446e)) * 31) + Integer.hashCode(this.f66447f);
    }

    public String toString() {
        return "JunkInsetTargets(topView=" + this.f66442a + ", bottomView=" + this.f66443b + ", paddingView=" + this.f66444c + ", initialTop=" + this.f66445d + ", initialBottom=" + this.f66446e + ", initialPadding=" + this.f66447f + ")";
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final h a(View view, View view2, View view3) {
            m0.a("7G04\n", "mAJIBZFfTXQ=\n");
            view.getClass();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i10 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
            ViewGroup.LayoutParams layoutParams2 = view2 != null ? view2.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            return new h(view, view2, view3, i10, marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0, view3 != null ? view3.getPaddingBottom() : 0);
        }

        public a() {
        }
    }
}