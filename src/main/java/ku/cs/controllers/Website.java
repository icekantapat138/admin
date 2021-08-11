package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import ku.cs.App;

import java.io.IOException;

public class Website{

    @FXML private ImageView image1;
    @FXML private ImageView image2;
    @FXML private ImageView image3;
    @FXML private ImageView image4;
    @FXML private ImageView image5;
    @FXML private ImageView image6;


    @FXML
    public void initialize() {
        String Min = getClass().getResource("/image/MIN.png").toExternalForm();
        image1.setImage(new Image(Min));

        String lam = getClass().getResource("/image/lamborghini-logo.png").toExternalForm();
        image2.setImage(new Image(lam));

        String fer = getClass().getResource("/image/ferrarilogo.png").toExternalForm();
        image3.setImage(new Image(fer));

        String mc = getClass().getResource("/image/mclarenlogo.png").toExternalForm();
        image4.setImage(new Image(mc));

        String w = getClass().getResource("/image/wmotorlogo.png").toExternalForm();
        image5.setImage(new Image(w));

        String bu = getClass().getResource("/image/bugattilogo.png").toExternalForm();
        image6.setImage(new Image(bu));
    }

    @FXML
    private void logout() throws IOException {  //ปุ่มกลับสู่หน้า home
        App.setRoot("automobill");
    }

    @FXML
    private void handleuserHyperlink() throws IOException{  //ปุ่มเข้าไปดูข้อมูลลูกค้า
        App.setRoot("user");
    }

    @FXML
    private void handlecartHyperlink() throws IOException{ //เข้าสู่หน้ารายการสินค้าที่กดซื้อ
        App.setRoot("cart");
    }


    @FXML
    private void lamborghiniMoseClick(MouseEvent event) throws IOException{
        App.setRoot("lamborghini");
    }

    @FXML
    private void ferrariMoseClick(MouseEvent event) throws IOException{
        App.setRoot("ferrari");
    }

    @FXML
    private void mclarenMoseClick(MouseEvent event) throws IOException{
        App.setRoot("mclaren");
    }

    @FXML
    private void wmotorMoseClick(MouseEvent event) throws IOException{
        App.setRoot("wmotor");
    }

    @FXML
    private void bugattiMoseClick(MouseEvent event) throws IOException{
        App.setRoot("bugatti");
    }


    @FXML
    private void handlelamborghiniHyperlink() throws IOException {
        App.setRoot("lamborghini");
    }

    @FXML
    private void handleferrariHyperlink() throws IOException {
        App.setRoot("ferrari");
    }

    @FXML
    private void handlemclarenHyperlink() throws IOException {
        App.setRoot("mclaren");
    }

    @FXML
    private void handlewmotorHyperlink() throws IOException {
        App.setRoot("wmotor");
    }

    @FXML
    private void handlebugattiHyperlink() throws IOException {
        App.setRoot("bugatti");
    }


}
