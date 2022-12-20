module com.example.custompoligon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.custompoligon to javafx.fxml;
    exports com.example.custompoligon;
    exports model;
    opens model to javafx.fxml;
}