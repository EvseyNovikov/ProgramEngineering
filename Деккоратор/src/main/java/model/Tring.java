package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Tring extends Shapes{

    public String toString(){

        return "The triangle area is "+ Area() + " and it's color is "+super.shapeColor;
    }

    @Override
    public void DrawShape(GraphicsContext gc) {
        gc.clearRect(0, 0, 350.0, 350.0); // очистка холста
        gc.setFill(shapeColor);
        gc.fillPolygon(new double[]{0, length/2, this.length}, new double[]{0, height, 0}, 3);
    }
    public double Area(){
        return (this.length * this.height) / 2;
    }

    public Tring(Color shapeColor) {
        super(shapeColor);

    }
}
