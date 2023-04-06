package com.itfactory.whilecondition;

import java.util.Random;

public class Example2 {
    /**
     * Se se genereze numere intr-o bucla, intre 0 si 100 pana cand numarul este mai mic decat 50
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            int numarGenerat = random.nextInt(101);
            System.out.println("S-a generat numarul " + numarGenerat);

            if (numarGenerat > 50) {
                System.out.println("Numarul introdus este mai mare decat 50, prin urmare se va mai genera un nou numar.");
            } else {
                System.out.println("Numarul introdus este mai mic ca 50. Bucla se va termina.");
                break;
            }
        }

    }
}