package com.trustlook.sdk.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.trustlook.sdk.Constants;

/* JADX INFO: loaded from: classes8.dex */
public class DataUtils {
    public static boolean getBooleanValue(Context context, String str, boolean z10) {
        return context.getSharedPreferences(Constants.PREFERENCE_NAME, 0).getBoolean(str, z10);
    }

    public static float getFloatValue(Context context, String str, float f10) {
        return context.getSharedPreferences(Constants.PREFERENCE_NAME, 0).getFloat(str, f10);
    }

    public static int getIntValue(Context context, String str, int i10) {
        return context.getSharedPreferences(Constants.PREFERENCE_NAME, 0).getInt(str, i10);
    }

    public static long getLongValue(Context context, String str, long j10) {
        return context.getSharedPreferences(Constants.PREFERENCE_NAME, 0).getLong(str, j10);
    }

    public static Region getRegionValue(Context context, int i10) {
        int intValue = getIntValue(context, Constants.CLIENT_REGION, i10);
        if (intValue == 1) {
            return Region.CHN;
        }
        return intValue == 2 ? Region.BAIDU : Region.INTL;
    }

    public static String getStringValue(Context context, String str, String str2) {
        return context.getSharedPreferences(Constants.PREFERENCE_NAME, 0).getString(str, str2);
    }

    public static void saveBooleanValue(Context context, String str, boolean z10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.PREFERENCE_NAME, 0).edit();
        editorEdit.putBoolean(str, z10);
        editorEdit.commit();
    }

    public static void saveFloatValue(Context context, String str, Float f10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.PREFERENCE_NAME, 0).edit();
        editorEdit.putFloat(str, f10.floatValue());
        editorEdit.commit();
    }

    public static void saveIntValue(Context context, String str, int i10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.PREFERENCE_NAME, 0).edit();
        editorEdit.putInt(str, i10);
        editorEdit.commit();
    }

    public static void saveLongValue(Context context, String str, long j10) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.PREFERENCE_NAME, 0).edit();
        editorEdit.putLong(str, j10);
        editorEdit.commit();
    }

    public static void saveRegionValue(Context context, Region region) {
        int i10;
        if (Region.CHN == region) {
            i10 = 1;
        } else {
            i10 = Region.BAIDU == region ? 2 : 0;
        }
        saveIntValue(context, Constants.CLIENT_REGION, i10);
    }

    public static void saveStringValue(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.PREFERENCE_NAME, 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }
}