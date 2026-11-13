package com.neeeex.similar3p.junk.ui;

/* JADX INFO: loaded from: classes7.dex */
public abstract class i {
    public static final long a(long j10, long j11, long j12) {
        Long lValueOf = Long.valueOf(j12 - (j11 <= j10 ? 0L : j11 - j10));
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }
}