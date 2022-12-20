package model;

public class Metrics {
    public float b0, b1;
    public String Message;
    public int category;
    public boolean Within(BMI bmi ){
        float bmi_val = bmi.calc();
        if (bmi_val > b0 & bmi_val < b1){
            return true;
        }
        return false;
    }
    public Metrics(float b0, float b1, String message, int category) {
        this.b0 = b0;
        this.b1 = b1;
        Message = message;
        this.category = category;
    }
}