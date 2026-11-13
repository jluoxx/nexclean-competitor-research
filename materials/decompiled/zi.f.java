package zi;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.neeeex.eraser.R$color;
import com.neeeex.eraser.m0;
import ji.d1;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f104388a = new f();

    public static void a(Function1 function1, p pVar, View view) {
        function1.invoke(pVar);
    }

    public final View b(ViewGroup viewGroup, final p pVar, boolean z10, final Function1 function1) {
        m0.a("szqIiA5c\n", "w1v67WAoDAM=\n");
        viewGroup.getClass();
        m0.a("Pqb5+lYaTg==\n", "WMOYjiNoK3c=\n");
        pVar.getClass();
        m0.a("Rn/hnVTrmg==\n", "KRGi8T2I8eQ=\n");
        function1.getClass();
        Context context = viewGroup.getContext();
        d1 d1VarC = d1.c(LayoutInflater.from(context), viewGroup, false);
        m0.a("z0+vW0DvFg2ID+ce\n", "piHJNyGbcyU=\n");
        d1VarC.getClass();
        int color = l2.a.getColor(context, R$color.color_neeeex_brand_5);
        int color2 = l2.a.getColor(context, R$color.white);
        ImageView imageView = d1VarC.f85393d;
        imageView.setImageResource(pVar.getIconRes());
        imageView.setScaleX(pVar.getIconScale());
        imageView.setScaleY(pVar.getIconScale());
        d1VarC.f85395f.setText(pVar.getTitleRes());
        d1VarC.f85394e.setText(pVar.getSubtitleRes());
        d1VarC.f85396g.setVisibility(z10 ? 0 : 8);
        d1VarC.getRoot().setCardBackgroundColor(color2);
        d1VarC.getRoot().setStrokeWidth(0);
        d1VarC.getRoot().setCardElevation(ti.c.a(z10 ? 2 : 1));
        MaterialButton materialButton = d1VarC.f85392c;
        materialButton.setBackgroundTintList(ColorStateList.valueOf(z10 ? color : l2.a.getColor(context, R$color.color_neeeex_brand_1)));
        materialButton.setStrokeWidth(0);
        if (z10) {
            color = -1;
        }
        materialButton.setTextColor(color);
        materialButton.setTextSize(16.0f);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: zi.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.a(function1, pVar, view);
            }
        };
        d1VarC.getRoot().setOnClickListener(onClickListener);
        d1VarC.f85392c.setOnClickListener(onClickListener);
        MaterialCardView root = d1VarC.getRoot();
        m0.a("iGmShvjksK3BIsj9\n", "7wzm1JeLxIU=\n");
        root.getClass();
        return root;
    }
}