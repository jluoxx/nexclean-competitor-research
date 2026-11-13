package com.neeeex.virus;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface u {

    public interface a {
        void a(int i10, int i11, String str, e0 e0Var);

        void b();

        void c(List list);

        void onCanceled();

        void onError(int i10, String str);
    }

    void a(a aVar);

    void cancel();
}