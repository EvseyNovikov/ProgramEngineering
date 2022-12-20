package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.Text;

public class Stroke extends ShapeDecorator {
    public Stroke(Shapes shp) {
        super(shp);
    }
    public void makeStroke(GraphicsContext gc){
        gc.setStroke(shp.strokeColor);
        shp.DrawShape(gc);
        gc.strokeRect(0, 0, shp.getLength(), shp.getHeight());
    }
}
