package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangular extends Shapes {
    public int length;
    public int height;

    public String toString(){
        return "Прямоугольник";
    }

    public void DrawShape(GraphicsContext gc, double start_x, double start_y){
        gc.setFill(shapeColor);
        gc.fillRect(start_x,start_y,this.length,this.height);
    }

    @Override
    public void setXY(double x, double y) {

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
