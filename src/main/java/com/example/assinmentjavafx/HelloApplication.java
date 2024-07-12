package com.example.assinmentjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("RegistationForm.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 550, 370);
        stage.setTitle("Registration Form JavaFX Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { launch();
    }
}