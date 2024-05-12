package org.example.lab5;

import java.util.ArrayList;
public class danne {
    private ArrayList<Integer> liczby = new ArrayList<Integer>();

     // Domyślna metoda wpisywania dannych ktora została zastępiona interfejsem C:\Users\nikit\Desktop\lab5\src\main\java\org.example.lab5\I1
      public void setLiczby(Integer liczba) {this.liczby.add(liczba);}

    public Integer getLiczby(Integer Index) {
        return this.liczby.get(Index);
    }
    danne(){};
}
