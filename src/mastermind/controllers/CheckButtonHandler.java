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
            System.out.println("gecheckt");
            model.makeAttempt(tempAttempt.toArray(new int[model.getCodeLength()]));
            model.step();
            System.out.println(model.getCode()[0]+" "+model.getCode()[1]+" "+model.getCode()[2]+" "+model.getCode()[3]+" ");
            System.out.println(model.getLatestAttempt()[0]+" "+model.getLatestAttempt()[1]+" "+model.getLatestAttempt()[2]+" "+model.getLatestAttempt()[3]);
            System.out.println("computerWins: " + model.getComputerWins());
            System.out.println("playerWins: " + model.getPlayerWins());
    }

}
