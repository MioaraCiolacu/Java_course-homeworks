package itfactory.com.extraformestring;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        //5. Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if
        // they are the same length and contain the same characters in the same positions.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti primul text: ");
        String text1 = sc.nextLine();
        System.out.print("Introduceti al doilea text: ");
        String text2 = sc.nextLine();
//        boolean egalitate=text1.equals(text2);
//        System.out.println(egalitate);

        int result = text1.compareToIgnoreCase(text2);  //va lua in calcul si spatiile goale
        if (result < 0) {
            System.out.println(text1 + " e mai mic decat " + text2);
        } else if (result == 0) {
            System.out.println(text1 + " este egal cu " + text2);
        } else
            System.out.println(text1 + " e mai mare decat " + text2);
    }
}
