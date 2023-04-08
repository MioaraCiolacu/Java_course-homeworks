package com.itfactory;

public class Dreptunghi {
    private double lungimeDreptunghi;
    private double latimeDreptunghi;


    //am creat constructor cu 2 parametrii
    public Dreptunghi(double lungimeDreptunghi, double latimeDreptunghi) {
        this.latimeDreptunghi = latimeDreptunghi;
        this.lungimeDreptunghi = lungimeDreptunghi;
    }


    //creare metode cu tip de return double
    public double calculeazaPerimetrulDreptunghi() {
        double perimetrulDreptunghi = 2 * lungimeDreptunghi + 2 * latimeDreptunghi;
        return perimetrulDreptunghi;
		//sau return 2 * lungimeDreptunghi + 2 * latimeDreptunghi;
    }


    public double calculeazaAriaDreptunghi() {
        double ariaDreptunghi = lungimeDreptunghi * latimeDreptunghi;
        return ariaDreptunghi;
		//sau return lungimeDreptunghi * latimeDreptunghi;
    }


    //creare metode cu tip de return void

    public void perimetruDreptunghi() {
        System.out.println("Perimetru este egal cu " + (2 * this.latimeDreptunghi + 2 * this.lungimeDreptunghi));
    }

    public void arieDreptunghi() {
        System.out.println("Aria este egala cu " + (lungimeDreptunghi * latimeDreptunghi));
    }
}
