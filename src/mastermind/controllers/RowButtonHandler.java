package mastermind.controllers;

import javafx.collections.ObservableIntegerArray;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import mastermind.Model;

/**
 *
 * @author Jeroen De Meyer
 */
public class RowButtonHandler implements EventHandler<ActionEvent>{
    
    private final int rowBtnNumber;
    
    private final ObservableIntegerArray tempAttempt;
    
    private final Model model;
        
    public RowButtonHandler(Model model, ObservableIntegerArray tempAttempt, int rowBtnNumber){
        this.model = model;
        this.tempAttempt = tempAttempt;
        this.rowBtnNumber = rowBtnNumber;
    }
    @Override
    public void handle(ActionEvent event){
        //(tempAttempt.get(rowBtnNumber)+1)%model.getNumberPossibilities()
        tempAttempt.set(rowBtnNumber, (tempAttempt.get(rowBtnNumber)+1)%model.getNumberPossibilities());            
        //System.out.println(tempAttempt.get(rowBtnNumber));
    }

}
