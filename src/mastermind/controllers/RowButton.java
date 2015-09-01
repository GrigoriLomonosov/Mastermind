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
    
    private final Model model;
    public Model getModel(){
        return model;
    }
    
    private final ObservableIntegerArray tempAttempt;
    public ObservableIntegerArray getTempAttempt(){
        return tempAttempt;
    }
    
    private final int rowNumber;
    public int getRowNumber(){
        return rowNumber;
    }
    
    public RowButton(Model model, ObservableIntegerArray tempAttempt, int rowNumber){
        this.model = model;
        this.tempAttempt = tempAttempt;
        this.rowNumber = rowNumber;
        setDisable(rowNumber!=0);
    }
    
    @Override
    public void invalidated(Observable o){
        setDisable(model.getStep()!=getRowNumber() ||
                    model.getComputerWins() || 
                    model.getPlayerWins());
    }
}
