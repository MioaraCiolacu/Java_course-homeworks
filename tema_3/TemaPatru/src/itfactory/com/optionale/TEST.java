package itfactory.com.optionale;

public class TEST {

    public static void main(String[] args) {

        //input string
        String str = "Welcome to [ItaFactory.com]";

        //get the substring between "Beginners" and "com"
        int start = str.indexOf("Ita") + "Ita".length();
        int end = str.lastIndexOf("com");

        String outStr = str.substring(start, end);
        System.out.println(outStr);

    }

}
