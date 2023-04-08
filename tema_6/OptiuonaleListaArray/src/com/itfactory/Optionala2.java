package com.itfactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Optionala2 {
    public static void main(String[] args) {
//        2. Se da o lista de String-uri aleatoriu (construiți voi lista). Se cere sa se afișeze string-ul cu cea mai
//        mare lungime. Dacă sunt mai multe string-uri cu aceeași lungime maxima se vor afișa toate

        List<String> list = new ArrayList<>(Arrays.asList("plimbare", "distractie", "munca", "serviciu", "academie", "pompieri", "padure", "calculator", "intreprindere"));

        //       initializez o variabiala de lungime 0 si cu ajutorul ei, urmaresc cea mai mare lungime intalnita (contor pt lungimea maxima)
        int lungimeMax = 0;
        List<String> maxList = new ArrayList<>();  //creez o noua lista unde voi stoca elementul/ele cu lungimea cea mai mare
        for (String cuvant : list) {      //parcurg lista si compar fiecare elem cu lungimeaMax
            if (cuvant.length() > lungimeMax) {
                lungimeMax = cuvant.length();      //daca lungimea unui cuvant este > lungimeMax, atunci lungimeMax devine valoarea aceasta si
                                                   // atunci o stochez intr-o noua lista maxList
                maxList = new ArrayList<>();
                maxList.add(cuvant);
            } else if (cuvant.length() == lungimeMax) {
                maxList.add(cuvant);
            }
        }
        //afisare lista cu elementele de lungime max (daca am 1 element, atunci va fi afisat doar 1, daca sunt mai multe, at se afiseaza toate
        System.out.println("Cuvintele cu cele mai mari lungimi sunt: ");
        for (String cuvant : maxList) {
            System.out.println(cuvant);
        }
		
		
		       // Alternativa trainer
//        //Extrag lungimea maxima printr-un comparator ce verifica lungimea fiecarui string.
//        int maxLength = list.stream().max(Comparator.comparingInt(String::length)).get().length();
//
//        //Filtrez lista sa imi extraga elementele cu lungimea maxima
//        System.out.println(list.stream()
//                               .filter(element -> element.length() == maxLength)
//                               .collect(Collectors.toUnmodifiableList()));
    }
}




