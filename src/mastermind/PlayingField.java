package mastermind;

import java.io.IOException;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Jeroen De Meyer
 */
public class PlayingField extends BorderPane{

    private final PlayingFieldCompanion comp;
    
    public PlayingField(){
        try{
            FXMLLoader loader = new FXMLLoader(
                PlayingField.class.getResource("PlayingField.fxml"),
                ResourceBundle.getBundle("resources/i18n"));
            loader.setRoot(this);
            this.comp = new PlayingFieldCompanion();
            loader.setController(comp);
            loader.load();
        }catch(IOException e){
            throw new RuntimeException(e);
          }
    }
}
