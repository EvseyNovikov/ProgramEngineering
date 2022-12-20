package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.Text;

public abstract class ShapeDecorator {
    Shapes shp;

    public ShapeDecorator(Shapes shp) {
        this.shp = shp;
    }
    public abstract void makeStroke(GraphicsContext gc);
}
