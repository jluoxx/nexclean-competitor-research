package com.neeeex.ctools.features.network;

import am.q;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.m0;
import fl.t;
import fl.z;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.m;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f64366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public di.b f64367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f64368e;

    /* JADX INFO: renamed from: com.neeeex.ctools.features.network.a$a, reason: collision with other inner class name */
    public static final class C0741a extends androidx.recyclerview.widget.h.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0741a f64369a = new C0741a();

        @Override // androidx.recyclerview.widget.h.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(di.c cVar, di.c cVar2) {
            "oldItem" /* decoded XOR */;
            cVar.getClass();
            "newItem" /* decoded XOR */;
            cVar2.getClass();
            return v.c(cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.h.f
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean b(di.c cVar, di.c cVar2) {
            "oldItem" /* decoded XOR */;
            cVar.getClass();
            "newItem" /* decoded XOR */;
            cVar2.getClass();
            return cVar.f() == cVar2.f() && v.c(cVar.d(), cVar2.d());
        }
    }

    public static final class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function1 f64370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f64371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f64372d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f64373e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f64374f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ProgressBar f64375g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public di.c f64376h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, Function1 function1) {
            super(view);
            "itemView" /* decoded XOR */;
            view.getClass();
            "onManageClick" /* decoded XOR */;
            function1.getClass();
            this.f64370b = function1;
            View viewFindViewById = view.findViewById(R$id.neeeex_network_app_icon);
            "findViewById(...)" /* decoded XOR */;
            viewFindViewById.getClass();
            this.f64371c = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R$id.neeeex_network_app_title);
            "findViewById(...)" /* decoded XOR */;
            viewFindViewById2.getClass();
            this.f64372d = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R$id.neeeex_network_traffic_size);
            "findViewById(...)" /* decoded XOR */;
            viewFindViewById3.getClass();
            this.f64373e = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R$id.neeeex_network_button_manage);
            "findViewById(...)" /* decoded XOR */;
            viewFindViewById4.getClass();
            TextView textView = (TextView) viewFindViewById4;
            this.f64374f = textView;
            View viewFindViewById5 = view.findViewById(R$id.neeeex_network_traffic_progress);
            "findViewById(...)" /* decoded XOR */;
            viewFindViewById5.getClass();
            this.f64375g = (ProgressBar) viewFindViewById5;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.network.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a.b.b(this.f64384a, view2);
                }
            });
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.network.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    a.b.c(this.f64385a, view2);
                }
            });
        }

        public static void b(b bVar, View view) {
            bVar.e();
        }

        public static void c(b bVar, View view) {
            bVar.e();
        }

        public final void d(di.c cVar, di.b bVar, long j10) {
            "item" /* decoded XOR */;
            cVar.getClass();
            "filter" /* decoded XOR */;
            bVar.getClass();
            this.f64376h = cVar;
            C0742a c0742aA = C0742a.f64377f.a(cVar, bVar, j10);
            this.f64371c.setImageDrawable(c0742aA.b());
            this.f64372d.setText(c0742aA.e());
            this.f64373e.setText(c0742aA.a());
            ProgressBar progressBar = this.f64375g;
            progressBar.setProgress(c0742aA.c());
            progressBar.setSecondaryProgress(c0742aA.d());
        }

        public final void e() {
            di.c cVar = this.f64376h;
            if (cVar != null) {
                this.f64370b.invoke(cVar);
            }
        }

        /* JADX INFO: renamed from: com.neeeex.ctools.features.network.a$b$a, reason: collision with other inner class name */
        public static final class C0742a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final C0743a f64377f = new C0743a(null);

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Drawable f64378a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f64379b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f64380c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f64381d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f64382e;

            public C0742a(Drawable drawable, String str, String str2, int i10, int i11) {
                "title" /* decoded XOR */;
                str.getClass();
                "formattedBytes" /* decoded XOR */;
                str2.getClass();
                this.f64378a = drawable;
                this.f64379b = str;
                this.f64380c = str2;
                this.f64381d = i10;
                this.f64382e = i11;
            }

            public final String a() {
                return this.f64380c;
            }

            public final Drawable b() {
                return this.f64378a;
            }

            public final int c() {
                return this.f64381d;
            }

            public final int d() {
                return this.f64382e;
            }

            public final String e() {
                return this.f64379b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0742a)) {
                    return false;
                }
                C0742a c0742a = (C0742a) obj;
                return v.c(this.f64378a, c0742a.f64378a) && v.c(this.f64379b, c0742a.f64379b) && v.c(this.f64380c, c0742a.f64380c) && this.f64381d == c0742a.f64381d && this.f64382e == c0742a.f64382e;
            }

            public int hashCode() {
                Drawable drawable = this.f64378a;
                return ((((((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.f64379b.hashCode()) * 31) + this.f64380c.hashCode()) * 31) + Integer.hashCode(this.f64381d)) * 31) + Integer.hashCode(this.f64382e);
            }

            public String toString() {
                return "TrafficRow(icon=" + this.f64378a + ", title=" + this.f64379b + ", formattedBytes=" + this.f64380c + ", primaryProgress=" + this.f64381d + ", secondaryProgress=" + this.f64382e + ")";
            }

            /* JADX INFO: renamed from: com.neeeex.ctools.features.network.a$b$a$a, reason: collision with other inner class name */
            public static final class C0743a {

                /* JADX INFO: renamed from: com.neeeex.ctools.features.network.a$b$a$a$a, reason: collision with other inner class name */
                public static final /* synthetic */ class C0744a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f64383a;

                    static {
                        int[] iArr = new int[di.b.values().length];
                        try {
                            iArr[di.b.MOBILE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[di.b.WIFI.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[di.b.BOTH_TYPES.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        f64383a = iArr;
                    }
                }

                public /* synthetic */ C0743a(m mVar) {
                    this();
                }

                public final C0742a a(di.c cVar, di.b bVar, long j10) {
                    t tVarA;
                    "item" /* decoded XOR */;
                    cVar.getClass();
                    "filter" /* decoded XOR */;
                    bVar.getClass();
                    int i10 = C0744a.f64383a[bVar.ordinal()];
                    if (i10 == 1) {
                        tVarA = z.a(Long.valueOf(cVar.c()), 0L);
                    } else if (i10 == 2) {
                        tVarA = z.a(0L, Long.valueOf(cVar.g()));
                    } else {
                        if (i10 != 3) {
                            coil.util.j.a();
                            return null;
                        }
                        tVarA = z.a(Long.valueOf(cVar.c()), Long.valueOf(cVar.e()));
                    }
                    return new C0742a(cVar.a(), cVar.b(), xh.a.f102795a.a(di.e.a(cVar, bVar)), b(((Number) tVarA.getFirst()).longValue(), j10), b(((Number) tVarA.getSecond()).longValue(), j10));
                }

                public final int b(long j10, long j11) {
                    if (j11 <= 0) {
                        return 0;
                    }
                    return q.p((int) ((j10 / j11) * 100.0d), 0, 100);
                }

                public C0743a() {
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Function1 function1) {
        super(C0741a.f64369a);
        "onManageClick" /* decoded XOR */;
        function1.getClass();
        this.f64366c = function1;
        this.f64367d = di.b.BOTH_TYPES;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        "holder" /* decoded XOR */;
        bVar.getClass();
        Object objG = g(i10);
        "getItem(...)" /* decoded XOR */;
        objG.getClass();
        bVar.d((di.c) objG, this.f64367d, this.f64368e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        "parent" /* decoded XOR */;
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_neeeex_network_traffic, viewGroup, false);
        viewInflate.getClass();
        return new b(viewInflate, this.f64366c);
    }

    public final void l(di.a aVar, di.b bVar) {
        "state" /* decoded XOR */;
        aVar.getClass();
        "nextFilter" /* decoded XOR */;
        bVar.getClass();
        this.f64367d = bVar;
        this.f64368e = aVar.b();
        i(aVar.a());
    }
}