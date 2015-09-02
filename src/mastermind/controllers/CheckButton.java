package mastermind.controllers;

import java.util.ResourceBundle;
import javafx.beans.Observable;
import javafx.collections.ObservableIntegerArray;
import mastermind.Model;

/**
 *
 * @author Jeroen De Meyer
 */
public class CheckButton extends RowButton{
    
    private final ResourceBundle resources = ResourceBundle.getBundle("resources/i18n");
    
    public CheckButton(Model model, ObservableIntegerArray tempAttempt, int rowNumber){
        super(model, tempAttempt, rowNumber);
        setOnAction(new CheckButtonHandler(model, tempAttempt));
        setText(resources.getString("checkRowBtn"));
    }
    
    @Override
    public void invalidated(Observable o){
        super.invalidated(o);
    }
}
