package com.neeeex.ctools.features.device;

/* JADX INFO: loaded from: classes7.dex */
public enum c {
    ACCELEROMETER(1),
    MAGNETIC_FIELD(2),
    ORIENTATION(3),
    GYROSCOPE(4),
    LIGHT(5),
    PROXIMITY(8),
    AMBIENT_TEMPERATURE(13);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ml.a f64279b = ml.b.a(d());
    private final int sensorType;

    c(int i10) {
        this.sensorType = i10;
    }

    public static ml.a getEntries() {
        return f64279b;
    }

    public final int getSensorType() {
        return this.sensorType;
    }
}