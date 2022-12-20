package com.example.interest_rates_calc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class HelloController {
    model.Calculate calculator = new model.Calculate();
    @FXML
    private Label label_1 = new Label();
    @FXML
    private RadioButton rb1 = new RadioButton();

    @FXML
    private RadioButton rb2 = new RadioButton();
    @FXML
    private RadioButton rb3 = new RadioButton();

    @FXML
    private TextField tf_1 = new TextField();

    @FXML
    private TextField tf_2 = new TextField();

    @FXML
    protected  void calculate_procent(){
        if(rb1.isSelected()){
            calculator.interest_rate = 3;
        }else if(rb2.isSelected()){
            calculator.interest_rate = 10;
        }else if(rb3.isSelected()){
            calculator.interest_rate = 15;
        }
    }
    @FXML
    protected  void start_the_calculation(){

        if (tf_1.getText() != null && calculator.interest_rate != 0){
                try{
                    calculator.sum = Integer.parseInt(tf_1.getText());
                    tf_2.setText(Integer.toString(calculator.calc_operation()));
                }catch(NumberFormatException ex){
                    label_1.setText("Вы ввели не число!");
                }
        }else if (calculator.interest_rate == 0){
            label_1.setText("Вы не выбради %");
        }else{
            label_1.setText("Вы не указали число!");
        }
    }
}