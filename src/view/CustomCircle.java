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
    
    private final int rowNumber;
    
    public CustomCircle(int circleNumber, Model model, int rowNumber){
        this.circleNumber = circleNumber;
        this.model = model;
        this.rowNumber = rowNumber;
        setFill(Color.TRANSPARENT);
        setRadius(10);
    }
    
    @Override
    public void invalidated(Observable o){
        System.out.println("circle invalidated");
        if(rowNumber<model.getStep()){
            setStroke(Color.BLACK);            
        }
        setFill(model.getCircleColor(rowNumber, circleNumber));
    }
}
