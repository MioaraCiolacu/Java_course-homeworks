package com.itfactory;

import com.itfactory.componente.CutieDeViteze;
import com.itfactory.componente.Motor;

public class Main {
    public static void main(String[] args) {
        CutieDeViteze cutieDeViteze = new CutieDeViteze("Bosh", 2800, true);
        // CutieDeViteze cutieDeViteze = new CutieDeViteze("Bosh", 2800, false);         //exemplu cu false la cutie automata
        // CutieDeViteze cutieDeViteze = new CutieDeViteze("Boshh", 2800, false);      //exemplu cu marca diferita

        Motor motor = new Motor("Bosh", 2500, 2700);
        //   Motor motor = new Motor("Bossh", 2500, 2700);      //exemplu cu marca productie diferit

        Reparatie reparatie = new Reparatie("Bosh", 5000.50, motor, cutieDeViteze);
        //  Reparatie reparatie = new Reparatie("Boosh", 5000.50, motor, cutieDeViteze);  //exemplu cu marca productie diferit

        reparatie.egalitateMarcaProductieCutieDeViteze();
        reparatie.egalitateMarcaProductieMotor();

    }
}
