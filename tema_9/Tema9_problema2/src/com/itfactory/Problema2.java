package com.itfactory;

import java.util.Scanner;

public class Problema2 {
    //Problema 2.
    //Sa se creeze un program simplu in care se va crea o metoda (in acceeasi clasa cu metoda main).
    //Metoda va primi ca parametru un array de numere (int).
    //Daca numerele din array nu sunt in ordine consecutiva se va arunca o exceptie.
    //Exemplu:
    //{5,6,7,8} - nu va arunca exceptie.
    //{5,6,9,8} - va arunca exceptie.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti lungimea array-ului: ");
        int lungime = Integer.parseInt(sc.nextLine());
        int[] elemente = new int[lungime];
        System.out.println("Introduceti elementele in array rand pe rand:");

        for (int i = 0; i < lungime; i++) {
            int elementeArray = Integer.parseInt(sc.nextLine());
            elemente[i] = elementeArray;
        }

        try {
            verificaNumereleConsecutive(elemente);
            System.out.println("Numere consecutive");
        } catch (NumereConsecutiveException e) {
            System.out.println("Numere neconsecutive");
            e.printStackTrace();
        } finally {
            System.out.println("Ai creat un array de " + lungime + " elemente.");
        }

    }


    public static void verificaNumereleConsecutive(int[] elemente) throws NumereConsecutiveException {
        for (int i = 0; i < elemente.length - 1; i++) {
            if (elemente[i] != elemente[i + 1] - 1) {
                throw new NumereConsecutiveException("Numerele nu sunt consecutive");
            }
        }
    }
}



