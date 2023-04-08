package com.itfactory;

public class BancaPentruNevoiPersonale implements UnitateBancara{

    @Override
    public double credit(Persoana persoana) {
        return persoana.getNetSalary()*10;
    }

    @Override
    public double dobanda(Persoana persoana) {
        return persoana.getNetSalary()*0.8;  //8/100*persoana.getNetSalary()*10;;
    }


}
