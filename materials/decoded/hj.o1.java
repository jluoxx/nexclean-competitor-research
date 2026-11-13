package hj;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes7.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f83647a = new o1();

    public final Object a(Object obj, String str) {
        boolean z10;
        if (obj == null || p003kotlin.text.k0.r0(str)) {
            return null;
        }
        for (String str2 : p003kotlin.text.k0.V0(str, new String[]{"."}, false, 0, 6, null)) {
            if (obj == null) {
                return null;
            }
            Class<?> superclass = obj.getClass();
            while (true) {
                if (superclass == null) {
                    z10 = false;
                    break;
                }
                try {
                    Field declaredField = superclass.getDeclaredField(str2);
                    z10 = true;
                    declaredField.setAccessible(true);
                    obj = declaredField.get(obj);
                    break;
                } catch (NoSuchFieldException unused) {
                    superclass = superclass.getSuperclass();
                } catch (Exception unused2) {
                    return null;
                }
            }
            if (!z10) {
                return null;
            }
        }
        return obj;
    }
}