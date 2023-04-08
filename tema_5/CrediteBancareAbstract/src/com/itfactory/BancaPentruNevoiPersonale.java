package com.itfactory;

public class BancaPentruNevoiPersonale extends UnitateBancara{
    public BancaPentruNevoiPersonale(String name) {
        super(name);

    }  //pentru ca este clasa abstracta, aici avem extends, nu implements
    @Override
    double credit(Persoana persoana) {
        return persoana.getNetSalary()*10;
    }

    @Override
    double dobanda(Persoana persoana) {
        return persoana.getNetSalary()*0.8;  //8/100*persoana.getNetSalary()*10;;
    }
}
