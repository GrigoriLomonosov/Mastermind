package mastermind;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Jeroen De Meyer
 */
public class Mastermind extends Application {
    
    @Override
    public void start(Stage stage) {
        Parent root = new PlayingField();
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("resources/generalStyle.css");
        
        stage.setTitle("Mastermind");
        //stage.getIcons().add(new Image("/resources/icon.png"));
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
