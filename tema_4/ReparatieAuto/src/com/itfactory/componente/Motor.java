package com.itfactory.componente;

public class Motor {


    private String marcaProductie;
    private int capacitateMotor;
    private double pretDeVanzare;


    public Motor(String marcaProductie, int capacitateMotor, double pretDeVanzare) {
        this.marcaProductie = marcaProductie;
        this.capacitateMotor = capacitateMotor;
        this.pretDeVanzare = pretDeVanzare;
    }

    public String marcaProductieMotor(){
        return marcaProductie;
    }



    public String getMarcaProductie() {
        return marcaProductie;
    }
}
