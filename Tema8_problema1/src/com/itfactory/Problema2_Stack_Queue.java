package com.itfactory;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Problema2_Stack_Queue {
    //2. Sa se verifice daca un numar citit de la tastatura este palindrom sau nu.
    //Exemplu: 991199 este palindrom, deoarece numarul citit invers este ca cel initial. Alte exemple de palindrom:
    // 121, 22322, 556655, 4432344
    //In clasa Utils aveti o metoda ajutatoarea care va transofmra un numar de tip int in array de String
    // continand fiecare cifra in ordine. Puteti rula metoda main din clasa Utils sa va convingeti.

    //sugestie:
//    Pentru aceasta verificare va fi util sa folositi un Queue si un Stack.
//Prima data puneti fiecare cifra (parcurgand array-ul) in Queue si in Stack (in acelasi timp).
//Apoi parcurgeti Queue-ul si Stack-ul si fiecare element scos din Queue trebuie sa fie egal cu fiecare element scos din Stack.
//Daca 2 elemente scoase nu sunt egale, numarul nu este palindrom.
//Exemplul palindrom
//1 2 3 4 3 2 1 (citit normal)
//1 2 3 4 3 2 1 (citit invers)
//
//Exemplul care nu este palindrom
//1 2 3 4 5 6 7 (citit normal)
//7 6 5 4 3 2 1 (citit invers)

    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = Integer.parseInt(cititor.nextLine());

        //fac conversia numarului in sir de caractere:
        String stringNumar = String.valueOf(number);

        //sparg sirul de caractere in caractere individuale
        char[] ch = stringNumar.toCharArray();

        Queue<Character> myQueue = new LinkedList<>();
        Stack<Character> myStack = new Stack<>();

        for (char c : ch) {
            myQueue.add(c);
            myStack.push(c);
        }

        if (myQueue.poll().equals(myStack.pop())) {
            System.out.println("This number is a palindrome");
        } else {
            System.out.println("This number is NOT a palindrome");
        }


        System.out.println();
        System.out.println("Content of my Queue" + myQueue);
        while (!(myQueue.isEmpty())) {
            System.out.println(myQueue.poll());
        }

        System.out.println();

        System.out.println("Content of my Stack" + myStack);
        while (!(myStack.isEmpty())) {
            System.out.println(myStack.pop());
        }


    }
}
