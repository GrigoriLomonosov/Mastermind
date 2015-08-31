package mastermind;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Jeroen De Meyer
 */
public class PlayingField extends BorderPane{

    private final PlayingFieldCompanion comp;
    
    public Model model;
    public Model getModel(){
        return model;
    }
    public void setModel(Model m){
        model = m;
        comp.setModel(model);
    }
    
    public PlayingField(){
        try{
            FXMLLoader loader = new FXMLLoader(
                PlayingField.class.getResource("PlayingField.fxml"));
            loader.setRoot(this);
            this.comp = new PlayingFieldCompanion();
            loader.setController(comp);
            loader.load();
        }catch(IOException e){
            throw new RuntimeException(e);
          }
    }
}
