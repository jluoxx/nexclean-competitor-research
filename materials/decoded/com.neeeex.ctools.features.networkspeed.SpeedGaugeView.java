package com.neeeex.ctools.features.networkspeed;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.android.systemui.shared.system.SysUiStatsLog;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.neeeex.eraser.R$color;
import com.neeeex.eraser.m0;
import com.tradplus.ads.common.serialization.asm.Opcodes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 \"2\u00020\u0001:\u0006'+!\u001a61B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J\u001f\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u0014J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010\u0014J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010\u0014J\u0017\u0010$\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b$\u0010\u0014J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020\u0015H\u0002¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002¢\u0006\u0004\b/\u00100R\u0014\u00103\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00102R\u0014\u00105\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00102R\u0014\u00107\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00102R\u0014\u00108\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00102R\u0014\u00109\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00102R\u0014\u0010:\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00102R\u0016\u0010<\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010=¨\u0006?"}, d2 = {"Lcom/neeeex/ctools/features/networkspeed/SpeedGaugeView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "mbps", "Lfl/m0;", "setSpeed", "(D)V", "onDetachedFromWindow", "()V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "start", TtmlNode.END, "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "c", "(FF)Landroid/animation/ValueAnimator;", CampaignEx.JSON_KEY_AD_K, "Lcom/neeeex/ctools/features/networkspeed/SpeedGaugeView$c;", "layer", "g", "(Lcom/neeeex/ctools/features/networkspeed/SpeedGaugeView$c;Landroid/graphics/Canvas;)V", "f", "j", "i", "h", "colorValue", "Landroid/graphics/Paint;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "(I)Landroid/graphics/Paint;", "degrees", "Lcom/neeeex/ctools/features/networkspeed/SpeedGaugeView$b;", "e", "(F)Lcom/neeeex/ctools/features/networkspeed/SpeedGaugeView$b;", "", "Lcom/neeeex/ctools/features/networkspeed/SpeedGaugeView$f;", "l", "()Ljava/util/List;", "a", "Landroid/graphics/Paint;", "trackPaint", "progressPaint", "tickPaint", "d", "labelPaint", "needlePaint", "hubPaint", "hubCenterPaint", "F", "progressFraction", "Landroid/animation/ValueAnimator;", "progressAnimator", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SpeedGaugeView extends View {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final RectF f64466k = new RectF(78.0f, 27.0f, 297.0f, 246.0f);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final List f64467l = gl.w.p("0" /* decoded XOR */, "10" /* decoded XOR */, "20" /* decoded XOR */, "50" /* decoded XOR */, "100" /* decoded XOR */, "250" /* decoded XOR */, "500" /* decoded XOR */, "750" /* decoded XOR */, "1000" /* decoded XOR */);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Paint trackPaint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Paint progressPaint;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Paint tickPaint;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Paint labelPaint;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Paint needlePaint;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final Paint hubPaint;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final Paint hubCenterPaint;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public float progressFraction;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public ValueAnimator progressAnimator;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f64477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f64478b;

        public b(float f10, float f11) {
            this.f64477a = f10;
            this.f64478b = f11;
        }

        public final float a() {
            return this.f64477a;
        }

        public final float b() {
            return this.f64478b;
        }

        public final e c(float f10) {
            return new e((this.f64477a * f10) + 188.0f, (this.f64478b * f10) + 141.0f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.f64477a, bVar.f64477a) == 0 && Float.compare(this.f64478b, bVar.f64478b) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f64477a) * 31) + Float.hashCode(this.f64478b);
        }

        public String toString() {
            return "Direction(x=" + this.f64477a + ", y=" + this.f64478b + ")";
        }
    }

    public enum c {
        ARCS,
        TICKS,
        LABELS,
        NEEDLE;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f64480b = ml.b.a(d());

        public static ml.a getEntries() {
            return f64480b;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f64485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f64486b;

        public e(float f10, float f11) {
            this.f64485a = f10;
            this.f64486b = f11;
        }

        public final float a() {
            return this.f64485a;
        }

        public final float b() {
            return this.f64486b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(this.f64485a, eVar.f64485a) == 0 && Float.compare(this.f64486b, eVar.f64486b) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f64485a) * 31) + Float.hashCode(this.f64486b);
        }

        public String toString() {
            return "Point(x=" + this.f64485a + ", y=" + this.f64486b + ")";
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f64487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f64488b;

        public f(e eVar, e eVar2) {
            "start" /* decoded XOR */;
            eVar.getClass();
            "end" /* decoded XOR */;
            eVar2.getClass();
            this.f64487a = eVar;
            this.f64488b = eVar2;
        }

        public final e a() {
            return this.f64488b;
        }

        public final e b() {
            return this.f64487a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return p003kotlin.jvm.internal.v.c(this.f64487a, fVar.f64487a) && p003kotlin.jvm.internal.v.c(this.f64488b, fVar.f64488b);
        }

        public int hashCode() {
            return (this.f64487a.hashCode() * 31) + this.f64488b.hashCode();
        }

        public String toString() {
            return "TickGeometry(start=" + this.f64487a + ", end=" + this.f64488b + ")";
        }
    }

    public static final /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64489a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.ARCS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.TICKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.LABELS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.NEEDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f64489a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeedGaugeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        "context" /* decoded XOR */;
        context.getClass();
        Paint paintB = b(Color.rgb(231, 231, 231));
        paintB.setShadowLayer(7.8f, 0.0f, 0.0f, Color.rgb(Opcodes.INVOKEINTERFACE, Opcodes.INSTANCEOF, 194));
        this.trackPaint = paintB;
        int i11 = R$color.color_neeeex_brand_5;
        this.progressPaint = b(context.getColor(i11));
        Paint paint = new Paint(1);
        paint.setColor(Color.rgb(195, 195, 195));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.4f);
        this.tickPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(Color.rgb(Opcodes.IF_ACMPNE, Opcodes.IF_ACMPNE, Opcodes.IF_ACMPNE));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(10.6f);
        paint2.setTypeface(Typeface.create("sans-serif" /* decoded XOR */, 0));
        this.labelPaint = paint2;
        Paint paint3 = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint3.setStyle(style);
        paint3.setAlpha(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE);
        this.needlePaint = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(context.getColor(i11));
        paint4.setStyle(style);
        this.hubPaint = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(-1);
        paint5.setStyle(style);
        this.hubCenterPaint = paint5;
        setLayerType(1, null);
    }

    public static final void d(SpeedGaugeView speedGaugeView, ValueAnimator valueAnimator) {
        "it" /* decoded XOR */;
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        "null cannot be cast to non-null type kotlin.Float" /* decoded XOR */;
        animatedValue.getClass();
        speedGaugeView.progressFraction = ((Float) animatedValue).floatValue();
        speedGaugeView.invalidate();
    }

    public final Paint b(int colorValue) {
        Paint paint = new Paint(1);
        paint.setColor(colorValue);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(22.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    public final ValueAnimator c(float start, float end) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(start, end);
        valueAnimatorOfFloat.setDuration(240L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.neeeex.ctools.features.networkspeed.a0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SpeedGaugeView.d(this.f64493a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final b e(float degrees) {
        double radians = Math.toRadians(degrees);
        return new b((float) Math.cos(radians), (float) Math.sin(radians));
    }

    public final void f(Canvas canvas) {
        RectF rectF = f64466k;
        canvas.drawArc(rectF, 120.0f, 299.0f, false, this.trackPaint);
        float f10 = this.progressFraction;
        if (f10 > 0.0f) {
            canvas.drawArc(rectF, 120.0f, f10 * 299.0f, false, this.progressPaint);
        }
    }

    public final void g(c layer, Canvas canvas) {
        int i10 = g.f64489a[layer.ordinal()];
        if (i10 == 1) {
            f(canvas);
            return;
        }
        if (i10 == 2) {
            j(canvas);
            return;
        }
        if (i10 == 3) {
            i(canvas);
        } else if (i10 == 4) {
            h(canvas);
        } else {
            coil.util.j.a();
        }
    }

    public final void h(Canvas canvas) {
        b bVarE = e((this.progressFraction * 299.0f) + 120.0f);
        e eVarC = bVarE.c(88.0f);
        e eVarC2 = bVarE.c(3.0f);
        Path path = new Path();
        path.moveTo(eVarC2.a() - (bVarE.b() * 14.0f), eVarC2.b() + (bVarE.a() * 14.0f));
        path.lineTo(eVarC.a(), eVarC.b());
        path.lineTo(eVarC2.a() + (bVarE.b() * 14.0f), eVarC2.b() - (bVarE.a() * 14.0f));
        path.close();
        this.needlePaint.setShader(new LinearGradient(188.0f, 141.0f, eVarC.a(), eVarC.b(), Color.rgb(Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, SysUiStatsLog.NOTIFICATION_PANEL_REPORTED, 246), getContext().getColor(R$color.color_neeeex_brand_5), Shader.TileMode.CLAMP));
        canvas.drawPath(path, this.needlePaint);
        this.needlePaint.setShader(null);
        canvas.drawCircle(188.0f, 141.0f, 18.25f, this.hubPaint);
        canvas.drawCircle(188.0f, 141.0f, 13.5f, this.hubCenterPaint);
    }

    public final void i(Canvas canvas) {
        float f10 = (-(this.labelPaint.ascent() + this.labelPaint.descent())) / 2.0f;
        int i10 = 0;
        for (Object obj : f64467l) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                gl.w.w();
            }
            e eVarC = e(((i10 / (f64467l.size() - 1)) * 270.0f) + 135.0f).c(82.0f);
            canvas.drawText((String) obj, eVarC.a(), eVarC.b() + f10, this.labelPaint);
            i10 = i11;
        }
    }

    public final void j(Canvas canvas) {
        for (f fVar : l()) {
            canvas.drawLine(fVar.b().a(), fVar.b().b(), fVar.a().a(), fVar.a().b(), this.tickPaint);
        }
    }

    public final void k() {
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.progressAnimator = null;
    }

    public final List l() {
        ArrayList arrayList = new ArrayList(15);
        for (int i10 = 0; i10 < 15; i10++) {
            b bVarE = e(((i10 / 14) * 299.0f) + 120.0f);
            arrayList.add(new f(bVarE.c(92.0f), bVarE.c(98.0f)));
        }
        return arrayList;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        k();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        "canvas" /* decoded XOR */;
        canvas.getClass();
        super.onDraw(canvas);
        d dVarA = d.f64481d.a(getWidth(), getHeight());
        if (dVarA == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(dVarA.a(), dVarA.b());
        canvas.scale(dVarA.c(), dVarA.c());
        Iterator<E> it = c.getEntries().iterator();
        while (it.hasNext()) {
            g((c) it.next(), canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public final void setSpeed(double mbps) {
        float fA = z.f64562a.a(mbps);
        k();
        ValueAnimator valueAnimatorC = c(this.progressFraction, fA);
        valueAnimatorC.start();
        this.progressAnimator = valueAnimatorC;
    }

    public static final class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f64481d = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f64482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f64483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f64484c;

        public d(float f10, float f11, float f12) {
            this.f64482a = f10;
            this.f64483b = f11;
            this.f64484c = f12;
        }

        public final float a() {
            return this.f64483b;
        }

        public final float b() {
            return this.f64484c;
        }

        public final float c() {
            return this.f64482a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Float.compare(this.f64482a, dVar.f64482a) == 0 && Float.compare(this.f64483b, dVar.f64483b) == 0 && Float.compare(this.f64484c, dVar.f64484c) == 0;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f64482a) * 31) + Float.hashCode(this.f64483b)) * 31) + Float.hashCode(this.f64484c);
        }

        public String toString() {
            return "GaugeTransform(scale=" + this.f64482a + ", offsetX=" + this.f64483b + ", offsetY=" + this.f64484c + ")";
        }

        public static final class a {
            public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
                this();
            }

            public final d a(int i10, int i11) {
                float f10 = i10;
                float f11 = i11;
                Float fValueOf = Float.valueOf(Math.min(f10 / 375.0f, f11 / 280.0f));
                if (fValueOf.floatValue() <= 0.0f) {
                    fValueOf = null;
                }
                if (fValueOf == null) {
                    return null;
                }
                float fFloatValue = fValueOf.floatValue();
                return new d(fFloatValue, (f10 - (375.0f * fFloatValue)) / 2.0f, (f11 - (280.0f * fFloatValue)) / 2.0f);
            }

            public a() {
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpeedGaugeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        "context" /* decoded XOR */;
        context.getClass();
    }

    public /* synthetic */ SpeedGaugeView(Context context, AttributeSet attributeSet, int i10, int i11, p003kotlin.jvm.internal.m mVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}