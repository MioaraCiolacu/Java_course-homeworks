package itfactory.com.extraoptionale;

import java.util.Scanner;

public class ProblemaUnu {
    public static void main(String[] args) {

        /**
         * Se citeste un text de la tastatura. Sa se transforme textul in limba pasareasca. Dupa fiecare vocala se
         * va scrie 'p' + vocala respectiva.
         * Exemplu: Astazi este soare.
         * ApAstapazipi epestepe sopoaparepe.
         * Am vazut un tik-tok cu un om care zicea ca stie limba pasareasca si am cautat pe net si chiar exista. :)))
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un text: ");
        String textIntrodus = sc.nextLine();
        char[] ch = textIntrodus.toCharArray();
        if (Character.isLetter('a') || Character.isLetter('e') || Character.isLetter('i') || Character.isLetter('o')
                || Character.isLetter('u') || Character.isLetter('A') || Character.isLetter('E') ||
                Character.isLetter('I') || Character.isLetter('O')
                || Character.isLetter('U')) {
            String textNou = textIntrodus
                    .replace("a", "apa")
                    .replace("e", "epe")
                    .replace("i", "ipi")
                    .replace("o", "opo")
                    .replace("u", "upu")
                    .replace("A", "ApA")
                    .replace("E", "EpE")
                    .replace("I", "IpI")
                    .replace("O", "OpO")
                    .replace("U", "UpU");

            System.out.print(textNou);
        }
    }
}



