package view;

import javafx.scene.shape.Circle;
import mastermind.ColorSelector;

/**
 *
 * @author Jeroen De Meyer
 */
public class SolutionCircle extends Circle{

    private final ColorSelector selector = new ColorSelector();
    
    private final int circleColor;
    
    public SolutionCircle(int circleColor){
        this.circleColor = circleColor;
        setRadius(10);
        setFill(selector.getColor(circleColor));
    }
}
