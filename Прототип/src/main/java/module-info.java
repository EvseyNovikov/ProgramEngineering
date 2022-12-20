module evsey.novikov.fabric {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens evsey.novikov.prototype to javafx.fxml;
    exports evsey.novikov.prototype;
}