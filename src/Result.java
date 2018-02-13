import java.util.ArrayList;
import java.util.List;


/**
 * Created by vkravets on 13.02.2018.
 */
public class Result {

    public List<Rectangle> groups = new ArrayList<>();

    public int getPoints() {
        int points = 0;
        for(Rectangle g: this.groups) {
            points += (g.rightBottom.x - g.leftTop.x) * (g.leftTop.y - g.rightBottom.y);
        }
        return points;
    }
}
