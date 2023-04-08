package com.itfactory;

public class IngrijirePersonala extends Produs {



    private boolean returnare;

    public IngrijirePersonala(String nume, double pret, int discount, boolean returnare) {
        super(nume, pret, discount);
        this.returnare = returnare;
    }

    public boolean isReturnare() {
        return returnare;
    }
}
