package com.trustlook.sdk.data;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class AppCertificate implements Serializable {
    public long pem_expire;
    public String pem_issuer;
    public String pem_serial;
    public long pem_start;

    public JSONObject getJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pem_issuer", this.pem_issuer);
            jSONObject.put("pem_serial", this.pem_serial);
            jSONObject.put("pem_start", this.pem_start);
            jSONObject.put("pem_expire", this.pem_expire);
            return jSONObject;
        } catch (JSONException e10) {
            e10.getMessage();
            return jSONObject;
        }
    }

    public long getPemExpiredDate() {
        return this.pem_expire;
    }

    public String getPemIssuer() {
        return this.pem_issuer;
    }

    public String getPemSerialNumber() {
        return this.pem_serial;
    }

    public long getPemStartDate() {
        return this.pem_start;
    }

    public void setPemExpiredDate(long j10) {
        this.pem_expire = j10;
    }

    public void setPemIssuer(String str) {
        this.pem_issuer = str;
    }

    public void setPemSerialNumber(String str) {
        this.pem_serial = str;
    }

    public void setPemStartDate(long j10) {
        this.pem_start = j10;
    }

    public String toString() {
        return "{\"pem_issuer\":\"" + this.pem_issuer + "\",\"pem_serial\":\"" + this.pem_serial + "\",\"pem_start\":" + this.pem_start + ",\"pem_expire\":" + this.pem_expire + "}";
    }
}