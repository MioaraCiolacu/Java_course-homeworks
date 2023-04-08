package itfactory.com.extraformestring;

import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        //  8. Write a Java program to test if a given string contains the specified sequence of char values.
        Scanner sc=new Scanner(System.in);
        System.out.println("Introdu un text: ");
        String text=sc.nextLine();
        if(text.contains("ea")){
            System.out.println("Exista combinatia cautata.");
        }else
            System.out.println("Nu exista combinatia cautata.");


        //sau
        String text1="Java language";
        String text2="ang";
        System.out.println(text1.contains(text2));  //returneaza boolean
    }
}
