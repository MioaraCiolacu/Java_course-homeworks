package com.itfactory;

public class Patrat {
    private double latura;

    public Patrat(double latura) {
        this.latura = latura;    //constructorul cu 1 parametru
    }

    //Varianta 1: metode care returneaza ceva
    public double calculezaPerimetru() {
        double perimetruPatrat = 4 * latura;
        return perimetruPatrat;
		//sau return 4 * latura;
    }

    public double calculeazaAriaPatratului() {
        double ariaPatratului = latura * latura;
        return ariaPatratului;
		//sau return latura * latura;
    }

    //Varianta 2: metode care imi afiseaza ceva
    public void calculeazaAriaPatrat() {
        System.out.println("Aria patratului este: " + (latura * latura));
    }

    public void calculeazaPerimetrulPatratului() {
        System.out.println("Perimetrul patratului este: " + (4 * latura));
    }
}
