package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Lamborghini {

    @FXML  private ImageView image;

    @FXML
    public void initialize() {
        String path = getClass().getResource("/image/lambopage.jpg").toExternalForm();
        image.setImage(new Image(path));
    }

}
