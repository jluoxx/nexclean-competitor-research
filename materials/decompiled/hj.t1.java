package hj;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes7.dex */
public final class t1 extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f83702a;

    public t1(k kVar) {
        this.f83702a = kVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f83702a.g(kj.c.E_91207.getCode(), "E_91207");
    }
}