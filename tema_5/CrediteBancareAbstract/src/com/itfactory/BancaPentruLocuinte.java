package com.itfactory;

public class BancaPentruLocuinte extends UnitateBancara{
    public BancaPentruLocuinte(String name) {
        super(name);

    }  //pentru ca este clasa abstracta, aici avem extends, nu implements
    @Override
    double credit(Persoana persoana) {
        return persoana.getNetSalary()*100;
    }

    @Override
    double dobanda(Persoana persoana) {
        return persoana.getNetSalary()*5;  //5/100*persoana.getNetSalary()*100;
    }
}
