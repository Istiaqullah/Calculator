package org.example.uiu_calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("installment.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 550);
        stage.setTitle("Installment calculator");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    static void changeScene(ActionEvent event,String fxml, String title) throws IOException {
        Parent root = null;
    try {
        root= FXMLLoader.load(Main.class.getResource(fxml));
    }catch (IOException e){
        e.printStackTrace();
    }
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
    stage.setScene(new Scene(root,700,550));
    stage.setTitle(title);
    stage.setResizable(false);
    stage.show();

    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
