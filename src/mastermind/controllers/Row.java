package mastermind.controllers;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;
import mastermind.Model;

/**
 *
 * @author Jeroen De Meyer
 */
public class Row extends HBox{

    private final RowCompanion comp;

    private int step;
    public int getStep(){
        return step;
    }
    public void setStep(int i){
        step = i;
        comp.setStep(i);
    }
    
    public Model model;
    public Model getModel(){
        return model;
    }
    public void setModel(Model m){
        model = m;
        comp.setModel(model);
    }
    
    public Row(){
        try{
            FXMLLoader loader = new FXMLLoader(
                Row.class.getResource("Row.fxml"));
            loader.setRoot(this);
            this.comp = new RowCompanion();
            loader.setController(comp);
            loader.load();
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
