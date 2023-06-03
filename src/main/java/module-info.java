module com.example._6quiprendfinalfx {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example._6quiprendfinalfx to javafx.fxml;
    exports com.example._6quiprendfinalfx;
}