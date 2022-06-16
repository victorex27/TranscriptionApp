package com.app.transcription.algorithm;

public class LSTM implements TranscriptionAlgorithm{
    @Override
    public String getNameOfAlgorithm() {
        return "LSTM";
    }

    @Override
    public String getTranscriptionSpeed() {
        return null;
    }

    @Override
    public String getWordRateError() {
        return null;
    }

    @Override
    public String convertWordsToText() {
        return null;
    }
}
