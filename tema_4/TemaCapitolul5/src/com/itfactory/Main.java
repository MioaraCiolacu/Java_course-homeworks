package com.itfactory;

import com.itfactory.componente.MemorieSSD;
import com.itfactory.componente.Ram;
import com.itfactory.electronice.Laptop;

public class Main {

    public static void main(String[] args) {
        Ram ram = new Ram("DDR3", "GB", 16);
        MemorieSSD memorie = new MemorieSSD(256, "GB");
        Laptop laptop = new Laptop("Asus", "Negru", 15.60, ram, memorie);

        System.out.println("Detalii laptop:");
        System.out.println("Marca: " + laptop.getMarca());
        System.out.println("Culoare: " + laptop.getCuloare());
        System.out.println("Dimensiune ecran: " + laptop.getDimensiuneEcran());
        System.out.println();
        System.out.println("Memorie RAM:");
        System.out.println("Tip memorie RAM: " + laptop.getRam().getTipMemorie());
        System.out.println("Unitatea de masura Memorie RAM: " + laptop.getRam().getUnitateMasura());
        System.out.println("Capacitate memorie RAM: " + laptop.getRam().getCapacitateMemorie());
        System.out.println();
        System.out.println("Spatiu de stocare SSD:");
        System.out.println("Capacitate stocare SSD: " + laptop.getMemorieSSD().getCapacitateStocare());
        System.out.println("Unitate de masura stocare SSD: " + laptop.getMemorieSSD().getUnitateMasura());

        System.out.println();
        System.out.println("Detalii laptop nou:");
        laptop.setCuloare("Rosu");
        System.out.println("Culoare laptop noua: " + laptop.getCuloare());
        laptop.setMarca("HP");
        System.out.println("Marca noua laptop: " + laptop.getMarca());
        laptop.setDimensiuneEcran(17.50);
        System.out.println("Dimensiune ecran HP: " + laptop.getDimensiuneEcran());

        System.out.println();
        System.out.println("Memorie RAM modificata:");
        laptop.setRam(new Ram("DDR", "GB", 32));
        System.out.println("Unitate masura RAM: " + laptop.getRam().getTipMemorie());
        System.out.println("Unitare masura: " + laptop.getRam().getUnitateMasura());
        System.out.println("Capacitate memorie noua: " + laptop.getRam().getCapacitateMemorie());

        System.out.println();
        System.out.println("Spatiu de stocare SSD nou:");
        laptop.setMemorieSSD(new MemorieSSD(350,"GB"));
        System.out.println("Unitare masura: "+laptop.getMemorieSSD().getUnitateMasura());
        System.out.println("Capacitate stocare SSD nou: "+ laptop.getMemorieSSD().getCapacitateStocare());

    }
}
