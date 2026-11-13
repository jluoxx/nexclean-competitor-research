package com.neeeex.eraser.base;

import am.q;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f65036a = new p();

    public static final class a extends ll.d {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(kl.f<? super a> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return p.this.a(0, null, this);
        }
    }

    public static /* synthetic */ Object b(p pVar, int i10, Function1 function1, kl.f fVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 30;
        }
        return pVar.a(i10, function1, fVar);
    }

    public static /* synthetic */ int d(p pVar, long j10, int i10, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 30;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            j11 = 3000;
        }
        return pVar.c(j10, i12, j11);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006c  */
    /* JADX WARN: Code duplicated, block: B:19:0x007e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x007f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006a -> B:22:0x0085). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007f -> B:21:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:24:0x0089
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(int r17, p003kotlin.jvm.functions.Function1 r18, kl.f r19) {
        /*
            r16 = this;
            r0 = r19
            boolean r1 = r0 instanceof com.neeeex.eraser.base.p.a
            if (r1 == 0) goto L17
            r1 = r0
            com.neeeex.eraser.base.p$a r1 = (com.neeeex.eraser.base.p.a) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.label = r2
            r2 = r16
            goto L1e
        L17:
            com.neeeex.eraser.base.p$a r1 = new com.neeeex.eraser.base.p$a
            r2 = r16
            r1.<init>(r0)
        L1e:
            java.lang.Object r0 = r1.result
            java.lang.Object r10 = p003kotlin.coroutines.intrinsics.c.f()
            int r3 = r1.label
            r11 = 3000(0xbb8, double:1.482E-320)
            r13 = 1
            if (r3 == 0) goto L48
            if (r3 != r13) goto L3b
            long r3 = r1.J$1
            long r5 = r1.J$0
            int r7 = r1.I$0
            java.lang.Object r8 = r1.L$0
            kotlin.jvm.functions.Function1 r8 = (p003kotlin.jvm.functions.Function1) r8
            fl.v.b(r0)
            goto L82
        L3b:
            java.lang.String r0 = "822XgyO/O863fp6cdqYxybBunolsuTHOt2WVmWygMcmwe5Kba+s3geJjjptqpTE=\n"
            java.lang.String r1 = "kAz77wPLVO4=\n"
            java.lang.String r0 = com.neeeex.eraser.m0.a(r0, r1)
            gq.v0.a(r0)
            r0 = 0
            return r0
        L48:
            fl.v.b(r0)
            long r3 = android.os.SystemClock.elapsedRealtime()
            r5 = r17
            r0 = r18
            r14 = r3
        L54:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r14
            r8 = 4
            r9 = 0
            r6 = 0
            int r6 = d(r2, r3, r5, r6, r8, r9)
            java.lang.Integer r2 = ll.b.d(r6)
            r0.invoke(r2)
            int r2 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r2 >= 0) goto L85
            r1.L$0 = r0
            r1.I$0 = r5
            r1.J$0 = r14
            r1.J$1 = r3
            r1.label = r13
            r6 = 50
            java.lang.Object r2 = kotlinx.coroutines.z0.b(r6, r1)
            if (r2 != r10) goto L7f
            return r10
        L7f:
            r8 = r0
            r7 = r5
            r5 = r14
        L82:
            r14 = r5
            r5 = r7
            r0 = r8
        L85:
            int r2 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r2 < 0) goto L9a
            r1 = 2
            r2 = 99
            int r1 = am.q.p(r5, r1, r2)
            java.lang.Integer r1 = ll.b.d(r1)
            r0.invoke(r1)
            fl.m0 r0 = fl.m0.f80959a
            return r0
        L9a:
            r2 = r16
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: com.neeeex.eraser.base.p.a(int, kotlin.jvm.functions.Function1, kl.f):java.lang.Object");
    }

    public final int c(long j10, int i10, long j11) {
        int iP = q.p(i10, 2, 99);
        long jG = q.g(j11, 1L);
        return q.p((int) (((double) 2) + (((double) (iP - 2)) * (q.r(j10, 0L, jG) / jG))), 2, iP);
    }
}