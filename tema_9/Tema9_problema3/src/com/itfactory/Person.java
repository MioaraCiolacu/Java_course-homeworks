package com.itfactory;

import java.util.Objects;

public class Person {
    private String numeComplet;
    private long CNP;

    public Person(String numeComplet, long CNP) {
        this.numeComplet = numeComplet;
        this.CNP = CNP;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return CNP == person.CNP && Objects.equals(numeComplet, person.numeComplet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeComplet, CNP);
    }

    @Override
    public String toString() {
        return "Person{" +
                "numeComplet='" + numeComplet + '\'' +
                ", CNP=" + CNP +
                '}';
    }

    public String getNumeComplet() {
        return numeComplet;
    }

    public void setNumeComplet(String numeComplet) {
        this.numeComplet = numeComplet;
    }

    public long getCNP() {
        return CNP;
    }

    public void setCNP(long CNP) {
        this.CNP = CNP;
    }
}
