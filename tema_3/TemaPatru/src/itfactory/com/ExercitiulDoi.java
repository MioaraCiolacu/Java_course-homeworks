package itfactory.com;

import java.util.Scanner;

public class ExercitiulDoi {
    public static void main(String[] args) {
        //Sa se creeze un program in care se citeste un sir de caractere de la tastatura care va reprezenta numele
        // unui candidat la introducerea intr-un sistem de contabilitate.
        //In cazul in care numele introdus depaseste lungimea de 25 de caractere, afisati mesajul urmator:
        // "Numele introdus este prea lung pentru sistem".
        //Aspecte:
        //1. Cand se citeste de la tastatura, textul citit va fi intampinat de un mesaj similar:
        // "Introduceti numele candidatului: ".

        Scanner cititor=new Scanner(System.in);
        System.out.println("Introduceti numele candidatului:");

        String numeIntrodus=cititor.nextLine();
        int lenght= numeIntrodus.trim().length();

        if (!(lenght<25)){
            System.out.println("Numele introdus este prea lung pentru sistem");
        }







    }
}
