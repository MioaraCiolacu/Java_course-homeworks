package com.itfactory.primitive;


/**
 * Rezolvati greselile din acest cod
 */
public class Primitive2 {
    public static void main(String[] args) {
//            int x = 3.2;
//            int y = 5.6f;
//            int z = 2.3d;

        //Daca vreau ca media aritmetica sa fie un nr double, atunci toate intrarile le voi defini ca nr double:

        double x = 3.2;
        double y = 5.6;
        double z = 2.3;
        double mediaAritmetica = (x + y + z) / 3.0;
        System.out.println("Media aritmetica este: " + mediaAritmetica);

        //sau pot sa le convertesc pe toate in tip de date int:

        //  int x=3.2;
        int myInt = (int) 3.2;
        //  int y = 5.6f;
        int myInt2 = (int) 5.6f;
        //int z = 2.3d;
        int myInt3 = (int) 2.3d;
        int suma = myInt3 + myInt2 + myInt;
        int media = suma / 3;
        System.out.println("Media aritmetica este: " + media);


    }
}