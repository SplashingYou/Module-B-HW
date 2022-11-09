package com.mycompany.module_b_assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javafx.scene.layout.AnchorPane;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage primaryStage) {
        try {
            AnchorPane page = (AnchorPane) FXMLLoader.load(App.class.getResource("IssueTrackingLite.fxml"));
            Scene scene = new Scene(page);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Issue Tracking Lite Sample");
            primaryStage.show();
        } catch (Exception ex) {
            //Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static void main(String[] args) {
        Application.launch(App.class, (java.lang.String[])null);
    }
}

