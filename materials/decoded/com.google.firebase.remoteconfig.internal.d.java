package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import fg.p;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Date f55388e = new Date(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Date f55389f = new Date(-1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f55390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f55391b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f55392c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f55393d = new Object();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f55394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Date f55395b;

        public a(int i10, Date date) {
            this.f55394a = i10;
            this.f55395b = date;
        }

        public Date a() {
            return this.f55395b;
        }

        public int b() {
            return this.f55394a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f55396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Date f55397b;

        public b(int i10, Date date) {
            this.f55396a = i10;
            this.f55397b = date;
        }

        public Date a() {
            return this.f55397b;
        }

        public int b() {
            return this.f55396a;
        }
    }

    public d(SharedPreferences sharedPreferences) {
        this.f55390a = sharedPreferences;
    }

    public a a() {
        a aVar;
        synchronized (this.f55392c) {
            aVar = new a(this.f55390a.getInt("num_failed_fetches", 0), new Date(this.f55390a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public long b() {
        return this.f55390a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public String c() {
        return this.f55390a.getString("last_fetch_etag", null);
    }

    public Date d() {
        return new Date(this.f55390a.getLong("last_fetch_time_in_millis", -1L));
    }

    public long e() {
        return this.f55390a.getLong("last_template_version", 0L);
    }

    public long f() {
        return this.f55390a.getLong("minimum_fetch_interval_in_seconds", c.f55372j);
    }

    public b g() {
        b bVar;
        synchronized (this.f55393d) {
            bVar = new b(this.f55390a.getInt("num_failed_realtime_streams", 0), new Date(this.f55390a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    public void h() {
        j(0, f55389f);
    }

    public void i() {
        n(0, f55389f);
    }

    public void j(int i10, Date date) {
        synchronized (this.f55392c) {
            this.f55390a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void k(p pVar) {
        synchronized (this.f55391b) {
            this.f55390a.edit().putLong("fetch_timeout_in_seconds", pVar.a()).putLong("minimum_fetch_interval_in_seconds", pVar.b()).commit();
        }
    }

    public void l(String str) {
        synchronized (this.f55391b) {
            this.f55390a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public void m(long j10) {
        synchronized (this.f55391b) {
            this.f55390a.edit().putLong("last_template_version", j10).apply();
        }
    }

    public void n(int i10, Date date) {
        synchronized (this.f55393d) {
            this.f55390a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void o() {
        synchronized (this.f55391b) {
            this.f55390a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public void p(Date date) {
        synchronized (this.f55391b) {
            this.f55390a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    public void q() {
        synchronized (this.f55391b) {
            this.f55390a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}