package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.lang.Cloneable;

public abstract class Shapes implements Cloneable{
    protected Color shapeColor;

    public abstract String toString();
    public abstract void DrawShape(GraphicsContext gc, double start_x, double start_y);

    public abstract void setXY(double x, double y);

    public abstract double Area();

    public Shapes(Color color) {
        System.out.println("Вызов конструктора");
        this.shapeColor = color;

    }

    public void setShapeColor(Color shapeColor) {
        this.shapeColor = shapeColor;
    }
    @Override
    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
