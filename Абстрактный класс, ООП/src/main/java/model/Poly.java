package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Poly extends  Shapes{
    double CanvasHeight;
    double CanvasWidth;
    double Radius = 100;

    public String toString() {
        return "The n-gon area is "+ Area() + " and it's color is "+super.ShapeColor;
    }

    public void DrawShape(GraphicsContext gc) {
        gc.clearRect(0, 0, 300.0, 300.0); // очистка холста
        gc.setFill(Color.ORANGE);

        double[] x_cords = new double[5];
        double[] y_cords = new double[5];

        for (int i = 0; i < 5; ++i) {
            x_cords[i] = Radius * Math.cos(2 * Math.PI * i / 5) + (CanvasWidth / 2);
            y_cords[i] = Radius * Math.sin(2 * Math.PI * i / 5) + (CanvasHeight / 2);
        }

        gc.fillPolygon(x_cords, y_cords, x_cords.length);
    }

    public double Area() {
        return 0.5 * ( Radius*Radius * 5 * Math.sin(360.0/5) ); // S = 1/2 * R^2 * n sin (360/n)
    }

    public Poly(Color color, double CanvasHeight, double CanvasWidth) {
        super(color);
        this.CanvasHeight = CanvasHeight;
        this.CanvasWidth = CanvasWidth;
    }

}



