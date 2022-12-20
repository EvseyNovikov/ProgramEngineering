package model;

public class BMI {
    float weight, height;
    public float calc(){
         return (this.weight / ( (float) Math.pow(this.height, 2.0) ) ) * 10000;
    }
    public BMI(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }
}
