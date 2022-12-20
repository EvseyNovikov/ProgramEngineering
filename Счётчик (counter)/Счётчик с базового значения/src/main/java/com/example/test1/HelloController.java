package com.example.test1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import model.*;
public class HelloController {
    public TextField text;

    model.Counter countVal = new model.Counter();
    @FXML
    private Label welcomeText;
    @FXML
    private RadioButton radio;


    @FXML
    protected void onHelloButtonClick() {

        countVal.IncreaseValue(1);
        welcomeText.setText(String.valueOf( countVal.getValue()));
    }
    @FXML
    protected void onHelloButtonClick2() {
        if(text.getText().isEmpty()){
            countVal.SetValue(0);
        }else{
            countVal.SetValue(Integer.valueOf(text.getText()));
            welcomeText.setText(text.getText());
        }
    }
    @FXML
    protected void onRadioButtonClicked(){
        text.setText("100");
    }

}