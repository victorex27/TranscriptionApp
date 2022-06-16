package com.app.transcription;

import com.app.transcription.algorithm.GRU;
import com.app.transcription.algorithm.LSTM;
import com.app.transcription.algorithm.RNN;
import com.app.transcription.algorithm.TranscriptionAlgorithm;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppController {

    @FXML
    private AnchorPane pane;
    @FXML
    private VBox vBox;

    public void initialize() throws IOException {
        Logger.getLogger(AppController.class.getName()).log(Level.INFO, "Showing main Page", "Snapshot");


        AnchorPane gruPane = getChildView(new GRU());
        AnchorPane lstmPane = getChildView(new LSTM());
        AnchorPane rnnPane = getChildView(new RNN());



        vBox.getChildren().addAll(gruPane, lstmPane, rnnPane);


    }

    private AnchorPane getChildView(TranscriptionAlgorithm algo) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("transcriber-view.fxml"));
        loader.setController(new TranscriberController( algo));
        AnchorPane childPane = loader.load();
        return  childPane;
    }

}