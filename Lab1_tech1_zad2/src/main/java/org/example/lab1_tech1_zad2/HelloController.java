package org.example.lab1_tech1_zad2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController
{
    @FXML
    private Label welcomeText;
    public TextField field1;
    public int count = 0;

    public int obliczenie() {
        if (field1.getText().length() != 0) {
            count++;
            for (int i = 0; i < field1.getText().length(); i++) {
                if (field1.getText().charAt(i) == ' ') {

                    count++;
                }
            }

        }
        ;
        return count;
    };
    public void printamount ()
    {

       welcomeText.setText("Ilość swów: " + obliczenie());
        count =0;
    }


}