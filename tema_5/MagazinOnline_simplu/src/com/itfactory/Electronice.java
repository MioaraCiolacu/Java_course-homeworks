package com.itfactory;

public class Electronice extends Produs{



    private int voltaj;

    public Electronice(String nume, double pret, int discount, int voltaj) {
        super(nume, pret, discount);
        this.voltaj = voltaj;
    }

}
