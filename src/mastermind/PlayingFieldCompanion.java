package mastermind;

import java.util.ArrayList;
import java.util.List;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
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
    
    public void initialize(){
        colors.setItems(FXCollections.observableArrayList(
                createOptions(6,11)));
        codeLength.setItems(FXCollections.observableArrayList(
                createOptions(4,9)));
    }
    
    @Override
    public void invalidated(Observable o){
        
    }
    
    public List<Integer> createOptions(int begin, int end){
        List<Integer> result = new ArrayList<>();
        for(int i=begin; i<=end; i++){
            result.add(i);
        }
        return result;
    }
    
}
