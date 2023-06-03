module com.example._6quiprendfinalfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires lombok;

    opens com.example._6quiprendfinalfx to javafx.fxml;
    exports com.example._6quiprendfinalfx;
    exports com.example._6quiprendfinalfx.Views;
    opens com.example._6quiprendfinalfx.Views to javafx.fxml;
    exports com.example._6quiprendfinalfx.model;
    opens com.example._6quiprendfinalfx.model to javafx.fxml;
    exports com.example._6quiprendfinalfx.model.Cards;
    opens com.example._6quiprendfinalfx.model.Cards to javafx.fxml;
    exports com.example._6quiprendfinalfx.Views.CardsView;
    opens com.example._6quiprendfinalfx.Views.CardsView to javafx.fxml;
}