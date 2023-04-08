package extraoptionale;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Extraoptionala3 {
    public static void main(String[] args) {

//Problema 3.
//Sa se creeze un progeram simplu (O clasa Main cu metoda main) in care se va defini o lista de Stringuri (List<String>).
//Mai departe se vor citi de la tastatura mai multe String-uri (Alegeti un numar relativ mic sa nu va complicati.
// de exemplu 3-4 valori sunt de ajuns).
//Aceste String-uri se vor introduce in lista doar string-urile citite care nu contin litera "a". (se va verfifica
// cu metoda contains din String)
//Exemplu:
//Introduceti cuvantul: birou // O sa il introduc
//Introduceti cuvantul: para // Nu sa il introduc

        List<String> listaElemente = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Va rugam sa introduceti 5 elemente:");
        for (int i = 0; i < 5; i++) {
            String element = sc.nextLine();
            if (!(element.contains("a"))) {
                listaElemente.add(element);
            }
        }
        System.out.println("Lista care indeplineste conditia este formata din" + listaElemente);
    }
}