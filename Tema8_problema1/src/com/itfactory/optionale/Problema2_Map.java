package com.itfactory.optionale;

import java.util.*;

public class Problema2_Map {
    public static void main(String[] args) {
        //2. Se da un map unde cheile sunt de tip int (atentie la int) iar valorile sunt de tip lista de int
        // (atentie la int).
        //Fiecare element va fi o pereche de forma (int, list de int).
        //Se cere ca pentru fiecare element din map sa se afiseze cheia, si maximul din lista asociata.


        List<Integer> listaInt1 = new ArrayList<>(Arrays.asList(1, 5, 6, 7));
        List<Integer> listaInt2 = new ArrayList<>(Arrays.asList(9, 2, 3, 0));
        List<Integer> listaInt3 = new ArrayList<>(Arrays.asList(11, 50, 6, 17, 40));
        List<Integer> listaInt4 = new ArrayList<>(Arrays.asList(1, 64, 71));
        List<Integer> listaInt5 = new ArrayList<>(Arrays.asList(1, 5));
        List<Integer> listaInt6 = new ArrayList<>(Arrays.asList(3, 8, 7));

        Map<Integer, List<Integer>> map = new HashMap<>();

        map.put(1, listaInt1);
        map.put(2, listaInt2);
        map.put(3, listaInt3);
        map.put(4, listaInt4);
        map.put(5, listaInt5);
        map.put(6, listaInt6);

        //Afisare map
        for (Integer key : map.keySet()) {  //parcurg fiecare cheie in parte
            List<Integer> val = map.get(key);  //extrag valorile din lista pentru fiecare cheie in parte
            System.out.println("In this map we have key " + key + " and values from list " + val);
            //==>In this map we have key 1 and values from list [1, 5, 6, 7]...etc
        }
        System.out.println();

        //Afisare cheie si valoarea maxima din lista
        for (Integer key : map.keySet()) {  //parcurg fiecare cheie in parte
            List<Integer> val = map.get(key);  //extrag valorile din lista pentru fiecare cheie in parte
            Integer valMax = Collections.max(val); //scot valoarea maxima
            System.out.println("In this map we have key " + key + " and maximum value from list " + valMax);
            //==>In this map we have key 1 and maximum value from list 7..etc
        }
        //--------------------------------------------------------------------------------------------------------------------------

        //for me:

        //pot sa afisez doar valorile din map, astfel:
        for (List<Integer> valori : map.values()) {  //parcurg fiecare valoare in parte
            System.out.println("In this map we have this values on lists " + valori);
            //==>In this map we have this values on lists [1, 5, 6, 7]...etc
        }
        System.out.println();

        //sau pot face afisarea (prima data afisez cheile, apoi perechile din lista):
        System.out.println(map.keySet() + " " + map.values()); //==>[1, 2, 3, 4, 5, 6] [[1, 5, 6, 7], [9, 2, 3, 0], [11, 50, 6, 17, 40], [1, 64, 71], [1, 5], [3, 8, 7]]

        //sau pot face afisarea direct sub aceasta forma, fara text:
        System.out.println(map);  //==>{1=[1, 5, 6, 7], 2=[9, 2, 3, 0], 3=[11, 50, 6, 17, 40], 4=[1, 64, 71], 5=[1, 5], 6=[3, 8, 7]}


        //Afisare cheie si valoarea min din lista
        for (Integer key : map.keySet()) {  //parcurg fiecare cheie in parte
            List<Integer> val = map.get(key);  //asociez lista mea cu fiecare cheie
            Integer valMin = Collections.min(val); //scot valoarea min
            System.out.println("In this map we have key " + key + " and minimum value from list " + valMin);
            //==>In this map we have key 6 and minimum value from list 3..etc
        }


		//sau 
		 //metoda mai simpla folosind foreach
        //map.forEach((k, v) -> System.out.println("Cheia: " + k + " cu maximul: " + Collections.max(v)));
    }
}

