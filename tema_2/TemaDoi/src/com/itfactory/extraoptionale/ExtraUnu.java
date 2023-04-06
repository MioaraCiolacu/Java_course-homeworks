package com.itfactory.extraoptionale;

import java.util.Scanner;

public class ExtraUnu {
    public static void main(String[] args) {
        //   1. Sa se citească de la tastatura numere de tip int pana la întâlnirea lui 0. Sa se afișeze numerele care
        //   satisfac relația:  20 < 6x2 + 5x + 1 < 50.

        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            double numarIntrodus = Integer.parseInt(sc.nextLine());
            double expression = 6 * Math.pow(numarIntrodus, 2) + 5 * numarIntrodus + 1;

            if ((numarIntrodus == 0)) {
                System.out.println(numarIntrodus);
                break;
            } else if ((20 < expression && expression < 50)) {
                System.out.println(numarIntrodus);
                count++;
            } else {
                System.out.println("Nu indeplineste conditia.");
            }

        }
        System.out.println("Sunt " + count + " numere care indeplinesc conditia");


    }
}








