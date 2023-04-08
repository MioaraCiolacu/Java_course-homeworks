package com.itfactory;

public abstract class UnitateBancara {
    //pentru aceasta clasa abstracta pot avea si field declarat, dar si constructor;
    protected String name;

    public UnitateBancara(String name) {
        this.name = name;
    }


    //pot avea metode abstracte, ca si la interfata
    abstract double credit(Persoana persoana);

    abstract double dobanda(Persoana persoana);

    //sau pot avea si metode cu corp, ceea ce intr-o interfata nu este indicat
    public void credite(Persoana persoana) {
        System.out.print("Creditul lui \"" + persoana.getName() + "\" cu datele de identificare: " + "varsta: " + persoana.getAge() + " ani, CNP: " + persoana.getCnp() + ", avand salariul de " + persoana.getNetSalary() + " lei, este de: ");
    }

    public void dobanzi(Persoana persoana) {
        System.out.print(" lei, iar dobanda aferenta este de: ");
    }
}
