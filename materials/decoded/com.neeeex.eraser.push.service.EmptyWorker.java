package com.neeeex.eraser.push.service;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.w;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.push.NotifyListener;
import kl.f;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/neeeex/eraser/push/service/EmptyWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/w$a;", "a", "(Lkl/f;)Ljava/lang/Object;", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EmptyWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        "context" /* decoded XOR */;
        context.getClass();
        "workerParams" /* decoded XOR */;
        workerParameters.getClass();
    }

    @Override // androidx.work.CoroutineWorker
    public Object a(f fVar) {
        NotifyListener.f65464a.n();
        w.a aVarB = w.a.b();
        "success(...)" /* decoded XOR */;
        aVarB.getClass();
        return aVarB;
    }
}