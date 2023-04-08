package extraoptionale;

import java.util.Random;
import java.util.Scanner;

public class Extraoptionala1 {

    public static void main(String[] args) {
        //Problema 1.
        //Sa se creeze un progeram simplu (O clasa Main cu metoda main) in care se va defini un array de elemente de
        // tip int (primitiva). Lungimea array-ului (int) se va citi de la tastatura.
        //(Folositi <int lungime = Integer.parseInt(scanner.nextLine());> pentru a citi int-ul (contraindicat scanner.nextInt()).
        //Cu ajutorul unei bucle for se vor introduce in array elemente random intre 0 si 20. Afisati array-ul.

        Scanner sc = new Scanner(System.in);
        System.out.println("Va rugam sa introduceti marimea array-ului: ");
        int lungime = Integer.parseInt(sc.nextLine());
        int[] array = new int[lungime];
        Random generator = new Random();

        lungime = array.length;
        for (int i = 0; i < array.length; i++) {
            int nrGenerat = generator.nextInt(21);
            array[i] = nrGenerat;
            System.out.print(array[i] + " ");
        }


    }
}

