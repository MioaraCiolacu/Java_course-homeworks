package com.itfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UnitateBancara unitateBancara = new BancaPentruNevoiPersonale("BT");
        UnitateBancara unitateBancara1 = new BancaPentruLocuinte("BT");
        UnitateBancara bancaPentruLocuinte = new BancaPentruLocuinte("BT");
        UnitateBancara bancaPentruNevoiPersonale = new BancaPentruNevoiPersonale("BT");
        Persoana persoana = new Persoana("Ioana", 28, 1234568932, 3000.00);
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
        } else if (varstaIntrodusa < 40 && varstaIntrodusa > 18) {
            System.out.println("Va incadrati la un credit de tipul \"Banca Pentru Locuinte\"");
            unitateBancara1.credite(persoana);
            System.out.print(bancaPentruLocuinte.credit(persoana));
            unitateBancara1.dobanzi(persoana);
            System.out.print(bancaPentruLocuinte.dobanda(persoana));
            System.out.println(" lei");
        } else {
            System.out.println("Va incadrati la un credit de tipul \"Banca Pentru Nevoi Personale\"");
            unitateBancara.credite(persoana);
            System.out.print(bancaPentruNevoiPersonale.credit(persoana));
            unitateBancara.dobanzi(persoana);
            System.out.print(bancaPentruNevoiPersonale.dobanda(persoana));
            System.out.println(" lei");
        }
    }


}

