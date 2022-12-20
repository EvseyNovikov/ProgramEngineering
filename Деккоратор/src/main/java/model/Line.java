package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Line extends Shapes {

    public String toString(){

        return "The line length is "+ Area() + " and it's color is "+super.shapeColor;
    }

    @Override
    public void DrawShape(GraphicsContext gc) {
        gc.clearRect(0, 0, 350.0, 350.0); // очистка холста
        gc.setFill(shapeColor);
        gc.fillRect(0, 10, super.length, 1);
    }

    public double Area(){
    return super.length;
    }

    public Line(Color shapeColor) {
        super(shapeColor);

    }
}
