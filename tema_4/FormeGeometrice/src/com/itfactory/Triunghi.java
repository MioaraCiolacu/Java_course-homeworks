package com.itfactory;

public class Triunghi {
    private double cateta1;
    private double cateta2;
    private double ipotenuza;

    public Triunghi(){
        //contructor fara parametrii
    }

    public double getCateta1(){
        return cateta1;
    }

    public void setCateta1(double cateta1) {
        this.cateta1 = cateta1;
    }

    public double getCateta2(){
        return cateta2;
    }

    public void setCateta2(double cateta2) {
        this.cateta2 = cateta2;
    }

    public double getIpotenuza(){
        return ipotenuza;
    }

    public void setIpotenuza(double ipotenuza) {
        this.ipotenuza = ipotenuza;
    }

    public double calculeazaPerimetrul(){
        double perimetru=cateta1+cateta2+ipotenuza;
        return perimetru;
		//sau return cateta1+cateta2+ipotenuza;
    }
}
