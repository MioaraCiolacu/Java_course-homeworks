package itfactory.com.extraoptionale;

import java.util.Scanner;

public class Problema3Cu3rezolvari {
    //     /**
//     *  2. Se citeşte un şir s1 de la tastatură, să se construiască un alt şir
//     *     s2: inversul şirului s1.
//     */
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introdu un text:");
//        String text = sc.nextLine();
//        text = text.trim();
//        String result = "";
//        char[] textInversat = text.toCharArray();
//        for (int i = textInversat.length - 1; i >= 0; i--) {
//            result += textInversat[i];
//        }
//        System.out.println("Cuvantul inversat " + result.trim());


//sau
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu un cuvant:");
        String text = sc.nextLine();
        char[] ch = text.toCharArray(); //pentru a imparti textul in caractere,
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}


//sau
//  public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Introduceti sirul: ");
//        String s1 = sc.nextLine();
//        String s2="";
//        int L1 = s1.length();  // lungimea primului sir
//        for (int i = L1 - 1; i >= 0; i--)
//         s2 = s2 + s1.charAt(i);
//        System.out.println("Inversul sirului " + "'" + s1 + "'" + " este: " + s2);
//
//}
