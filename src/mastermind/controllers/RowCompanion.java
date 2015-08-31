package mastermind.controllers;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import mastermind.Model;

/**
 *
 * @author Jeroen De Meyer
 */
public class RowCompanion implements InvalidationListener{

    @FXML
    public HBox root;
    
    private Model model;
    public void setModel(Model m){
        if(model != m){
            if(model != null){
                model.removeListener(this);
            }
            model = m;
            if(model!=null){
                model.addListener(this);
            }
        }
    }
    
    private int step;
    public void setStep(int k){
        System.out.println("in Rowclass: " + k);
        step = k;
    }
    
    public void initialize(){
        System.out.println(model);
        System.out.println(step);
        root.getChildren().add(new TextField("test"));
    }
    
    @FXML
    public void createButtons(ActionEvent event){
        
    }
    
    @Override
    public void invalidated(Observable o){
        
    }
}
