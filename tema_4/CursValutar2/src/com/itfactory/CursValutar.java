package com.itfactory;

public class CursValutar {
	double schimbEUR_RON;
    double schimbGBP_RON;
    double schimbUSD_RON;

    public CursValutar(double schimbEUR_RON, double schimbGBP_RON, double schimbUSD_RON) {
        this.schimbEUR_RON = schimbEUR_RON;
        this.schimbGBP_RON = schimbGBP_RON;
        this.schimbUSD_RON = schimbUSD_RON;
    }

	
    public double getSchimbEUR_RON() {
        return schimbEUR_RON;
    }

    public void setSchimbEUR_RON(double schimbEUR_RON) {
        this.schimbEUR_RON = schimbEUR_RON;
    }

    public double getSchimbGBP_RON() {
        return schimbGBP_RON;
    }

    public void setSchimbGBP_RON(double schimbGBP_RON) {
        this.schimbGBP_RON = schimbGBP_RON;
    }

    public double getSchimbUSD_RON() {
        return schimbUSD_RON;
    }

    public void setSchimbUSD_RON(double schimbUSD_RON) {
        this.schimbUSD_RON = schimbUSD_RON;
    }

  
    public double schimbValutarEUR_LEU(double eurLeu) {
        double valoareaEuroLei = eurLeu / schimbEUR_RON;
        return valoareaEuroLei;
    }

    public double schimbValutarGBP_LEU(double gbpLeu) {
        double valoareaGbpLei = gbpLeu / schimbGBP_RON;
        return valoareaGbpLei;
    }

    public double schimbValutarUSD_LEU(double usdLeu) {
        double valoareaUsdLei = usdLeu / schimbUSD_RON;
        return valoareaUsdLei;
    }

    public void sfarsitProgram() {
        System.out.println("Ati iesit din program.");
        System.exit(0);
    }
}
