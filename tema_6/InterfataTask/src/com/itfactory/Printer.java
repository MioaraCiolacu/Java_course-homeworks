package com.itfactory;

public class Printer implements Task {

    private String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void executa() {
        System.out.println(" Name of this printer is " + name);

    }


}
