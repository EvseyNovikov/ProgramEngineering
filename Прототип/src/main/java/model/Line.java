package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shapes {

    double length;

    public String toString(){

        return "Линия";
    }
    public void DrawShape(GraphicsContext gc, double start_x, double start_y){
        gc.setStroke(shapeColor);
        gc.strokeLine(start_x, start_y, length, start_y);
    }

    @Override
    public void setXY(double x, double y) {

    }

    public double Area(){
    return length;
    }

    public Line(Color color, double length) {
        super(color);
        this.length = length;

    }
}
