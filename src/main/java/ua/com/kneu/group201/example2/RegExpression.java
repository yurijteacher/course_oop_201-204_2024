package ua.com.kneu.group201.example2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {

    public static void main(String[] args) {

        String text = "I study Java with my teacher!";

        String pattern = "[ IJa-z]";

        Pattern p = Pattern.compile(pattern);
        Matcher m =  p.matcher(text);

        if(m.matches()){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println(m.matches() ? "true" : "false");

        /*
        [0-9] або \d - перевірка на цифри
        [^0-9] або \D - всі символи, окрім цифр
        [a-zA-Z_] або \w - всі маленькі та великі символи + "_"
        [^a-zA-Z_] або \w - всі символи, окрім маленьких, великих символів та "_"
        \b - границя слова
        \B - заперечення
        \t табуляція
        \r зміна каретки
        \f розрив сторінок
        \n перехід на новий рядок
        \s [\t\r\f\n]
        \S

        [abc] або а, або b, або с
        [^abc] будь-які значення, окрім abc
        [0-9] [a-z] [A-Z]

        X+ може бути один раз, або може повторюватись скільки завгодно разів
        X* може не бути, або може повторюватись скільки завгодно разів
        X{n} n-разів
        X{n,m} [з .. по ..]
        X{n,} n>
        X? 1 або відсутнє
         */










    }

}
