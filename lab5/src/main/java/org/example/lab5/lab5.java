package org.example.lab5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.Console;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class lab5 extends Application {
    @Override
    public void start(Stage stage) throws IOException {}
    public static void main(String[] args) {
        //Zadanie 1 Lab5
        System.out.println("\n Zadanie 1 Lab 5");
        Interfejs1 funk1 = (x, y) -> x + y;
        System.out.println("Odp: " + funk1.operation(5, 5));

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
        for (int i = 0; i < liczbyLista.size(); i += 2) {
            System.out.println("Element (liczba) o indeksie " + i + " z listy liczbyLista = " + liczbyLista.get(i));
        }
        ;

        //Zadanie 3 Lab5
        System.out.println("\n Zadanie 3 Lab 5");
        ArrayList<Integer> listaHelp = new ArrayList<Integer>();
        for (int i = 0; i < liczbyLista.size(); i += 2) {
            listaHelp.add(liczbyLista.get(i));
        }
        ;
        System.out.println("Największa wartość elementa (liczby) z listy liczbyLista o parzystym indeksie = " + Collections.max(listaHelp));

        //Zadanie 4 Lab5
//        System.out.println("\n Zadanie 4 Lab 5");
        Scanner inputItem = new Scanner(System.in);
//        System.out.println("Podaj index minimalny: ");
//        int minNum = inputItem.nextInt();
//        System.out.println("Podaj index maksymalny: ");
//        int maxNum = inputItem.nextInt();
//        for(int i = minNum; i != maxNum; i++)
//        {System.out.println("Wartość elementa (liczby) o indeksie " + i +" z listy liczbyLista = " + liczbyLista.get(i));}

//        //Zadanie 5 Lab 5
//        System.out.println("\n Zadanie 5 Lab 5");
//        ArrayList<Osoby> listaOsob = new ArrayList<Osoby>();
//        listaOsob.add(new Osoby(new Date(2005-1900, 0, 15), "Nikita", "Riabchii"));
//        listaOsob.add(new Osoby(new Date(1980-1900, 5, 25), "Anton", "Wanko"));
//        listaOsob.add(new Osoby(new Date(2000-1900, 1, 7), "Piotr", "Dobry"));
//        listaOsob.add(new Osoby(new Date(2016-1900, 10, 12), "Anna", "Lilovicz"));
//        System.out.println("Wpisz minimalny rocznik od którego chcesz zobaczyć osób z listy listaOsob");
////        Ralizcja odczyty osobnych wartości
////        System.out.println("Podaj minimalny rok: ");
////        int minRok = inputItem.nextInt();
////        System.out.println("Podaj minimalny miesąć: ");
////        int minMies = inputItem.nextInt();
////        System.out.println("Podaj minimalny dzień: ");
////        int minDzien = inputItem.nextInt();
//        System.out.println("Podaj date bez spacji w formie RRRRMMDD: ");
//        String minDataStr = inputItem.next();
//        LocalDate minData = LocalDate.parse(minDataStr, DateTimeFormatter.BASIC_ISO_DATE);
//        Instant instant = Instant.from(minData.atStartOfDay(ZoneId.of("GMT")));
//        Date minDataTypeDate = Date.from(instant);
////        System.out.println(minDataTypeDate);
//
//        for (int i = 0; i<listaOsob.size();i++){
//            if (listaOsob.get(i).dataUrodzenia.after(minDataTypeDate)  ){
//                System.out.println("\nOsoba uridzona od "+minData+ " : "+"\nImie: "+ listaOsob.get(i).imie+ "\nNazwisko: "+ listaOsob.get(i).nazwisko + "\nData urodzenia: "+listaOsob.get(i).dataUrodzenia);
//
//            }
////            else System.out.println("Niedziała");
//
//    }
        //Zadanie 6 Lab 5
//        System.out.println("\n Zadanie 6 Lab 5");


//
//




        System.exit(0);
    }
}
