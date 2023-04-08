package com.itfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProblemaListe {
    public static void main(String[] args) {
        List<Integer> numere = new ArrayList<>();
        Random generator = new Random();
        System.out.println("Is list empty?: " + numere.isEmpty());
        int count = 0;
        while (true) {
            int numarGenerat = generator.nextInt(21); /// am pus sa se genereze nr de la 0 la 120
            numere.add(numarGenerat);
            if (numarGenerat == 10) {
                break;
            }
            if (numarGenerat == 5) {
                count++;
            }
            System.out.println("Generate numbers: " + numarGenerat);
        }

        System.out.println("Lista mea contine urmatoarele numere: " + numere);
        System.out.println("Is now my list empty?: " + numere.isEmpty());
        System.out.println("Numarul de aparitii ale lui 5 este: " + count);


    }

}
