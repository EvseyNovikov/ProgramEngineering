package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangular extends Shapes{

    public String toString(){
        return "The area of the rectangular is "+ Area() + " and it's color is "+super.shapeColor;
    }

    public void DrawShape(GraphicsContext gc){
        gc.clearRect(0, 0, 350.0, 350.0); // очистка холста
        gc.setFill(shapeColor);
        gc.fillRect(0, 0, super.length, super.height);
    }
    public double Area(){
        return super.length * height;
    }
    public Rectangular(Color shapeColor) {
        super(shapeColor);
    }
}
