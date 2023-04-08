package com.itfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Produs> produse = new ArrayList<>();
        produse.add(new Produs("pantalon", 150.00));
        produse.add(new Produs("bluza", 120.50));
        produse.add(new Produs("camasa", 250.00));
        produse.add(new Produs("salopeta", 350.00));
        produse.add(new Produs("fular", 20.50));
        produse.add(new Produs("caciula", 50.00));
        produse.forEach(prod -> {
            System.out.println("Produsul " + prod.getName() + " are pretul de " + prod.getCost() + " lei.");
        });

        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Va rugam sa introduceti numarul produselor ce le doriti in lista:");
        int numarProduse = Integer.parseInt(sc.nextLine());
        System.out.println("Va rugam introduceti " + numarProduse + " produs/e:");
        for (int i = 0; i < numarProduse; i++) {
            String produsNou = scanner.nextLine();
            if (!((produsNou.equals("pantalon")) || (produsNou.equals("bluza")) || (produsNou.equals("camasa")) || (produsNou.equals("salopeta")) || (produsNou.equals("fular")) || (produsNou.equals("caciula")))) {
                produse.add(new Produs(produsNou));
            } else if ((produsNou.equals("pantalon")) || (produsNou.equals("bluza")) || (produsNou.equals("camasa")) || (produsNou.equals("salopeta")) || (produsNou.equals("fular")) || (produsNou.equals("caciula"))) {
                System.out.println("Avem deja acest produs in lista");
            }
        }
        System.out.print("Lista cu toate produsele contine: ");
        for (int i = 0; i < produse.size(); i++) {
            System.out.print(produse.get(i).getName() + " " + produse.get(i).getCost()+" ; ");
        }

    }
}

