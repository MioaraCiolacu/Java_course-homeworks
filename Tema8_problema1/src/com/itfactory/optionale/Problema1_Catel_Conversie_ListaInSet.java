package com.itfactory.optionale;

public class Problema1_Catel_Conversie_ListaInSet {
    private String name;
    private int age;
    private String owner;




    public Problema1_Catel_Conversie_ListaInSet(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Catel_Conversie_ListaInSet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner='" + owner + '\'' +
                '}';
    }
}
