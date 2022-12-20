package model;

public class Calculate {
    public int interest_rate = 0;
    public int sum = 0;

    public int calc_operation (){
        return (this.sum / 100) * this.interest_rate;
    }
}
