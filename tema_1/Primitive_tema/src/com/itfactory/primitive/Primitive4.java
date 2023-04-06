package com.itfactory.primitive;

/**
 * Rezolvati greselile din acest cod
 */
public class Primitive4
{
    public static void main(String[] args)
    {
        int x = 3;
        char c = 'c';       //  c=99, in ASCII

        /*
            Este posibil sa adun o variabila de tip int cu o variabila de tip char?
            Practic un numar cu un caracter?
            Raspuns: DA! Deoarece variabilele de tip char, in acest caz, sunt reprezentate de numere in sistemul ASCII
            link: https://www.javatpoint.com/char-keyword-in-java (Primitiva 'char').
            Acest link va ajuta pentru a intelge primitiva 'char' https://www.asciitable.com/
         */
        int adunare = x + c;
        System.out.println(adunare);
    }
}