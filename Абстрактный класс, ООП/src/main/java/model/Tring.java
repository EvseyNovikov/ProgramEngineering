package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Tring extends  Shapes{
    double length;
    double height;

    public String toString(){

        return "The triangle area is "+ Area() + " and it's color is "+super.ShapeColor;
    }
    public void DrawShape(GraphicsContext gc){

        gc.setFill(Color.ORANGE);
        gc.fillPolygon(new double[]{0, length/2, this.length}, new double[]{0, height, 0}, 3);
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
