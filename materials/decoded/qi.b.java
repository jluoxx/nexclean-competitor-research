package qi;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.thinkup.core.common.dd.n;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f92155a = new b();

    public final boolean a(long j10, long j11, boolean z10, Boolean bool, boolean z11, long j12) {
        long j13;
        if (z10 && v.c(bool, Boolean.FALSE)) {
            j13 = 5000;
        } else {
            j13 = z11 ? ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS * j12 : n.f67831d;
        }
        return j10 - j11 >= j13;
    }
}