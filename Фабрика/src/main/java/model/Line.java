package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shapes {

    double length;

    public String toString(){

        return "The line length is "+ Area() + " and it's color is "+super.shapeColor;
    }
    public void DrawShape(GraphicsContext gc, double start_x, double start_y){
        gc.setStroke(shapeColor);
        gc.strokeLine(start_x, start_y, length, 10.0);
    }
    public double Area(){
    return length;
    }

    public Line(Color color, double length) {
        super(color);
        this.length = length;

    }
}
