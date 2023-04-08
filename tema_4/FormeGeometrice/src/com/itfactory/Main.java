package com.itfactory;

public class Main {
    public static void main(String[] args) {

        Triunghi triunghi = new Triunghi();
        System.out.println(triunghi);  //afiseaza hashcode-ul

        //setam dimensiunile, intrucat constructorul nostru a fost definit fara parametrii si pentru a nu mai afisa hashcodul anterior
        triunghi.setCateta1(3.00);
        triunghi.setCateta2(5.60);
        triunghi.setIpotenuza(7.20);

        //putem afisa in consola fiecare latura
        System.out.println("Dimensiune ipotenuza: " + triunghi.getIpotenuza());
        System.out.println("Dimensiune cateta 1: " + triunghi.getCateta1());
        System.out.println("Dimensiune cateta 2: " + triunghi.getCateta2());


        double perimetru = triunghi.calculeazaPerimetrul();
        System.out.println("Perimetrul triunghiului este: " + perimetru);


        System.out.println();
        System.out.println();
        Patrat patrat = new Patrat(5.60);

        //apelarea metodei cu tip de return double:
        double perimetruPatrat = patrat.calculezaPerimetru();
        System.out.println("Perimetrul patratului este: " + perimetruPatrat);
        double ariaPatratului=patrat.calculeazaAriaPatratului();
        System.out.println("Aria patratului este: "+ariaPatratului);

        //apelarea metodei cu tip de return void:
        patrat.calculeazaAriaPatrat();
        patrat.calculeazaPerimetrulPatratului();

        System.out.println();
        System.out.println();
        //instantierea obiectului de tip dreptunghi
        Dreptunghi dreptunghi = new Dreptunghi(20, 10.10);


        //apelarea metodei cu tip de return void:
        dreptunghi.arieDreptunghi();
        dreptunghi.perimetruDreptunghi();


        //apelarea metodelor cu tip de return double:
        double perimetrulDreptunghi = dreptunghi.calculeazaPerimetrulDreptunghi();
        System.out.println("Perimetrul dreptunghiului este: " + perimetrulDreptunghi);

        double ariaDreptunghi = dreptunghi.calculeazaAriaDreptunghi();
        System.out.println("Aria dreptunghiului este: " + ariaDreptunghi);


    }
}
