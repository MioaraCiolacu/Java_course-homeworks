package com.itfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Imbracaminte imbracamintePantaloni = new Imbracaminte("pantaloni", 175.00, 10);
        Imbracaminte imbracaminteBluza = new Imbracaminte("bluza", 220.00, 20);
        Imbracaminte imbracaminteAccesoriu = new Imbracaminte("accesoriu", 100.00, 30);

        IngrijirePersonala ingrijirePersonala = new IngrijirePersonala("aparat ras", 200, 0, true);
        IngrijirePersonala ingrijirePersonalaRetur = new IngrijirePersonala("aparat ras", 200, 20, false);

        Electronice electronice = new Electronice("TV", 1700, 0, 220);

        Scanner cititorText = new Scanner(System.in);
        Scanner cititorINumar = new Scanner(System.in);

        System.out.println("Introduceti produsul dorit din categoria imbracaminte: ");
        String produsImbracaminte = cititorText.nextLine();
        switch (produsImbracaminte) {
            case "pantaloni":
                System.out.print("Introduceti un numar intre 0 si 100:");
                int numarIntrodus = Integer.parseInt(cititorINumar.nextLine());
                if (numarIntrodus <= 100 && numarIntrodus >= 0) {
                    System.out.println("Pretul cu discount pentru acest produs este " + imbracamintePantaloni.pretCuDiscountProdus());
                } else {
                    System.out.println("Numarul introdus nu este in intervalul solicitat, nu putem procesa solicitarea.");
                }
                break;
            case "bluza":
                System.out.print("Introduceti un numar intre 0 si 100:");
                numarIntrodus = Integer.parseInt(cititorINumar.nextLine());
                if (numarIntrodus <= 100 && numarIntrodus >= 0) {
                    System.out.println("Pretul cu discount pentru acest produs este " + imbracaminteBluza.pretCuDiscountProdus());
                } else {
                    System.out.println("Numarul introdus nu este in intervalul solicitat, nu putem procesa solicitarea.");
                }
                break;
            case "accesoriu":
                System.out.print("Introduceti un numar intre 0 si 100:");
                numarIntrodus = Integer.parseInt(cititorINumar.nextLine());
                if (numarIntrodus <= 100 && numarIntrodus >= 0) {
                    System.out.println("Pretul cu discount pentru acest produs este " + imbracaminteAccesoriu.pretCuDiscountProdus());
                } else {
                    System.out.println("Numarul introdus nu este in intervalul solicitat, nu putem procesa solicitarea.");
                }
                break;
            default:
                System.out.println("Nu avem acest produs.");
                break;
        }
		//se poate crea o metoda pentru switch in clasa Imbracaminte, iar aici sa facem doar apelarea metodei.

        System.out.println("Introduceti produsul dorit din categoria ingrijire personala: ");
        String produsIngrijirePersonala = cititorText.nextLine();
		//am cerut un nr intre 0 si 100, ca si verificare pentru casierul de la casa, sa nu introduca din greseala alte valori
        System.out.print("Introduceti un numar intre 0 si 100:");
        int numarIntrodus = Integer.parseInt(cititorINumar.nextLine());
        System.out.println("Produsul se returneaza?");
        boolean retur = Boolean.parseBoolean(cititorText.nextLine());
        if (numarIntrodus <= 100 && numarIntrodus >= 0) {
            if (retur) {
                System.out.println("Pentru acest produs, nu putem aplica discount, pretul final fiind de " + ingrijirePersonala.getPret());
            } else {
                System.out.println("Pretul cu discount pentru acest produs este " + ingrijirePersonalaRetur.pretCuDiscountProdus());
            }
        } else {
            System.out.println("Numarul introdus nu este in intervalul solicitat, nu putem procesa solicitarea.");
        }

        System.out.println("Introduceti produsul dorit din categoria electronice: ");
        String electronic = cititorText.nextLine();
        System.out.println("Introduceti voltajul produsului: ");
        int voltaj = Integer.parseInt(cititorINumar.nextLine());
        if (voltaj == 220 || voltaj == 240) {
            System.out.println("Avem un astfel de produs, pretul acestuia este de " + electronice.getPret());
        } else {
            System.out.println("Produsul nu poate fi folosit la o priza ce prevede reglementarile europene");

        }
		//instructiunea if-else o putem ingloba intr-o metoda in clasa electronice, iar aici sa facem apelarea ei
    }


}



