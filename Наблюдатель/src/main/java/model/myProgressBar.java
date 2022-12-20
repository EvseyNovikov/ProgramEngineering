package model;
import javafx.scene.control.ProgressBar;

public class myProgressBar extends ProgressBar implements IObserver {
    public double counter = 0;

    public myProgressBar() {
       setProgress(0);
    }

    @Override
    public void update() {
        if(counter < 1.5){
            setProgress(counter);
            counter = counter + 00.1;
        }else if (counter > 1.5){
            counter = 0;
            setProgress(counter);
        }
    }
}
