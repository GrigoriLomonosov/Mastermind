package mastermind;

import java.util.HashMap;
import java.util.Map;
import javafx.scene.paint.Color;

/**
 *
 * @author Jeroen De Meyer
 */
public class ColorSelector {

    private final Map<Integer, Color> colors;
    
    public ColorSelector(){
        colors = new HashMap<>();
        colors.put(0, Color.BLUE);
        colors.put(1, Color.GREEN);
        colors.put(2, Color.YELLOW);
        colors.put(3, Color.RED);
        colors.put(4, Color.ORANGE);
        colors.put(5, Color.BROWN);
        colors.put(6, Color.PURPLE);
        colors.put(7, Color.PINK);
        colors.put(8, Color.CORNSILK);
        colors.put(9, Color.VIOLET);
        colors.put(10, Color.PLUM);
    }
    
    public Color getColor(int i){
        System.out.println("ColorSelector: " + colors.get(i));
        return colors.get(i);
    }
}
