package com.reyun.solar.engine.config;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class RemoteConfig {
    private JSONObject customIDEventProperties;
    private JSONObject customIDProperties;
    private JSONObject customIDUserProperties;
    private boolean enable;
    private MergeType mergeType;

    public enum MergeType {
        WITH_USER,
        WITH_CACHE
    }

    public RemoteConfig(boolean z10, MergeType mergeType, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.enable = z10;
        this.mergeType = mergeType;
        this.customIDProperties = jSONObject;
        this.customIDEventProperties = jSONObject2;
        this.customIDUserProperties = jSONObject3;
    }

    public JSONObject getCustomIDEventProperties() {
        return this.customIDEventProperties;
    }

    public JSONObject getCustomIDProperties() {
        return this.customIDProperties;
    }

    public JSONObject getCustomIDUserProperties() {
        return this.customIDUserProperties;
    }

    public MergeType getMergeType() {
        return this.mergeType;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setCustomIDEventProperties(JSONObject jSONObject) {
        this.customIDEventProperties = jSONObject;
    }

    public void setCustomIDProperties(JSONObject jSONObject) {
        this.customIDProperties = jSONObject;
    }

    public void setCustomIDUserProperties(JSONObject jSONObject) {
        this.customIDUserProperties = jSONObject;
    }

    public void setEnable(boolean z10) {
        this.enable = z10;
    }

    public void setMergeType(MergeType mergeType) {
        this.mergeType = mergeType;
    }

    public RemoteConfig() {
        this.enable = false;
    }
}