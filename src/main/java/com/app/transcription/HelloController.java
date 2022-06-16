package com.app.transcription;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;

public class HelloController extends Application {

    SplashScreenController splashScreenController;
    @Override
    public void start(Stage stage) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("app-view.fxml"));
//        splashScreenController = fxmlLoader.getController();
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();

    }

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void stop() throws Exception {


        System.exit(0);


    }
}