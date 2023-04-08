package com.itfactory.ifcondition;

import java.util.Random;

public class Example2 {
    /**
     * Sa se genereze doua numere random intre 0 si 50
     * Daca suma acestor numere depaseste 70 se va afisa un mesaj "Suma <suma> mai mare decat 70"
     * Daca suma acestor numere este egala cu 70 se va afisa un mesaj "Suma <suma> egala cu 70"
     * Daca suma acestor numere este mai mica decat 70 se va afisa un "Suma <suma> mai mica decat 70"
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();

        int numarGenerat1 = random.nextInt(0, 51);
        int numarGenerat2 = random.nextInt(0, 51);
        System.out.println(numarGenerat1);
        System.out.println(numarGenerat2);
        int suma = numarGenerat1 + numarGenerat2;
        if (suma > 70) {
            System.out.println("Suma " + suma + " este mai mare decat 70");
        } else if (suma < 70) {
            System.out.println("Suma " + suma + " este mai mica decat 70");
        } else {
            System.out.println("Suma " + suma + " este egala cu 70");
        }
    }

}

//package com.itfactory.ifcondition;
//
//import java.util.Random;
//
//public class Example2
//{
//    /**
//     * Sa se genereze doua numere random intre 0 si 50
//     * Daca suma acestor numere depaseste 70 se va afisa un mesaj "Suma <suma> mai mare decat 70"
//     * Daca suma acestor numere este egala cu 70 se va afisa un mesaj "Suma <suma> egala cu 70"
//     * Daca suma acestor numere este mai mica decat 70 se va afisa un "Suma <suma> mai mica decat 70"
//     *
//     * @param args
//     */
//    public static void main(String[] args)
//    {
//        Random random = new Random();
//
//        int suma = x + y;
//        if ()
//        {
//            System.out.println("Suma " + suma + " este mai mare decat 70");
//        }
//        else if ()
//        {
//            System.out.println("Suma " + suma + " este mai mica decat 70");
//        }
//
//            System.out.println("Suma " + suma + " este egala cu 70");
//    }
//}
