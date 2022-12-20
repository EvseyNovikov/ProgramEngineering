package model;

public class Counter {
    int k = 0;
    public int IncreaseValue(int a){
        return this.k += a;
    }
    public int getValue(){
        return this.k;
    }
}
