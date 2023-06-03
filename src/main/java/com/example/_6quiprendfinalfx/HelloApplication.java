package com.example._6quiprendfinalfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader gameBoard = new FXMLLoader(getClass().getResource("/com/example/_6quiprendfinalfx/Fxml/playing-stage.fxml"));
        Parent rootGameBoard = gameBoard.load();
        Scene sceneGameBoard = new Scene(rootGameBoard);

        stage.setTitle("6 qui prend");
        // stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/path/to/the/icon.png"))));
        stage.setScene(sceneGameBoard);
        stage.show();

        gameBoard.getController();
    }
    public static void main(String[] args) {
        launch(args);
    }
}