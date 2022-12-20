package model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ListCell;

public class ShapeCell extends ListCell<Shapes> {// класс Product

    @Override
    public void updateItem(Shapes item, boolean empty) {

        super.updateItem(item, empty);

        if (item != null) {

            Canvas cnv = new Canvas();

            cnv.setHeight(60);// задание размера элемента отображения
            cnv.setWidth(60);

            GraphicsContext gr=cnv.getGraphicsContext2D();

            Shapes item1=(Shapes)item.clone();//текущая фигура из списка ObservableList

            item1.DrawShape(gr,1,1); // ее отрисовка на канве

            setGraphic(cnv); //установка канвы вместо cell

        }

    }

}