package com.itfactory;

public class Curs {
    private String nume_curs;
    private int id_curs;

    public Curs(String nume_curs, int id_curs) {
        this.nume_curs = nume_curs;
        this.id_curs = id_curs;
    }

//    public String getNume_curs() {
//        return nume_curs;
//    }
//
//    public void setNume_curs(String nume_curs) {
//        this.nume_curs = nume_curs;
//    }
//
//    public int getId_curs() {
//        return id_curs;
//    }
//
//    public void setId_curs(int id_curs) {
//        this.id_curs = id_curs;
//    }

    @Override
    public String toString() {
        return "Curs{" +
                "nume_curs='" + nume_curs + '\'' +
                ", id_curs=" + id_curs +
                '}';
    }
}
