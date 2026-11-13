package com.neeeex.eraser.launcher;

import com.android.launcher3.AutoInstallsLayout;
import com.thinkup.core.q.m0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/neeeex/eraser/launcher/WorkspaceToolPlacementPolicy;", "", "<init>", "()V", "findPlacement", "Lcom/neeeex/eraser/launcher/WorkspaceToolPlacementPolicy$Placement;", "occupied", "", "", "clean", "Lcom/neeeex/eraser/launcher/WorkspaceToolPlacementPolicy$Cell;", "tool", "mirrorCells", "", "([[ZLcom/neeeex/eraser/launcher/WorkspaceToolPlacementPolicy$Cell;Lcom/neeeex/eraser/launcher/WorkspaceToolPlacementPolicy$Cell;Z)Lcom/neeeex/eraser/launcher/WorkspaceToolPlacementPolicy$Placement;", "Cell", m0.f73927d, "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkspaceToolPlacementPolicy {
    public static final WorkspaceToolPlacementPolicy INSTANCE = new WorkspaceToolPlacementPolicy();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/neeeex/eraser/launcher/WorkspaceToolPlacementPolicy$Cell;", "", AutoInstallsLayout.ATTR_X, "", AutoInstallsLayout.ATTR_Y, "<init>", "(II)V", "getX", "()I", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cell {
        private final int x;
        private final int y;

        public Cell(int i10, int i11) {
            this.x = i10;
            this.y = i11;
        }

        public static /* synthetic */ Cell copy$default(Cell cell, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = cell.x;
            }
            if ((i12 & 2) != 0) {
                i11 = cell.y;
            }
            return cell.copy(i10, i11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getY() {
            return this.y;
        }

        public final Cell copy(int x10, int y10) {
            return new Cell(x10, y10);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cell)) {
                return false;
            }
            Cell cell = (Cell) other;
            return this.x == cell.x && this.y == cell.y;
        }

        public final int getX() {
            return this.x;
        }

        public final int getY() {
            return this.y;
        }

        public int hashCode() {
            return (Integer.hashCode(this.x) * 31) + Integer.hashCode(this.y);
        }

        public String toString() {
            return "Cell(x=" + this.x + ", y=" + this.y + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/neeeex/eraser/launcher/WorkspaceToolPlacementPolicy$Placement;", "", "tool", "Lcom/neeeex/eraser/launcher/WorkspaceToolPlacementPolicy$Cell;", "clean", "<init>", "(Lcom/neeeex/eraser/launcher/WorkspaceToolPlacementPolicy$Cell;Lcom/neeeex/eraser/launcher/WorkspaceToolPlacementPolicy$Cell;)V", "getTool", "()Lcom/neeeex/eraser/launcher/WorkspaceToolPlacementPolicy$Cell;", "getClean", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Placement {
        private final Cell clean;
        private final Cell tool;

        public Placement(Cell cell, Cell cell2) {
            com.neeeex.eraser.m0.a("YcCPng==\n", "Fa/g8g+VKPk=\n");
            cell.getClass();
            com.neeeex.eraser.m0.a("Ik6eIZw=\n", "QSL7QPLQ9ZQ=\n");
            cell2.getClass();
            this.tool = cell;
            this.clean = cell2;
        }

        public static /* synthetic */ Placement copy$default(Placement placement, Cell cell, Cell cell2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cell = placement.tool;
            }
            if ((i10 & 2) != 0) {
                cell2 = placement.clean;
            }
            return placement.copy(cell, cell2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Cell getTool() {
            return this.tool;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Cell getClean() {
            return this.clean;
        }

        public final Placement copy(Cell tool, Cell clean) {
            com.neeeex.eraser.m0.a("7x/f5g==\n", "m3Cwilx5hJ8=\n");
            tool.getClass();
            com.neeeex.eraser.m0.a("WzhPUao=\n", "OFQqMMRB1Qs=\n");
            clean.getClass();
            return new Placement(tool, clean);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Placement)) {
                return false;
            }
            Placement placement = (Placement) other;
            return p003kotlin.jvm.internal.v.c(this.tool, placement.tool) && p003kotlin.jvm.internal.v.c(this.clean, placement.clean);
        }

        public final Cell getClean() {
            return this.clean;
        }

        public final Cell getTool() {
            return this.tool;
        }

        public int hashCode() {
            return (this.tool.hashCode() * 31) + this.clean.hashCode();
        }

        public String toString() {
            return "Placement(tool=" + this.tool + ", clean=" + this.clean + ")";
        }
    }

    private WorkspaceToolPlacementPolicy() {
    }

    private static final Placement findPlacement$beside(int i10, int i11, int i12, boolean[][] zArr, Cell cell) {
        Cell cell2 = new Cell(cell.getX() + i10, cell.getY());
        if (findPlacement$vacant(i11, i12, zArr, cell) && findPlacement$vacant(i11, i12, zArr, cell2)) {
            return new Placement(cell2, cell);
        }
        return null;
    }

    public static /* synthetic */ Placement findPlacement$default(WorkspaceToolPlacementPolicy workspaceToolPlacementPolicy, boolean[][] zArr, Cell cell, Cell cell2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return workspaceToolPlacementPolicy.findPlacement(zArr, cell, cell2, z10);
    }

    private static final boolean findPlacement$vacant(int i10, int i11, boolean[][] zArr, Cell cell) {
        int y10;
        int x10 = cell.getX();
        return x10 >= 0 && x10 < i10 && (y10 = cell.getY()) >= 0 && y10 < i11 && !zArr[cell.getX()][cell.getY()];
    }

    public final Placement findPlacement(boolean[][] occupied, Cell clean, Cell tool, boolean mirrorCells) {
        Placement placementFindPlacement$beside;
        Placement placementFindPlacement$beside2;
        com.neeeex.eraser.m0.a("HlFc4yWlSio=\n", "cTI/llXML04=\n");
        occupied.getClass();
        int length = occupied.length;
        boolean[] zArr = (boolean[]) gl.s.r0(occupied);
        if (zArr != null) {
            int length2 = zArr.length;
            if (length >= 2 && length2 != 0) {
                for (boolean[] zArr2 : occupied) {
                    if (zArr2.length == length2) {
                    }
                }
                int i10 = mirrorCells ? 1 : -1;
                if (clean != null && (placementFindPlacement$beside2 = findPlacement$beside(i10, length, length2, occupied, clean)) != null) {
                    return placementFindPlacement$beside2;
                }
                if (tool != null && (placementFindPlacement$beside = findPlacement$beside(i10, length, length2, occupied, new Cell(tool.getX() - i10, tool.getY()))) != null) {
                    return placementFindPlacement$beside;
                }
                for (int i11 = length2 - 1; -1 < i11; i11--) {
                    for (int i12 = 0; i12 < length; i12++) {
                        Placement placementFindPlacement$beside3 = findPlacement$beside(i10, length, length2, occupied, new Cell(i12, i11));
                        if (placementFindPlacement$beside3 != null) {
                            return placementFindPlacement$beside3;
                        }
                    }
                }
            }
        }
        return null;
    }
}