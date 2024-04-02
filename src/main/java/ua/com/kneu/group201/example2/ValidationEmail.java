package ua.com.kneu.group201.example2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationEmail {

    public static void main(String[] args) {


        int a = 5;

        // [0-9]+ 234435435435

        // [0-9]+[\\.]?[0-9]+ // double 24324.344


        String email = "vasya123._pypkin.sdfg@kneu.edu.ua";
        String pattern = "[a-zA-Z]+[\\.\\w]+@[\\w]+[\\.\\w]+[\\w]{2,}";


        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(email);

        if(m.matches()){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
