package com.example.iterator;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.ImageCollection;
import model.Iterator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    public ImageView imageGallery;
    public Button buttonPrev;
    public Button buttonNext;
    public Button toStart;
    public Button choseDirectory;
    @FXML
    public Timeline timeline = new Timeline();

    public File[] images_paths;
    public ImageCollection images;
    @FXML
    public Iterator image_iterator;

    public void nextImage(ActionEvent actionEvent) {
        if (images != null) {
            if (image_iterator.hasNext()) {

                Image name = (Image) image_iterator.next();
                imageGallery.setImage(name);
            }
        }
    }

    public void prevImage(ActionEvent actionEvent) throws FileNotFoundException {
        if (images != null) {
            if (image_iterator.hasPrev()) {
                Image name = (Image) image_iterator.prev();
                imageGallery.setImage(name);
            }
        }


    }

    public void startImage(ActionEvent actionEvent) {
        if (images != null) {
            Image name = (Image) image_iterator.preview();
            imageGallery.setImage(name);
        }
    }

    public void onChoseDirectory(ActionEvent actionEvent) {

        final DirectoryChooser directoryChooser = new DirectoryChooser();
        final File selectedDirectory =  directoryChooser.showDialog(new Stage());

        if (selectedDirectory != null) {

            images_paths = selectedDirectory.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {

                    if(name.endsWith(".jpg")){
                        return name.endsWith(".jpg");
                    }else if(name.endsWith(".png")){
                        return name.endsWith(".png");
                    }else if(name.endsWith(".gif")){
                        return name.endsWith(".gif");
                    }else if(name.endsWith(".jpeg")){
                       return name.endsWith(".jpeg");
                    }
                    return false;
                }
            });

            if(images_paths.length > 0) {

                imageGallery.setImage(new Image(images_paths[0].toString().replace("\\", "/")));

                images = new ImageCollection(images_paths);
                image_iterator = images.getIterator();

                System.out.println(Arrays.toString(images_paths));

            }else{
                System.out.println("В данной папке нет картинок");
            }
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        timeline.setCycleCount(Timeline.INDEFINITE);//кол-во повторов
        timeline.getKeyFrames().add(new KeyFrame(new Duration(3000), new
                EventHandler() {
                    @Override
                    public void handle(Event event) {
                        if (images != null) {
                            if (image_iterator.hasNext()) {

                                Image name = (Image) image_iterator.next();
                                imageGallery.setImage(name);
                            }
                        }
                    }
                }));
    }

    public void stopAnim(ActionEvent actionEvent) {
        timeline.stop();
    }

    public void startAnim(ActionEvent actionEvent) {
        timeline.play();
    }
}