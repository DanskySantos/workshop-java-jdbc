module application.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens application.workshopjavafxjdbc to javafx.fxml;
    exports application.workshopjavafxjdbc;
    exports controllers;
    opens controllers to javafx.fxml;
    exports model.entities;
}