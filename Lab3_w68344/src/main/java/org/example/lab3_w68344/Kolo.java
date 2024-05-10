package org.example.lab3_w68344;

public class Kolo extends Figura{
    private int promien;

    public void setPromien(int Promien) {
        this.promien = Promien;
    }

    @Override
    public double pole()
    {
        return 3.14*(promien^2);
    }

    @Override
    public void info() {
        System.out.println("Radius kola = "+promien);
        System.out.println("Powierchnia kola = "+pole());
    }

    Kolo(int radius){
this.promien = radius;
    };
}
