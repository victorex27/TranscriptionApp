package com.app.transcription.algorithm;

public interface TranscriptionAlgorithm {


    String getNameOfAlgorithm();
    public String getTranscriptionSpeed();
    public String getWordRateError();
    public String convertWordsToText();
}
