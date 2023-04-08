package com.itfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        CursValutar cursvalutar = new CursValutar(4.9136, 5.5584, 4.6385);

        Scanner cititorText = new Scanner(System.in);
        Scanner cititorBani = new Scanner(System.in);
        System.out.println("Selecteaza optiunea dorita: ");
        String optiune = cititorText.nextLine();
        switch (optiune) {
            case "1_Schimba bani:": {
                System.out.println("Introdu suma de bani, in lei, pe care o doresti sa o schimbi:");
                int suma = Integer.parseInt(cititorBani.nextLine());
                System.out.println("Selecteaza moneda de schimb: ");
                String moneda = cititorText.nextLine();
                switch (moneda) {
                    case "EUR":
                        double valoareaEuroLei = cursvalutar.schimbValutarEUR_LEU(suma);
                        System.out.println("Suma de bani in euro este: " + valoareaEuroLei);
                        break;
                    case "GBP":
                        double valoareaGbpLei = cursvalutar.schimbValutarGBP_LEU(suma);
                        System.out.println("Suma de bani in GBP este: " + valoareaGbpLei);
                        break;
                    case "USD":
                        double valoareaUsdLei = cursvalutar.schimbValutarUSD_LEU(suma);
                        System.out.println("Suma de bani in USD este: " + valoareaUsdLei);
                        break;
                    default:
                        System.out.println("Nu avem aceasta moneda.");
                        break;
                }
                break;
            }
            case "2 - schimba cursul unei monezi:": {
                System.out.println("Introdu suma de bani, pe care o doresti sa o schimbi:");
                double sumaCaz2 = Double.parseDouble(cititorBani.nextLine());
                System.out.println("Introdu moneda pe care doriti sa o schimbati:");
                String moneda2 = cititorText.nextLine();
                switch (moneda2) {
                    case "EUR":
                        System.out.println("Introdu valoarea noului curs:");
                        double valoareNouaCurs = Double.parseDouble(cititorBani.nextLine());
                        cursvalutar.setSchimbEUR_RON(valoareNouaCurs);
                        System.out.println(sumaCaz2/cursvalutar.getSchimbEUR_RON());
                        break;
                    case "GBP":
                        System.out.println("Introdu valoarea noului curs:");
                        double valoareNouaCurs2 = Double.parseDouble(cititorBani.nextLine());
                        cursvalutar.setSchimbGBP_RON(valoareNouaCurs2);
                        System.out.println(sumaCaz2/cursvalutar.getSchimbGBP_RON());
                        break;
                    case "USD":
                        System.out.println("Introdu valoarea noului curs:");
                        double valoareNouaCurs3 = Double.parseDouble(cititorBani.nextLine());
                        cursvalutar.setSchimbUSD_RON(valoareNouaCurs3);
                        System.out.println(sumaCaz2/cursvalutar.getSchimbUSD_RON());
                        break;
                }
                break;
            }
            case "3_Exit program:":
                cursvalutar.sfarsitProgram();
                break;
        }
    }
}
