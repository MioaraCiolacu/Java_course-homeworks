package com.itfactory.ifcondition;

import java.util.Random;

public class Example3 {
    /**
     * Vreau sa verific daca un numar este intre 1 si 25, intre 25 si 50, intre 50 si 75 sau intre 75 si 100
     * 1.....25......50......75.....100 ?
     */
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(101);
       // System.out.println(randomInt);       pot face pentru verificarea codului de mai jos, sa imi arate ce numar s-a generat

        if (randomInt < 25) {
            System.out.println("Numarul generat este intre 1 si 25");

        } else if (randomInt >= 25 && randomInt < 50) {
            System.out.println("Numarul generat este intre 25, inclusiv, si 50");
        } else if (randomInt >= 50 && randomInt < 75) {
            System.out.println("Numarul generat este intre 50, inclusiv, si 75");
        }else {
            System.out.println("Numarul generat este intre 75, inclusiv, si 100");
        }


    }
}


//ackage com.itfactory.ifcondition;
//
//import java.util.Random;
//
//public class Example3
//{
//    /**
//    Vreau sa verific daca un numar este intre 1 si 25, intre 25 si 50, intre 50 si 75 sau intre 75 si 100
//    1.....25......50......75.....100 ?
//     */
//    public static void main(String[] args)
//    {
//        Random random = new Random();
//        int randomInt = random.nextInt(100);
//
//        if(randomInt >= 50) {
//
//        } else {
//
//        }
//    }
//}