package mastermind;

import java.util.ArrayList;
import java.util.List;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import mastermind.controllers.Row;

/**
 *
 * @author Jeroen De Meyer
 */
public class PlayingFieldCompanion implements InvalidationListener{
    
    @FXML
    public VBox rowContainer;
    @FXML
    public Button newBtn;
    @FXML
    public ChoiceBox colors;
    @FXML
    public ChoiceBox codeLength;

    public Model model;
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
    
    public void startNewGame(ActionEvent e){
        System.out.println("start new Game");
        if(colors.getSelectionModel().selectedIndexProperty().getValue()==-1 ||
            codeLength.getSelectionModel().selectedIndexProperty().getValue()==-1  ){
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Board not configured");
            alert.setContentText("Please choose the number of colors and the length of the code");
            alert.showAndWait();
        }
        else{
            int numberOfColors = (int)colors.getSelectionModel().getSelectedItem();
            int length = (int)codeLength.getSelectionModel().getSelectedItem();
            boolean b = model.newGame(numberOfColors,length);
            if(!b){
                Alert alert = new Alert(AlertType.ERROR);
                alert.setContentText("Choose correct configuration");
                alert.showAndWait();
            }
            else{
                System.out.println("add: " + rowContainer);
                rowContainer.getChildren().clear();
                rowContainer.getChildren().add(new Row());
            }
        }
    }
    
    @Override
    public void invalidated(Observable o){
        System.out.println(model);
    }
    
    public List<Integer> createOptions(int begin, int end){
        List<Integer> result = new ArrayList<>();
        for(int i=begin; i<=end; i++){
            result.add(i);
        }
        return result;
    }
    
}
