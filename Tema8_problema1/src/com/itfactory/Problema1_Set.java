package com.itfactory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//1. Se da un text citit de la tastatura (sau dintr-o variabila String). Pentru delimitarea cuvintelor se
// vor folosi doar spatii.
//Se cere sa se determine cate cuvinte distincte sunt in textul dat.
//Exemplu de text. "mar mar par par cireasa". Sunt 3 cuvinte distincte in acest text. (mar, par, cireasa).
//Pentru toata lumea: Pentru a sparge un text in cuvinte ne folosim de metoda split din String. metoda split
// ne va returna un array de string-uri. (vezi documentatie).
//String[] cuvinte = textulMeu.split("\\s+") (O sa spargem textul in cuvinte in functie de spatiile dintre
// cuvinte)
//
//https://www.geeksforgeeks.org/split-string-java-examples/
//https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
//SUGESTII TEMA:
//Problema1.
//O sa avem nevoie de un Set pentru problema asta deoarece o sa evitam sa adaugam duplicate astfel sa vedem
// cate cuvinte distincte avem in text.
//Array-ul rezultat de la split il vom parcurge si vom insera in set fiecare string. Mai apoi afisam lungimea
// setului.

public class Problema1_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a sentance:");
        String sentance = sc.nextLine();

        Set<String> mySet = new HashSet<>();

        // parcurg lista cu toate elementele in ea, separate:
        System.out.println();
        String[] separeteWords = sentance.split("\\s+");

        for (String separeteWord : separeteWords) {
            mySet.add(separeteWord);
            System.out.println(separeteWord);
        }
        System.out.println("We have in our list " + separeteWords.length + " words");

        //parcurg setul, doar cu cate un element diferit in ea si afisez lungimea lui:
        System.out.println();
        for (String value : mySet) {
            System.out.println(value);
        }
        System.out.println("We have in our set " + mySet.size() + " words");


        //sau
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti textul: ");
        //introduc textul si ii fac split dupa spatiu.
        String text = scanner.nextLine();
        if (!text.trim().isEmpty()) {
            String[] arrSplit = text.split("\\s+");


            //Varianta for
            //        Set<String> distinct = new HashSet<>();
            //        for (String s : splitArr)
            //        {
            //            distinct.add(s);
            //        }

            //Varianta mai simpla:
//            Set<String> distinct = new HashSet<>(Arrays.asList(arrSplit));
//
//            System.out.println("Sunt " + distinct.size() + " cuvinte distincte si acestea sunt " + distinct);
//        }
//        else
//        {
//            System.out.println("Nu lucram pe un String gol");
//        }
//        scanner.close();
        }
    }
}
