package itfactory.com;

import java.util.Scanner;

public class ExercitiulUnu {
    public static void main(String[] args) {
        //Sa se creeze un program prin care se citeste de la tastatura un user si o parola. In prealabil, acestea
        // trebuie sa mimeze autentificarea unui user intr-un sistem.
        //Daca userul si parola sunt aceleasi cu cele prestabilite, afisati un mesaj de tipul: "Userul {user}
        // s-a autentificat in aplicatie." (Unde {user} este userul introdus).
        //In cazul in care cel putin una din valorile citite (user sau parola) nu este egala cu valoarea prestabilita,
        // se afiseaza mesajul "Credentiale gresite".
        //Aspecte:
        //1. Pentru userul si parola prestabilite se definesc 2 stringuri in program.
        //2. Cand se citeste de la tastatura, textul citit va fi intampinat de un mesaj similar:
        // "Introduceti userul: " / "Introduceti parola: ".


        String userPrestabilit = "Mioara Ciolacu";
        String parolaPrestabilita = "asdfghjkl1234@";

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti userul:");
        String userIntrodus = sc.nextLine();
        System.out.println("Introduceti parola:");
        String parolaIntrodusa = sc.nextLine();

        boolean egalitate=userIntrodus.equals(userPrestabilit);
        boolean egalitateDoi=parolaIntrodusa.equals(parolaPrestabilita);

        if(egalitate && egalitateDoi) {
            System.out.println("Userul " + userIntrodus + " s-a autentificat in sistem.");
        }else{
            System.out.println("Credentiale gresite");
        }


    }

}
