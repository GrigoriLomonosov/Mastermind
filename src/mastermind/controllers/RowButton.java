package mastermind.controllers;

import javafx.scene.control.Button;

/**
 *
 * @author Jeroen De Meyer
 */
public class RowButton extends Button{
    
    private int place;
    public int getPlace() {
        return place;
    }
    public void setPlace(int place) {
        this.place = place;
    }
}
