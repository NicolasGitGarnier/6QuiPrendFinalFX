package com.example._6quiprendfinalfx;

import com.example._6quiprendfinalfx.Views.HelloController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/*public class HelloApplication extends Application {
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
}*/

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/_6quiprendfinalfx/Fxml/hello-view.fxml"));
            Parent root = loader.load();
            HelloController controller = loader.getController();
            controller.setPrimaryStage(primaryStage);

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}