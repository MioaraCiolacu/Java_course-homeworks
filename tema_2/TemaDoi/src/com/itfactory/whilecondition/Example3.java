package com.itfactory.whilecondition;


public class Example3 {
    /**
     * Se da un numar x = 1.
     * Se se incrementeze numarul x pana cand acesta depaseste 5.
     *
     * @param args
     */
//    public static void main(String[] args) {
//        int primulNumar = 1;
//
//        while (true) {
//            primulNumar++;
//            if (primulNumar <= 5) {
//                System.out.println(primulNumar++);
//                primulNumar--;
//            } else {
//                System.out.println(" Urmatorul numar a depasit valoarea 5. Vom termina instructiunea.");
//                break;
//            }
//
//        }
//    }
//}

//sau
    public static void main(String[] args) {
        int primulNumar = 1;

        while (true) {
            primulNumar++;
            if (primulNumar > 5) {
                System.out.println("Urmatorul numar a depasit valoarea 5. Vom termina instructiunea.");
                break;
            } else {
                System.out.println(primulNumar++);
                primulNumar--;

            }

        }
    }
}


//package com.itfactory.whilecondition;
//
//
//public class Example3
//{
//    /**
//     * Se da un numar x = 1.
//     * Se se incrementeze numarul x pana cand acesta depaseste 5.
//     * @param args
//     */
//    public static void main(String[] args)
//    {
//        int x = 1;
//
//    }
//}