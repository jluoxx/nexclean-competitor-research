package zi;

import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$string;

/* JADX INFO: loaded from: classes7.dex */
public enum p {
    JUNK_CLEANER(R$string.neeeex_similar_junk_files, R$string.neeeex_for_you_junk_subtitle, R$drawable.ic_neeeex_home_capacity_junk, 0.0f, 8, null),
    VIRUS_SCAN(R$string.virus_neeeex_home_entry, R$string.neeeex_for_you_virus_subtitle, R$drawable.virus_neeeex_home_entry, 0.72f),
    NETWORK_TRAFFIC(R$string.ctools_neeeex_network_traffic_title, R$string.neeeex_for_you_network_traffic_subtitle, R$drawable.neeeex_junk_tool_network_traffic, 0.0f, 8, null),
    APP_MANAGER(R$string.ctools_neeeex_app_manager_title, R$string.neeeex_for_you_app_manager_subtitle, R$drawable.neeeex_junk_tool_app_manager, 0.0f, 8, null),
    SCREENSHOTS(R$string.neeeex_similar_screenshots, R$string.neeeex_for_you_screenshots_subtitle, R$drawable.ic_neeeex_home_capacity_screenshots, 0.0f, 8, null),
    RECENT_APPS(R$string.ctools_neeeex_recent_apps_title, R$string.neeeex_for_you_recent_apps_subtitle, R$drawable.neeeex_junk_tool_recent_apps, 0.0f, 8, null),
    SIMILAR_IMAGES(R$string.neeeex_similar_images, R$string.neeeex_for_you_similar_images_subtitle, R$drawable.ic_neeeex_home_capacity_similar_images, 0.0f, 8, null),
    DUPLICATE_MEDIA(R$string.neeeex_duplicate_media, R$string.neeeex_for_you_duplicate_media_subtitle, R$drawable.ic_neeeex_home_capacity_duplicate_media, 0.0f, 8, null),
    LARGE_MEDIA(R$string.neeeex_large_media, R$string.neeeex_for_you_large_media_subtitle, R$drawable.ic_neeeex_home_capacity_large_media, 0.0f, 8, null),
    LARGE_FILES(R$string.neeeex_large_docs, R$string.neeeex_for_you_large_files_subtitle, R$drawable.ic_neeeex_home_capacity_large_docs, 0.0f, 8, null),
    DEVICE_STATUS(R$string.ctools_neeeex_device_status_title, R$string.neeeex_for_you_device_status_subtitle, R$drawable.neeeex_junk_tool_device_status, 0.0f, 8, null),
    PHOTO_COMPRESSOR(R$string.ctools_neeeex_photo_compressor_title, R$string.neeeex_for_you_photo_compressor_subtitle, R$drawable.ic_neeeex_home_capacity_photo_compressor, 0.0f, 8, null),
    NETWORK_SPEED(R$string.ctools_neeeex_network_speed_title, R$string.neeeex_for_you_network_speed_subtitle, R$drawable.ic_neeeex_home_network_speed, 0.9f),
    DUPLICATE_DOCS(R$string.neeeex_duplicate_docs, R$string.neeeex_for_you_duplicate_docs_subtitle, R$drawable.ic_neeeex_home_capacity_duplicate_docs, 0.0f, 8, null);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ml.a f104414b = ml.b.a(d());
    private final int iconRes;
    private final float iconScale;
    private final int subtitleRes;
    private final int titleRes;

    /* synthetic */ p(int i10, int i11, int i12, float f10, int i13, p003kotlin.jvm.internal.m mVar) {
        this(i10, i11, i12, (i13 & 8) != 0 ? 1.0f : f10);
    }

    public static ml.a getEntries() {
        return f104414b;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final float getIconScale() {
        return this.iconScale;
    }

    public final int getSubtitleRes() {
        return this.subtitleRes;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    p(int i10, int i11, int i12, float f10) {
        this.titleRes = i10;
        this.subtitleRes = i11;
        this.iconRes = i12;
        this.iconScale = f10;
    }
}