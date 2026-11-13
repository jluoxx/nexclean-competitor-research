package com.neeeex.eraser.utils;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.FileObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.neeeex.eraser.m0;
import gl.g0;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tl.n f66166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f66167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f66168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ContentResolver f66169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f66170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f66171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f66172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ContentObserver f66173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ContentObserver f66174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f66175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f66176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Long f66177l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f66161n = "key_neeeex_event_time" /* decoded XOR */;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f66160m = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p003kotlin.text.p f66162o = new p003kotlin.text.p(".*(/\\.).*" /* decoded XOR */);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String[] f66163p = {Environment.DIRECTORY_DCIM, Environment.DIRECTORY_PICTURES, Environment.DIRECTORY_MOVIES, Environment.DIRECTORY_DOWNLOADS, Environment.DIRECTORY_DOCUMENTS};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f66164q = "media_type=? OR media_type=?" /* decoded XOR */;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String[] f66165r = {"1" /* decoded XOR */, "3" /* decoded XOR */};

    public static final class b {
        public final boolean a(long j10) {
            b0 b0Var = b0.f66131a;
            if (j10 - b0Var.v("key_neeeex_event_time" /* decoded XOR */, 0L) <= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
                return false;
            }
            b0Var.C("key_neeeex_event_time" /* decoded XOR */, j10);
            return true;
        }
    }

    public enum c {
        IMAGE(0, new p003kotlin.text.p("(?i).*[.](jpg|jpeg|png|gif|webp|bmp|svg)(_temp)?$" /* decoded XOR */)),
        VIDEO(1, new p003kotlin.text.p("(?i).*[.](3gp|mp4|mkv|flv|avi|rmvb|mov)(_temp)?$" /* decoded XOR */));


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f66179b = ml.b.a(d());
        private final int callbackType;
        private final p003kotlin.text.p matcher;

        c(int i10, p003kotlin.text.p pVar) {
            this.callbackType = i10;
            this.matcher = pVar;
        }

        public static ml.a getEntries() {
            return f66179b;
        }

        public final boolean accepts(String str) {
            "path" /* decoded XOR */;
            str.getClass();
            return this.matcher.matches(str);
        }

        public final int getCallbackType() {
            return this.callbackType;
        }
    }

    public static final class e extends FileObserver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f66182b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(File file, String str) {
            super(str, 576);
            this.f66182b = file;
        }

        @Override // android.os.FileObserver
        public void onEvent(int i10, String str) {
            h hVar = h.this;
            File file = this.f66182b;
            try {
                fl.u.a aVar = fl.u.Companion;
                hVar.i(file, str);
                fl.u.m372constructorimpl(fl.m0.f80959a);
            } catch (Throwable th2) {
                fl.u.a aVar2 = fl.u.Companion;
                fl.u.m372constructorimpl(fl.v.a(th2));
            }
        }
    }

    public static final class f extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f66183a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Handler handler, h hVar) {
            super(handler);
            this.f66183a = hVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            super.onChange(z10, uri);
            h hVar = this.f66183a;
            try {
                fl.u.a aVar = fl.u.Companion;
                hVar.j();
                fl.u.m372constructorimpl(fl.m0.f80959a);
            } catch (Throwable th2) {
                fl.u.a aVar2 = fl.u.Companion;
                fl.u.m372constructorimpl(fl.v.a(th2));
            }
        }
    }

    public static final class g extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f66184a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Handler handler, h hVar) {
            super(handler);
            this.f66184a = hVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            super.onChange(z10, uri);
            h hVar = this.f66184a;
            try {
                fl.u.a aVar = fl.u.Companion;
                hVar.f66171f.a(hVar.s(), hVar.f66167b);
                fl.u.m372constructorimpl(fl.m0.f80959a);
            } catch (Throwable th2) {
                fl.u.a aVar2 = fl.u.Companion;
                fl.u.m372constructorimpl(fl.v.a(th2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(Context context, tl.n nVar, Function1 function1, Function1 function2) {
        "context" /* decoded XOR */;
        context.getClass();
        "onFileDeleted" /* decoded XOR */;
        nVar.getClass();
        "onFileTrashed" /* decoded XOR */;
        function1.getClass();
        "onScreenshotAdded" /* decoded XOR */;
        function2.getClass();
        this.f66166a = nVar;
        this.f66167b = function1;
        this.f66168c = function2;
        ContentResolver contentResolver = context.getContentResolver();
        "getContentResolver(...)" /* decoded XOR */;
        contentResolver.getClass();
        this.f66169d = contentResolver;
        this.f66170e = System.currentTimeMillis();
        this.f66171f = new d(null, 1, 0 == true ? 1 : 0);
        this.f66172g = new b();
        this.f66175j = new ArrayList();
        this.f66176k = new LinkedHashMap();
    }

    public final void f(File file) {
        List listM;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(file);
        while (!arrayDeque.isEmpty()) {
            File file2 = (File) arrayDeque.removeLast();
            if (file2.isDirectory()) {
                this.f66175j.add(h(file2));
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles != null) {
                    listM = new ArrayList();
                    for (File file3 : fileArrListFiles) {
                        if (file3.isDirectory()) {
                            listM.add(file3);
                        }
                    }
                } else {
                    listM = null;
                }
                if (listM == null) {
                    listM = gl.w.m();
                }
                for (int iO = gl.w.o(listM); -1 < iO; iO--) {
                    arrayDeque.addLast(listM.get(iO));
                }
            }
        }
    }

    public final boolean g(String str) {
        return f66162o.matches(str);
    }

    public final FileObserver h(File file) {
        return new e(file, file.getAbsolutePath());
    }

    public final void i(File file, String str) {
        c cVarU;
        if (str != null && this.f66172g.a(System.currentTimeMillis())) {
            String absolutePath = new File(file, str).getAbsolutePath();
            absolutePath.getClass();
            if (g(absolutePath) || (cVarU = u(absolutePath)) == null) {
                return;
            }
            this.f66166a.invoke(absolutePath, Integer.valueOf(cVarU.getCallbackType()));
        }
    }

    public final void j() {
        Long l10 = this.f66177l;
        if (l10 == null) {
            this.f66177l = r();
            return;
        }
        List listQ = q(l10.longValue());
        if (!listQ.isEmpty()) {
            List list = listQ;
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                retrofit2.e0.a();
                return;
            }
            Long lValueOf = Long.valueOf(((k) it.next()).b());
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((k) it.next()).b());
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            this.f66177l = lValueOf;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                l((k) it2.next());
            }
        }
        t();
    }

    public final Uri k() {
        Uri contentUri = MediaStore.Files.getContentUri("external" /* decoded XOR */);
        "getContentUri(...)" /* decoded XOR */;
        contentUri.getClass();
        return contentUri;
    }

    public final void l(k kVar) {
        if (kVar.e()) {
            this.f66176k.put(Long.valueOf(kVar.b()), kVar);
        } else {
            o(kVar);
        }
    }

    public final void m() {
        Handler handler = new Handler(Looper.getMainLooper());
        g gVar = new g(handler, this);
        f fVar = new f(handler, this);
        this.f66173h = gVar;
        this.f66174i = fVar;
        this.f66169d.registerContentObserver(k(), true, gVar);
        this.f66169d.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, fVar);
    }

    public final void n() {
        String[] strArr = f66163p;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Environment.getExternalStoragePublicDirectory(str));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f((File) it.next());
        }
        Iterator it2 = this.f66175j.iterator();
        while (it2.hasNext()) {
            ((FileObserver) it2.next()).startWatching();
        }
    }

    public final void o(k kVar) {
        if (kVar.a() < this.f66170e - 10000 || !l.f66191a.a(kVar.c())) {
            return;
        }
        this.f66168c.invoke(kVar.d());
    }

    public final k p(long j10) {
        k kVar;
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        String[] strArr = {"_id" /* decoded XOR */, "_display_name" /* decoded XOR */, "date_added" /* decoded XOR */, "relative_path" /* decoded XOR */, "is_pending" /* decoded XOR */};
        ContentResolver contentResolver = this.f66169d;
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Cursor cursorQuery = contentResolver.query(uri, strArr, "_id=?" /* decoded XOR */, new String[]{String.valueOf(j10)}, null);
        if (cursorQuery == null) {
            return null;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            if (cursor2.moveToFirst()) {
                long j11 = cursor2.getLong(cursor2.getColumnIndexOrThrow("_id" /* decoded XOR */));
                StringBuilder sb2 = new StringBuilder();
                String string = cursor2.getString(cursor2.getColumnIndexOrThrow("_display_name" /* decoded XOR */));
                String str = "";
                if (string == null) {
                    string = "";
                }
                sb2.append(string);
                sb2.append('/');
                String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("relative_path" /* decoded XOR */));
                if (string2 != null) {
                    str = string2;
                }
                sb2.append(str);
                String string3 = sb2.toString();
                Uri uriWithAppendedId = ContentUris.withAppendedId(uri, j11);
                "withAppendedId(...)" /* decoded XOR */;
                uriWithAppendedId.getClass();
                kVar = new k(j11, uriWithAppendedId, string3, cursor2.getLong(cursor2.getColumnIndexOrThrow("date_added" /* decoded XOR */)) * 1000, cursor2.getInt(cursor2.getColumnIndexOrThrow("is_pending" /* decoded XOR */)) == 1);
            } else {
                kVar = null;
            }
            ql.c.a(cursor, null);
            return kVar;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ql.c.a(cursor, th2);
                throw th3;
            }
        }
    }

    public final List q(long j10) {
        List listS = gl.w.s("_id" /* decoded XOR */, "_display_name" /* decoded XOR */, "date_added" /* decoded XOR */);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            listS.add("relative_path" /* decoded XOR */);
            listS.add("is_pending" /* decoded XOR */);
        } else {
            listS.add("_data" /* decoded XOR */);
        }
        String[] strArr = (String[]) listS.toArray(new String[0]);
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = this.f66169d.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "_id>?" /* decoded XOR */, new String[]{String.valueOf(j10)}, "_id ASC" /* decoded XOR */);
        if (cursorQuery == null) {
            return arrayList;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id" /* decoded XOR */);
            int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("_display_name" /* decoded XOR */);
            int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("date_added" /* decoded XOR */);
            int columnIndexOrThrow4 = i10 < 29 ? cursor2.getColumnIndexOrThrow("_data" /* decoded XOR */) : -1;
            int columnIndexOrThrow5 = i10 >= 29 ? cursor2.getColumnIndexOrThrow("relative_path" /* decoded XOR */) : -1;
            int columnIndexOrThrow6 = i10 >= 29 ? cursor2.getColumnIndexOrThrow("is_pending" /* decoded XOR */) : -1;
            while (cursor2.moveToNext()) {
                long j11 = cursor2.getLong(columnIndexOrThrow);
                StringBuilder sb2 = new StringBuilder();
                String string = cursor2.getString(columnIndexOrThrow2);
                String str = "";
                if (string == null) {
                    string = "";
                }
                sb2.append(string);
                if (columnIndexOrThrow4 >= 0) {
                    sb2.append('/');
                    String string2 = cursor2.getString(columnIndexOrThrow4);
                    sb2.append(string2 == null ? "" : string2);
                }
                if (columnIndexOrThrow5 >= 0) {
                    sb2.append('/');
                    String string3 = cursor2.getString(columnIndexOrThrow5);
                    if (string3 != null) {
                        str = string3;
                    }
                    sb2.append(str);
                }
                String string4 = sb2.toString();
                Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j11);
                "withAppendedId(...)" /* decoded XOR */;
                uriWithAppendedId.getClass();
                arrayList.add(new k(j11, uriWithAppendedId, string4, 1000 * cursor2.getLong(columnIndexOrThrow3), columnIndexOrThrow6 >= 0 && cursor2.getInt(columnIndexOrThrow6) == 1));
            }
            fl.m0 m0Var = fl.m0.f80959a;
            ql.c.a(cursor, null);
            return arrayList;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ql.c.a(cursor, th2);
                throw th3;
            }
        }
    }

    public final Long r() {
        Cursor cursorQuery = this.f66169d.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id" /* decoded XOR */}, Build.VERSION.SDK_INT >= 29 ? "is_pending=0" /* decoded XOR */ : null, null, "_id DESC" /* decoded XOR */);
        if (cursorQuery == null) {
            return null;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            Long lValueOf = Long.valueOf(cursor2.moveToFirst() ? cursor2.getLong(0) : 0L);
            ql.c.a(cursor, null);
            return lValueOf;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ql.c.a(cursor, th2);
                throw th3;
            }
        }
    }

    public final LinkedHashSet s() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Cursor cursorQuery = this.f66169d.query(k(), new String[]{"_data" /* decoded XOR */, "is_trashed" /* decoded XOR */}, f66164q, f66165r, null);
        if (cursorQuery == null) {
            return linkedHashSet;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_data" /* decoded XOR */);
            int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("is_trashed" /* decoded XOR */);
            while (cursor2.moveToNext()) {
                if (cursor2.getInt(columnIndexOrThrow2) == 1) {
                    linkedHashSet.add(cursor2.getString(columnIndexOrThrow));
                }
            }
            fl.m0 m0Var = fl.m0.f80959a;
            ql.c.a(cursor, null);
            return linkedHashSet;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ql.c.a(cursor, th2);
                throw th3;
            }
        }
    }

    public final void t() {
        Set setKeySet = this.f66176k.keySet();
        "<get-keys>(...)" /* decoded XOR */;
        setKeySet.getClass();
        for (Long l10 : g0.f1(setKeySet)) {
            l10.getClass();
            k kVarP = p(l10.longValue());
            if (kVarP == null) {
                this.f66176k.remove(l10);
            } else if (!kVarP.e()) {
                this.f66176k.remove(l10);
                o(kVarP);
            }
        }
    }

    public final c u(String str) {
        for (c cVar : c.values()) {
            if (cVar.accepts(str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void v() {
        Object objM372constructorimpl;
        try {
            fl.u.a aVar = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(r());
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        if (fl.u.m377isFailureimpl(objM372constructorimpl)) {
            objM372constructorimpl = null;
        }
        this.f66177l = (Long) objM372constructorimpl;
        m();
        n();
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public a() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f66180a;

        public d(LinkedHashSet linkedHashSet) {
            "paths" /* decoded XOR */;
            linkedHashSet.getClass();
            this.f66180a = linkedHashSet;
        }

        public final void a(LinkedHashSet linkedHashSet, Function1 function1) {
            "next" /* decoded XOR */;
            linkedHashSet.getClass();
            "publish" /* decoded XOR */;
            function1.getClass();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!this.f66180a.contains(str)) {
                    function1.invoke(str);
                }
            }
            this.f66180a.clear();
            this.f66180a.addAll(linkedHashSet);
        }

        public /* synthetic */ d(LinkedHashSet linkedHashSet, int i10, p003kotlin.jvm.internal.m mVar) {
            this((i10 & 1) != 0 ? new LinkedHashSet() : linkedHashSet);
        }
    }
}