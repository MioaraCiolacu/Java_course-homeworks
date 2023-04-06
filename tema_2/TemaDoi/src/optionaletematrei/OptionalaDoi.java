package optionaletematrei;

public class OptionalaDoi {
    public static void main(String[] args) {
        //2. Scrieti un program in care afisati toate numerele intregi de la -100 la 100, mai putin cele divizibile
        // cu 2 sau cu 3.

        for (int j = -100; j <= 100; j++) {

            if (j % 2 == 0 || j % 3 == 0) {
                continue;
            }
            System.out.print(j+" ");

        }
    }
}
