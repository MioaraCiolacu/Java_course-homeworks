package itfactory.com.extraformestring;

import java.sql.Struct;

public class Problema5 {
    public static void main(String[] args) {
        //9. Write a Java program to compare a given string to the specified character sequence.
        String text1="In acest moment invat programare Java la IT Factory.";
        String text2="in acest moment invat programare Java la IT Factory.";
       boolean result=text1.equalsIgnoreCase(text2);
        System.out.println(result);
        System.out.println(text2.contentEquals("moment"));

    }
}
