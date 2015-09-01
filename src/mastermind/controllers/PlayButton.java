package mastermind.controllers;

import javafx.beans.Observable;
import javafx.collections.ObservableIntegerArray;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import mastermind.ColorSelector;
import mastermind.Model;

/**
 *
 * @author Jeroen De Meyer
 */
public class PlayButton extends RowButton{

        
    private final ColorSelector selector = new ColorSelector(); 
    
    private final int place;
    
    public PlayButton(Model model, ObservableIntegerArray tempAttempt, int place, int rowNumber){
        super(model, tempAttempt, rowNumber);
        this.place = place;
        setOnAction(new PlayButtonHandler(model, tempAttempt,place));
        setStyle(
            "-fx-min-width: 30px; " +
            "-fx-min-height: 30px; " +
            "-fx-max-width: 30px; " +
            "-fx-max-height: 30px;");
        setBackgroundColor();
        //setText(Integer.toString(tempAttempt.get(place)));     
    }
    
    @Override
    public void invalidated(Observable o){
        super.invalidated(o);
        //setText(Integer.toString(getTempAttempt().get(place)));
        setBackgroundColor();
    }
    
    private void setBackgroundColor(){
        setBackground(new Background(new BackgroundFill(selector.getColor(getTempAttempt().get(place)), 
                                                        new CornerRadii(25.0), 
                                                        new Insets(2))));
    }
}
