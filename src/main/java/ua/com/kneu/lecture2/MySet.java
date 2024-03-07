package ua.com.kneu.lecture2;

import java.util.HashSet;
import java.util.Set;

public class MySet {

    public static void main(String[] args) {

        Set<Integer> set  = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(set);

        Set<Student> students = new HashSet<>();

        students.add(new Student(1L, "Ivanka", "Pypina", 28));
        students.add(new Student(2L, "Vasya", "Pypin", 21));
        students.add(new Student(3L, "Ivan", "Pypin", 24));
        students.add(new Student(4L, "Ivan", "Pypin", 24));

        System.out.println(students);

        students.clear();
        System.out.println(students);



    }


}
