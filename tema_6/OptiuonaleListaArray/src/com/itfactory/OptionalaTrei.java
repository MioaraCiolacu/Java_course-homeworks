package com.itfactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptionalaTrei {
    public static void main(String[] args) {
//        3. Se dau doua liste de numere întregi (sau string-uri la alegerea voastră). Sa se creeze o lista ce
//        conțin elementele comune din cele doua liste


        //Exemplul 1, array de integer:


//        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 48};
//        int[] array2 = {5, 6, 7, 20, 50, 48, 75};
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array2.length; j++) {
//                if ((array1[i] == array2[j])) {
//                    System.out.println(array1[i]);
//                }
//
//            }


        //Exemplu 2, array de stringuri


//        System.out.println();
//        String[] companyOne = new String[6];
//        companyOne[0] = "one";
//        companyOne[1] = "two";
//        companyOne[2] = "three";
//        companyOne[3] = "four";
//        companyOne[4] = "five";
//        companyOne[5] = "six";
//
//        String[] companyTwo = new String[3];
//        companyTwo[0] = "one";
//        companyTwo[1] = "three";
//        companyTwo[2] = "five";
//
//
//        for (int k = 0; k < companyOne.length; k++) {
//            for (int l = 0; l < companyTwo.length; l++) {
//                if ((companyOne[k]) == (companyTwo[l])) {
//                    System.out.println(companyOne[k]);
//                }
//
//            }
//
//        }


        //Exemplu 3,lista de stringuri

        List<String> list = new ArrayList<>(Arrays.asList("plimbare", "distractie", "munca", "serviciu", "academie", "pompieri", "padure", "calculator", "intreprindere"));
        List<String> list2 = new ArrayList<>(Arrays.asList("plimbare","munca","fun","serviciu","academie","pompieri","excursie"));

        //apelez metoda retainAll, care imi elimina elementele care nu sunt continute in lista data ca parametru
        list.retainAll(list2);
        List<String> lista_comuna = new ArrayList<>(list);
        System.out.println(lista_comuna);

        //sau
        list2.retainAll(list);
        List<String> lista_comuna2 = new ArrayList<>(list2);
        System.out.println(lista_comuna2);




        //Exemplu 4,lista de integer

        List<Integer>lista1=new ArrayList<>();
        lista1.add(5);
        lista1.add(78);
        lista1.add(6);
        lista1.add(89);
        lista1.add(1);
        lista1.add(6);
        lista1.add(8);

        List<Integer>lista2=new ArrayList<>();
        lista2.add(5);
        lista2.add(15);
        lista2.add(6);
        lista2.add(12);
        lista2.add(5);
        lista2.add(7);
        lista2.add(8);

        lista1.retainAll(lista2);
        List<Integer> lista_comunaNumere = new ArrayList<>(lista1);  //creez lista comuna, care imi va afisa aceste elemente
        System.out.println(lista_comunaNumere);

        lista2.retainAll(lista1);
        List<Integer> lista_comunaNumere2 = new ArrayList<>(lista2);
        System.out.println(lista_comunaNumere2);

		
		//SAU
		//List<Integer> intersection = new ArrayList<>();
        //
        //for (Integer iNumber : lista1)
        //{
        //    if (lista2.contains(iNumber))
        //    {
        //        intersection.add(iNumber);
        //   }
        //}
        //System.out.println(intersection);

        //Varianta cu streams.
        //System.out.println(list1.stream().filter(list2::contains).collect(Collectors.toUnmodifiableList()));
    
		
		
    }

}



