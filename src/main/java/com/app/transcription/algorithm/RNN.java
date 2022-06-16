package com.app.transcription.algorithm;

public class RNN implements TranscriptionAlgorithm{
    @Override
    public String getNameOfAlgorithm() {
        return "RNN";
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
