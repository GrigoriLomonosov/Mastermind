package mastermind.controllers;

import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableIntegerArray;
import javafx.geometry.Pos;
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
    
    private final Model model;
    
    private final ObservableIntegerArray tempAttempt;

    public PlayingFieldRow(int rowNumber, Model model){
        this.model = model;
        this.rowNumber = rowNumber;
        tempAttempt = FXCollections.observableIntegerArray(new int[model.getCodeLength()]);
    }
    
    public HBox create(){
        HBox hb = new HBox();
        HBox buttonBox = new HBox();
        HBox circleBox = new HBox();
        
        for(int i=0; i<model.getCodeLength(); i++){
            RowButton btn = new PlayButton(model, tempAttempt,i, rowNumber);
            model.addListener(btn);
            tempAttempt.addListener(btn);
            buttonBox.getChildren().add(btn);
        }
        hb.getChildren().add(buttonBox);
        
        RowButton checkBtn = new CheckButton(model, tempAttempt, rowNumber);
        model.addListener(checkBtn);
        hb.getChildren().add(checkBtn);
        
        for(int i=0; i<model.getCodeLength(); i++){
            CustomCircle cc = new CustomCircle(i, model, rowNumber);
            model.addListener(cc);
            circleBox.getChildren().add(cc);
        }
        hb.getChildren().add(circleBox);
        setRowStyle(hb);
        return hb;
    } 
    
    public void setRowStyle(HBox hb){
        hb.setAlignment(Pos.CENTER);
        hb.setSpacing(8);
    }
}
