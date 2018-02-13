
public class Cell {

    public Cell(int x, int y, Type type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public boolean isGrouped = false;
    public final Type type;
    public final int x;
    public final int y;

    public boolean is(Type type) {
        return this.type.is(type);
    }

    public void markGrouped() {
        this.isGrouped = true;
    }
}