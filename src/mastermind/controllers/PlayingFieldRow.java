package mastermind.controllers;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import mastermind.Model;
import view.CustomCircle;

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
            InvalidationListener listener = (Observable o) -> {
                btn.setDisable(model.getComputerWins() || model.getPlayerWins());
            };
            model.addListener(listener);
            hb.getChildren().add(btn);
        }
        Button checkBtn = new Button();
        checkBtn.setOnAction(new CheckButtonHandler());
        InvalidationListener listener = (Observable o) -> {
            checkBtn.setDisable(model.getComputerWins() || model.getPlayerWins());
        };
        model.addListener(listener);
            /**checkBtn.setOnAction((ActionEvent event) -> {
                System.out.println("gecheckt");
                model.makeAttempt(tempAttempt);
                model.step();
                System.out.println(model.getCode()[0]+" "+model.getCode()[1]+" "+model.getCode()[2]+" "+model.getCode()[3]+" ");
                System.out.println(model.getLatestAttempt()[0]+" "+model.getLatestAttempt()[1]+" "+model.getLatestAttempt()[2]+" "+model.getLatestAttempt()[3]);
                
            });**/
        hb.getChildren().add(checkBtn);
        
        for(int i=0; i<numberOfButtons; i++){
            CustomCircle cc = new CustomCircle(i, model, rowNumber);
            System.out.println(cc);
            cc.setStroke(Color.BLACK);
            cc.setRadius(10);
            hb.getChildren().add(cc);
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
            System.out.println(model.getStep());
        }
    }
    
    public class CheckButtonHandler implements EventHandler<ActionEvent>{
        
        @Override
        public void handle(ActionEvent event){
            System.out.println("gecheckt");
            model.makeAttempt(tempAttempt);
            model.step();
            System.out.println(model.getCode()[0]+" "+model.getCode()[1]+" "+model.getCode()[2]+" "+model.getCode()[3]+" ");
            System.out.println(model.getLatestAttempt()[0]+" "+model.getLatestAttempt()[1]+" "+model.getLatestAttempt()[2]+" "+model.getLatestAttempt()[3]);
            System.out.println("computerWins: " + model.getComputerWins());
            System.out.println("playerWins: " + model.getPlayerWins());
        }
    }
    
    
}
