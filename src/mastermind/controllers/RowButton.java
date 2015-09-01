package mastermind.controllers;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.ObservableIntegerArray;
import javafx.scene.control.Button;
import mastermind.Model;

/**
 *
 * @author Jeroen De Meyer
 */
public class RowButton extends Button implements InvalidationListener{
    
    private final int place;
    
    private final Model model;
    
    private final ObservableIntegerArray tempAttempt;
    
    private final int rowNumber;
    
    public RowButton(Model model, ObservableIntegerArray tempAttempt, int place, int rowNumber){
        this.model = model;
        this.tempAttempt = tempAttempt;
        this.place = place;
        this.rowNumber = rowNumber;
    }
    
    @Override
    public void invalidated(Observable o){
        setDisable(model.getStep()!=rowNumber ||
                                model.getComputerWins() || 
                                model.getPlayerWins());
        setText(Integer.toString(tempAttempt.get(place)));
    }
}
