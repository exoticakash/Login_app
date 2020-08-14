package sample;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TextField t1, t2, t4;
    @FXML
    private Button b1, b2, b3, signin, signup, signin2, signup2;
    @FXML
    private PasswordField t3, t5;
    @FXML
    private Label bl1, bl2, al1, al2, al3, al4, al5, al6, al7, p1, p2, p3, p4;
    @FXML
    private AnchorPane layer1, layer2;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        al1.setVisible(true);
        signin.setVisible(true);
        t1.setVisible(true);
        t2.setVisible(true);
        t3.setVisible(true);
        bl1.setVisible(true);
        bl2.setVisible(true);
        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(true);
        signup.setVisible(true);

        al2.setVisible(false);
        al3.setVisible(false);
        al4.setVisible(false);
        al5.setVisible(false);
        al6.setVisible(false);
        al7.setVisible(false);
        signup2.setVisible(false);
        signin2.setVisible(false);
        t4.setVisible(false);
        t5.setVisible(false);

        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);

    }

    @FXML
    private void btn(MouseEvent event) {
        TranslateTransition slide = new TranslateTransition();
        TranslateTransition slide1 = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.5));
        slide1.setDuration(Duration.seconds(0.5));
        slide.setNode(layer2);
        slide1.setNode(layer1);
        slide.setToX(600);
        slide1.setToX(-300);
        slide.play();
        slide1.play();
        //layer1.setTranslateX(-300);

        al1.setVisible(false);
        signin.setVisible(false);
        t1.setVisible(false);
        t2.setVisible(false);
        t3.setVisible(false);
        bl1.setVisible(false);
        bl2.setVisible(false);
        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(true);
        signup.setVisible(false);

        al2.setVisible(true);
        al3.setVisible(true);
        al4.setVisible(true);
        al5.setVisible(true);
        al6.setVisible(true);
        al7.setVisible(true);
        signup2.setVisible(true);
        signin2.setVisible(true);
        t4.setVisible(true);
        t5.setVisible(true);

    }

    @FXML
    private void btn2(MouseEvent event) {
        TranslateTransition slide = new TranslateTransition();
        TranslateTransition slide1 = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.5));
        slide1.setDuration(Duration.seconds(0.5));
        slide.setNode(layer2);
        slide1.setNode(layer1);
        slide.setToX(0);
        slide1.setToX(0);
        slide.play();
        slide1.play();
        //layer1.setTranslateX(0);
        al1.setVisible(true);
        signin.setVisible(true);
        t1.setVisible(true);
        t2.setVisible(true);
        t3.setVisible(true);
        bl1.setVisible(true);
        bl2.setVisible(true);
        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(true);
        signup.setVisible(true);

        al2.setVisible(false);
        al3.setVisible(false);
        al4.setVisible(false);
        al5.setVisible(false);
        al6.setVisible(false);
        al7.setVisible(false);
        signup2.setVisible(false);
        signin2.setVisible(false);
        t4.setVisible(false);
        t5.setVisible(false);
    }

    @FXML
    private void signup(MouseEvent event) {

    }

    @FXML
    private void signin(MouseEvent event) {

    }
}

