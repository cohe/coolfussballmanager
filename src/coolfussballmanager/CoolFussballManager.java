package coolfussballmanager;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class CoolFussballManager extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btnGameStart = new Button();
        btnGameStart.setText("Neues Spiel starten");
        btnGameStart.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
                SeasonData seasondata = new SeasonData();
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btnGameStart);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Cool Fußball Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}