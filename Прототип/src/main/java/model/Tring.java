package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Tring extends Shapes {
    double length;
    double height;

    public String toString(){

        return "Триугольник";
    }
    public void DrawShape(GraphicsContext gc, double start_x, double start_y){

        gc.setFill(shapeColor);
        gc.fillPolygon(new double[]{start_x, length/2, this.length}, new double[]{start_y, height, 0}, 3);
    }

    @Override
    public void setXY(double x, double y) {

    }

    public double Area(){
        return (this.length * this.height) / 2;
    }

    public Tring(Color color, double length, double height) {
        super(color);
        this.length = length;
        this.height = height;
    }

}
