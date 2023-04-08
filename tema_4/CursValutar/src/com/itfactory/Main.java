package com.itfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CursValutar cursvalutar = new CursValutar(4.9136, 5.5584, 4.6385);
        CursValutar cursValutar2 = new CursValutar(0.8846, 1.0655);
        CursValutar cursvalutar3 = new CursValutar(1.1302, '0');
        CursValutar cursvalutar4 = new CursValutar('0', 1.20);
        CursValutar cursvalutar5 = new CursValutar('0', '0', 0.9445);
        CursValutar cursValutar6 = new CursValutar('0', 0.8312, '0');


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
                        double valoareaEuroLei = cursvalutar.schimbValutarEUR(suma);
                        System.out.println("Suma de bani in euro este: " + valoareaEuroLei);
                        break;
                    case "GBP":
                        double valoareaGbpLei = cursvalutar.schimbValutarGBP(suma);
                        System.out.println("Suma de bani in GBP este: " + valoareaGbpLei);
                        break;
                    case "USD":
                        double valoareaUsdLei = cursvalutar.schimbValutarUSD(suma);
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
                        System.out.println("Introdu moneda de schimb: ");
                        String moneda2DeSchimb = cititorText.nextLine();
                        switch (moneda2DeSchimb) {
                            case "EUR": {
                                System.out.println("Aveti acceasi suma de bani, fiind vorba de aceeasi moneda.");
                                break;
                            }
                            case "GBP": {
                                double valoareEurGbp = cursValutar2.schimbValutarEG(sumaCaz2);
                                System.out.println("Suma de bani in GBP este: " + valoareEurGbp);
                                break;
                            }
                            case "USD": {
                                double valoareEurUsd = cursValutar2.schimbValutarEU(sumaCaz2);
                                System.out.println("Suma de bani in GBP este: " + valoareEurUsd);
                                break;
                            }
                            default: {
                                System.out.println("Nu avem aceasta moneda.");
                                break;
                            }
                        }
                        break;
                    case "GBP":
                        System.out.println("Introdu moneda de schimb: ");
                        String moneda3DeSchimb = cititorText.nextLine();
                        switch (moneda3DeSchimb) {
                            case "EUR": {
                                double valoareGbpEur = cursvalutar3.schimbValutarGbpEur(sumaCaz2);
                                System.out.println("Suma de bani in Euro este: " + valoareGbpEur);
                                break;
                            }
                            case "GBP": {
                                System.out.println("Aveti acceasi suma de bani, fiind vorba de aceeasi moneda.");
                                break;
                            }
                            case "USD": {
                                double valoareGbpUsd = cursvalutar4.schimbValutarGbpUsd(sumaCaz2);
                                System.out.println("Suma de bani in USD este: " + valoareGbpUsd);
                                break;
                            }
                            default: {
                                System.out.println("Nu avem aceasta moneda.");
                                break;
                            }
                        }
                        break;
                    case "USD":
                        System.out.println("Introdu moneda de schimb: ");
                        String moneda4DeSchimb = cititorText.nextLine();
                        switch (moneda4DeSchimb) {
                            case "EUR":
                                double valoareUsdEur = cursvalutar5.schimbValutarUsdEur(sumaCaz2);
                                System.out.println("Suma de bani in EURO este: " + valoareUsdEur);
                                break;
                            case "GBP":
                                double valoareUsdGbp = cursValutar6.schimbValutarUsdGbp(sumaCaz2);
                                System.out.println("Suma de bani in GBP este: " + valoareUsdGbp);
                                break;
                            case "USD":
                                System.out.println("Aveti acceasi suma de bani, fiind vorba de aceeasi moneda.");
                                break;
                            default:
                                System.out.println("Nu avem aceasta moneda.");
                                break;
                        }
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
