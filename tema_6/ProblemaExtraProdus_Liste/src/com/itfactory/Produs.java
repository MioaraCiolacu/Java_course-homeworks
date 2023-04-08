package com.itfactory;

public class Produs {
    //PROBLEMA6
    //Sa se creeze un program in Java pe baza urmatoarelor cerinte:
    //1. Se va creea o clasa Produs cu proprietatile denumire si pret. (stabiliti tipurile corect). Constructor cu parametri.
    // Generati metoda equals corespunzator dupa modelul de la curs.
    //2. Sa se creeze clasa Main cu metoda main in care se va creea o lista de produse. (Presupunem ca este stocul unui magazin)
    //3. Se da un numar int (n) citit de la tastatura care va determina cate produse se vor citi mai departe (la fel de la tastatura)
    //4. Mai departe se vor citi n produse de la tastatura. Daca in lista definita la punctul 2  produsul citit este deja,
    // se va afisa un mesaj, daca nu, se va adauga in lista..
    //5. Afisati lista finala.

    private String name;
    private double cost;

    public Produs(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public Produs(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
