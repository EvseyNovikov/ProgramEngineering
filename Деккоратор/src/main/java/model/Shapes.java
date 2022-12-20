package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public abstract class Shapes {
    protected Color shapeColor;
    protected double length = 300;
    protected double height = 250;
    public Color strokeColor = Color.BLACK;

    public abstract String toString();
    public abstract void DrawShape(GraphicsContext gc);

    public abstract double Area();


    public Shapes(Color shapeColor) {
        this.shapeColor = shapeColor;
    }

    public void setShapeColor(Color shapeColor) {
        this.shapeColor = shapeColor;
    }
    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

}
