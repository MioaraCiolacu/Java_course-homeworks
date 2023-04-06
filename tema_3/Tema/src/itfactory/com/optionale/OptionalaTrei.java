package itfactory.com.optionale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OptionalaTrei {
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

        Scanner sc = new Scanner(System.in);
        Random generator = new Random();

        ArrayList<String> cuvinte = new ArrayList<>(Arrays.asList("animal", "petrecere", "vacanta", "peisaj", "excursie",
                "munte", "mare", "restaurant", "scoala", "bucatar", "bicicleta", "masina", "floare", "pasare", "java", "programator"));
        String cuvant = cuvinte.get(generator.nextInt(cuvinte.size()));

        System.out.println("Cuvant de inceput: " + cuvant);
        String stop = cuvant.substring(cuvant.length() - 2); // sa afiseze ultimele 2 caractere

        System.out.println("Introduceti un cuvant care incepe cu \"" + stop + "\":");
        String cuvantIntrodus = sc.nextLine();
        String start = cuvantIntrodus.substring(0, 2);  // sa afiseze primele doua caractere

        while (stop.equals(start)) {
            stop = cuvantIntrodus.substring(cuvantIntrodus.length() - 2);
            System.out.println("Introduceti un cuvant care incepe cu \"" + stop + "\":");
            cuvantIntrodus = sc.nextLine();

            if (cuvantIntrodus.isEmpty()) {
                System.out.println("....Jocul s-a terminat.");
            }
          start = cuvantIntrodus.substring(0, 2);
        }
        System.out.println("Jocul s-a terminat");
    }
}

//va da exception in thread la introducerea spatiului gol