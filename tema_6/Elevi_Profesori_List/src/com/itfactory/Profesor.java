package com.itfactory;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persoana{
    List<Curs> lista_cursuri_profesor=new ArrayList<>();


    public Profesor(String nume_complet, int varsta, List<Curs> lista_cursuri_profesor) {
        super(nume_complet, varsta);
        this.lista_cursuri_profesor = lista_cursuri_profesor;
    }
}
