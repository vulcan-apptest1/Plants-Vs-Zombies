package sample;

import javafx.scene.layout.Pane;

public class Jalapeno extends Plant {
    public Jalapeno(int x, int y, Pane pane) {
        super(x, y, "file:src/sample/assets/jalapeno.gif", pane, 4);
    }
    @Override
    public void attack(){
        //blast all the zombies around
    }
}
