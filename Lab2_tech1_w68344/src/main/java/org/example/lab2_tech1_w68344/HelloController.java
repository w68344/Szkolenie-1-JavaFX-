package org.example.lab2_tech1_w68344;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.awt.*;
import java.net.URI;
import java.net.URISyntaxException;
import javafx. scene. control.ComboBox;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;

public class HelloController
{

 public Label leblLaboratorium;
 public RadioButton radioBlue;
 public RadioButton radioYellow;
 public RadioButton radioRed;

 public void coloreLblBlue () {
     leblLaboratorium.setTextFill(Color.rgb(0, 123, 255, 1)); //Nibieski

 }
 public void coloreLblYellow ()
 {
     leblLaboratorium.setTextFill(Color.rgb(255,255,0,1)); //Żóty
 }
 public void coloreLblRed ()
 {
     leblLaboratorium.setTextFill(Color.rgb(255,0,0,1)); //Czerwony

 }
    public void coloreLblBlack ()
    {
        leblLaboratorium.setTextFill(Color.rgb(0,0,0,1)); //Czarny

    }
public void textLblLab1 ()
{
    leblLaboratorium.setText("Laboratorium 1");
}
    public void textLblLab2 ()
    {
        leblLaboratorium.setText("Laboratorium 2");
    }
    public void textLblLab3 ()
    {
        leblLaboratorium.setText("Laboratorium 3");
    }
    public void closeapp()
    {
        Platform.exit();
    }
    @FXML
    public void helpMenu (ActionEvent event) throws URISyntaxException, java.io.IOException
    {
        Desktop.getDesktop().browse(new URI("https://openjfx.io/"));
    }
    public RadioButton radioJava;
    public RadioButton radioKotlin;
    public RadioButton radioCsharp;
    @FXML
    public ImageView logoImagine;

    public void czangeLogoJava()
    {
        radioJava.setOnMouseClicked(e->     logoImagine.setImage(new Image("JavaFX_Logo.png")));
    }
    public void czangeLogoKotlin()
    {
        radioKotlin.setOnMouseClicked(e -> logoImagine.setImage(new Image("Kotlin Logo.png")));
    }
    public void czangeLogoCsharp()
    {
        radioCsharp.setOnMouseClicked(e -> logoImagine.setImage(new Image("Csharp Logo.png")));
    }
    public void loopLogo()
    {
        logoImagine.setFitHeight(450);
        logoImagine.setFitWidth(450);
    }
    public void loopOutLogo()
    {
        logoImagine.setFitHeight(250);
        logoImagine.setFitWidth(250);
    }




}