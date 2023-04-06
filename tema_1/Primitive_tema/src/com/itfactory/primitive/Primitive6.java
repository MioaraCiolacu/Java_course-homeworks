package com.itfactory.primitive;


import java.util.Scanner;

/***
 * Creati un program simplu in care sa calculati si sa afisati aria unui dreptunghi.
 * Pentru aceasta va trebui sa definiti variabilele necesare si sa afisati rezultatul
 * System.out.println("Aria dreptunghiului este: " + arieDreptunghi);
 *
 * Ce este aria unui dreptunghi?
 *** Este produsul lungimii si al latimii
 */
public class Primitive6 {
    public static void main(String[] args) {

        int laturaScurta = 20;
        int laturLunga = 25;
        System.out.println("Aria dreptunghiului este " + laturLunga * laturaScurta);

        //sau

        double lungime = 5.1;
        double latime = 2.6;
        double arieDreptunghi = lungime * latime;
        System.out.println("Aria dreptunghiului este " + arieDreptunghi);
        System.out.println();

        //sau

        Scanner cititor = new Scanner(System.in);
        System.out.println("Introdu lungimea dreptunghiului: ");
        double lung = Double.parseDouble(cititor.nextLine());
        System.out.println("Introdu latimea dreptunghiului: ");
        double lat = Double.parseDouble(cititor.nextLine());
        double arieDrept = lung * lat;
        System.out.println("Aria dreptunghiului este " + arieDrept);


        //sau
        double produs = 1;
        for (int i = 0; i < 2; i++) {
            System.out.print("Introdu marimea muchiei: ");
            double nrDouble = Double.parseDouble(cititor.nextLine());
            produs *= nrDouble;
        }
        System.out.println("Aria triunghiului este: " + produs);

    }
}