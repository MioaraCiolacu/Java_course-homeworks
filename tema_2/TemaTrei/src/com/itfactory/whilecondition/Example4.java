package com.itfactory.whilecondition;

import java.sql.SQLOutput;
import java.util.Random;

public class Example4 {
    /**
     * Se cere sa se creeze o bucla while prin care se genereaza cate un numar randon intre 1 si
     * 10 la fiecare iteratie.
     * In momentul in care s-a generat 5 se va iesi din bucla.
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            int number = random.nextInt(10 + 1);
            System.out.println("S-a generat numarul " + number);

            if (number == 5) {
                System.out.println("Am generat nr.5, deci vom opri instructiunea.");
                break;
            }
        }
    }
}
