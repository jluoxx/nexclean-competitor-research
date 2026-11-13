package com.thinkup.core.common.m0.d.d;

import android.os.Build;
import com.thinkup.core.common.m0.d.dq;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends dq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HttpURLConnection f69699d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InputStream f69700m;

    public n(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.f69699d = httpURLConnection;
        this.f69700m = inputStream;
    }

    private String d(boolean z10) throws Throwable {
        InputStreamReader inputStreamReader;
        if (this.f69700m == null) {
            try {
                HttpURLConnection httpURLConnection = this.f69699d;
                if (httpURLConnection == null) {
                    return "";
                }
                httpURLConnection.disconnect();
                return "";
            } catch (Throwable unused) {
                return "";
            }
        }
        BufferedReader bufferedReader = null;
        try {
            inputStreamReader = new InputStreamReader(this.f69700m);
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader2.readLine();
                        if (line != null) {
                            sb2.append(line);
                            if (z10) {
                                sb2.append('\n');
                            }
                        } else {
                            try {
                                break;
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                    bufferedReader2.close();
                    try {
                        inputStreamReader.close();
                    } catch (Throwable unused3) {
                    }
                    try {
                        InputStream inputStream = this.f69700m;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        HttpURLConnection httpURLConnection2 = this.f69699d;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                    } catch (Throwable unused4) {
                    }
                    return sb2.toString();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused5) {
                        }
                    }
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (Throwable unused6) {
                        }
                    }
                    try {
                        InputStream inputStream2 = this.f69700m;
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        HttpURLConnection httpURLConnection3 = this.f69699d;
                        if (httpURLConnection3 == null) {
                            throw th;
                        }
                        httpURLConnection3.disconnect();
                        throw th;
                    } catch (Throwable unused7) {
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
        }
    }

    @Override // com.thinkup.core.common.m0.d.dq
    public final String m() {
        return d(false);
    }

    @Override // com.thinkup.core.common.m0.d.dq
    public final String n() {
        return d(true);
    }

    @Override // com.thinkup.core.common.m0.d.dq
    public final long d() {
        try {
            InputStream inputStream = this.f69700m;
            if (inputStream == null || Build.VERSION.SDK_INT < 33) {
                return 0L;
            }
            return inputStream.readAllBytes().length;
        } catch (Throwable unused) {
            return 0L;
        }
    }
}