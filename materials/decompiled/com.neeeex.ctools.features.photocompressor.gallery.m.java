package com.neeeex.ctools.features.photocompressor.gallery;

import com.neeeex.eraser.m0;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public interface m {

    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.neeeex.ctools.features.photocompressor.data.b f64789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f64790b;

        public a(com.neeeex.ctools.features.photocompressor.data.b bVar, n nVar) {
            m0.a("G7iCFVHnbg==\n", "eNn2dD2ICTw=\n");
            bVar.getClass();
            m0.a("uUw8RQ2ZL+OeSDI=\n", "yilQIG7tSoc=\n");
            nVar.getClass();
            this.f64789a = bVar;
            this.f64790b = nVar;
        }

        public static /* synthetic */ a b(a aVar, com.neeeex.ctools.features.photocompressor.data.b bVar, n nVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = aVar.f64789a;
            }
            if ((i10 & 2) != 0) {
                nVar = aVar.f64790b;
            }
            return aVar.a(bVar, nVar);
        }

        public final a a(com.neeeex.ctools.features.photocompressor.data.b bVar, n nVar) {
            m0.a("GSkNALLPig==\n", "ekh5Yd6g7T0=\n");
            bVar.getClass();
            m0.a("yoRhFnhIbxXtgG8=\n", "ueENcxs8CnE=\n");
            nVar.getClass();
            return new a(bVar, nVar);
        }

        public final com.neeeex.ctools.features.photocompressor.data.b c() {
            return this.f64789a;
        }

        public final n d() {
            return this.f64790b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return v.c(this.f64789a, aVar.f64789a) && this.f64790b == aVar.f64790b;
        }

        public int hashCode() {
            return (this.f64789a.hashCode() * 31) + this.f64790b.hashCode();
        }

        public String toString() {
            return "Content(catalog=" + this.f64789a + ", selectedTab=" + this.f64790b + ")";
        }
    }

    public static final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64791a;

        public b(int i10) {
            this.f64791a = i10;
        }

        public final int a() {
            return this.f64791a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f64791a == ((b) obj).f64791a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f64791a);
        }

        public String toString() {
            return "Error(messageRes=" + this.f64791a + ")";
        }
    }

    public static final class c implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f64792a = new c();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 374525370;
        }

        public String toString() {
            return m0.a("7bDPV3vhxA==\n", "od+uMxKPo84=\n");
        }
    }
}