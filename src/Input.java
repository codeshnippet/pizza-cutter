/**
 * Created by vkravets on 13.02.2018.
 */
public class Input {
    public Cell[][] cells;
    public int L;
    public int H;

    public int calculateMaxGroups() {
        Cell[][] field = this.cells;
        int min = getLeastRepresentedGroupSize(field);
        return  min / L;
    }

    public Type getLeastRepresentedType() {
        int tomatoCount = getTomatoCount();
        int cells = this.cells.length * this.cells[0].length;
        return tomatoCount <= cells / 2 ? Type.TOMATO : Type.MUSHROOM;
    }

    private int getLeastRepresentedGroupSize(Cell[][] field) {
        int tomatoCount = getTomatoCount();
        int cells = field.length * field[0].length;
        return Math.min(tomatoCount, cells / 2);
    }

    private int getTomatoCount() {
        int tomatoCount = 0;
        for(int i = 0; i < cells.length; i++ ) {
            for (int j = 0; j < cells[i].length; j++) {
                if(cells[i][j].is(Type.TOMATO)) {
                    tomatoCount++;
                }
            }
        }
        return tomatoCount;
    }
}
