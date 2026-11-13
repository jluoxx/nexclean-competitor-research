package com.neeeex.virus;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.m0;
import p003kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f66670a = new e();

    public static void b(Activity activity, Dialog dialog, DialogInterface dialogInterface) {
        int i10 = (int) (20 * activity.getResources().getDisplayMetrics().density);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(activity.getResources().getDisplayMetrics().widthPixels - (i10 * 2), -2);
        }
    }

    public static void c(Dialog dialog, View view) {
        dialog.dismiss();
    }

    public static final void e(Dialog dialog, Function0 function0, View view) {
        dialog.dismiss();
        function0.invoke();
    }

    public final Dialog d(final Activity activity, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, final Function0 function0) {
        m0.a("gMX7dQKBdHM=\n", "4aaPHHToAAo=\n");
        activity.getClass();
        m0.a("gSqHEKM=\n", "9UPzfMZSfeM=\n");
        charSequence.getClass();
        m0.a("BC5ITfjUfg==\n", "aUs7PpmzG7Y=\n");
        charSequence2.getClass();
        m0.a("NnJwUK6xcxAwZWo=\n", "VR0eNsfDHkQ=\n");
        charSequence3.getClass();
        m0.a("Y8K5NWxrxLBh\n", "DKz6WgINrcI=\n");
        function0.getClass();
        final Dialog dialog = new Dialog(activity);
        dialog.setContentView(R$layout.virus_neeeex_dialog_confirmation);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(2);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.55f;
            window.setAttributes(attributes);
        }
        ((TextView) dialog.findViewById(R$id.virus_neeeex_confirmation_title)).setText(charSequence);
        ((TextView) dialog.findViewById(R$id.virus_neeeex_confirmation_message)).setText(charSequence2);
        TextView textView = (TextView) dialog.findViewById(R$id.virus_neeeex_confirmation_action);
        textView.setText(charSequence3);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.virus.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.e(dialog, function0, view);
            }
        });
        ((TextView) dialog.findViewById(R$id.virus_neeeex_confirmation_cancel)).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.virus.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.c(dialog, view);
            }
        });
        dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neeeex.virus.d
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                e.b(activity, dialog, dialogInterface);
            }
        });
        dialog.show();
        return dialog;
    }
}