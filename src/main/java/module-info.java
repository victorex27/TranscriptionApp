module com.app.transcription {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.logging;

    opens com.app.transcription to javafx.fxml;
    exports com.app.transcription;
}