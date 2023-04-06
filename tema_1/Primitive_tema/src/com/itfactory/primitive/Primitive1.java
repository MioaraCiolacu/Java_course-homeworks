package com.itfactory.primitive;

/**
 * Rezolvati greselile din acest cod
 */
public class Primitive1 {
    public static void main(String[] args) {

        int intValue1 = 1;
        //Eroare 1:     int intValue2 = 5.1;
        //aici daca avem valoare int, atunci vom avea int intValue2=5;
        // daca vrem sa avem valoare 5.1, atunci modificam numele tipului de data
        //  in double, precum si numele variabilei: double doubleValueDoi=5.1;
        int intValue2 = 5;
        double doubleValueDoi = 5.1;
        int intValueDoii = (int) 5.1;   //sau pot face conversia nr. double in int


        long longValue1 = 150000L;
        //Eroare 2:  long longValue2 = 10000000000000000000000000000000000L;
        //e scris cu prea multe zero-uri, chiar si pentru un tip de date long,
        // corect este scris cu maxim 19 caractere(cifre):
        long longValue2 = 1000000000000000000L;


        float floatValue1 = 1.3f;
        //Eroare 3: lipseste "f" la initializare:  float floatValue2 = 23.123123;
        float floatValue2 = 23.123123f;

        double doubleValue1 = 2.5d;
        double doubleValue2 = 123.443423;

        boolean booleanValue1 = true;
        //Eroare 4: boolean booleanValue2 = 5;
        // tipul de date boolean nu poate avea decat doua valori:true sau false;
        boolean booleanValue2 = false;


        char charValue1 = 'a';
        //Eroare 5: char charValue2 = 67 c;
        //tipul de date char nu poate ingloba decat un singur caracter, sau ne referim la reprezentarea ASCII, atfel putem avea:
        char charValue2 = '6';
        char charValueDoi=67;


        int caracter = '6';

        System.out.println(intValue1);
        System.out.println(intValue2);
        System.out.println(doubleValueDoi); // odata modificat si introdus aceasta, l-am trecut si aici, pentru a fi afisat la consola
        System.out.println(intValueDoii);  //odata introdus mai sus (declarat si initializat), l-am trecut si aici
        System.out.println(longValue1);
        System.out.println(longValue2);
        System.out.println(floatValue1);
        System.out.println(floatValue2);
        System.out.println(doubleValue1);
        System.out.println(doubleValue2);
        System.out.println(booleanValue1);
        System.out.println(booleanValue2);
        System.out.println(charValue1);
        System.out.println(charValue2);
        System.out.println(charValueDoi);
        System.out.println(caracter);

    }
}
