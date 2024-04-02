package ua.com.kneu.group201.example2;

import java.util.Arrays;

public class MyString {

    public static void main(String[] args) {

        /*
        byte
        short
        int
        long
        float
        double
        boolean (true/false)
        char ''
         */

        /*
        String
        */

        int a = 5;
        short b = 3;

        System.out.println(Integer.hashCode(a));
        System.out.println(a==b);

        String text = "I study Java!!!";



        System.out.println(text.hashCode());

        text = text + "!";

        System.out.println(text.hashCode());

        if(a!=b) System.out.println("false");

        String text1 = "I study Java!!!!";
        System.out.println(text1.hashCode());

        System.out.println(text1.equals(text));

        StringBuilder stringBuilder = new StringBuilder("Text");

        System.out.println(stringBuilder + ":"+stringBuilder.hashCode());

        stringBuilder = stringBuilder.append("123");

        System.out.println(stringBuilder + ":"+stringBuilder.hashCode());

        StringBuffer stringBuffer = new StringBuffer("Text2");
        System.out.println(stringBuffer + ":" +stringBuffer.hashCode());
        stringBuffer = stringBuffer.append("2345");

        System.out.println(stringBuffer + ":" +stringBuffer.hashCode());

        char[] textCharArray = text1.toCharArray();

        for (int i = 0; i < textCharArray.length; i++) {
            if(textCharArray[i]=='!') textCharArray[i] = '.';
        }

        String text3 = new String(textCharArray);
        System.out.println(text3);

        text3 = text3.replace(".", "!");

        System.out.println(text3);

        String text4 = "\t \t \n I study Java with my teacher! \r \t";

        System.out.println(text4.toLowerCase().trim());
        System.out.println(text4.toUpperCase().trim());

        boolean login = text4.startsWith("\t \t \n I study");
        System.out.println(login);

        boolean login2 = text4.endsWith("\t \t \n I study");
        System.out.println(login2);


        String[] arr =  text4.toUpperCase().trim().split(" |\\,|\\.|_");
        System.out.println(Arrays.toString(arr));



    }





}
