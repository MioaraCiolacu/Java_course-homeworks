package com.itfactory.optionale;

import java.util.*;

public class Problema1_Conversie_Lista_Set {
    public static void main(String[] args) {
        //1. Se da o lista de String-uri (Sau Integer, sau obiecte preferabile). Printr-o linie de cod,
        // transformati lista intr-un set.
        //Atentie: In lista se vor regasi elemente duplicate, in Set acele elemente duplicate vor aparea o singura data.



        //Exemplul 1, Integer
        List<Integer> listaInteger = new ArrayList<>(Arrays.asList(1, 2, 5, 5, 1, 3, 4, 6, 7, 2, 9));
        Set<Integer> listaSetInteger = new HashSet<>(listaInteger);
        System.out.println("Setul este format din urmatoarele elemente: " + listaSetInteger);
        System.out.println("Lista este formata din urmatoarele elemente: " + listaInteger);

        System.out.println();

        //Exemplul 2, String
        List<String> listaString = new ArrayList<>(Arrays.asList("Unu", "Doi", "Cinci", "Sase", "Unu", "Trei", "Cinci", "Trei", "Doi", "Cinci", "Noua"));
        Set<String> listaSetString= new HashSet<>(listaString);
        System.out.println("Setul este format din urmatoarele elemente: " + listaSetString);
        System.out.println("Lista este formata din urmatoarele elemente: " + listaString);

        System.out.println();

        //Exemplul 3, clase

        Problema1_Catel_Conversie_ListaInSet catel=new Problema1_Catel_Conversie_ListaInSet("Ciuwawa",2,"Tudor");
        Problema1_Catel_Conversie_ListaInSet catel2=new Problema1_Catel_Conversie_ListaInSet("Lupu",2,"Vlad");
        Problema1_Catel_Conversie_ListaInSet catel3=new Problema1_Catel_Conversie_ListaInSet("Ursu",4,"Anda");
        Problema1_Catel_Conversie_ListaInSet catel4=new Problema1_Catel_Conversie_ListaInSet("Azor",7,"Simo");
        Problema1_Catel_Conversie_ListaInSet catel5=new Problema1_Catel_Conversie_ListaInSet("Haiduc",9,"Ema");

        List<Problema1_Catel_Conversie_ListaInSet> catelusi=new ArrayList<>();
        catelusi.add(catel);
        catelusi.add(catel2);
        catelusi.add(catel3);
        catelusi.add(catel4);
        catelusi.add(catel5);

        Set<Problema1_Catel_Conversie_ListaInSet> setCatelusi= new HashSet<>(catelusi);
        System.out.println("Lista este format din urmatoarele elemente: " + catelusi);
        System.out.println("Setul este format din urmatoarele elemente: " + setCatelusi);


    }
}
