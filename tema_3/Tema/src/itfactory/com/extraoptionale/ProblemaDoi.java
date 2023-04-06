package itfactory.com.extraoptionale;

import java.util.Scanner;

public class ProblemaDoi {
    public static void main(String[] args) {
//        1. Se citeşte un şir. Să se afişeze dacă primul caracter este egal cu
//                *    ultimul caracter

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu un text:");
        String text = sc.nextLine();

        char text1 = text.charAt(0);
        char text2 = text.charAt(text.length() - 1);

        System.out.println(text1);
        System.out.println(text2);

        if (text1 == text2) {
            System.out.println("TRUE");
        } else
            System.out.println("FALSE");

    }
}
