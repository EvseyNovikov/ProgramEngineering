package builder.pattern.builder;

import javafx.beans.property.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    public Button show_shape;
    public VBox VboxContainer;
    @FXML
    Rectangle rect = new Rectangle();
    Arc arc = new Arc();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        VboxContainer.getChildren().add(rect);
        VboxContainer.getChildren().add(arc);

        rect.setX(20);
        rect.setY(50);
        rect.setWidth(200);
        rect.setHeight(150);
        rect.setFill(Color.BLACK);

        arc.setCenterX(VboxContainer.getWidth() / 2);
        arc.setCenterY(VboxContainer.getHeight() / 2);
        arc.setRadiusX(100.0f);
        arc.setRadiusY(100.0f);
        arc.setStartAngle(360.0f);
        arc.setLength(100f);

    }
}