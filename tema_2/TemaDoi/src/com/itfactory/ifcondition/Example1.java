package com.itfactory.ifcondition;

import java.util.Scanner;

public class Example1 {
    /**
     * Se citeste un numar de la tastatura. Sa se afiseze un mesaj afirmativ daca numarul este mai mare ca 10
     * In caz contrar se va afisa un mesaj negativ.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar:");
        double numar = Double.parseDouble(scanner.nextLine());
        if (numar >= 10)
            System.out.println("Numarul introdus este mai mare ca 10.");
        else {
            System.out.println("Numarul introdus NU este mai mare ca 10.");
        }
    }
}


//package com.itfactory.ifcondition;
//
//import java.util.Scanner;
//
//public class Example1
//{
//    /**
//     * Se citeste un numar de la tastatura. Sa se afiseze un mesaj afirmativ daca numarul este mai mare ca 10
//     * In caz contrar se va afisa un mesaj negativ.
//     * @param args
//     */
//    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner(System.in);
//    }
//}