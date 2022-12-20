package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangular extends Shapes{
    public int length;
    public int height;

    public String toString(){
        return "The area of the rectangular is "+ Area() + " and it's color is "+super.ShapeColor;
    }

    public void DrawShape(GraphicsContext gc){
        gc.setFill(Color.ORANGE);
        gc.fillRect(10,10,this.length,this.height);
    }
    public double Area(){
        return length * height;
    }
    public Rectangular(Color color, int length, int height) {
        super(color);
        this.length = length;
        this.height = height;
    }
}
