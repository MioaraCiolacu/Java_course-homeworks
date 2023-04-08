package com.itfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UnitateBancara unitateBancara;
        UnitateBancara bancaPentruLocuinte = new BancaPentruLocuinte();
        UnitateBancara bancaPentruNevoiPersonale = new BancaPentruNevoiPersonale();
        Persoana persoana = new Persoana("Ion", 28, 1234568932, 2660.56);
        persoana = new Persoana(persoana.getName(), persoana.getAge(), persoana.getCnp(), persoana.getNetSalary());

        Scanner cititorText = new Scanner(System.in);
        Scanner cititoCifre = new Scanner(System.in);

        System.out.print("Va rugam introduceti numele dumneavoastra:");
        String numeIntrodus = cititorText.nextLine();
        persoana.setName(numeIntrodus);

        System.out.print("Va rugam introduceti varsta dumneavoastra:");
        int varstaIntrodusa = Integer.parseInt(cititoCifre.nextLine());
        persoana.setAge(varstaIntrodusa);

        System.out.print("Va rugam introduceti CNP-ul dumneavoastra:");
        int cnpIntrodus = Integer.parseInt(cititoCifre.nextLine());
        persoana.setCnp(cnpIntrodus);

        System.out.print("Va rugam introduceti salariul net al dumneavoastra:");
        double salariuIntrodus = Double.parseDouble(cititoCifre.nextLine());
        persoana.setNetSalary(salariuIntrodus);

        if (varstaIntrodusa < 18) {
            System.out.println("Persoana nu este eligibila pentru un credit");
			System.exit(0);
        } else if (varstaIntrodusa < 40 && varstaIntrodusa > 18) {
            System.out.println("Va incadrati la un credit de tipul \"Banca Pentru Locuinte\"");
            System.out.println("Creditul maxim ce va poate fi oferit este de " + bancaPentruLocuinte.credit(persoana) + " lei, iar dobanda aferenta este de " + bancaPentruLocuinte.dobanda(persoana) + " lei.");

        } else {
            System.out.println("Va incadrati la un credit de tipul \"Banca Pentru Nevoi Personale\"");
            System.out.println("Creditul maxim ce va poate fi oferit este de " + bancaPentruNevoiPersonale.credit(persoana) + " lei, iar dobanda aferenta este de " + bancaPentruNevoiPersonale.dobanda(persoana) + " lei.");

        }
    }


}

