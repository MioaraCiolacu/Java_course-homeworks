package com.itfactory.primitive;

import java.math.BigDecimal;
import java.util.Scanner;

/***
 * Creati un program simplu in care sa calculati si sa afisati perimetrul unui triunghi
 *  Pentru aceasta va trebui sa definiti variabilele necesare si sa afisati rezultatul
 * System.out.println("Perimetrul triunghiului este: " + perimetruTriunghi);
 *
 * Ce este perimetrul unui triunghi?
 *** Este suma lungimilor laturilor
 */

public class Primitive5 {

    public static void main(String[] args) {

        int laturaUnu = 25;
        int lauraDoi = 15;
        int laturaTrei = 32;
        int perimetruTriunghi = laturaUnu + lauraDoi + laturaTrei;
        System.out.println("Perimetrul triunghiului este: " + perimetruTriunghi);
        System.out.println();

        //sau

        double latUnu = 3.1;
        double latDoi = 4.5;
        double latTrei = 5.3;
        double perim = latUnu + latDoi + latTrei;
        System.out.println("Perimetrul triunghiului este: " + perim);
        System.out.println();

        //sau pentru valori exacte dupa virgula, sa facem prin clasa BigDecimal

        System.out.println();
        BigDecimal latUnu1 = BigDecimal.valueOf(3.1);
        BigDecimal latDoi2 = BigDecimal.valueOf(4.5);
        BigDecimal latTrei3 = BigDecimal.valueOf(5.3);
        BigDecimal perim2 = latUnu1.add(latDoi2).add(latTrei3);
        System.out.println("Perimetrul triunghiului este: " + perim2);

        //sau

        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu prima lungime de latura: ");
        double nr = Double.parseDouble(sc.nextLine());
        System.out.print("Introdu a doua lungime de latura: ");
        double nr2 = Double.parseDouble(sc.nextLine());
        System.out.print("Introdu a treia lungime de latura: ");
        double nr3 = Double.parseDouble(sc.nextLine());
        double perimTriunghi = nr + nr2 + nr3;
        System.out.println("Perimetrul triunghiului este: " + perimTriunghi);
        System.out.println();

        //sau

        double suma = 0;
        for (int i = 1; i <=3; i++) {
            System.out.print("Introdu lungimea de latura " + i + ":");
            double nrDouble = Double.parseDouble(sc.nextLine());
            suma += nrDouble;
        }
        System.out.println("Perimetrul triunghiului este: " + suma);


    }
}