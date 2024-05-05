package org.example.lab2_tech1_w68344;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.awt.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.imageio.IIOException;

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

}