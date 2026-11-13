package com.thinkup.core.common.m0.d.d;

import com.thinkup.core.common.m0.d.dq;
import com.thinkup.core.common.md.m.qn;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes7.dex */
public final class dd extends dq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qn f69676d;

    public dd(qn qnVar) {
        this.f69676d = qnVar;
    }

    private InputStream q() {
        qn qnVar = this.f69676d;
        if (qnVar != null) {
            return qnVar.n().dn();
        }
        return null;
    }

    @Override // com.thinkup.core.common.m0.d.dq
    public final long d() {
        qn qnVar = this.f69676d;
        if (qnVar != null) {
            return qnVar.m();
        }
        return 0L;
    }

    @Override // com.thinkup.core.common.m0.d.dq
    public final String m() {
        try {
            qn qnVar = this.f69676d;
            return qnVar != null ? qnVar.o() : null;
        } finally {
            qn qnVar2 = this.f69676d;
            if (qnVar2 != null) {
                qnVar2.close();
            }
        }
    }

    @Override // com.thinkup.core.common.m0.d.dq
    public final String n() {
        try {
            StringBuilder sb2 = new StringBuilder();
            qn qnVar = this.f69676d;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(qnVar != null ? qnVar.n().dn() : null));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
                sb2.append('\n');
            }
            return sb2.toString();
        } finally {
            qn qnVar2 = this.f69676d;
            if (qnVar2 != null) {
                qnVar2.close();
            }
        }
    }

    @Override // com.thinkup.core.common.m0.d.dq
    public final void o() {
        qn qnVar = this.f69676d;
        if (qnVar != null) {
            qnVar.close();
        }
    }
}