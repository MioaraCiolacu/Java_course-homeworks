package itfactory.com.optionale;

import java.util.Scanner;

public class OptionalaDoi {
    public static void main(String[] args) {
//        2. Se citesc doua variabile de tip String de la tastatura, din care unul va reprezenta un text oarecare,
//        iar cel de al doilea reprezinta un keyword care se va cauta in text.
//   Se cere sa se numere de cate ori apare keyword-ul in textul respectiv.

        //OptinalDoi - nu e rea abordarea. Dar este una intersanta fara split (Combinatie intre metodele replaceFirst
        // si contains) "Daca contine ... numar cuvantul si ii fac replace cu ceva banal .. continui pana cand textul
        // nu mai contine cuvantul deoarece l-am inlocuit cu altceva si obtin numarul de cate ori a fost prezent"

        Scanner cititor = new Scanner(System.in);
        System.out.println("Introduceti un text:");
        String text1 = cititor.nextLine();
        System.out.println("Introduceti keyword-ul dorit:");
        String text2 = cititor.nextLine();
        int key = 0;
        String[] ch = text1.split(" "); //pentru a imparti textul in cuvinte, separate de "(spatiu)"
        for (String cuvant : ch) {
            if (cuvant.equals(text2)) {
                key++;
            }
        }
        System.out.println("Number of keyword in a string : " + key);
    }
}

