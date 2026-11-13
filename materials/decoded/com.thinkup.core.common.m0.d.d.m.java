package com.thinkup.core.common.m0.d.d;

import android.text.TextUtils;
import com.thinkup.core.common.m0.d.Cdo;
import com.thinkup.core.common.m0.d.dn;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends com.thinkup.core.common.m0.d.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f69696m = "POST";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f69697n = "GET";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f69698o;

    public m(com.thinkup.core.common.m0.d.d0 d0Var) {
        super(d0Var);
    }

    private static InputStream d(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Exception unused) {
        }
        if (!"gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"))) {
            return inputStream;
        }
        try {
            byte[] bArr = new byte[2];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedInputStream.mark(2);
            int i10 = bufferedInputStream.read(bArr);
            bufferedInputStream.reset();
            return (i10 == -1 || (((bArr[1] & 255) << 8) | (bArr[0] & 255)) != 35615) ? bufferedInputStream : new GZIPInputStream(bufferedInputStream);
        } catch (Exception unused2) {
            return inputStream;
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0130 A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #1 {all -> 0x0133, blocks: (B:64:0x012b, B:66:0x0130), top: B:72:0x012b }] */
    private Cdo m(dn dnVar) {
        HttpURLConnection httpURLConnection;
        byte[] bArr;
        Cdo.d dVarD = new Cdo.d().d(dnVar);
        InputStream inputStream = null;
        try {
            if (this.f69698o) {
                dVarD.d(new InterruptedException("canceled"));
                return dVarD.d();
            }
            httpURLConnection = (HttpURLConnection) new URL(dnVar.f69732d).openConnection();
            try {
                String str = dnVar.f69733m;
                if (TextUtils.isEmpty(str)) {
                    str = "GET";
                }
                httpURLConnection.setRequestMethod(str);
                if ("POST".equals(str)) {
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setUseCaches(false);
                } else if ("GET".equals(str)) {
                    httpURLConnection.setInstanceFollowRedirects(false);
                }
                httpURLConnection.setConnectTimeout((int) this.f69664d.f69722q);
                httpURLConnection.setReadTimeout((int) this.f69664d.f69714d);
                Map<String, String> map = dnVar.f69736q;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, String> entry : dnVar.f69736q.entrySet()) {
                        httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.connect();
                if ("POST".equals(str) && (bArr = dnVar.f69734n) != null) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(bArr);
                    outputStream.flush();
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                dVarD.d(responseCode);
                if (responseCode == 200) {
                    if (!this.f69698o) {
                        dVarD.d(new n(httpURLConnection, d(httpURLConnection)));
                        return dVarD.d();
                    }
                    dVarD.d(new InterruptedException("canceled"));
                    httpURLConnection.disconnect();
                    return dVarD.d();
                }
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    dVarD.d(httpURLConnection.getHeaderFields());
                } else if (this.f69698o) {
                    dVarD.d(new InterruptedException("canceled"));
                } else {
                    String headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField != null && headerField.toLowerCase().startsWith("http")) {
                        dnVar.f69732d = headerField;
                        httpURLConnection.disconnect();
                        return m(dnVar);
                    }
                }
                httpURLConnection.disconnect();
                return dVarD.d();
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    try {
                        inputStream.close();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Throwable unused) {
                        dVarD.d(th);
                        return dVarD.d();
                    }
                } else if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                dVarD.d(th);
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
    }

    @Override // com.thinkup.core.common.m0.d.m
    public final Cdo d(dn dnVar) {
        return m(dnVar);
    }

    @Override // com.thinkup.core.common.m0.d.m
    public final void d() {
        this.f69698o = true;
    }

    @Override // com.thinkup.core.common.m0.d.m
    public final void d(dn dnVar, com.thinkup.core.common.m0.d.n nVar) {
    }
}