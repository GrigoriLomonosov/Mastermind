package mastermind;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import mastermind.controllers.PlayingFieldRow;
import view.SolutionCircle;

/**
 *
 * @author Jeroen De Meyer
 */
public class PlayingFieldCompanion implements InvalidationListener{
    
    public ResourceBundle resources;
    @FXML
    public VBox rowContainer;
    @FXML
    public HBox solutionContainer;
    @FXML
    public Button newBtn;
    @FXML
    public ChoiceBox colors;
    @FXML
    public ChoiceBox codeLength;
    @FXML
    public Model model;
    
    public void initialize(){
        colors.setItems(FXCollections.observableArrayList(
                createOptions(6,11)));
        codeLength.setItems(FXCollections.observableArrayList(
                createOptions(4,9)));
        model.addListener(this);
    }
    
    public void startNewGame(ActionEvent e){
        solutionContainer.getChildren().clear();
        if(colors.getSelectionModel().selectedIndexProperty().getValue()==-1 ||
            codeLength.getSelectionModel().selectedIndexProperty().getValue()==-1  ){
            getIncorrectConfigurationAlert();
        }
        else{
            int numberOfColors = (int)colors.getSelectionModel().getSelectedItem();
            int length = (int)codeLength.getSelectionModel().getSelectedItem();
            if(model.newGame(numberOfColors,length)){
                rowContainer.getChildren().clear();
                for(int i=0; i<model.getMaxSteps(); i++){
                    rowContainer.getChildren().add(new PlayingFieldRow(i, model).create());
                }
            }
            else{
                getIncorrectConfigurationAlert();
            }
        }
    }
    
    @Override
    public void invalidated(Observable o){
        if(model.getPlayerWins()){                  
            getVictoryAlert(resources.getString("playerWinsTitle"),
                            new MessageFormat(
                                            resources.getString("playerWinsText")).format(
                                                new Integer[]{model.getStep()}));
            showSolution();
        }
        if(model.getComputerWins()){
            getVictoryAlert(resources.getString("computerWinsTitle"), resources.getString("computerWinsText"));
            showSolution();
        }
    }
    
    private List<Integer> createOptions(int begin, int end){
        List<Integer> result = new ArrayList<>();
        for(int i=begin; i<=end; i++){
            result.add(i);
        }
        return result;
    }   
    
    private void getIncorrectConfigurationAlert(){
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(resources.getString("incorrectConfigTitle"));
        alert.setContentText(resources.getString("incorrectConfigText"));
        alert.showAndWait();
    }
    
    private void getVictoryAlert(String title, String text){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(text);
        alert.showAndWait();
    }
    
    private void showSolution(){
        solutionContainer.getChildren().clear();
        solutionContainer.getChildren().add(new Label(resources.getString("solutionLabel")));
        for(int i=0; i<model.getCodeLength(); i++){
            solutionContainer.getChildren().add(new SolutionCircle(model.getCode()[i]));
        }
    }
}
