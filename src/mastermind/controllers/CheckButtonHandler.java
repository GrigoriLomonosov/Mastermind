package mastermind.controllers;

import javafx.collections.ObservableIntegerArray;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import mastermind.Model;

/**
 *
 * @author Jeroen De Meyer
 */
public class CheckButtonHandler implements EventHandler<ActionEvent>{
    
    private final Model model;
    
    private final ObservableIntegerArray tempAttempt;
    
    public CheckButtonHandler(Model model, ObservableIntegerArray tempAttempt){
        this.model = model;
        this.tempAttempt = tempAttempt;
    }
    
    @Override
    public void handle(ActionEvent event){
            model.makeAttempt(tempAttempt.toArray(new int[model.getCodeLength()]));
            model.step();
    }

}
