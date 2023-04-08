package com.itfactory;

public class CursValutar {
    double schimbEUR;
    double schimbGBP;
    double schimbUSD;
    double schimbEurGbp;
    double schimbEurUsd;
    double schimbUsdGbp;
    double schimbGbpEur;
    double schimbGbpUsd;
    double schimbUsdEur;


    public CursValutar(double schimbEUR, double schimbGBP, double schimbUSD) {
        this.schimbEUR = schimbEUR;
        this.schimbGBP = schimbGBP;
        this.schimbUSD = schimbUSD;
    }

    public CursValutar(double schimbGbpEur, char a) {
        this.schimbGbpEur = schimbGbpEur;
    }

    public CursValutar(char a, double schimbUsdGbp, char b) {
        this.schimbUsdGbp = schimbUsdGbp;
    }

    public CursValutar(char a, double schimbGbpUsd) {
        this.schimbGbpUsd = schimbGbpUsd;
    }

    public CursValutar(char a, char b, double schimbUsdEur) {
        this.schimbUsdEur = schimbUsdEur;
    }

    public CursValutar(double schimbEurGbp, double schimbEurUsd) {
        this.schimbEurGbp = schimbEurGbp;
        this.schimbEurUsd = schimbEurUsd;
    }


    public double schimbValutarEUR(double eurLeu) {
        double valoareaEuroLei = eurLeu / schimbEUR;
        return valoareaEuroLei;
    }

    public double schimbValutarGBP(double gbpLeu) {
        double valoareaGbpLei = gbpLeu / schimbGBP;
        return valoareaGbpLei;
    }

    public double schimbValutarUSD(double usdLeu) {
        double valoareaUsdLei = usdLeu / schimbUSD;
        return valoareaUsdLei;
    }

    public double schimbValutarEG(double gbpEur) {
        double valoareEurGbp = gbpEur * schimbEurGbp;
        return valoareEurGbp;
    }

    public double schimbValutarEU(double bani) {
        double valoareEurUsd = bani * schimbEurUsd;
        return valoareEurUsd;
    }

    public double schimbValutarUsdEur(double baniii) {
        double valoareUsdEur = baniii * schimbUsdEur;
        return valoareUsdEur;
    }

    public double schimbValutarUsdGbp(double altiBani) {
        double valoareUsdGbp = altiBani * schimbUsdGbp;
        return valoareUsdGbp;
    }

    public double schimbValutarGbpUsd(double altiBani2) {
        double valoareGbpUsd = altiBani2 * schimbGbpUsd;
        return valoareGbpUsd;
    }

    public double schimbValutarGbpEur(double baniNoi) {
        double valoareGbpEur = baniNoi * schimbGbpEur;
        return valoareGbpEur;
    }

    public void sfarsitProgram() {
        System.out.println("Ati iesit din program.");
        System.exit(0);
    }
}
