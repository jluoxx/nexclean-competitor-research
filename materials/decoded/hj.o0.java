package hj;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f83646a;

    public o0(s0 s0Var) {
        this.f83646a = s0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f83646a.o(true, false, false);
    }
}