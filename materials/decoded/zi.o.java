package zi;

import com.neeeex.eraser.m0;
import java.util.List;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f104411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f104412b;

    public o(p pVar, List list) {
        "highlighted" /* decoded XOR */;
        pVar.getClass();
        "ordered" /* decoded XOR */;
        list.getClass();
        this.f104411a = pVar;
        this.f104412b = list;
    }

    public final p a() {
        return this.f104411a;
    }

    public final List b() {
        return this.f104412b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f104411a == oVar.f104411a && v.c(this.f104412b, oVar.f104412b);
    }

    public int hashCode() {
        return (this.f104411a.hashCode() * 31) + this.f104412b.hashCode();
    }

    public String toString() {
        return "RecommendationPlan(highlighted=" + this.f104411a + ", ordered=" + this.f104412b + ")";
    }
}