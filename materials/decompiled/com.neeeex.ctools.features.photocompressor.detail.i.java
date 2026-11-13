package com.neeeex.ctools.features.photocompressor.detail;

import android.app.Application;
import android.net.Uri;
import androidx.p002lifecycle.AndroidViewModel;
import androidx.p002lifecycle.LiveData;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModelKt;
import coil.util.j;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.m0;
import gq.v0;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.k;
import kotlinx.coroutines.p0;
import ll.m;
import p003kotlin.jvm.internal.v;
import tl.n;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.neeeex.ctools.features.photocompressor.core.b f64711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.neeeex.ctools.features.photocompressor.data.a f64712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableLiveData f64713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Job f64714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.neeeex.ctools.features.photocompressor.core.a f64715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f64716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LiveData f64717g;

    public interface a {

        /* JADX INFO: renamed from: com.neeeex.ctools.features.photocompressor.detail.i$a$a, reason: collision with other inner class name */
        public static final class C0760a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.neeeex.ctools.features.photocompressor.core.a f64718a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f64719b;

            public C0760a(com.neeeex.ctools.features.photocompressor.core.a aVar, long j10) {
                m0.a("1nQV/L3bSDc=\n", "twZhldu6K0M=\n");
                aVar.getClass();
                this.f64718a = aVar;
                this.f64719b = j10;
            }

            public final com.neeeex.ctools.features.photocompressor.core.a a() {
                return this.f64718a;
            }

            public final long b() {
                return this.f64719b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0760a)) {
                    return false;
                }
                C0760a c0760a = (C0760a) obj;
                return v.c(this.f64718a, c0760a.f64718a) && this.f64719b == c0760a.f64719b;
            }

            public int hashCode() {
                return (this.f64718a.hashCode() * 31) + Long.hashCode(this.f64719b);
            }

            public String toString() {
                return "Created(artifact=" + this.f64718a + ", originalSize=" + this.f64719b + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f64720a = new b();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1776453645;
            }

            public String toString() {
                return m0.a("8Q+kPgMF\n", "t27NUmZhBU0=\n");
            }
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f64721a = new a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1529658744;
            }

            public String toString() {
                return m0.a("Hm79PlxY\n", "WA+UUjk87w4=\n");
            }
        }

        /* JADX INFO: renamed from: com.neeeex.ctools.features.photocompressor.detail.i$b$b, reason: collision with other inner class name */
        public static final class C0761b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Uri f64722a;

            public C0761b(Uri uri) {
                m0.a("iean\n", "/JTObYqLAZs=\n");
                uri.getClass();
                this.f64722a = uri;
            }

            public final Uri a() {
                return this.f64722a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0761b) && v.c(this.f64722a, ((C0761b) obj).f64722a);
            }

            public int hashCode() {
                return this.f64722a.hashCode();
            }

            public String toString() {
                return "Published(uri=" + this.f64722a + ")";
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.neeeex.ctools.features.photocompressor.core.a f64723a;

        public c(com.neeeex.ctools.features.photocompressor.core.a aVar) {
            m0.a("zuNO9FlMASE=\n", "r5E6nT8tYlU=\n");
            aVar.getClass();
            this.f64723a = aVar;
        }

        public final com.neeeex.ctools.features.photocompressor.core.a a() {
            return this.f64723a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && v.c(this.f64723a, ((c) obj).f64723a);
        }

        public int hashCode() {
            return this.f64723a.hashCode();
        }

        public String toString() {
            return "SaveRequest(artifact=" + this.f64723a + ")";
        }
    }

    public static final class d extends m implements n {
        final /* synthetic */ c $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar, kl.f<? super d> fVar) {
            super(2, fVar);
            this.$request = cVar;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return i.this.new d(this.$request, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((d) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            b c0761b;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    fl.v.b(obj);
                    com.neeeex.ctools.features.photocompressor.data.a aVar = i.this.f64712b;
                    com.neeeex.ctools.features.photocompressor.core.a aVarA = this.$request.a();
                    this.label = 1;
                    obj = aVar.k(aVarA, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        v0.a(m0.a("tXeRwrCFeMPxZJjd5ZxyxPZ0mMj/g3LD8X+T2P+acsT2YZTa+NF0jKR5iNr5n3I=\n", "1hb9rpDxF+M=\n"));
                        return null;
                    }
                    fl.v.b(obj);
                }
                c0761b = new b.C0761b((Uri) obj);
            } catch (CancellationException e10) {
                throw e10;
            } catch (Throwable unused) {
                c0761b = b.a.f64721a;
            }
            i.this.k(this.$request, c0761b);
            return fl.m0.f80959a;
        }
    }

    public static final class e extends m implements n {
        final /* synthetic */ String $sourceDisplayName;
        final /* synthetic */ long $sourceSizeBytes;
        final /* synthetic */ Uri $sourceUri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Uri uri, String str, long j10, kl.f<? super e> fVar) {
            super(2, fVar);
            this.$sourceUri = uri;
            this.$sourceDisplayName = str;
            this.$sourceSizeBytes = j10;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return i.this.new e(this.$sourceUri, this.$sourceDisplayName, this.$sourceSizeBytes, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((e) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            a c0760a;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    fl.v.b(obj);
                    com.neeeex.ctools.features.photocompressor.core.b bVar = i.this.f64711a;
                    Uri uri = this.$sourceUri;
                    String str = this.$sourceDisplayName;
                    this.label = 1;
                    obj = bVar.l(uri, str, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        v0.a(m0.a("/BBG7YIBsxC4A0/y1xi5F78TT+fNB7kQuBhE980euRe/BkP1ylW/X+0eX/XLG7k=\n", "n3EqgaJ13DA=\n"));
                        return null;
                    }
                    fl.v.b(obj);
                }
                c0760a = new a.C0760a((com.neeeex.ctools.features.photocompressor.core.a) obj, this.$sourceSizeBytes);
            } catch (CancellationException e10) {
                throw e10;
            } catch (Throwable unused) {
                c0760a = a.b.f64720a;
            }
            i.this.j(c0760a);
            return fl.m0.f80959a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Application application) {
        super(application);
        m0.a("AMyQXoIZeYMI044=\n", "YbzgMut6GPc=\n");
        application.getClass();
        this.f64711a = new com.neeeex.ctools.features.photocompressor.core.b(application);
        this.f64712b = new com.neeeex.ctools.features.photocompressor.data.a(application);
        MutableLiveData mutableLiveData = new MutableLiveData(h.d.f64707a);
        this.f64713c = mutableLiveData;
        this.f64717g = mutableLiveData;
    }

    public final void h() {
        File fileB;
        Job job = this.f64714d;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        com.neeeex.ctools.features.photocompressor.core.a aVar = this.f64715e;
        if (aVar != null && (fileB = aVar.b()) != null) {
            fileB.delete();
        }
        this.f64715e = null;
    }

    public final LiveData i() {
        return this.f64717g;
    }

    public final void j(a aVar) {
        if (v.c(aVar, a.b.f64720a)) {
            this.f64713c.setValue(new h.c(R$string.ctools_neeeex_photo_compressor_error_compress, false));
            return;
        }
        if (!(aVar instanceof a.C0760a)) {
            j.a();
            return;
        }
        a.C0760a c0760a = (a.C0760a) aVar;
        if (c0760a.a().b().length() >= c0760a.b()) {
            c0760a.a().b().delete();
            this.f64713c.setValue(h.a.f64703a);
        } else {
            this.f64715e = c0760a.a();
            this.f64713c.setValue(new h.e(c0760a.a()));
        }
    }

    public final void k(c cVar, b bVar) {
        if (v.c(bVar, b.a.f64721a)) {
            mi.a.f88870a.L();
            this.f64713c.setValue(new h.c(R$string.ctools_neeeex_photo_compressor_error_save, true));
        } else {
            if (!(bVar instanceof b.C0761b)) {
                j.a();
                return;
            }
            cVar.a().b().delete();
            this.f64715e = null;
            mi.a.f88870a.M();
            this.f64713c.setValue(new h.g(((b.C0761b) bVar).a()));
        }
    }

    public final void l() {
        c cVarM = m();
        if (cVarM == null) {
            return;
        }
        Job job = this.f64714d;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f64713c.setValue(h.f.f64709a);
        this.f64714d = k.d(ViewModelKt.getViewModelScope(this), null, null, new d(cVarM, null), 3, null);
    }

    public final c m() {
        com.neeeex.ctools.features.photocompressor.core.a aVar = this.f64715e;
        if (aVar == null) {
            return null;
        }
        h hVar = (h) this.f64713c.getValue();
        if (hVar instanceof h.e) {
            return new c(aVar);
        }
        if ((hVar instanceof h.c) && ((h.c) hVar).a()) {
            return new c(aVar);
        }
        return null;
    }

    public final boolean n(String str) {
        return !(v.c(this.f64716f, str) && !(this.f64713c.getValue() instanceof h.c));
    }

    public final void o(Uri uri, String str, long j10) {
        m0.a("wQ/IzOCzDg7b\n", "smC9voPWW3w=\n");
        uri.getClass();
        m0.a("WosGsZshWyJalB+igQp+Jkw=\n", "KeRzw/hEH0s=\n");
        str.getClass();
        String str2 = uri + "|" + j10;
        if (n(str2)) {
            this.f64716f = str2;
            h();
            this.f64713c.setValue(h.b.f64704a);
            this.f64714d = k.d(ViewModelKt.getViewModelScope(this), null, null, new e(uri, str, j10, null), 3, null);
        }
    }

    @Override // androidx.p002lifecycle.ViewModel
    public void onCleared() {
        h();
        super.onCleared();
    }
}