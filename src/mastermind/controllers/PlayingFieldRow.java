package mastermind.controllers;

import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableIntegerArray;
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
    }
    
    public HBox create(){
        HBox hb = new HBox();
        hb.setPrefHeight(40);
        hb.setPrefWidth(200);
        //Adding the buttons
        for(int i=0; i<numberOfButtons; i++){
            RowButton btn = new PlayButton(model, tempAttempt,i, rowNumber);
            //buttons[i] = btn;
            model.addListener(btn);
            tempAttempt.addListener(btn);
            hb.getChildren().add(btn);
        }
        //Adding the checkButton
        RowButton checkBtn = new CheckButton(model, tempAttempt, rowNumber);
        model.addListener(checkBtn);
        hb.getChildren().add(checkBtn);
        //Adding the circles
        for(int i=0; i<numberOfButtons; i++){
            CustomCircle cc = new CustomCircle(i, model, rowNumber);
            //circles[i] = cc;
            model.addListener(cc);
            hb.getChildren().add(cc);
        }
        
        return hb;
    } 
    
    public void setRowStyle(HBox hb){
        
    }
}
