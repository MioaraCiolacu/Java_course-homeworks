package com.itfactory.componente;

public class CutieDeViteze {

    private String marcaProductie;
    private double pretVanzare;
	private boolean automata;

	
    public boolean isAutomata() {
        return automata;
    }

    public CutieDeViteze(String marcaProductie, double pretVanzare, boolean automata) {
        this.marcaProductie = marcaProductie;
        this.pretVanzare = pretVanzare;
        this.automata = automata;
    }

    public String marcaProductieCutieViteza(){
        return marcaProductie;
    }

    public String getMarcaProductie() {
        return marcaProductie;
    }
}
