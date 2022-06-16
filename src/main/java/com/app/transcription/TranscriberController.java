package com.app.transcription;

import com.app.transcription.algorithm.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TranscriberController {

    TranscriptionAlgorithm algorithm;
    @FXML
    private Label nameOfTranscriber, speedOfTranscription, wordErrorRate;

    public void initialize() throws IOException {

        wordErrorRate.setText("WER:_______");
        nameOfTranscriber.setText(algorithm.getNameOfAlgorithm());

    }

    public TranscriberController(TranscriptionAlgorithm algorithm){
        this.algorithm = algorithm;

    }
}
