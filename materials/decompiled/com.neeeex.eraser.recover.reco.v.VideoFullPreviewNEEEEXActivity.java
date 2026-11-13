package com.neeeex.eraser.recover.reco.v;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;
import androidx.p002lifecycle.LifecycleOwnerKt;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.base.RootActivity;
import kotlinx.coroutines.Job;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0003-\u0019.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0003R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/neeeex/eraser/recover/reco/v/VideoFullPreviewNEEEEXActivity;", "Lcom/neeeex/eraser/base/RootActivity;", "<init>", "()V", "Lfl/m0;", "onDestroy", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onPostCreate", "n0", "q0", "Landroid/media/MediaPlayer;", "player", "o0", "(Landroid/media/MediaPlayer;)V", "u0", "t0", "Lcom/neeeex/eraser/recover/reco/v/VideoFullPreviewNEEEEXActivity$c;", "command", "p0", "(Lcom/neeeex/eraser/recover/reco/v/VideoFullPreviewNEEEEXActivity$c;)V", "v0", "s0", "c", "Landroid/media/MediaPlayer;", "audioPlayer", "", "d", "Z", "soundMuted", "Lcom/neeeex/eraser/recover/reco/v/VideoFullPreviewNEEEEXActivity$b;", "e", "Lcom/neeeex/eraser/recover/reco/v/VideoFullPreviewNEEEEXActivity$b;", "playback", "Lkotlinx/coroutines/Job;", "f", "Lkotlinx/coroutines/Job;", "progressTracker", "Lji/b0;", "g", "Lji/b0;", "binding", "h", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoFullPreviewNEEEEXActivity extends RootActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public MediaPlayer audioPlayer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean soundMuted = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public b playback = b.PLAYING;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Job progressTracker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public ji.b0 binding;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f65913i = com.neeeex.eraser.m0.a("nZKZJG8OLwOcg4wJfjA2Dg==\n", "+OrtVg5RQmY=\n");

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public enum b {
        PLAYING,
        PAUSED,
        COMPLETED;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f65920b = ml.b.a(d());

        public static ml.a getEntries() {
            return f65920b;
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f65921a = new a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -631419614;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("3KRTzo0RHav7\n", "n8s+vuF0ac4=\n");
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f65922a = new b();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 617593112;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("X4o/lZNfypZqnDqTnFE=\n", "C+VY8v86mvo=\n");
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.v.VideoFullPreviewNEEEEXActivity$c$c, reason: collision with other inner class name */
        public static final class C0798c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0798c f65923a = new C0798c();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0798c);
            }

            public int hashCode() {
                return 2031947570;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("4YRzOUA01NXAhXA=\n", "tesUXixRh7o=\n");
            }
        }
    }

    public static final class d extends ll.m implements tl.n {
        int label;

        public d(kl.f<? super d> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return VideoFullPreviewNEEEEXActivity.this.new d(fVar);
        }

        @Override // tl.n
        public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((d) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0029 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:12:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // ll.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p003kotlin.coroutines.intrinsics.c.f()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto Lf
                fl.v.b(r6)
                goto L2a
            Lf:
                java.lang.String r6 = "Yl9/DpLZWfYmTHYRx8BT8SFcdgTd31P2Jld9FN3GU/EhSXoW2o1VuXNRZhbbw1M=\n"
                java.lang.String r0 = "AT4TYrKtNtY=\n"
                java.lang.String r6 = com.neeeex.eraser.m0.a(r6, r0)
                gq.v0.a(r6)
                r6 = 0
                return r6
            L1c:
                fl.v.b(r6)
            L1f:
                r5.label = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = kotlinx.coroutines.z0.b(r3, r5)
                if (r6 != r0) goto L2a
                return r0
            L2a:
                com.neeeex.eraser.recover.reco.v.VideoFullPreviewNEEEEXActivity r6 = com.neeeex.eraser.recover.reco.v.VideoFullPreviewNEEEEXActivity.this
                com.neeeex.eraser.recover.reco.v.VideoFullPreviewNEEEEXActivity.m0(r6)
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.neeeex.eraser.recover.reco.v.VideoFullPreviewNEEEEXActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static void j0(VideoFullPreviewNEEEEXActivity videoFullPreviewNEEEEXActivity, View view) {
        videoFullPreviewNEEEEXActivity.p0(c.b.f65922a);
    }

    public static void k0(VideoFullPreviewNEEEEXActivity videoFullPreviewNEEEEXActivity, View view) {
        videoFullPreviewNEEEEXActivity.p0(c.C0798c.f65923a);
    }

    public static void l0(VideoFullPreviewNEEEEXActivity videoFullPreviewNEEEEXActivity, View view) {
        videoFullPreviewNEEEEXActivity.onBackPressed();
    }

    public static final void r0(VideoFullPreviewNEEEEXActivity videoFullPreviewNEEEEXActivity, MediaPlayer mediaPlayer) {
        videoFullPreviewNEEEEXActivity.p0(c.a.f65921a);
    }

    public final void n0() {
        ji.b0 b0Var = this.binding;
        ji.b0 b0Var2 = null;
        if (b0Var == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("CitTslFyCQ==\n", "aEI91jgcbu0=\n"));
            b0Var = null;
        }
        b0Var.f85334b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoFullPreviewNEEEEXActivity.l0(this.f65986a, view);
            }
        });
        ji.b0 b0Var3 = this.binding;
        if (b0Var3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("8jeoZUkzgA==\n", "kF7GASBd520=\n"));
            b0Var3 = null;
        }
        b0Var3.f85336d.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoFullPreviewNEEEEXActivity.j0(this.f65989a, view);
            }
        });
        ji.b0 b0Var4 = this.binding;
        if (b0Var4 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("rS8Ym200iw==\n", "z0Z2/wRa7GU=\n"));
        } else {
            b0Var2 = b0Var4;
        }
        b0Var2.f85335c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoFullPreviewNEEEEXActivity.k0(this.f66007a, view);
            }
        });
    }

    public final void o0(MediaPlayer player) {
        if (this.audioPlayer != null) {
            return;
        }
        this.audioPlayer = player;
        player.setVolume(0.0f, 0.0f);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.b0 b0VarC = ji.b0.c(getLayoutInflater());
        com.neeeex.eraser.m0.a("LuLwnseJHw5porjb\n", "R4yW8qb9eiY=\n");
        b0VarC.getClass();
        this.binding = b0VarC;
        if (b0VarC == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("20d6nX4+VA==\n", "uS4U+RdQMww=\n"));
            b0VarC = null;
        }
        setContentView(b0VarC.getRoot());
        n0();
        q0();
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        s0();
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        ti.a.a(this, false);
    }

    public final void p0(c command) {
        b bVar;
        ji.b0 b0Var = null;
        if (p003kotlin.jvm.internal.v.c(command, c.a.f65921a)) {
            this.playback = b.COMPLETED;
            ji.b0 b0Var2 = this.binding;
            if (b0Var2 == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("DMXbFZ+Eog==\n", "bqy1cfbqxdE=\n"));
            } else {
                b0Var = b0Var2;
            }
            b0Var.f85336d.setImageResource(R$drawable.ic_neeeex_player_play);
            return;
        }
        if (p003kotlin.jvm.internal.v.c(command, c.C0798c.f65923a)) {
            v0();
            return;
        }
        if (!p003kotlin.jvm.internal.v.c(command, c.b.f65922a)) {
            coil.util.j.a();
            return;
        }
        ji.b0 b0Var3 = this.binding;
        if (b0Var3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("etRPdm1HeQ==\n", "GL0hEgQpHt8=\n"));
            b0Var3 = null;
        }
        VideoView videoView = b0Var3.f85339g;
        if (videoView.isPlaying()) {
            videoView.pause();
            bVar = b.PAUSED;
        } else {
            videoView.start();
            bVar = b.PLAYING;
        }
        this.playback = bVar;
        int i10 = bVar == b.PLAYING ? R$drawable.ic_neeeex_player_pause : R$drawable.ic_neeeex_player_play;
        ji.b0 b0Var4 = this.binding;
        if (b0Var4 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("4K4ePXZAew==\n", "gsdwWR8uHDQ=\n"));
        } else {
            b0Var = b0Var4;
        }
        b0Var.f85336d.setImageResource(i10);
    }

    public final void q0() {
        String stringExtra = getIntent().getStringExtra(f65913i);
        ji.b0 b0Var = null;
        if (stringExtra == null || p003kotlin.text.k0.r0(stringExtra)) {
            stringExtra = null;
        }
        if (stringExtra == null) {
            finish();
            return;
        }
        ji.b0 b0Var2 = this.binding;
        if (b0Var2 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("Kgvuo4ic+A==\n", "SGKAx+Hyn5A=\n"));
            b0Var2 = null;
        }
        b0Var2.f85337e.setEnabled(false);
        ji.b0 b0Var3 = this.binding;
        if (b0Var3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("RvH3/G89HA==\n", "JJiZmAZTe/w=\n"));
        } else {
            b0Var = b0Var3;
        }
        VideoView videoView = b0Var.f85339g;
        videoView.setVideoPath(stringExtra);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.neeeex.eraser.recover.reco.v.f0
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                VideoFullPreviewNEEEEXActivity.r0(this.f66010a, mediaPlayer);
            }
        });
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.neeeex.eraser.recover.reco.v.g0
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                this.f66031a.o0(mediaPlayer);
            }
        });
        videoView.start();
        u0();
    }

    public final void s0() {
        ji.b0 b0Var = this.binding;
        if (b0Var == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("Du6BMkzwVQ==\n", "bIfvViWeMj4=\n"));
            b0Var = null;
        }
        b0Var.f85339g.stopPlayback();
        Job job = this.progressTracker;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.progressTracker = null;
        this.audioPlayer = null;
    }

    public final void t0() {
        ji.b0 b0Var = this.binding;
        ji.b0 b0Var2 = null;
        if (b0Var == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("zJyzZqbhcg==\n", "rvXdAs+PFZc=\n"));
            b0Var = null;
        }
        long currentPosition = b0Var.f85339g.getCurrentPosition();
        ji.b0 b0Var3 = this.binding;
        if (b0Var3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("7oMpt57OEw==\n", "jOpH0/egdHI=\n"));
            b0Var3 = null;
        }
        long duration = b0Var3.f85339g.getDuration();
        com.neeeex.eraser.utils.c cVar = com.neeeex.eraser.utils.c.f66140a;
        String strB = cVar.b(currentPosition);
        String strB2 = cVar.b(duration);
        ji.b0 b0Var4 = this.binding;
        if (b0Var4 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("J1lJ2Ffdvg==\n", "RTAnvD6z2ak=\n"));
            b0Var4 = null;
        }
        b0Var4.f85338f.setText(strB + " / " + strB2);
        if (duration > 0) {
            ji.b0 b0Var5 = this.binding;
            if (b0Var5 == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("pMc6+JiCYg==\n", "xq5UnPHsBV0=\n"));
            } else {
                b0Var2 = b0Var5;
            }
            b0Var2.f85337e.setProgress((int) ((currentPosition * ((long) 100)) / duration));
        }
    }

    public final void u0() {
        Job job = this.progressTracker;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.progressTracker = kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(null), 3, null);
    }

    public final void v0() {
        MediaPlayer mediaPlayer = this.audioPlayer;
        if (mediaPlayer == null) {
            return;
        }
        try {
            boolean z10 = this.soundMuted;
            boolean z11 = !z10;
            float f10 = !z10 ? 0.0f : 1.0f;
            mediaPlayer.setVolume(f10, f10);
            this.soundMuted = z11;
            int i10 = !z10 ? R$drawable.ic_neeeex_player_mute : R$drawable.ic_neeeex_player_unmute;
            ji.b0 b0Var = this.binding;
            if (b0Var == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("0E90t6NgZQ==\n", "siYa08oOApM=\n"));
                b0Var = null;
            }
            b0Var.f85335c.setImageResource(i10);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.v.VideoFullPreviewNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context, String str) {
            com.neeeex.eraser.m0.a("4qlHCjvBwQ==\n", "gcYpfl65tXg=\n");
            context.getClass();
            com.neeeex.eraser.m0.a("molp8Q==\n", "6ugdmVtg0Eg=\n");
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) VideoFullPreviewNEEEEXActivity.class);
            intent.putExtra(com.neeeex.eraser.m0.a("GCrycmI+MQYZO+dfcwAoCw==\n", "fVKGAANhXGM=\n"), str);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }
}