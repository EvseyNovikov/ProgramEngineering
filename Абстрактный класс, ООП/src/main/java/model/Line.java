package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shapes {

    double length;

    public String toString(){

        return "The line length is "+ Area() + " and it's color is "+super.ShapeColor;
    }
    public void DrawShape(GraphicsContext gc){
        gc.setStroke(Color.ORANGE);
        gc.strokeLine(0, 0, length, 0);
    }
    public double Area(){
    return length;
    }

    public Line(Color color, double length) {
        super(color);
        this.length = length;
    }
}
