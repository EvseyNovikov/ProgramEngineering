package com.novikov.bmi;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.BMI;
import model.Diagnosis;
public class HelloController {
    @FXML
    private TextField resultField;
    @FXML
    private TextField weightField;
    @FXML
    private  TextField heightField;
    public void make_calculation(ActionEvent actionEvent) {
        try{
            BMI bmi = new BMI(Float.parseFloat(heightField.getText()), Float.parseFloat(weightField.getText()));
            Diagnosis dg = new Diagnosis(7, bmi);
            resultField.setText(dg.ShowMetrics());
            resultField.setText(dg.ShowDiagnosis());
        }catch (NumberFormatException e){
            System.out.println("Введены некоректные данные");
        }
    }

    {}
}