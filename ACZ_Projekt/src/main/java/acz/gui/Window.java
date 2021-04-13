package acz.gui;

import java.io.IOException;
import javafx.application.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class Window extends Application implements EventHandler<ActionEvent> {

    private Button button;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Test");
        
        button = new Button();
        button.setText("click");
        button.setOnAction(this);
        
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        
        Scene scene = new Scene(layout, 800, 600);
        
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource() == button) {
            System.err.println("press button");
        }
        
    }
}