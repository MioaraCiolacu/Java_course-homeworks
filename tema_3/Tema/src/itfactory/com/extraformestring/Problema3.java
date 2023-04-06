package itfactory.com.extraformestring;

import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        //7. Write a Java program to concatenate a given string to the end of another string.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu o propozitie: ");
        String propozitie1 = sc.nextLine();

        System.out.print("Introdu o propozitie: ");
        String propozitie2 = sc.nextLine();
        String text=propozitie1.concat(propozitie2);
        System.out.println(text);
    }
}
