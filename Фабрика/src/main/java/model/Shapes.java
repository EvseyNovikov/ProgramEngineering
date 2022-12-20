package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shapes {
    protected Color shapeColor;

    public abstract String toString();
    public abstract void DrawShape(GraphicsContext gc, double start_x, double start_y);

    public abstract double Area();

    public Shapes(Color color) {
        System.out.println("Вызов конструктора");
        this.shapeColor = color;

    }

    public void setShapeColor(Color shapeColor) {
        this.shapeColor = shapeColor;
    }

}
