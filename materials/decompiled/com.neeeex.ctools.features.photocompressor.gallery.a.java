package com.neeeex.ctools.features.photocompressor.gallery;

import am.q;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.m0;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends androidx.recyclerview.widget.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f64757d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final androidx.recyclerview.widget.h.f f64758e = new C0763a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f64759c;

    /* JADX INFO: renamed from: com.neeeex.ctools.features.photocompressor.gallery.a$a, reason: collision with other inner class name */
    public static final class C0763a extends androidx.recyclerview.widget.h.f {
        @Override // androidx.recyclerview.widget.h.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(com.neeeex.ctools.features.photocompressor.data.c cVar, com.neeeex.ctools.features.photocompressor.data.c cVar2) {
            m0.a("z8fqWeAzvQ==\n", "oKuOEJRW0Ms=\n");
            cVar.getClass();
            m0.a("7owMcZ9g4A==\n", "gOl7OOsFjT4=\n");
            cVar2.getClass();
            return v.c(cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.h.f
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean b(com.neeeex.ctools.features.photocompressor.data.c cVar, com.neeeex.ctools.features.photocompressor.data.c cVar2) {
            m0.a("BUNkVP4a9A==\n", "ai8AHYp/mWs=\n");
            cVar.getClass();
            m0.a("RGK159SWIQ==\n", "KgfCrqDzTAE=\n");
            cVar2.getClass();
            return v.c(cVar.e(), cVar2.e());
        }
    }

    public static final class c extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function1 f64760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f64761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f64762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public com.neeeex.ctools.features.photocompressor.data.c f64763e;

        /* JADX INFO: renamed from: com.neeeex.ctools.features.photocompressor.gallery.a$c$a, reason: collision with other inner class name */
        public static final class C0764a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.neeeex.ctools.features.photocompressor.data.c f64764a;

            public C0764a(com.neeeex.ctools.features.photocompressor.data.c cVar) {
                m0.a("qcYvIg==\n", "wLJKT2VnPwI=\n");
                cVar.getClass();
                this.f64764a = cVar;
            }

            public final String a(View view) {
                m0.a("LgfGyw==\n", "WG6jvG1AvkY=\n");
                view.getClass();
                return Formatter.formatFileSize(view.getContext(), this.f64764a.d());
            }

            public final void b(ImageView imageView) {
                m0.a("Bfj0zpiu\n", "cZmGqf3aOtk=\n");
                imageView.getClass();
                ((com.bumptech.glide.j) ((com.bumptech.glide.j) com.bumptech.glide.b.u(imageView).r(this.f64764a.e()).e()).c0(R$drawable.bg_neeeex_item_main_entry)).G0(imageView);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0764a) && v.c(this.f64764a, ((C0764a) obj).f64764a);
            }

            public int hashCode() {
                return this.f64764a.hashCode();
            }

            public String toString() {
                return "PhotoCell(item=" + this.f64764a + ")";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view, Function1 function1) {
            super(view);
            m0.a("eZ4M1ICMuMs=\n", "EOppudbl3bw=\n");
            view.getClass();
            m0.a("xiu8TOXuhA==\n", "qUX/IIyN74g=\n");
            function1.getClass();
            this.f64760b = function1;
            View viewFindViewById = view.findViewById(R$id.neeeex_photo_compressor_item_image);
            m0.a("zKdLiFwLHq7ot2yIIkxV94M=\n", "qs4l7Apie9k=\n");
            viewFindViewById.getClass();
            this.f64761c = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R$id.neeeex_photo_compressor_item_size);
            m0.a("yw15vJCndK3vHV687uA/9IQ=\n", "rWQX2MbOEdo=\n");
            viewFindViewById2.getClass();
            this.f64762d = (TextView) viewFindViewById2;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.photocompressor.gallery.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a.c.b(this.f64765a, view2);
                }
            });
        }

        public static void b(c cVar, View view) {
            com.neeeex.ctools.features.photocompressor.data.c cVar2 = cVar.f64763e;
            if (cVar2 != null) {
                cVar.f64760b.invoke(cVar2);
            }
        }

        public final void c(com.neeeex.ctools.features.photocompressor.data.c cVar) {
            m0.a("3wNC44c=\n", "qWIuluLw2P4=\n");
            cVar.getClass();
            this.f64763e = cVar;
            C0764a c0764a = new C0764a(cVar);
            TextView textView = this.f64762d;
            View view = this.itemView;
            m0.a("NFKSsu9o2dw=\n", "XSb337kBvKs=\n");
            view.getClass();
            textView.setText(c0764a.a(view));
            c0764a.b(this.f64761c);
        }

        public final ImageView d() {
            return this.f64761c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Function1 function1) {
        super(f64758e);
        m0.a("sB+kczOLWA==\n", "33HnH1roM+I=\n");
        function1.getClass();
        this.f64759c = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c cVar, int i10) {
        m0.a("c/ovUf4G\n", "G5VDNZt0t10=\n");
        cVar.getClass();
        Object objG = g(i10);
        m0.a("X/boi7FelK0WvbLr\n", "OJOcwsU7+YU=\n");
        objG.getClass();
        cVar.c((com.neeeex.ctools.features.photocompressor.data.c) objG);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup viewGroup, int i10) {
        m0.a("dOlKGZZq\n", "BIg4fPgej4k=\n");
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_neeeex_photo_compressor, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        m0.a("qFOkNjMBq667ZrEIMxW38+EY/lM=\n", "zzbQelJ4xNs=\n");
        layoutParams.getClass();
        viewInflate.setLayoutParams(m(layoutParams, viewGroup));
        return new c(viewInflate, this.f64759c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(c cVar) {
        m0.a("qzv7H1T5\n", "w1SXezGLl34=\n");
        cVar.getClass();
        com.bumptech.glide.b.u(cVar.d()).l(cVar.d());
        super.onViewRecycled(cVar);
    }

    public final ViewGroup.LayoutParams m(ViewGroup.LayoutParams layoutParams, ViewGroup viewGroup) {
        float f10 = viewGroup.getResources().getDisplayMetrics().density;
        int iIntValue = viewGroup.getResources().getDisplayMetrics().widthPixels - ((int) (40 * f10));
        Integer numValueOf = Integer.valueOf(viewGroup.getMeasuredWidth());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        }
        layoutParams.height = q.f((((iIntValue - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) - (((int) (8 * f10)) * 2)) / 3, 1);
        return layoutParams;
    }

    public static final class b {
        public /* synthetic */ b(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public b() {
        }
    }
}