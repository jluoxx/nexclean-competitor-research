package com.reyun.solar.engine.config;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class CustomDomain {
    private boolean enable;
    private String receiverDomain;
    private String ruleDomain;
    private String tcpGatewayHost;
    private String tcpReceiverHost;
    private String tcpRuleHost;

    public CustomDomain(boolean z10, String str, String str2, String str3, String str4, String str5) {
        this.enable = z10;
        if (!TextUtils.isEmpty(str) && !str.endsWith("/")) {
            str = str.concat("/");
        }
        if (!TextUtils.isEmpty(str2) && !str2.endsWith("/")) {
            str2 = str2.concat("/");
        }
        this.receiverDomain = str;
        this.ruleDomain = str2;
        this.tcpReceiverHost = str3;
        this.tcpRuleHost = str4;
        this.tcpGatewayHost = str5;
    }

    public Boolean getEnable() {
        return Boolean.valueOf(this.enable);
    }

    public String getReceiverDomain() {
        return this.receiverDomain;
    }

    public String getRuleDomain() {
        return this.ruleDomain;
    }

    public String getTcpGatewayHost() {
        return this.tcpGatewayHost;
    }

    public String getTcpReceiverHost() {
        return this.tcpReceiverHost;
    }

    public String getTcpRuleHost() {
        return this.tcpRuleHost;
    }

    public void setEnable(boolean z10) {
        this.enable = z10;
    }

    public void setReceiverDomain(String str) {
        if (!TextUtils.isEmpty(str) && !str.endsWith("/")) {
            str = str.concat("/");
        }
        this.receiverDomain = str;
    }

    public void setRuleDomain(String str) {
        if (!TextUtils.isEmpty(str) && !str.endsWith("/")) {
            str = str.concat("/");
        }
        this.ruleDomain = str;
    }

    public void setTcpGatewayHost(String str) {
        this.tcpGatewayHost = str;
    }

    public void setTcpReceiverHost(String str) {
        this.tcpReceiverHost = str;
    }

    public void setTcpRuleHost(String str) {
        this.tcpRuleHost = str;
    }

    public CustomDomain() {
        this.enable = false;
    }
}