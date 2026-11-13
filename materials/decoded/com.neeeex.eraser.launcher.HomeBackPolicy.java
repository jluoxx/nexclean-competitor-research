package com.neeeex.eraser.launcher;

import com.reyun.solar.engine.utils.Command;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007¨\u0006\r"}, d2 = {"Lcom/neeeex/eraser/launcher/HomeBackPolicy;", "", "<init>", "()V", "normalBack", "Lcom/neeeex/eraser/launcher/HomeBackPolicy$Prompt;", "attributed", "", "defaultHome", Command.Common.SOURCE_TYPE, "", "xiaomi", "Prompt", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HomeBackPolicy {
    public static final HomeBackPolicy INSTANCE = new HomeBackPolicy();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/neeeex/eraser/launcher/HomeBackPolicy$Prompt;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "RESOLVER", "ROLE", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum Prompt {
        NONE,
        RESOLVER,
        ROLE;

        private static final /* synthetic */ ml.a $ENTRIES = ml.b.a(values());

        public static ml.a getEntries() {
            return $ENTRIES;
        }
    }

    private HomeBackPolicy() {
    }

    public final Prompt normalBack(boolean attributed, boolean defaultHome, int sdk, boolean xiaomi) {
        if (!attributed || defaultHome) {
            return Prompt.NONE;
        }
        return (sdk >= 35 || xiaomi) ? Prompt.ROLE : Prompt.RESOLVER;
    }
}