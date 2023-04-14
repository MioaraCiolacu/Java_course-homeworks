package com.itfactory;

import java.util.ArrayList;
import java.util.List;



public class Servicii {
    private List<Person> persoane = new ArrayList<>();

public void persoaneInLista(Person persoana){
    persoane.add(persoana);
}

    public void persoaneInLista2(Person persoana) throws ServiceException {
        persoane.add(persoana);
        for (Person persoana2 : persoane) {
            if (persoana2.equals(persoana)) {
                throw new ServiceException("Avem deja aceasta persoana in lista");
            }
        }

    }

    public void verificaCNP(long personCNP) throws ServiceException {
        boolean cnpGasit = false;
        for (Person persoana3 : persoane) {
            if (persoana3.getCNP() == personCNP) {
                System.out.println("Numele este: " + persoana3.getNumeComplet());
                cnpGasit = true;
                break;
            }
        }
        if (!cnpGasit) {
            throw new ServiceException("Nu avem aceasta persoana in lista");
        }

    }

    public void verificaCNPNume(String numePerson, long personCNP) throws ServiceException {
        boolean cnpNumeGasit = false;
        for (Person persoana3 : persoane) {
            if (persoana3.getCNP() == personCNP && !(persoana3.getNumeComplet().equals(numePerson))) {
                System.out.println("Numele este: " + persoana3.getNumeComplet());
                cnpNumeGasit = true;
                break;
            }
        }
        if (!cnpNumeGasit) {
            throw new ServiceException("Nu exista 2 persoane cu acelasi CNP.");
        }


    }

    @Override
    public String toString() {
        return "Servicii{" +
                "persoane=" + persoane +
                '}';
    }

}
