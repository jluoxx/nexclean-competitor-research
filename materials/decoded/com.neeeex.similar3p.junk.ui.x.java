package com.neeeex.similar3p.junk.ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.m0;
import gl.b1;
import gl.v0;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends RecyclerView.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f66491c = new c(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f66492d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f66493e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f66494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f66495b;

    /* JADX WARN: Multi-variable type inference failed */
    public x(List list) {
        "categories" /* decoded XOR */;
        list.getClass();
        this.f66494a = list;
        this.f66495b = new a(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        "holder" /* decoded XOR */;
        bVar.getClass();
        com.neeeex.similar3p.junk.a aVar = (com.neeeex.similar3p.junk.a) this.f66494a.get(i10);
        Map mapB = this.f66495b.b();
        Set setA = this.f66495b.a();
        com.neeeex.similar3p.junk.b bVar2 = (com.neeeex.similar3p.junk.b) mapB.get(aVar);
        if (bVar2 == null) {
            bVar2 = new com.neeeex.similar3p.junk.b(0, 0L, 3, null);
        }
        bVar.g(aVar, bVar2, setA.contains(aVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f66494a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10, List list) {
        "holder" /* decoded XOR */;
        bVar.getClass();
        "payloads" /* decoded XOR */;
        list.getClass();
        com.neeeex.similar3p.junk.a aVar = (com.neeeex.similar3p.junk.a) this.f66494a.get(i10);
        if (list.isEmpty()) {
            onBindViewHolder(bVar, i10);
            return;
        }
        for (Object obj : list) {
            if (p003kotlin.jvm.internal.v.c(obj, f66492d)) {
                com.neeeex.similar3p.junk.b bVar2 = (com.neeeex.similar3p.junk.b) this.f66495b.b().get(aVar);
                if (bVar2 == null) {
                    bVar2 = new com.neeeex.similar3p.junk.b(0, 0L, 3, null);
                }
                bVar.i(bVar2);
            } else if (p003kotlin.jvm.internal.v.c(obj, f66493e)) {
                bVar.h(this.f66495b.a().contains(aVar));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        "parent" /* decoded XOR */;
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.neeeex_junk_item_scan_category, viewGroup, false);
        viewInflate.getClass();
        return new b(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(b bVar) {
        "holder" /* decoded XOR */;
        bVar.getClass();
        super.onViewAttachedToWindow(bVar);
        bVar.m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(b bVar) {
        "holder" /* decoded XOR */;
        bVar.getClass();
        bVar.k();
        super.onViewDetachedFromWindow(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(b bVar) {
        "holder" /* decoded XOR */;
        bVar.getClass();
        bVar.l();
        super.onViewRecycled(bVar);
    }

    public final void m(Map map, Set set) {
        "totals" /* decoded XOR */;
        map.getClass();
        "completedCategories" /* decoded XOR */;
        set.getClass();
        a aVar = this.f66495b;
        a aVar2 = new a(v0.w(map), gl.g0.k1(set));
        this.f66495b = aVar2;
        int i10 = 0;
        for (Object obj : this.f66494a) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                gl.w.w();
            }
            com.neeeex.similar3p.junk.a aVar3 = (com.neeeex.similar3p.junk.a) obj;
            if (!p003kotlin.jvm.internal.v.c(aVar.b().get(aVar3), aVar2.b().get(aVar3))) {
                notifyItemChanged(i10, f66492d);
            }
            if (aVar.a().contains(aVar3) != aVar2.a().contains(aVar3)) {
                notifyItemChanged(i10, f66493e);
            }
            i10 = i11;
        }
    }

    public static final class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f66498h = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f66499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f66500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f66501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f66502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ObjectAnimator f66503f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f66504g;

        /* JADX INFO: renamed from: com.neeeex.similar3p.junk.ui.x$b$b, reason: collision with other inner class name */
        public static final /* synthetic */ class C0815b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f66505a;

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
                f66505a = iArr;
            }
        }

        public static final class c implements View.OnLayoutChangeListener {
            public c() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                view.removeOnLayoutChangeListener(this);
                b.this.f66504g = false;
                if (b.this.f66502e && b.this.f66501d.isAttachedToWindow()) {
                    b.this.o();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            "itemView" /* decoded XOR */;
            view.getClass();
            View viewFindViewById = view.findViewById(R$id.neeeex_junk_category_title);
            "findViewById(...)" /* decoded XOR */;
            viewFindViewById.getClass();
            this.f66499b = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R$id.neeeex_junk_category_summary);
            "findViewById(...)" /* decoded XOR */;
            viewFindViewById2.getClass();
            this.f66500c = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R$id.neeeex_junk_category_state);
            "findViewById(...)" /* decoded XOR */;
            viewFindViewById3.getClass();
            this.f66501d = (ImageView) viewFindViewById3;
        }

        public final boolean f() {
            return ValueAnimator.areAnimatorsEnabled();
        }

        public final void g(com.neeeex.similar3p.junk.a aVar, com.neeeex.similar3p.junk.b bVar, boolean z10) {
            "category" /* decoded XOR */;
            aVar.getClass();
            "total" /* decoded XOR */;
            bVar.getClass();
            this.f66499b.setText(q(aVar));
            i(bVar);
            h(z10);
        }

        public final void h(boolean z10) {
            this.f66502e = !z10;
            this.f66501d.setImageResource(z10 ? R$drawable.neeeex_junk_result_checked : R$drawable.neeeex_junk_scanning_loading);
            if (z10) {
                p();
            } else if (z10) {
                coil.util.j.a();
            } else {
                n();
            }
        }

        public final void i(com.neeeex.similar3p.junk.b bVar) {
            "total" /* decoded XOR */;
            bVar.getClass();
            this.f66500c.setText(e0.a(bVar.a()));
        }

        public final boolean j() {
            return this.f66503f == null && this.f66502e && f();
        }

        public final void k() {
            p();
        }

        public final void l() {
            this.f66502e = false;
            p();
        }

        public final void m() {
            if (this.f66502e) {
                n();
            }
        }

        public final void n() {
            if (j()) {
                if (this.f66501d.isLaidOut()) {
                    o();
                    return;
                }
                if (this.f66504g) {
                    return;
                }
                this.f66504g = true;
                ImageView imageView = this.f66501d;
                if (!imageView.isLaidOut() || imageView.isLayoutRequested()) {
                    imageView.addOnLayoutChangeListener(new c());
                    return;
                }
                this.f66504g = false;
                if (this.f66502e && this.f66501d.isAttachedToWindow()) {
                    o();
                }
            }
        }

        public final void o() {
            if (j()) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f66501d, (Property<ImageView, Float>) View.ROTATION, 0.0f, 360.0f);
                objectAnimatorOfFloat.setDuration(900L);
                objectAnimatorOfFloat.setRepeatCount(-1);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat.start();
                this.f66503f = objectAnimatorOfFloat;
            }
        }

        public final void p() {
            ObjectAnimator objectAnimator = this.f66503f;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            this.f66503f = null;
            this.f66501d.setRotation(0.0f);
        }

        public final int q(com.neeeex.similar3p.junk.a aVar) {
            int i10 = C0815b.f66505a[aVar.ordinal()];
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

        public static final class a {
            public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
                this();
            }

            public a() {
            }
        }
    }

    public static final class c {
        public /* synthetic */ c(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public c() {
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f66496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f66497b;

        public a(Map map, Set set) {
            "totals" /* decoded XOR */;
            map.getClass();
            "completed" /* decoded XOR */;
            set.getClass();
            this.f66496a = map;
            this.f66497b = set;
        }

        public final Set a() {
            return this.f66497b;
        }

        public final Map b() {
            return this.f66496a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p003kotlin.jvm.internal.v.c(this.f66496a, aVar.f66496a) && p003kotlin.jvm.internal.v.c(this.f66497b, aVar.f66497b);
        }

        public int hashCode() {
            return (this.f66496a.hashCode() * 31) + this.f66497b.hashCode();
        }

        public String toString() {
            return "AdapterState(totals=" + this.f66496a + ", completed=" + this.f66497b + ")";
        }

        public /* synthetic */ a(Map map, Set set, int i10, p003kotlin.jvm.internal.m mVar) {
            this((i10 & 1) != 0 ? v0.k() : map, (i10 & 2) != 0 ? b1.f() : set);
        }
    }
}