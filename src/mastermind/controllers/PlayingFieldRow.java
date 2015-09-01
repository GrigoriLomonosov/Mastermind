package mastermind.controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.HBox;
import mastermind.Model;

/**
 *
 * @author Jeroen De Meyer
 */
public class PlayingFieldRow {

    private final int rowNumber;
    public int getRowNumber(){
        return rowNumber;
    }
    
    private final int numberOfButtons;
    
    private final Model model;
    
    private final int[] tempAttempt;
    
    public PlayingFieldRow(int rowNumber, int numberOfButtons, Model model){
        this.numberOfButtons = numberOfButtons;
        this.rowNumber = rowNumber;
        this.model = model;
        tempAttempt = new int[numberOfButtons];
    }
    
    public HBox create(){
        HBox hb = new HBox();
        hb.setPrefHeight(40);
        hb.setPrefWidth(200);
        for(int i=0; i<numberOfButtons; i++){
            RowButton btn = new RowButton(i);
            btn.setOnAction(new RowButtonHandler(i));
            hb.getChildren().add(btn);//.setOnAction(handler);
        }
        return hb;
    }
    
    public class RowButtonHandler implements EventHandler<ActionEvent>{
        
        private final int rowBtnNumber;
        
        public RowButtonHandler(int rowBtnNumber){
            this.rowBtnNumber = rowBtnNumber;
        }
        @Override
        public void handle(ActionEvent event){
            tempAttempt[rowBtnNumber] = (tempAttempt[rowBtnNumber]+1)%model.getNumberPossibilities();
        }
    }
    
    
}
