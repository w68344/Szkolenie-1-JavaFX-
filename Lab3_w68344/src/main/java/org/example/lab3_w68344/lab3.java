package org.example.lab3_w68344;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;

public class lab3 extends Application {
    @Override
    public void start(Stage stage) throws IOException {}

    public static void main(String[] args) {
        System.out.println("Lab3 w68344");
        //Zadanie 10.2 from lab3-4
        //Tworzenie niwych ojektów
        Prostokat P1 = new Prostokat(5, 5);
        Prostokat P2 = new Prostokat(6, 9);
        //Sprawzenie dziaanie metod
        System.out.println("\nSprawzenie dziaanie metod");
        P1.info();
        P2.info();
        P2.pole();
        P2.setBokA(1);
        P1.setBokB(1);
        P1.info();
        P2.info();
        //Zadanie 10.4 from lab3-4
        //Sprawdzenie dziaania polimorfizmu
        System.out.println("\nSprawdzenie dziłania polimorfizmu");
        Kolo kolo1 = new Kolo(5);
        kolo1.info();
        //Zadanie 10.5 from lab3-4
        //tworzenie kolekcji objektów
        System.out.println("\nTworzenie kolekcji objektów");
        ArrayList<Figura> listFigur = new ArrayList<Figura>();
        listFigur.add(new Kolo(3));
        listFigur.add(new Kolo(1));
        listFigur.add(new Prostokat(3,3));
        listFigur.add(new Prostokat(1,1));
        //Zadanie 10.6 from lab3-4
        //Logika wyszukiwania objektów
        System.out.println("\nOdanleżenie figury o powierchni wększej od 5");
        System.out.println("\nTakie figury to są: ");
        int liczbaFigur = 1;
        for (int i = 0; i < listFigur.size();i++)
        {
            if(listFigur.get(i).pole()>5)
            {

                System.out.println("\nFigura "+ liczbaFigur +" to:");
                System.out.println("Typ figury: "+listFigur.get(i).getClass());
                listFigur.get(i).info();
                liczbaFigur++;

            }
            else {
                int ii = 0;
                if(ii == listFigur.size()) {
                    System.out.println("Nie znależono takich objektów");

                }

            }

        }

    }
}