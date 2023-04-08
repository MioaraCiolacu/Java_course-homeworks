package itfactory.com.optionale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OptionalaTreiRefacut {
    public static void main(String[] args) {
        //3. Sa se implementeze joculetul Fazan. (Studiati metoda substring cu doi parametri/argumenti)
        // - https://beginnersbook.com/2013/12/java-string-substring-method-example/
        //   Fazan presupune ca intr-un grup de membri, fiecare va incerca sa formeze un cuvant incepand cu
        //   ultimele doua litere ale cuvantului precedent.
        //   O sa alegeti un cuvant initial aleatoriu (presupunem ca incepe calculatorul).
        //   			Daca utilizatorul introduce un cuvant care nu incepe cu acea grupare, jocul se termina
        //   			Daca sunteti blocati in a introduce un cuvant (Exemplu: dupa cuvintele care se termina
        //   			in "nt") utilizatorul o sa introduca un String empty iar programul se termina.
        //
        //   Cuvant de inceput: "animal".
        //   Introduceti un cuvant care incepe cu "al": alfabet
        //   Introduceti un cuvant care incepe cu "et": etaj
        //   Introduceti un cuvant care incepe cu "aj": altceva
        //   Jocul s-a terminat!

//        Scanner sc = new Scanner(System.in);
//        Random generator = new Random();
//
//        ArrayList<String> cuvinte = new ArrayList<>(Arrays.asList("animal", "petrecere", "scoala", "bucatar",
//                "bicicleta", "masina", "floare", "pasare", "java", "programator"));
//        String cuvant = cuvinte.get(generator.nextInt(cuvinte.size()));
//
//        System.out.println("Cuvant de inceput: " + cuvant);
//
//        System.out.println("Introduceti un cuvant care incepe cu " + (cuvant.substring((cuvant.length() - 2),cuvant.length())) + ":");
//        String cuvantIntrodus = sc.nextLine();
//
//        while (true) {
//            System.out.println("Introduceti un cuvant care incepe cu " + (cuvantIntrodus.substring((cuvantIntrodus.length() - 2), cuvantIntrodus.length())) + ":");
//            cuvantIntrodus = sc.nextLine();
//            if(!(cuvantIntrodus.startsWith((cuvantIntrodus.substring((cuvantIntrodus.length() - 2), cuvantIntrodus.length()))))) {
//                System.out.println("Ai pierdut!Jocul s-a terminat!");
//                break;
//            }
//            if(cuvantIntrodus.isEmpty()){
//                System.out.println("Ai pierdut!Jocul s-a terminat!");
//                break;
//            }
//
//        }
//
//    }


        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti cuvant de inceput: ");
        String cuvant = sc.nextLine();

        while (true) {
            String lastLetters = cuvant.substring(cuvant.length() - 2);
            System.out.print("Introduceti cuvant care incepe cu " + lastLetters + ": ");
            cuvant = sc.nextLine();
            if (cuvant.isEmpty() || !cuvant.startsWith(lastLetters)) {
                System.out.println("Jocul s-a terminat");
                break;
            }
        }
    }
}
