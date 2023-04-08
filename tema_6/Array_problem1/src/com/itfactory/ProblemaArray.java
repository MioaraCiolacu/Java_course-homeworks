package com.itfactory;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemaArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input ten names: ");

        String cuvinte[] = new String[10];
        for (int i = 0; i < 10; i++) {
            String names = sc.nextLine();
            //pot folosi si asta in loc de ce e mai jos:  cuvinte[i] = sc.nextLine();
             cuvinte[i] = names;
        }
        System.out.println("Content of my array from user input" + Arrays.toString(cuvinte));
        //sau
        for (int i = 0; i < cuvinte.length; i++) {
            System.out.print(cuvinte[i]+" ");
        }
        System.out.println();
        String cuvinteReverse[] = new String[cuvinte.length];
        System.out.print("Content of my reverse array is: ");
        for (int i = 0; i < cuvinteReverse.length; i++) {
            cuvinteReverse[i] = cuvinte[cuvinte.length - 1 - i];
            System.out.print(cuvinteReverse[i]+" ");
        }

		//Mai simplu
        System.out.println("Content reversed: " + Arrays.toString(cuvinteReverse);
    }

}
