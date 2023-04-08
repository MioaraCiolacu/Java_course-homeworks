package com.itfactory.dowhilecondition;

import java.util.Scanner;

public class Example1 {
    /**
     * Se se implementeze un program in care se citeste un numar de la tastatura pana la introducerea numarului 0.
     * Fiecare numar citit se va afisa sub forma: S-a citit numarul <x>
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        do {
            System.out.print("Introduceti un numar: ");
            int numar = Integer.parseInt(scanner.nextLine());
            System.out.println("S-a citit numarul " + numar);
            count++;
            if (numar == 0) {
                break;
            }
        } while (true);

    }
}


//package com.itfactory.dowhilecondition;
//
//import java.util.Scanner;
//
//public class Example1
//{
//    /**
//     * Se se implementeze un program in care se citeste un numar de la tastatura pana la introducerea numarului 0.
//     * Fiecare numar citit se va afisa sub forma: S-a citit numarul <x>
//     *
//     */
//    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner(System.in);
//        do {
//            x = scanner.nextInt();
//        } while ();
//
//    }
//}