package com.example._6quiprendfinalfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader gameBoard = new FXMLLoader(getClass().getResource("/com/example/_6quiprendfinalfx/Fxml/playing-stage.fxml"));
        stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/_6quiprendfinalfx/taureau.jpeg"))));
        Parent rootGameBoard = gameBoard.load();
        Scene sceneGameBoard = new Scene(rootGameBoard);

        stage.setTitle("6 qui prend");
        stage.setScene(sceneGameBoard);
        stage.show();

        gameBoard.getController();
    }
    public static void main(String[] args) {
        launch(args);
    }
}