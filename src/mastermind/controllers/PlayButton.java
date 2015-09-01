package mastermind.controllers;

import javafx.beans.Observable;
import javafx.collections.ObservableIntegerArray;
import mastermind.Model;

/**
 *
 * @author Jeroen De Meyer
 */
public class PlayButton extends RowButton{

    private final int place;
    
    public PlayButton(Model model, ObservableIntegerArray tempAttempt, int place, int rowNumber){
        super(model, tempAttempt, rowNumber);
        this.place = place;
        setOnAction(new RowButtonHandler(model, tempAttempt,place));
        setText(Integer.toString(tempAttempt.get(place)));
        
    }
    
    @Override
    public void invalidated(Observable o){
        super.invalidated(o);
        setText(Integer.toString(getTempAttempt().get(place)));
    }
}
