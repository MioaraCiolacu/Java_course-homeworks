package com.itfactory.optionale;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Problema3_Queue_Stack {
    public static void main(String[] args) {
        //3. Se dau doua structuri de date: un queue si un stack amblee continand numere intregi.
        //Se cere sa se implementeze un program prin care la fiecare extragere a unui numar din stack, atatea elemente
        // vor fi scoase din queue.
        //Atunci cand nu mai sunt elemente ramase intr-una din structuri se va afisa care din ele a ramas empty. :)


        // CAZ 1: nr elemente stack < nr elemente queue

//        Queue<Integer> myQueue = new LinkedList<>();
//        myQueue.add(1);
//        myQueue.add(2);
//        myQueue.add(3);
//        myQueue.add(4);
//        myQueue.add(5);
//        myQueue.add(6);
//        myQueue.add(7);
//        myQueue.add(8);
//        myQueue.add(9);
//        myQueue.add(10);
//        myQueue.add(11);
//
//        Stack<Integer> myStack = new Stack<>();
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        myStack.push(4);
//
//
//        while (!myStack.isEmpty()) {
//            if (myStack.pop().equals(4)) {
//                System.out.println("myQueue: " + myQueue.poll());
//                System.out.println("myQueue: " + myQueue.poll());
//                System.out.println("myQueue: " + myQueue.poll());
//                System.out.println("myQueue: " + myQueue.poll());
//                System.out.println();
//            }
//            if (myStack.pop().equals(3)) {
//                System.out.println("myQueue: " + myQueue.poll());
//                System.out.println("myQueue: " + myQueue.poll());
//                System.out.println("myQueue: " + myQueue.poll());
//                System.out.println();
//            }
//            if (myStack.pop().equals(2)) {
//                System.out.println("myQueue: " + myQueue.poll());
//                System.out.println("myQueue: " + myQueue.poll());
//                System.out.println();
//            }
//            if (myStack.pop().equals(1)) {
//                System.out.println("myQueue: " + myQueue.poll());
//                System.out.println();
//            }
//            System.out.println("Is myStack empty? : " + myStack.isEmpty());
//            System.out.println("Is myQueue empty? : " + myQueue.isEmpty());
//        }
//
//        System.out.println();
//        System.out.println();


//        myQueue: 1
//myQueue: 2
//myQueue: 3
//myQueue: 4
//myQueue: 5
//myQueue: 6
//myQueue: 7
//myQueue: 8
//myQueue: 9
//myQueue: 10
//Is myStack empty? : true
//Is myQueue empty? : false


        // CAZ 2: nr elemente stack > nr elemente queue si cu instructiunea FOR:

        Queue<Integer> myQueue2 = new LinkedList<>();
        myQueue2.add(1);
        myQueue2.add(2);
        myQueue2.add(3);

        Stack<Integer> myStack2 = new Stack<>();
        myStack2.push(1);
        myStack2.push(2);
        myStack2.push(3);
        myStack2.push(4);

        while (!myStack2.isEmpty()) {
            if (myStack2.pop().equals(4)) {
                for (int i = 0; i < 4; i++) {
                    System.out.println("myQueue2: " + myQueue2.poll());
                }
                System.out.println();
            }
            if (myStack2.pop().equals(3)) {
                for (int i = 0; i < 3; i++) {
                    System.out.println("myQueue2: " + myQueue2.poll());
                }
                System.out.println();
            }
            if (myStack2.pop().equals(2)) {
                for (int i = 0; i < 2; i++) {
                    System.out.println("myQueue2: " + myQueue2.poll());
                }
                System.out.println();
            }
            if (myStack2.pop().equals(1)) {
                System.out.println("myQueue2: " + myQueue2.poll());
                System.out.println();
            }
            System.out.println("Is myStack2 empty? : " + myStack2.isEmpty());
            System.out.println("Is myQueue2 empty? : " + myQueue2.isEmpty());


            //myQueue2: 1
            //myQueue2: 2
            //myQueue2: 3
            //myQueue2: null
            //
            //myQueue2: null
            //myQueue2: null
            //myQueue2: null
            //
            //myQueue2: null
            //myQueue2: null
            //
            //myQueue2: null
            //
            //Is myStack2 empty? : true
            //Is myQueue2 empty? : true
            //se va opri atunci cand se va goli pe el insusi, din perechea asociata, va extrage valoarea null

			
			
			//sau pot crea un Queue si un Stack cu numere random:
		//	 Random random = new Random();
        //for(int i = 0; i < random.nextInt(15 + 1) + 5; i++)
        //{
        //    queue.add(random.nextInt(3 + 1) + 1);
        //}

        //for (int i = 0; i < random.nextInt(15 + 1) + 5; i++)
        //{
        //   stack.push(random.nextInt(3 + 1) + 1);
        //}
		
		
        }
    }
}

