package com.itfactory;

public class Insumare implements Task {
    private int numberOne;
    private int numberTwo;

    public Insumare(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }


    @Override
    public void executa() {
        System.out.println("Sum of the two given numbers is " + (numberOne + numberTwo));

    }

}
