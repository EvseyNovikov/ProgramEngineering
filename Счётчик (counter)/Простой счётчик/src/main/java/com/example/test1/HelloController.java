package com.example.test1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import model.*;
public class HelloController {
    model.Counter countVal = new model.Counter();
    @FXML
    private Label welcomeText;



    @FXML
    protected void onHelloButtonClick() {
        countVal.IncreaseValue(1);
        welcomeText.setText(String.valueOf( countVal.getValue()));
    }
}