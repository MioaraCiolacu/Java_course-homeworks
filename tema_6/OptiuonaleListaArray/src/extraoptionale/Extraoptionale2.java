package extraoptionale;

import java.util.Scanner;

public class Extraoptionale2 {
    public static void main(String[] args) {
        //Problema 2.
        //Sa se creeze un progeram simplu (O clasa Main cu metoda main) in care se va defini un array de elemente de tip String.
        // Lungimea array-ului (int) se va citi de la tastatura.
        //(Folositi <int lungime = Integer.parseInt(scanner.nextLine());> pentru a citi int-ul (contraindicat scanner.nextInt()).
        //Cu ajutorul unei bucle for se vor introduce in array elemente citite de la tastatura. Afisati array-ul.

        Scanner sc = new Scanner(System.in);
        Scanner scText = new Scanner(System.in);
        System.out.println("Va rog sa introduceti lungimea array-ului:");
        int lungime = Integer.parseInt(sc.nextLine());
        String[] array = new String[lungime];
        System.out.println("Va rog sa introduceti " + lungime + " elemente in array:");
        for (int i = 0; i < array.length; i++) {
            String element = scText.nextLine();
            array[i] = element;
        }
        for (String elem : array) {
            System.out.print(elem + " ");
        }
    }
}
