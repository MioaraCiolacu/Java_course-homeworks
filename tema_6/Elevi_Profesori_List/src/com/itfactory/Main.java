package com.itfactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curs curs1 = new Curs("Matematica", 52);
        Curs curs2 = new Curs("Geografie", 53);
        Curs curs3 = new Curs("Informatica", 54);
        Curs curs4 = new Curs("Mecanica", 55);
        Curs curs5 = new Curs("Romana", 56);
        Curs curs6 = new Curs("Biologie", 57);
        Curs curs7 = new Curs("Tehnologie", 58);


        Elev elev = new Elev("Maria Iona", 18, new ArrayList<>());
        List<Curs> lista_cursuri_elev = new ArrayList<>();
        lista_cursuri_elev.add(curs1);
        lista_cursuri_elev.add(curs2);
        lista_cursuri_elev.add(curs3);
        lista_cursuri_elev.add(curs4);
        lista_cursuri_elev.add(curs7);


        Profesor profesor = new Profesor("Vasile Anton", 45, new ArrayList<>());
        List<Curs> lista_cursuri_profesor = new ArrayList<>();
        lista_cursuri_profesor.add(curs1);
        lista_cursuri_profesor.add(curs3);
        lista_cursuri_profesor.add(curs5);
        lista_cursuri_profesor.add(curs6);
        lista_cursuri_profesor.add(curs7);


//parcurg fiecare lista sa vad cursurile fiecaruia
        System.out.println();
        System.out.println("Cursurile elevului sunt:");
        for (Curs cursElev : lista_cursuri_elev) {
            System.out.println(cursElev);
        }

        System.out.println();
        System.out.println("Cursurile profesorului sunt:");
        for (Curs cursProfesor : lista_cursuri_profesor) {
            System.out.println(cursProfesor);
        }

        System.out.println();
//apelez metoda retainAll pentru a elimina cursurle care nu sunt comune si sa mi le afiseze pe cele comune
        lista_cursuri_elev.retainAll(lista_cursuri_profesor);
        List<Curs> lista_comuna2 = new ArrayList<>(lista_cursuri_elev);
        System.out.println("Cursurile comune sunt: " + lista_comuna2);


    }
}
