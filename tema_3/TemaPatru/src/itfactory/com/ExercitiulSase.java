package itfactory.com;

public class ExercitiulSase {
    public static void main(String[] args) {
        //Se da urmatorul text:
        //"Ma numesc NumePrenume si sunt cursant la cursul de testare din cadrul companiei facebook."
        //Sa se scrie un program prin care sa se corecteze textul si sa se inlocuiasca cuvintele gresite:
        //Aspecte:
        //1. "NumePrenume" - se va inlocui cu numele cursantului.
        //2. "testare" - se va inlocui cu tipul de curs la care participati.
        //3. "facebook" - se va inlocui cu numele companiei unde participati la curs.

        String text = "Ma numesc NumePrenume si sunt cursant la cursul de testare din cadrul companiei facebook.";
        String textInlocuit = text
                .replace("NumePrenume", "Ciolacu Mioara")
                .replace("testare", "Java & OOP")
                .replace("facebook", "IT Factory");
        System.out.println(textInlocuit);

    }
}
