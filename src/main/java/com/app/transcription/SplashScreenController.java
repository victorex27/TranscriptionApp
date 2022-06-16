package com.app.transcription;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SplashScreenController extends Application implements Initializable {

        /**
         * Initializes the controller class.
         */
        @FXML
        private AnchorPane apane;

        private AnchorPane borderPane;

        private AppController controller;

        @Override
        public void initialize(URL url, ResourceBundle rb) {
                splash();
        }

        private void splash() {
                new Thread() {
                        @Override
                        public void run() {
                                try {
                                        Thread.sleep(1000);
                                } catch (Exception e) {
                                        System.out.println(e);
                                }
                                Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                                try {
                                                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("app-view.fxml"));
                                                        borderPane = (AnchorPane) fxmlLoader.load();
                                                        controller = fxmlLoader.getController();
                                                        Stage stage = new Stage();
                                                        Scene scene = new Scene(borderPane);
                                                        stage.setTitle("Text Detector");
                                                        stage.setScene(scene);
                                                        stage.setMinHeight(400);
                                                        stage.setMinWidth(600);
                                                        stage.initStyle(StageStyle.UTILITY);
                                                        stage.show();
                                                        apane.getScene().getWindow().hide();
                                                } catch (IOException ex) {
                                                        Logger.getLogger(SplashScreenController.class.getName()).log(Level.SEVERE, null, ex);
                                                }

                                        }
                                });
                        }
                }.start();
        }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }



}