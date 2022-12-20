package evsey.novikov.prototype;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.util.Callback;
import model.*;
import model.Shapes;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public ListView listboxforfigure;
    Shapes sp = new Rectangular(Color.ORANGE, 150, 200);
    private ObservableList<Shapes> items;

    @FXML
    private Canvas my_canvas;

    public void addShape(MouseEvent x) {

        GraphicsContext gr = my_canvas.getGraphicsContext2D();
        listboxforfigure.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        int a = listboxforfigure.getSelectionModel().getSelectedIndex();
        Shapes new_figure = (Shapes) items.get(a).clone();
        new_figure.DrawShape(gr, x.getX(), x.getY());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Rectangular rect = new Rectangular(Color.ORANGE, 200, 100);
        Tring trig = new Tring(Color.ORANGE, 60, 60);
        Line line = new Line(Color.ORANGE, 300);

        listboxforfigure.setCellFactory(new Callback<ListView<Shapes>, ListCell<Shapes>>() {
            @Override
            public ListCell<Shapes> call(ListView<Shapes> list) {

                return new ShapeCell();
            }

        }

        );

        items = FXCollections.observableArrayList(rect, trig, line);
        listboxforfigure.setItems(items);
        listboxforfigure.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }
}