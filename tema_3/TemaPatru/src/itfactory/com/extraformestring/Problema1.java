package itfactory.com.extraformestring;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
//        1. Write a Java program to get the character at the given index within the String

        Scanner sc=new Scanner(System.in);
        System.out.println("Introdu un text:");
        String text=sc.nextLine();
        char result1=text.charAt(0);
        char result2=text.charAt(4);
        char result3=text.charAt(text.length()-1);
        char result4=text.charAt(text.length()-6);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }


}
