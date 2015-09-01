package mastermind.controllers;

import javafx.beans.Observable;
import javafx.collections.ObservableIntegerArray;
import mastermind.ColorSelector;
import mastermind.Model;

/**
 *
 * @author Jeroen De Meyer
 */
public class CheckButton extends RowButton{
    
    public CheckButton(Model model, ObservableIntegerArray tempAttempt, int rowNumber){
        super(model, tempAttempt, rowNumber);
        setOnAction(new CheckButtonHandler(model, tempAttempt));
    }
    
    @Override
    public void invalidated(Observable o){
        super.invalidated(o);
    }

}
