package mastermind.controllers;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableIntegerArray;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
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
    
    private final ObservableIntegerArray tempAttempt;
    
    private final Button[] buttons;
    
    private final Circle[] circles;
    
    public PlayingFieldRow(int rowNumber, int numberOfButtons, Model model){
        this.numberOfButtons = numberOfButtons;
        this.rowNumber = rowNumber;
        this.model = model;
        buttons = new Button[numberOfButtons];
        circles = new Circle[numberOfButtons];
        tempAttempt = FXCollections.observableIntegerArray(new int[numberOfButtons]);
        tempAttempt.addListener(new InvalidationListener(){
            @Override
            public void invalidated(Observable o){
                for(int i=0; i<buttons.length; i++){
                    buttons[i].setText(Integer.toString(tempAttempt.get(i)));
                }
            }
        });
    }
    
    public HBox create(){
        HBox hb = new HBox();
        hb.setPrefHeight(40);
        hb.setPrefWidth(200);
        //Adding the buttons
        for(int i=0; i<numberOfButtons; i++){
            RowButton btn = new RowButton(i);
            btn.setOnAction(new RowButtonHandler(i));
            //btn.setDisable(true);
            InvalidationListener listener = (Observable o) -> {
                System.out.println("step: " + model.getStep());
                btn.setDisable(model.getStep()!=rowNumber ||
                                model.getComputerWins() || 
                                model.getPlayerWins());
            };
            buttons[i] = btn;
            model.addListener(listener);
            hb.getChildren().add(btn);
        }
        //Adding the checkButton
        Button checkBtn = new Button();
        checkBtn.setOnAction(new CheckButtonHandler());
        //checkBtn.setDisable(true);
        InvalidationListener listener = (Observable o) -> {
            checkBtn.setDisable(model.getStep()!=rowNumber ||
                                model.getComputerWins() || 
                                model.getPlayerWins());
        };
        model.addListener(listener);
        hb.getChildren().add(checkBtn);
        //Adding the circles
        for(int i=0; i<numberOfButtons; i++){
            CustomCircle cc = new CustomCircle(i, model, rowNumber);
            cc.setFill(Color.TRANSPARENT);
            cc.setStroke(Color.BLACK);
            cc.setRadius(10);
            circles[i] = cc;
            model.addListener(cc);
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
            //(tempAttempt.get(rowBtnNumber)+1)%model.getNumberPossibilities()
            tempAttempt.set(rowBtnNumber, (tempAttempt.get(rowBtnNumber)+1)%model.getNumberPossibilities());            
            //System.out.println(tempAttempt.get(rowBtnNumber));
        }
    }
    
    public class CheckButtonHandler implements EventHandler<ActionEvent>{
        
        @Override
        public void handle(ActionEvent event){
            System.out.println("gecheckt");
            model.makeAttempt(tempAttempt.toArray(new int[numberOfButtons]));
            model.step();
            System.out.println(model.getCode()[0]+" "+model.getCode()[1]+" "+model.getCode()[2]+" "+model.getCode()[3]+" ");
            System.out.println(model.getLatestAttempt()[0]+" "+model.getLatestAttempt()[1]+" "+model.getLatestAttempt()[2]+" "+model.getLatestAttempt()[3]);
            System.out.println("computerWins: " + model.getComputerWins());
            System.out.println("playerWins: " + model.getPlayerWins());
        }
    }
    
    
}
