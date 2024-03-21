package ua.com.kneu.group203.example2;

import java.util.Arrays;

public class Main
{

    public static void main(String[] args) {

        /*
        byte
        short
        int
        long
        double
        float
        char
        boolean
         */

        /*
        String
         */

        String text = "ab"; // link
        System.out.println(text.hashCode());

        text = text + "123";
        System.out.println(text.hashCode());

        int a = 5;  // val
        a = 10;
        System.out.println(a);

        String text1 = "ab123";
        System.out.println(text1.hashCode());
        System.out.println(text1.equals(text)); // true

       //  System.out.println(text1 == text); false

        Integer a1 = 15;

        System.out.println(a1.hashCode());
        a1++;
        System.out.println(a1.hashCode());

        StringBuilder stringBuilder = new StringBuilder("qwe");
        System.out.println(stringBuilder.hashCode());

        StringBuffer stringBuffer = new StringBuffer("asdsa");
        stringBuilder = stringBuilder.append("123");

        System.out.println(stringBuilder.hashCode());

        String text2 = "I study Java!!!";

        char[] arr = text2.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='!'){
                arr[i]='.';
            }
        }
        System.out.println(text2.toUpperCase());
        System.out.println(text2.toLowerCase());

        String text3 = "I,study.Java !!!";

        String[] array = text3.split(" |\\.|\\,|_");
        System.out.println(Arrays.toString(array));

        String text4 = "I study Java !!!";

        boolean login = text4.startsWith("I study");
        System.out.println(login);

        boolean login1 = text4.endsWith("I study");
        System.out.println(login1);

    }
}
