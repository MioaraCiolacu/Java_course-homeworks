package com.itfactory;

import java.util.Scanner;

public class Problema1 {
    //Problema 1.
    //Sa se creeze un program cu o clasa Main in care se va crea o metoda care citeste cuvinte de la tastatura pana la introducerea unui anume cuvant.
    //Daca cuvantul respectiv contine cuvinte precum ("pruna" sau "pupaza") se va arunca o exceptie. (Exceptia trebuie creata de voi).
    //(Mai pe scurt simulam un mic programel in care prevenim cuvintele vulgare). :)


    public static void main(String[] args)  {
        try {
            saySomething();
        } catch (VulgarWordException e) {
            System.out.println("Cuvant vulgar:(");
            e.printStackTrace();
        }finally {
            System.out.println("E bine sa fim civilizati.");
        }

    }


    public static void saySomething() throws VulgarWordException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Va rugam introduceti un cuvant:");
            String word = scanner.nextLine();
            if(word.equals("pruna") ||word.equals(("pupaza"))){
                throw new VulgarWordException("Va rugam sa folositi cuvinte civilizate.");
            }
        }
    }
}


