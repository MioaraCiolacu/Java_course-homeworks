package com.itfactory;

import com.itfactory.componente.CutieDeViteze;
import com.itfactory.componente.Motor;

public class Reparatie {
    private String marcaProductie;
    private double costReparatie;
    private Motor motor;
    private CutieDeViteze cutieDeViteze;


    public Reparatie(String marcaProductie, double costReparatie, Motor motor, CutieDeViteze cutieDeViteze) {
        this.marcaProductie = marcaProductie;
        this.costReparatie = costReparatie;
        this.motor = motor;
        this.cutieDeViteze = cutieDeViteze;
    }


    //varianta fara getter:

    public void egalitateMarcaProductieMotor() {
        if (marcaProductie.equalsIgnoreCase(motor.marcaProductieMotor())) {
            System.out.println("Avem aceeasi marca la motor. Pretul de reparatie este de " + costReparatie + " lei.");
        } else {
            System.out.println("Marcile nu sunt identice la motor.");
        }
    }

    //varianta in care am folosit getter:
//    public void egalitateMarcaProductieMotor() {
//        if (marcaProductie.equalsIgnoreCase(motor.getMarcaProductie())) {
//            System.out.println("Avem aceeasi marca la motor. Pretul de reparatie este de " + costReparatie + " lei.");
//        } else {
//            System.out.println("Marcile nu sunt identice la motor.");
//        }
//    }




    //varianta cu getter:
//    public void egalitateMarcaProductieCutieDeViteze() {
//
//        if (marcaProductie.equalsIgnoreCase(cutieDeViteze.getMarcaProductie()) && cutieDeViteze.isAutomata()) {
//            System.out.println("Pretul de reparatie final pentru cutia de viteze automata este de " + (costReparatie + 2150.75) + " lei");
//        } else if (marcaProductie.equalsIgnoreCase(cutieDeViteze.getMarcaProductie()) && !(cutieDeViteze.isAutomata()))
//            System.out.println("Pretul de reparatie la cutia de viteze manuala este de " + costReparatie + " lei.");
//        else {
//            System.out.println("Marcile nu sunt identice.Costul de productie nu poate fi stabilit. Componente gresite");
//
//        }
//    }

//varianta fara getter
    public void egalitateMarcaProductieCutieDeViteze() {

        if (marcaProductie.equalsIgnoreCase(cutieDeViteze.marcaProductieCutieViteza()) && cutieDeViteze.isAutomata()) {
            System.out.println("Pretul de reparatie final pentru cutia de viteze automata este de " + (costReparatie + 2150.75) + " lei");
        } else if (marcaProductie.equalsIgnoreCase(cutieDeViteze.marcaProductieCutieViteza()) && !(cutieDeViteze.isAutomata()))
            System.out.println("Pretul de reparatie la cutia de viteze manuala este de " + costReparatie + " lei.");
        else {
            System.out.println("Marcile nu sunt identice.Costul de productie nu poate fi stabilit. Componente gresite");

        }
    }
}
