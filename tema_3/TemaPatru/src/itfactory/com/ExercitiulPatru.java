package itfactory.com;

import java.util.Scanner;

public class ExercitiulPatru {
    public static void main(String[] args) {
        //Sa se creeze un program in care se va citi de la tastatura siruri de caractere pana cand introduc
        // textul "stop";
        //Aspecte.
        //1. Se va folosi bucla "while"
        //
        //Simulare:
        //Introduceti textul: masina
        //Introduceti textul: avion
        //Introduceti textul: stop
        //
        //Am iesit din program.

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduceti textul: ");
        String text=sc.nextLine();
        while(!(text.equalsIgnoreCase("stop"))){
            System.out.println("Introduceti textul: ");
            String textIntrodus=sc.nextLine();
            if(textIntrodus.equalsIgnoreCase("stop")){
                break;
            }

        }
        System.out.println("Am iesit din program.");


    }
}
