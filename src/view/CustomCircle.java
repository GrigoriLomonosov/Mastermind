package view;

import java.util.HashMap;
import java.util.Map;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import mastermind.Model;

/**
 *
 * @author Jeroen De Meyer
 */
public class CustomCircle extends Circle implements InvalidationListener{
    
    private final int circleNumber;
    
    private final Model model;
    
    public CustomCircle(int circleNumber, Model model){
        this.circleNumber = circleNumber;
        this.model = model;
        model.addListener(this);
    }
    
    @Override
    public void invalidated(Observable o){
        setFill(model.getResultConfiguration()[circleNumber]);
    }
}
