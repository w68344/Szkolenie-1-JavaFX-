package org.example.lab1_tech1_w68344;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import java.lang.Integer;


public class CalkulatorController {
    //declaracja zmiennych dla controllera
    public int liczba1;
    public int liczba2;
    public int action;
    public int wynik;
    public Button butnDodawanie;
    public Button butnMnozenie;
    public Button butnOdejmowanie;
    public Button btnObliczenie;
    public Label lbl1;
    public TextField textFieldl1;
    public TextField textFieldl2;
    //Odzytywanie liczb z pola tekstowego 1
    public int zaplicz1()
    {
        //Obsługa wyjątków tekstowuch
        try
        {
            liczba1 = Integer.valueOf(textFieldl1.getText());
        }
        catch (NumberFormatException e)
        {
            lbl1.setText("Zostły podane niepoprawnw danne");
        }
        return liczba1;
    };
    //Odzytywanie liczb z pola tekstowego 1
    public int zaplicz2()
    {
        //Obsługa wyjątków tekstowuch
        try
        {
            liczba2 = Integer.valueOf(textFieldl2.getText());

        }
        catch (NumberFormatException e)
        {
            lbl1.setText("Zostły podane niepoprawnw danne");
        }
        return liczba2;
    };
    //Wybór akcji
    @FXML
    public int choseAktion()
    {
        butnDodawanie.setOnAction(e -> action = 1 );
        //Liczba 1 dla zmiennej (action) oznacza dodawanie
        butnMnozenie.setOnAction(e -> action = 2);
        //Liczba 2 dla zmiennej (action) oznacza mnożenie
        butnOdejmowanie.setOnAction(e-> action = 3);
        //Liczba 3 dla zmiennej (action) oznacza odejmowanie
        return action;
    };
    //Obliczenie i przekazywanie wynniku do końciwej zmiennej
    @FXML
    public int obliczenie()
    {
        if(action == 1)
            wynik = zaplicz1() + zaplicz2();
        if (action ==2)
            wynik = zaplicz1() * zaplicz2();
        if (action ==3)
            wynik = zaplicz1() - zaplicz2();
        else lbl1.setText("Błąd obliczenia");
        return wynik;

    };
    //Wypisywanie liczby na monitorze dla użytkownika
    @FXML
    public void butnprint() {
        btnObliczenie.setOnAction(event -> lbl1.setText("Wynik działania: " + obliczenie()));
    }




}
