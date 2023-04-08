package com.itfactory;

public class Produs {
    private String nume;
    private double pret;
    private double discount;

    public Produs(String nume, double pret, int discount) {
        this.nume = nume;
        this.pret = pret;
        this.discount = discount;
    }


    public double pretCuDiscountProdus(){
        double pretFinal=pret-pret*(discount/100);
        return (pretFinal);
    }

    public double getPret() {
        return pret;
    }
}
