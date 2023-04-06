package com.itfactory.forcondition;

import java.util.Random;

public class Example2 {
    /**
     * Sa se creeze un program in care se vor parcurge numerele de la 0 la 19
     * La fiecare iteratie, se va genera un numar random x intre 0 si 20
     * Se va verifica conditia daca indexul adunat cu numarul generat random este 30, se va afisa un mesaj de match.
     * <p>
     * Exemplu: la indexul 12 s-a generat numarul x=18. Prin urmare 12 + 18 = 30
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            System.out.println("Numarul din bucla for:" + i);
            int nr = random.nextInt(21);
            System.out.println("Numarul random generat este: " + nr);

            if ((i + nr) == 30) {

                System.out.println("AM gasit un match: " + i + " : " + nr);
            } else {
                System.out.println("Nu am gasit niciun match.");
            }

        }

    }
}

//package com.itfactory.forcondition;
//
//        import java.util.Random;
//
//public class Example2
//{
//    /**
//     * Sa se creeze un program in care se vor parcurge numerele de la 0 la 19
//     * La fiecare iteratie, se va genera un numar random x intre 0 si 20
//     * Se va verifica conditia daca indexul adunat cu numarul generat random este 30, se va afisa un mesaj de match.
//     *
//     * Exemplu: la indexul 12 s-a generat numarul x=18. Prin urmare 12 + 18 = 30
//     * @param args
//     */
//    public static void main(String[] args)
//    {
//        Random random = new Random();
//        for(;;)
//        {
//            if ((i + x) == 30)
//            {
//                System.out.println("Am gasit un match: " + i + " : " + x);
//            }
//        }
//    }
//}
