package optionaletematrei;

import java.util.Scanner;

public class OptionalaTrei {
//    3. Scrieti un program in care creati o consola interactiva prin care userul poate sa aleaga optiuni de la 1 la 3.
//    La start-ul programului, va trebui sa apara un mesaj cu optiunile posibile.
//	a) Pentru optiunea 1, userul va trebui sa introduca un numar de la 1 la 10. Daca numarul nu este in acest interval
//	se va afisa un mesaj de eroare.
//	b) Pentru optiunea 2 userul va trebui sa introduca doua numere intregi si se va afisa suma acestora
//	c) Pentru optiunea 3 userul va trebui sa introduca un numar intreg pozitiv (se va face verificarea) iar pe baza
//	acestuia se vor afisa toate numerele de la 0 pana la acesta.



    //Tema sesiunea 3
    //Optionale. Tema 3 - Super frumos. La consola interactiva trebuie sa inglobezi totul intr-un while true si sa ai o
    // optiune de exit 🙂 Utilizatorul decide cand iese din program


    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);
        System.out.print("Introduceti una din optiunile urmatoare: 1, 2 sau 3:");
        int optiuneaAleasa = Integer.parseInt(cititor.nextLine());
        if (optiuneaAleasa > 3 || optiuneaAleasa < 0) {
            System.out.println("Va rugam sa introduceti una din variantele disponibile: 1 2 sau 3.");
        }

        switch (optiuneaAleasa) {
            case 1:
                System.out.print("Introduceti un numar de la 1 la 10:");
                int numarIntrodus = Integer.parseInt(cititor.nextLine());
                if (numarIntrodus > 10 || numarIntrodus < 1) {
                    System.out.println("Numarul introdus nu face parte din intervalul solicitat.Va rugam reluati pasii.");
                } else {
                    System.out.println("Felicitari. Ai urmat toti pasii solicitati la optiunea 1.");
                }
                break;
            case 2:
                System.out.println("Va rugam introduceti doua numere intregi:");
                int primulNumar = Integer.parseInt(cititor.nextLine());
                int alDoileaNumar = Integer.parseInt(cititor.nextLine());
                int suma = primulNumar + alDoileaNumar;
                System.out.println("Suma numerelor " + primulNumar + " si " + alDoileaNumar + " este " + suma);
                break;
            case 3:
                System.out.print("Va rugam sa introduceti un numar pozitiv (mai mare decat 0):");
                int numarPozitiv = Integer.parseInt(cititor.nextLine());
                if (numarPozitiv < 0) {
                    System.out.println("Nu ati introdus un numar pozitiv. Va rugam reluati procesul.");
                    break;
                } else {
                    for (int i = 0; i <= numarPozitiv; i++) {
                        System.out.println(i);
                    }
                }

        }


    }
}

