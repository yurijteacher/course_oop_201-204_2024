package ua.com.kneu.group203.example2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

    public static void main(String[] args) {

        String text = "I study Java!";

        String pattern = "[ IJa-z!]+";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if(m.matches()){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        /*
        [0-9]+ перевірка на цифри
        \d перевірка на цифри
        \D [^0-9] всі символи, окрім 0-9
        \w  або [A-Za-z_0-9] - перевірка на маленькі та великі літери, "_", цифри [0-9]
        \W або [^A-Za-z_0-9] - за виключенням
        \b границя слова
        \B заперечення границі слова
        \t табуляція
        \r повернення каретки
        \f розрив сторінки
        \n перехід на новий рядок
        \s [\t\r\f\n]
        \S заперечення

        [abc] або a, або b, ...
        [^abc] будь-які символи, окрім a,b,c.
        []+ символи можуть повторюватись скільки завгодно разів
        []* може не бути, або може повторюватись скільки завгодно разів
        []{n} - повтор n-разів
        []{n,m} - у діапазоні від n до m
        []{n,} - n>
        []? - 1 або відсутнє
         */


        String email = "vasya123.pypkin.asddf_@kneu.edu.ua";

        String pattern2 = "[a-zA-Z]+[\\.\\w]+@[\\w]+[\\.\\w]+[\\w]{2,}";
        Pattern p1 = Pattern.compile(pattern2);
        Matcher m1 = p1.matcher(email);

        if(m1.matches()){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


}
