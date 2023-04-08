package com.itfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Imbracaminte imbracamintePantaloni = new Imbracaminte("pantaloni", 175.00, 10);
        Imbracaminte imbracaminteBluza = new Imbracaminte("bluza", 220.00, 20);
        Imbracaminte imbracaminteAccesoriu = new Imbracaminte("accesoriu", 100.00, 30);

        IngrijirePersonala ingrijirePersonala = new IngrijirePersonala("aparat ras", 200, 0, true);
        IngrijirePersonala ingrijirePersonalaRetur = new IngrijirePersonala("aparat ras", 200, 20, false);
        IngrijirePersonala ingrijirePersonala2 = new IngrijirePersonala("set machiaj", 366, 0, true);
        IngrijirePersonala ingrijirePersonala2Retur = new IngrijirePersonala("set machiaj", 366, 20, false);
        IngrijirePersonala ingrijirePersonala3 = new IngrijirePersonala("set spumat si gel de dus", 100, 0, true);
        IngrijirePersonala ingrijirePersonala3Retur = new IngrijirePersonala("set spumat si gel de dus", 100, 20, false);

        Electronice electronice = new Electronice("TV", 1700, 0, 220);
        Electronice electronice2 = new Electronice("Laptop", 2300, 0, 220);
        Electronice electronice3 = new Electronice("Robot bucatarie", 370, 0, 240);

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
                    System.out.println("Numarul introdus nu este in intervalul solicitat, nu pute procesa solicitarea.");
                }
                break;
            case "bluza":
                System.out.print("Introduceti un numar intre 0 si 100:");
                numarIntrodus = Integer.parseInt(cititorINumar.nextLine());
                if (numarIntrodus <= 100 && numarIntrodus >= 0) {
                    System.out.println("Pretul cu discount pentru acest produs este " + imbracaminteBluza.pretCuDiscountProdus());
                } else {
                    System.out.println("Numarul introdus nu este in intervalul solicitat, nu pute procesa solicitarea.");
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
        }


        System.out.println("Introduceti produsul dorit din categoria ingrijire personala: ");
        String produsIngrijirePersonala = cititorText.nextLine();
        switch (produsIngrijirePersonala) {
            case "aparat ras":
                int numarIntrodus = intervalNumarSiRetur(cititorINumar, "Produsul se returneaza?");
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
                break;

            case "set machiaj":
                numarIntrodus = intervalNumarSiRetur(cititorINumar, "Produsul se returneaza?");
                boolean retur2 = Boolean.parseBoolean(cititorText.nextLine());
                if (numarIntrodus <= 100 && numarIntrodus >= 0) {
                    if (retur2) {
                        System.out.println("Pentru acest produs, nu putem aplica discount, pretul final fiind de " + ingrijirePersonala2.getPret());
                    } else {
                        System.out.println("Pretul cu discount pentru acest produs este " + ingrijirePersonala2Retur.pretCuDiscountProdus());
                    }
                } else {
                    System.out.println("Numarul introdus nu este in intervalul solicitat, nu putem procesa solicitarea.");
                }
                break;

            case "set spumat si gel de dus":
                int numarIntrodus2 = intervalNumarSiRetur(cititorINumar, "Produsul se returneaza?");
                boolean retur3 = Boolean.parseBoolean(cititorText.nextLine());
                if (numarIntrodus2 <= 100 && numarIntrodus2 >= 0) {
                    if (retur3) {
                        System.out.println("Pentru acest produs, nu putem aplica discount, pretul final fiind de " + ingrijirePersonala3.getPret());
                    } else {
                        System.out.println("Pretul cu discount pentru acest produs este " + ingrijirePersonala3Retur.pretCuDiscountProdus());
                    }
                } else {
                    System.out.println("Numarul introdus nu este in intervalul solicitat, nu putem procesa solicitarea.");
                }
                break;
            default:
                System.out.println("Nu avem acest produs.");
        }


        System.out.println("Introduceti produsul dorit din categoria electronice: ");
        String electronic = cititorText.nextLine();
        switch (electronic) {
            case "TV":
                int voltaj = voltajCitire(cititorINumar);
                if (voltaj == 220 || voltaj == 240) {
                    System.out.println("Avem un astfel de produs, pretul acestuia este de " + electronice.getPret());
                } else {
                    System.out.println("Produsul nu poate fi folosit la o priza ce prevede reglementarile europene");

                }
                break;
            case "Laptop":
                int voltaj2 = voltajCitire(cititorINumar);
                if (voltaj2 == 220 || voltaj2 == 240) {
                    System.out.println("Avem un astfel de produs, pretul acestuia este de " + electronice2.getPret());
                } else {
                    System.out.println("Produsul nu poate fi folosit la o priza ce prevede reglementarile europene");

                }
                break;
            case "Robot bucatarie":
                int voltaj3 = voltajCitire(cititorINumar);
                if (voltaj3 == 220 || voltaj3 == 240) {
                    System.out.println("Avem un astfel de produs, pretul acestuia este de " + electronice3.getPret());
                } else {
                    System.out.println("Produsul nu poate fi folosit la o priza ce prevede reglementarile europene");

                }
                break;

        }
    }

    private static int intervalNumarSiRetur(Scanner cititorINumar, String x) {
        System.out.print("Introduceti un numar intre 0 si 100:");
        int numarIntrodus = Integer.parseInt(cititorINumar.nextLine());
        System.out.println(x);
        return numarIntrodus;
    }

    private static int voltajCitire(Scanner cititorINumar) {
        System.out.println("Introduceti voltajul produsului: ");
        int voltaj = Integer.parseInt(cititorINumar.nextLine());
        return voltaj;
    }
}



