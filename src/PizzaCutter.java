import java.util.ArrayList;
import java.util.List;

public class PizzaCutter {

    public void solve() {
        Input input = readInput("");

        int maxGroups = input.calculateMaxGroups();

        int size = input.H;
        int groups = maxGroups;
        int maxPoints = 0;
        Result maxResult = null;
        while (size >= 2 * input.L) {
            Result result = process(input, input.L, size);
            if (result.getPoints() > maxPoints) {
                maxResult = result;
            }
            size -= 2;
        }


        writeOutput(maxResult.groups);
    }

    public Result process(Input input, int L, int size) {
        Result result = new Result();
        Cell[][] cells = input.cells;

        Type leastRepresentedType = input.getLeastRepresentedType();

        for(int i = 0; i < cells.length; i++ ) {
            for (int j = 0; j < cells[i].length; j++) {
                if(cells[i][j].isGrouped) {
                    continue;
                }

                List<Cell> closestLeastReprGroup = new ArrayList<>();
                while(cells[i][j].is(leastRepresentedType) && closestLeastReprGroup.size() < L) {
                    Cell closest = getClosestOfType(cells, i, j, leastRepresentedType);
                    closestLeastReprGroup.add(closest);
                }

            }
        }
        return null;
    }

    private Cell getClosestOfType(Cell[][] cells, int i, int j, Type type) {
        return null;
    }


    public Input readInput(String filePath) {
        return null;
    }

    public void writeOutput(List<Rectangle> groups) {

    }
}
