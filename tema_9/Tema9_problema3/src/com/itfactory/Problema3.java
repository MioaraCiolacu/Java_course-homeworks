package com.itfactory;

import java.util.ArrayList;
import java.util.List;

public class Problema3 {
    //Problema 3.
    //Sa se creeze un program prin care se creeaza o clasa Servicii ce va desemna anumite functii pentru gestiunea
    // unor Persoane intr-un sistem.

    //Se vor trata cazurile de nefunctionare corespunzatoare prin exceptii. Pentru aceasta se va crea o clasa
    // ServiceException (trebuie sa fie o exceptie. Urmati exemplul de la curs).

    //Cerinte clasa Person
    //1. Pentru aceasta se va creea clasa Persoana cu fieldurile: numeComplet, CNP (pentru usurinta luati-l de tip long)
    //2. Se vor genera metodele equals si hashcode.
    //3. Se va genera metoda toString(). (Pentru a afisa detaliile persoanei. nu trebuie apelat super.toString() cum am
    // mai vazut prin teme).
    //
    //Cerinte clasa Servicii.
    //1. Clasa servicii va avea o lista de Persoane.
    //2. Se va implementa o metoda care va primi ca parametrul un numar de tip long ce va reprezenta CNP-ul unei persoane.
    //   2.1 Metoda va verifica daca daca exista o persoana cu acest CNP in lista.
    //      2.1.1. Daca CNP-ul exista in lista se va afisa numele persoanei
    //      2.1.2. Daca CNP-ul nu exista in lista se va arunca o exceptie.
    //
    //   2.2 Metoda care introduce o persoana in lista. Metoda primeste ca parametru un obiect de tipul Person
    //      2.2.1 Daca persoana exista deja in lista se va arunca o exceptie.
    //      2.2.2. (SUPLIMENTAR) Daca exista o alta persoana cu acelasi CNP dar nume diferit se va arunca o exceptie.
    //      (Nu exista 2 persoane cu acelasi CNP in realitate).


    public static void main(String[] args) {

        Servicii servicii = new Servicii();
        Person p1 = new Person("Ana Ioana", 123456789L);
        Person p2 = new Person("Vlad Ion", 1234567890L);
        Person p3 = new Person("Mara Sofia", 61235456789L);
        Person p4 = new Person("Ela Dana", 5123456789L);
        Person p5 = new Person("Vasi Andrei", 4123456789L);

        //in ordinea rezolvarilor, initial am adaugat in lista normal elementele, dar odata creata metoda 2 care arunca
        // o execeptie, atunci adaugarea elementelor in lista trebuie inglobata in try-catch

//2.1
        servicii.persoaneInLista(p1);
        servicii.persoaneInLista(p2);
        servicii.persoaneInLista(p3);
        servicii.persoaneInLista(p4);
        servicii.persoaneInLista(p5);

        System.out.println(servicii); //vreau sa vad ce persoane am in lista

        System.out.println("Varianta cand avem toate CNP-urile egale:");
        try {
            servicii.verificaCNP(123456789L);
            servicii.verificaCNP(1234567890L);
            servicii.verificaCNP(61235456789L);
            servicii.verificaCNP(5123456789L);
            servicii.verificaCNP(4123456789L);
        } catch (ServiceException e) {
            System.out.println("Nu exista aceasta inregistrare");
            e.printStackTrace();
        }
        System.out.println();

        System.out.println("Separat am facut try-catch doar pe un sg element din lista:");

        try {
            servicii.verificaCNP(1234567890L);
            System.out.println("Avem o astfel de persoana");
        } catch (ServiceException e) {
            e.printStackTrace();
            System.out.println("Nu exista aceasta inregistrare");
        }

        System.out.println();

        System.out.println("Varianta cand NU avem CNP egal si va genera exceptie:");
        try {
            servicii.verificaCNP(55123456789L);
        } catch (ServiceException e) {
            e.printStackTrace();
            System.out.println("Nu exista aceasta inregistrare.Nu avem aceasta persoana in lista");
        }

        //2.2
        System.out.println();
        System.out.println("Varianta cand am deja persoana in lista si va arunca o exceptie");
        try {
            servicii.persoaneInLista2(p1);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        System.out.println();


        System.out.println();

        System.out.println("Varianta cand NU avem CNP egal si va genera exceptie:");
        try {
            servicii.verificaCNP(55123456789L);
        } catch (ServiceException e) {
            e.printStackTrace();
            System.out.println("Nu exista aceasta inregistrare.Nu avem aceasta persoana in lista");
        }

        //2.2
        System.out.println();
        System.out.println("Varianta cand am deja persoana in lista si va arunca o exceptie");
        try {
            servicii.persoaneInLista2(p1);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        System.out.println();


//Suplimentar (2 persoane diferite cu acelasi cnp)

        System.out.println();

        System.out.println("Varianta cu 2 persoane diferite,dar cu acelasi cnp");
        try {
            servicii.verificaCNPNume("Ana V",55123456789L);
        } catch (ServiceException e) {
            e.printStackTrace();
            System.out.println("Err.Nu exista 2 persoane cu acelasi CNP.");
        }

        System.out.println();

        System.out.println("Varianta cu 2 persoane diferite si cu cnp diferit, va genera din nou eroare,intrucat" +
                " nu va identifica in lista mea initiala persoana nou introdusa, chiar daca este diferita");
        try {
            servicii.verificaCNPNume("Mara Ema", 461235456789L);
        } catch (ServiceException e) {
            e.printStackTrace();
            System.out.println("Err."); //aici daca vreau sa fie alt mesaj, eventual unul generic, as putea modifica textul
            // din metoda. In acest caz, nu vorba de 2 nume identice, dar cu acelasi cnp
        }

    }
}



