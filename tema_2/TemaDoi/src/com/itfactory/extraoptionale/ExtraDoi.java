package com.itfactory.extraoptionale;

import java.util.Scanner;

public class ExtraDoi {
    public static void main(String[] args) {
        //    2. Sa se citească de la tastatura numere de tip int pana userul introduce un număr negativ.
        //    In momentul în care introduce numărul negativ se va afișa suma numerelor precedente.


        //ExtraOptionaleDoi - Nu trebuie sa mai faci operatia cu numarul negativ (dar nu e nimic rau)

        Scanner sc = new Scanner(System.in);
        int suma = 0;

        while (true) {
            System.out.println("Introduceti un numar: ");
            int numar = Integer.parseInt(sc.nextLine());
            suma += numar;
            if (numar < 0) {
                suma-=numar;
                break;
            }
        }
        System.out.println("suma numerelor introduse este " + suma);
    }
}
