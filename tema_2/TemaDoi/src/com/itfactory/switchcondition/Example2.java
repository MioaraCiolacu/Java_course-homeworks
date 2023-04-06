package com.itfactory.switchcondition;

import java.util.Random;

public class Example2 {
    /**
     * Sa se genereze un numar int random intre 0 si 4
     * Sa se creeze un statement switch prin care se verifica numarul generat.
     * In cazul in care s-a generat 0 o sa afisez un mesaj "Nu am nicio bomboana"
     * In cazul in care s-a generat 1 o sa afisez un mesaj "Am o bomboana"
     * In cazul in care s-a generat 2,3 sau 4 sa se afisze mesajul "Am  o bomboane"
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        int numarRandom = random.nextInt(4 + 1);

        switch (numarRandom) {
            case 0:
                System.out.println("Nu am nicio bomboana");
                break;
            case 1:
                System.out.println("Am o bomboana");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("am " + numarRandom + " bomboane");

        }
        System.out.println(numarRandom);
    }
}


//package com.itfactory.switchcondition;
//
//import java.util.Random;
//
//public class Example2
//{
//    /**
//     * Sa se genereze un numar int random intre 0 si 4
//     * Sa se creeze un statement switch prin care se verifica numarul generat.
//     * In cazul in care s-a generat 0 o sa afisez un mesaj "Nu am nicio bomboana"
//     * In cazul in care s-a generat 1 o sa afisez un mesaj "Am o bomboana"
//     * In cazul in care s-a generat 2,3 sau 4 sa se afisze mesajul "Am  o bomboane"
//     * @param args
//     */
//    public static void main(String[] args)
//    {
//        Random random = new Random();
//        int x = random.nextInt(4 + 1);
//
//        switch (x)
//        {
//
//        }
//
//        //Pentru verificare puteti afisa numarul generat.
//        System.out.println(x);
//    }
//}