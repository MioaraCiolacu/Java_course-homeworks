package com.itfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Task task;
        List<Task> num = new ArrayList<>();
        Random generator = new Random();
        for (int i = 0; i < 10; i++) {
            int numarGenerat = generator.nextInt(2);
            System.out.println("Generate number is  " + numarGenerat);
            if (numarGenerat == 0) {
                task = new Printer("HP"); 
                num.add(task);
              //  task.executa();  //afisat aici, se va afisa numarul generat si blocul (metoda) de executat, una dupa alta
            } else {
                task = new Insumare(5, 6); 
                num.add(task);
              // task.executa();
            }
        }

        for (Task tasks : num) {    //scris aici acest bloc de cod, va fi mai intai numarul generat afisat si apoi metodele corespunzatoare numerelor generate
            tasks.executa();
        }

    }
}
