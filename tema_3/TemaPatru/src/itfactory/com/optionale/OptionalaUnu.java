package itfactory.com.optionale;

import java.util.Scanner;

public class OptionalaUnu {
    public static void main(String[] args) {
//        1. Creati un program prin care, avand un text introdus la tastatura, sa se numere cate caractere mici are
//        textul si cate caractere mari are acel text.

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un text:");
        String text = sc.nextLine();
        int bigLetter = 0;
        int smallLeter = 0;
        char[] ch = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(ch[i])) {
                bigLetter++;
            } else if (Character.isLowerCase(ch[i])) {
                smallLeter++;
            }
        }
        System.out.println("letter big: " + bigLetter);
        System.out.println("letter small: " + smallLeter);
    }
}
