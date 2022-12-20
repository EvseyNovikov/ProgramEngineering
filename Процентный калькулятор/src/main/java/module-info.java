module com.example.interest_rates_calc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.interest_rates_calc to javafx.fxml;
    exports com.example.interest_rates_calc;
}