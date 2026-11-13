package com.neeeex.similar3p.utils;

import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0005H\u0002J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086 J\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0086 J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086 ¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/neeeex/similar3p/utils/ImageNUtils;", "", "<init>", "()V", "nativeLoaded", "", "getNativeLoaded", "()Z", "setNativeLoaded", "(Z)V", "loadNativeLibrary", "aa", "", "bitmap", "Landroid/graphics/Bitmap;", "ab", "", CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, "", "", "hashes", "", "threshold", "", "([JI)[[I", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ImageNUtils {
    public static final ImageNUtils INSTANCE;
    private static boolean nativeLoaded;

    static {
        ImageNUtils imageNUtils = new ImageNUtils();
        INSTANCE = imageNUtils;
        nativeLoaded = imageNUtils.loadNativeLibrary();
    }

    private ImageNUtils() {
    }

    private final boolean loadNativeLibrary() {
        try {
            System.loadLibrary("neeeex_sm" /* decoded XOR */);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final native long aa(Bitmap bitmap);

    public final native String ab(Bitmap bitmap);

    public final native int[][] ac(long[] hashes, int threshold);

    public final boolean getNativeLoaded() {
        return nativeLoaded;
    }

    public final void setNativeLoaded(boolean z10) {
        nativeLoaded = z10;
    }
}