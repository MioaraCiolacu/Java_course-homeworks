package optionaletematrei;

import java.util.Scanner;

public class OptionalaUnu {
    public static void main(String[] args) {
        //1. Scrieti un program in care, folosind o bucla (? decideti voi care) o sa cititi de la tastatura numere
        // intregi pana la intalnirea unui numar divizibil cu 7.

        Scanner cititor = new Scanner(System.in);
        while (true) {
            System.out.print("Introduceti un numar:");
            int numarIntrodus = Integer.parseInt(cititor.nextLine());
            if (numarIntrodus % 7 == 0)
                break;
        }
    }
}
