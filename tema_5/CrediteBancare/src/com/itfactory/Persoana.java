package com.itfactory;

public class Persoana {
    private String name;
    private int age;
    private long cnp;
    private double netSalary;


    public Persoana(String name, int age, long cnp, double netSalary) {
        this.name = name;
        this.age = age;
        this.cnp = cnp;
        this.netSalary = netSalary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getCnp() {
        return cnp;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }
}
