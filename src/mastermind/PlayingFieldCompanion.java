package mastermind;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

/**
 *
 * @author Jeroen De Meyer
 */
public class PlayingFieldCompanion implements InvalidationListener{
    
    @FXML
    public Button newBtn;
    @FXML
    public ChoiceBox colors;
    @FXML
    public ChoiceBox codeLength;

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
    
    public void invalidated(Observable o){
        
    }
    
}
