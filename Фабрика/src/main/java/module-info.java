module evsey.novikov.fabric {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens evsey.novikov.fabric to javafx.fxml;
    exports evsey.novikov.fabric;
}