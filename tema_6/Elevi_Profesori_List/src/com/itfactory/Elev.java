package com.itfactory;

import java.util.ArrayList;
import java.util.List;

public class Elev extends Persoana{
    List<Curs> lista_cursuri_elev=new ArrayList<>();


    public Elev(String nume_complet, int varsta, List<Curs> lista_cursuri_elev) {
        super(nume_complet, varsta);
        this.lista_cursuri_elev = lista_cursuri_elev;
    }
}
