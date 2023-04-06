package itfactory.com;

import java.util.Scanner;

public class ExercitiulTrei {
    public static void main(String[] args) {
        //Sa se creeze un program in care se calculeaza pretul unei cantitati de produse. Pentru aceasta se
        // vor citi urmatoarele 3 variabile: numele produsului, pretul produsului si cantitatea.
        //Se cere ca in functie de datele introduse sa se calculeze pretul final. Se va afisa un mesaj similar:
        // "Pentru produsele de tip {nume produs} si cantitatea {cantitate} , pretul este de {pret calculat}";
        //Aspecte:
        //1. "Cumpar atatea produse cu numele pe care il citesc si calculez pretul total"


        String nume = "mere";
        double cantitate = 4.50;
        double pret = 2.50;
        double pretCalculat = cantitate * pret;
        System.out.println("Pentru produsele de tip " + nume + " si cantitatea " + cantitate + ", pretul este de " + pretCalculat + " lei");


        //SAU


        Scanner sc = new Scanner(System.in);
        Scanner cititor = new Scanner(System.in);

        double pretUniversalProdus = 2.50;

        System.out.println("Va rugam introduceti numele produsului:");
        String numeProdus = sc.nextLine();
        System.out.println("Va rugam introduceti cantitatea");
        double cantitateProduse = Double.parseDouble(cititor.nextLine());
        double pretFinal = cantitateProduse * pretUniversalProdus;
        System.out.println("Pentru produsele de tip " + numeProdus + " si cantitatea " + cantitateProduse + ", pretul este de " + pretFinal + " lei");


        //SAU

        Scanner scan = new Scanner(System.in);
        Scanner cititor2 = new Scanner(System.in);

        double pretMere = 2.50;
        double pretPere = 5.50;
        double pretGutui = 10.50;
        double pretKiwi = 9.50;
        double pretBanane = 7.50;
        double pretPrune = 12.50;

        System.out.println("Va rugam introduceti numele produsului:");
        String numeProdusIntrodus = scan.nextLine();
        System.out.println("Va rugam introduceti cantitatea");
        double cantitateProduseIntroduse = Double.parseDouble(cititor2.nextLine());

        switch (numeProdusIntrodus) {
            case "mere":
                System.out.println("Pentru produsele de tip " + numeProdusIntrodus + " si cantitatea " + cantitateProduseIntroduse + ", pretul este de " + (pretMere * cantitateProduseIntroduse) + " lei");
                break;
            case "pere":
                System.out.println("Pentru produsele de tip " + numeProdusIntrodus + " si cantitatea " + cantitateProduseIntroduse + ", pretul este de " + (pretPere * cantitateProduseIntroduse) + " lei");
                break;
            case "gutui":
                System.out.println("Pentru produsele de tip " + numeProdusIntrodus + " si cantitatea " + cantitateProduseIntroduse + ", pretul este de " + (pretGutui * cantitateProduseIntroduse) + " lei");
                break;
            case "kiwi":
                System.out.println("Pentru produsele de tip " + numeProdusIntrodus + " si cantitatea " + cantitateProduseIntroduse + ", pretul este de " + (pretKiwi * cantitateProduseIntroduse) + " lei");
                break;
            case "banane":
                System.out.println("Pentru produsele de tip " + numeProdusIntrodus + " si cantitatea " + cantitateProduseIntroduse + ", pretul este de " + (pretBanane * cantitateProduseIntroduse) + " lei");
                break;
            case "prune":
                System.out.println("Pentru produsele de tip " + numeProdusIntrodus + " si cantitatea " + cantitateProduseIntroduse + ", pretul este de " + (pretPrune * cantitateProduseIntroduse) + " lei");
                break;
            default:
                System.out.println("Nu avem acest produs/aceasta cantitate pe stoc.");
        }
    }


}

