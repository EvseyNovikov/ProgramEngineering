module com.example.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.novikov.task7 to javafx.fxml;
    exports com.novikov.task7;
}