package com.itfactory.switchcondition;

import java.util.Random;

public class Example3 {
    /**
     * In acest program simulam cati bani primim de la parinti pentru a merge la un film.
     * Nu o sa stim cati bani primim asa ca o sa generam un numar intre 0 si 10 sa vedem cati bani ne dau parintii.
     * In caz contrar nu o sa putem sa mergem la film.
     * Costul unui film este de 5 lei.
     * <p>
     * <p>
     * <p>
     * Sa se genereze un numar int random intre 0 si 20
     * Sa se creeze un statement switch prin care se verifica numarul generat.
     * In cazul in care s-a generat 0 o sa afisez un mesaj "Nu am primit nimic. Nu merg la film"
     * In cazul in care s-a generat 1 este o sa afisez un mesaj "Am un leu. Nu merg la film. Mai am nevoie de 4 lei." si se va termina switchul folosind break.
     * In cazul in care s-a generat 2 este o sa afisez un mesaj "Am un leu. Nu merg la film. Mai am nevoie de 3 lei." si se va termina switchul folosind break.
     * In cazul in care s-a generat 3 este o sa afisez un mesaj "Am un leu. Nu merg la film. Mai am nevoie de 2 lei." si se va termina switchul folosind break.
     * In cazul in care s-a generat 4 este o sa afisez un mesaj "Am un leu. Nu merg la film. Mai am nevoie de 1 leu." si se va termina switchul folosind break.
     * In cazul in care s-a generat un numar peste 5 Afisez "Am destui bani pentru film. Yeyyy".
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        int baniPrimiti = random.nextInt(10 + 1);

        switch (baniPrimiti) {
            case 0:
                System.out.println("Nu am primit nimic. Nu merg la film");
                break;
            case 1:
                System.out.println("Am un leu. Nu merg la film. Mai am nevoie de 4 lei");
                break;
            case 2:
                System.out.println("Am " + baniPrimiti + " lei. Nu merg la film. Mai am nevoie de 3 lei");
                break;
            case 3:
                System.out.println("Am " + baniPrimiti + " lei. Nu merg la film. Mai am nevoie de 2 lei");
                break;
            case 4:
                System.out.println("Am " + baniPrimiti + " lei. Nu merg la film. Mai am nevoie de 1 leu");
                break;
            default:
                System.out.println("Am destui bani. Merg la film");

        }
        System.out.println(baniPrimiti);
    }
}


//package com.itfactory.switchcondition;
//
//import java.util.Random;
//
//public class Example3
//{
//    /**
//     * In acest program simulam cati bani primim de la parinti pentru a merge la un film.
//     * Nu o sa stim cati bani primim asa ca o sa generam un numar intre 0 si 10 sa vedem cati bani ne dau parintii.
//     * In caz contrar nu o sa putem sa mergem la film.
//     * Costul unui film este de 5 lei.
//     *
//     *
//     *
//     * Sa se genereze un numar int random intre 0 si 20
//     * Sa se creeze un statement switch prin care se verifica numarul generat.
//     * In cazul in care s-a generat 0 o sa afisez un mesaj "Nu am primit nimic. Nu merg la film"
//     * In cazul in care s-a generat 1 este o sa afisez un mesaj "Am un leu. Nu merg la film. Mai am nevoie de 4 lei." si se va termina switchul folosind break.
//     * In cazul in care s-a generat 2 este o sa afisez un mesaj "Am un leu. Nu merg la film. Mai am nevoie de 3 lei." si se va termina switchul folosind break.
//     * In cazul in care s-a generat 3 este o sa afisez un mesaj "Am un leu. Nu merg la film. Mai am nevoie de 2 lei." si se va termina switchul folosind break.
//     * In cazul in care s-a generat 4 este o sa afisez un mesaj "Am un leu. Nu merg la film. Mai am nevoie de 1 leu." si se va termina switchul folosind break.
//     * In cazul in care s-a generat un numar peste 5 Afisez "Am destui bani pentru film. Yeyyy".
//     * @param args
//     */
//    public static void main(String[] args)
//    {
//        Random random = new Random();
//        int x = random.nextInt(10 + 1);
//
//        switch (x)
//        {
//        case 0: ?
//        default:
//            System.out.println("Am destui bani. Merg la film");
//
//            //Exista un caz special, cazul default. In acest caz, codul se va executa pentru orice alta valoare care nu s-a gasit printre cazurile enumerate.
//            //Acesta se pune mereu ultimul.
//        }
//
//        //
//        System.out.println(x);
//    }
//}