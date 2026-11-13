package com.neeeex.eraser.launcher;

import com.android.launcher3.testing.shared.TestProtocol;
import com.mbridge.msdk.MBridgeConstans;
import com.neeeex.eraser.m0;
import java.util.Iterator;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/neeeex/eraser/launcher/FirstMinusOneFunnel;", "", "Lkotlin/Function0;", "", "readState", "Lkotlin/Function1;", "", "writeState", "Lcom/neeeex/eraser/launcher/FirstMinusOneEntryPath;", "Lfl/m0;", "report", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", TestProtocol.STATE_FIELD, "entryPath", "(Ljava/lang/String;)Lcom/neeeex/eraser/launcher/FirstMinusOneEntryPath;", "startNewUser", "()Z", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "recordEntryPath", "(Lcom/neeeex/eraser/launcher/FirstMinusOneEntryPath;)Z", "reportShown", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "Companion", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FirstMinusOneFunnel {
    private final Function0 readState;
    private final Function1 report;
    private final Function1 writeState;

    @Deprecated
    public static final String PENDING = m0.a("f7x3b1vFYw==\n", "D9kZCzKrBAQ=\n");

    @Deprecated
    public static final String REPORTED = m0.a("OZBI9u09sXE=\n", "S/U4mZ9J1BU=\n");
    private static final Companion Companion = new Companion(null);

    public FirstMinusOneFunnel(Function0 function0, Function1 function1, Function1 function2) {
        m0.a("wiM6wwfASyLV\n", "sEZbp1S0KlY=\n");
        function0.getClass();
        m0.a("g5KEr7H8aUiAhQ==\n", "9ODt29SvHSk=\n");
        function1.getClass();
        m0.a("etJBTsvE\n", "CLcxIbmw2tU=\n");
        function2.getClass();
        this.readState = function0;
        this.writeState = function1;
        this.report = function2;
    }

    private final FirstMinusOneEntryPath entryPath(String state) {
        Object next;
        Iterator<E> it = FirstMinusOneEntryPath.getEntries().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (p003kotlin.jvm.internal.v.c(((FirstMinusOneEntryPath) next).getValue(), state)) {
                return (FirstMinusOneEntryPath) next;
            }
        }
        next = null;
        return (FirstMinusOneEntryPath) next;
    }

    public final synchronized boolean recordEntryPath(FirstMinusOneEntryPath path) {
        m0.a("Gj22Sw==\n", "alzCIzd9BrY=\n");
        path.getClass();
        String str = (String) this.readState.invoke();
        if (!p003kotlin.jvm.internal.v.c(str, PENDING) && entryPath(str) == null) {
            return false;
        }
        return ((Boolean) this.writeState.invoke(path.getValue())).booleanValue();
    }

    public final synchronized boolean reportShown() {
        FirstMinusOneEntryPath firstMinusOneEntryPathEntryPath = entryPath((String) this.readState.invoke());
        if (firstMinusOneEntryPathEntryPath == null) {
            return false;
        }
        if (!((Boolean) this.writeState.invoke(REPORTED)).booleanValue()) {
            return false;
        }
        this.report.invoke(firstMinusOneEntryPathEntryPath);
        return true;
    }

    public final synchronized boolean startNewUser() {
        if (((CharSequence) this.readState.invoke()).length() > 0) {
            return false;
        }
        return ((Boolean) this.writeState.invoke(PENDING)).booleanValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/neeeex/eraser/launcher/FirstMinusOneFunnel$Companion;", "", "<init>", "()V", "PENDING", "", "REPORTED", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        private Companion() {
        }
    }
}