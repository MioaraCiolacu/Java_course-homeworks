package com.itfactory.whilecondition;

import java.util.Scanner;

public class Example1 {
    /**
     * Sa se citeasca de la tastatura numere pana la introducerea numarului 0.
     * Se cere sa se foloseasca bucla while.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Introdu numarul: ");
            int numarIntrodus = Integer.parseInt(scanner.nextLine());
            System.out.println("Am citit: " + numarIntrodus);
            if (numarIntrodus == 0) {
                break;
            }

        }
        System.out.println("S-a introdus numarul 0. Ies din bucla");
    }
}


//package com.itfactory.whilecondition;
//
//import java.util.Scanner;
//
//public class Example1
//{
//    /**
//     * Sa se citeasca de la tastatura numere pana la introducerea numarului 0.
//     * Se cere sa se foloseasca bucla while.
//     * @param args
//     */
//    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner(System.in);
//        int x;
//        System.out.print("Introdu numarul: ");
//        while( ) {
//            System.out.println("Am citit: " + x);
//            System.out.print("Introdu numarul: ");
//        }
//        System.out.println("S-a introdus numarul 0. Ies din bucla");
//    }
//}