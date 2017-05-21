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
                SeasonData seasonData = new SeasonData();
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btnGameStart);
        
        Scene scene = new Scene(root, 800, 600);
        
        primaryStage.setTitle("Cool Fußball Manager");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}