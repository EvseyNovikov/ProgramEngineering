package com.example.custompoligon;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import model.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    Shapes sp = new Rectangular(Color.ORANGE);
    @FXML
    private TextField   colorField;
    @FXML
    private Canvas my_canvas;
    private GraphicsContext gc;
    @FXML

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gc = my_canvas.getGraphicsContext2D();
    }

    public void chosePoint(MouseEvent mouseEvent) {

        gc.clearRect(0, 0, my_canvas.getWidth(), my_canvas.getHeight()); // очистка холста

        sp = getShape(Integer.parseInt(colorField.getText()));
        sp.setShapeColor(Color.ORANGE);
        sp.DrawShape(gc);

    }

    public Shapes getShape(int val){
        if (val == 1){
            return new Rectangular(Color.ORANGE);
        }
        else if (val == 2){
            return new Line(Color.ORANGE);
        }
        else if (val == 3){
            return new Poly(Color.ORANGE, my_canvas.getHeight(), my_canvas.getWidth());
        }
        else if (val == 4){
            return new Tring(Color.ORANGE);
        }
        return new Rectangular(Color.ORANGE);
    }

    public void makeDrawing(KeyEvent keyEvent) {

        gc.clearRect(0, 0, my_canvas.getHeight(), my_canvas.getHeight()); // очистка холста

        if(!colorField.getText().equals("") ){
            sp = getShape(Integer.parseInt(colorField.getText()));
            sp.setShapeColor(Color.ORANGE);
            sp.DrawShape(gc);
        }

    }

    public void AddStroke(ActionEvent actionEvent) {
        Stroke addStroke = new Stroke(sp);
        addStroke.makeStroke(gc);

    }
}