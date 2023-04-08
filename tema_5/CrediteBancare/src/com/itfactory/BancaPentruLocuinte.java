package com.itfactory;

public class BancaPentruLocuinte implements UnitateBancara{
    @Override
    public double credit(Persoana persoana) {
        return persoana.getNetSalary()*100;
    }

    @Override
    public double dobanda(Persoana persoana) {
        return persoana.getNetSalary()*5;  //5/100*persoana.getNetSalary()*100;
    }
}
