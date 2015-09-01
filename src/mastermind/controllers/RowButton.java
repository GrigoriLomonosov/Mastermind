package mastermind.controllers;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.scene.control.Button;
import mastermind.Model;

/**
 *
 * @author Jeroen De Meyer
 */
public class RowButton extends Button {//implements InvalidationListener{
    
    private int place;
    public int getPlace() {
        return place;
    }
    public void setPlace(int place) {
        this.place = place;
    }
    
    public RowButton(int place){
        this.place = place;
    }
    /**
    @Override
    public void invalidated(Observable o){
        Model model = new Model();
        setDisable(model.getComputerWins() || model.getPlayerWins());
    }**/
}
