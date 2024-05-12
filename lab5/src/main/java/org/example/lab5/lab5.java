package org.example.lab5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.Console;
import java.io.IOException;
import java.util.*;

public class lab5 extends Application {
    @Override
    public void start(Stage stage) throws IOException {}
    public static void main(String[] args) {
        //Zadanie 1 Lab5
        System.out.println("\n Zadanie 1 Lab 5");
        Interfejs1 funk1 = (x,y) -> x + y;
        System.out.println("Odp: "+ funk1.operation(5,5));

        //Zdanie 2 Lab5
        System.out.println("\n Zadanie 2 Lab 5");
        //Tworzenie listy
        ArrayList<Integer> liczbyLista = new ArrayList<Integer>();
        liczbyLista.add(1);
        liczbyLista.add(2);
        liczbyLista.add(3);
        liczbyLista.add(4);
        liczbyLista.add(50);
        liczbyLista.add(60);
        //Tworzenie pętli wypisywania wartości
        for (int i = 0; i<liczbyLista.size(); i+=2)
        {
            System.out.println("Element (liczba) o indeksie "+ i +" z listy liczbyLista = " + liczbyLista.get(i));
        };

        //Zadanie 3 Lab5
        System.out.println("\n Zadanie 3 Lab 5");
        ArrayList<Integer> listaHelp = new ArrayList<Integer>();
        for (int i = 0; i<liczbyLista.size(); i+=2)
        {
            listaHelp.add(liczbyLista.get(i));
        };
        System.out.println("Największa wartość elementa (liczby) z listy liczbyLista o parzystym indeksie = "+ Collections.max(listaHelp));

        //Zadanie 4 Lab5
        System.out.println("\n Zadanie 4 Lab 5");
        Scanner inputItem = new Scanner(System.in);
        System.out.println("Podaj index minimalny: ");
        int minNum = inputItem.nextInt();
        System.out.println("Podaj index maksymalny: ");
        int maxNum = inputItem.nextInt();
        for(int i = minNum; i != maxNum; i++)
        {System.out.println("Wartość elementa (liczby) o indeksie " + i +" z listy liczbyLista = " + liczbyLista.get(i));}

        //Zadanie 5 Lab 5
        System.out.println("\n Zadanie 5 Lab 5");
        Map<Date,String> ludzi = new HashMap<Date,String>();
        ludzi.put(new Date(2005,00,15), "Nikita");
        ludzi.put(new Date(2005,00,16), "Anton");
        ludzi.put(new Date(2006,00,17), "Michal");
//        System.out.println(ludzi.);





        System.exit(0);
    }
}