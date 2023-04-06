package com.itfactory.forcondition;

import java.util.Random;

public class Example3 {
    /**
     * Sa se creesze un program prin care se genereaza doua numere int random (o limita inferioara si o limita superioara)
     * intre un anumit interval
     * (De ex intre 0 si 30)
     * In acest program se va verifica daca numarul generat limita inferioara este mai mic decat limita superioara se
     * vor afisa numerele dintre aceste valori>
     *
     * Exemplu:
     * limitaInferioara = 7 | limitaSuperioara = 12 -> Output: 7 8 9 10 11 12
     */
    public static void main(String[] args) {
        Random random = new Random();

        int limitaInferioara = random.nextInt(0, 31);  //nr intre  si 30
        int limitaSuperioara = random.nextInt(0, 31);//nr intre 0 si 30

        System.out.println(limitaInferioara);
        System.out.println(limitaSuperioara);

        if (limitaInferioara < limitaSuperioara)
        {
            System.out.println("S-a indeplinit conditia: limita inferioara:<" + limitaInferioara +"> | limita superioara <" + limitaSuperioara + ">");
            for (int i = limitaInferioara; i <=limitaSuperioara; i++) {
                System.out.print(" " + i + " ");
            }

        } else {
            System.out.println("Nu s-a indeplinit conditia: limita inferioara:<" + limitaInferioara +"> | limita superioara <" + limitaSuperioara + ">");
        }

    }
}

//package com.itfactory.forcondition;
//
//import java.util.Random;
//
//public class Example3
//{
//    /**
//     * Sa se creesze un program prin care se genereaza doua numere int random (o limita inferioara si o limita superioara) intre un anumit interval
//     * (De ex intre 0 si 30)
//     * In acest program se va verifica daca numarul generat limita inferioara este mai mic decat limita superioara se vor afisa numerele dintre aceste valori>
//     * Exemplu:
//     * limitaInferioara = 7 | limitaSuperioara = 12 -> Output: 7 8 9 10 11 12
//     */
//    public static void main(String[] args)
//    {
//        Random random = new Random();
//        int limitaInferioara;
//        int limitaSuperioara;
//        if (limitaInferioara < limitaSuperioara)
//        {
//            System.out.println("S-a indeplinit conditia: limita inferioara:<" + limitaInferioara +"> | limita superioara <" + limitaSuperioara + ">");
//            for (;;)
//            {
//                System.out.print(" " + i + " ");
//            }
//        } else {
//            System.out.println("Nu s-a indeplinit conditia: limita inferioara:<" + limitaInferioara +"> | limita superioara <" + limitaSuperioara + ">");
//        }
//
//    }
//}
