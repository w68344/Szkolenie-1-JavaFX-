package org.example.lab3_w68344;
//Zadanie 10.1 from lab3-4
public class Prostokat extends Figura
{
    //inicjacja zmienych
    private int bokA = 0;
    private int bokB = 0;
    //dodanie seterow i geterow
    public int getBokA()
    {
        return this.bokA;
    }
    public int setBokA(int BokA)
    {
        this.bokA = BokA;
        return BokA;
    }
    public  int getBokB()
    {
        return this.bokB;
    }
    public int setBokB(int BokB)
    {
        this.bokB = BokB;
        return BokB;
    }
    //Construktor clasy Prostokat
    public Prostokat(int BokA,int BokB)
    {
        this.bokA = BokA;
        this.bokB = BokB;
    }
    //Metody klasy
    @Override
    public  void info()
    {
        System.out.println("Wysokość prostokąta " + "= "+getBokA()+" Szerokość prostokąta = " + getBokB()+ "\nPole figury to: "+ pole());
    }
    @Override
    public double pole()
    {
       return bokA * bokB;
    }

}
