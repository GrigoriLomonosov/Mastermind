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
        setId("playButton");
        setBackgroundColor();   
    }
    
    @Override
    public void invalidated(Observable o){
        super.invalidated(o);
        setBackgroundColor();
    }
    
    private void setBackgroundColor(){
        setBackground(new Background(new BackgroundFill(selector.getColor(getTempAttempt().get(place)), 
                                                        new CornerRadii(25.0), 
                                                        new Insets(2))));
    }
}
