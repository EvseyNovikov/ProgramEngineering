module com.novikov.bmi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.novikov.bmi to javafx.fxml;
    exports com.novikov.bmi;
}