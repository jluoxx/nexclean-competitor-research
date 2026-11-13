package com.thinkup.core.common.dq.d;

import com.thinkup.core.api.TUBiddingListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.bridge.ITUBaseAdAdapter;
import com.thinkup.core.common.dq.dd.n;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    private static TUCustomLoadListener d(ITUBaseAdAdapter iTUBaseAdAdapter, TUCustomLoadListener tUCustomLoadListener) {
        if (iTUBaseAdAdapter == null || tUCustomLoadListener == null) {
            return null;
        }
        com.thinkup.core.common.dq.o.m serverExtraInfo = iTUBaseAdAdapter.getServerExtraInfo();
        return (serverExtraInfo == null || !serverExtraInfo.dq()) ? tUCustomLoadListener : new n(tUCustomLoadListener, serverExtraInfo);
    }

    private static ITUBaseAdAdapter d(ITUBaseAdAdapter iTUBaseAdAdapter) {
        return new m(iTUBaseAdAdapter);
    }

    private static TUBiddingListener d(ITUBaseAdAdapter iTUBaseAdAdapter, TUBiddingListener tUBiddingListener) {
        if (iTUBaseAdAdapter == null || tUBiddingListener == null) {
            return null;
        }
        com.thinkup.core.common.dq.o.m serverExtraInfo = iTUBaseAdAdapter.getServerExtraInfo();
        return (serverExtraInfo == null || !serverExtraInfo.dq()) ? tUBiddingListener : new com.thinkup.core.common.dq.dd.m(tUBiddingListener, serverExtraInfo);
    }
}