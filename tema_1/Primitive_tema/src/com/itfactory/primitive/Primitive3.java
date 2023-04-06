package com.itfactory.primitive;

/**
 * Rezolvati greselile din acest cod
 */
public class Primitive3 {
    public static void main(String[] args) {
        //  float x = 3.5d;             daca am numar float, nu il pot imitializa cu un numar double,
        // ori am double x=3.5d, ori am float x=3.5f;
        //double y = 123141.21112222L;  daca am numar double, nu il pot initializa cu un numar long,
        // ori am double y = 123141.21112222, ori am long y=123141.21112222L;

        // double z = y / x.0;     deja am un numar x declarat si initializat, daca il vom lasa double, atunci automat
        // x va fi 3.5 si nu si-ar mai avea rostul ".0"

        //  Asadar, putem avea:
        double x = 3.5d;
        double y = 123141.21112222;
        double z = y / x;

        System.out.println("Impartirea celor doua numere este: " + z);// in exterior, concatenare
        System.out.printf("Impartirea celor doua numere este %f", z);
    }

}