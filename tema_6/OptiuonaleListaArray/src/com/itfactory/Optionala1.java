package com.itfactory;


import java.util.*;

public class Optionala1 {
    public static void main(String[] args) {
        //1. Se da o lista de numere întregi. Sa se afișeze cel mai mare număr din lista

        List<Integer> numere = new ArrayList<>(Arrays.asList(5, 23, 84, 31, 57, 96, 45, 87, 96, 42, 31, 895, 3154, 87, 213, 548, 1));
        System.out.println("Lista initiala este: ");
        for (int i = 0; i < numere.size(); i++) {
            System.out.print(numere.get(i) + " ");
        }
        System.out.println();
        Collections.sort(numere);
        System.out.println("Sortare nr crescator: ");
        for (int i = 0; i < numere.size(); i++) {
            System.out.print(numere.get(i)+" ");
        }
        System.out.println();
        System.out.println("Cel mai mare numar din lista este " + numere.get(numere.size() - 1));


        //SAU
        System.out.println();
        Object obj=Collections.max(numere);
        System.out.println(obj);


        //pentru minim pot folosi:

        System.out.println();
        Object obj2=Collections.min(numere);
        System.out.println(obj2);

		
		 //sau

//        int max = 0;
//        for (Integer number : numere)
//        {
//            if (number > max)
//            {
//                max = number;
//            }
//        }
//        System.out.println(max);

    }
}
