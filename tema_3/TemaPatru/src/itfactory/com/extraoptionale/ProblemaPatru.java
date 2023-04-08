package itfactory.com.extraoptionale;

import java.util.Scanner;

public class ProblemaPatru {
    public static void main(String[] args) {
//           * 3. Se citeşte o propozitie p1 de la tastatură, in care cuvintele sunt separate printr-un spatiu.
//           Să se construiască o alta prepozitie
//     *    p2: cuvintele prepozitiei 1 sunt trecute in ordine inversa.
//     *    Exemplu: Astazi este vineri.
//     *    Rezultat: vineri este Astazi.
//     */


        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu un text:");
        String text = sc.nextLine();
        String ch[] = text.split(" "); //pentru a imparti textul in cuvinte, separate de "(spatiu)"
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i] + " ");
        }
    }
}
