package ua.com.kneu.lecture2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyList {

    public static void main(String[] args) {

        List list = List.of(1,2,3,4);

        System.out.println(list);


        // for
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+", ");
        }

        System.out.println("/");

        int i = 0;
        // while
        while (i < list.size()){
            System.out.print(list.get(i)+", ");
            i++;
        }

        i = 0;

        System.out.println("/");

        do {
            System.out.print(list.get(i)+", ");
            i++;
        } while (i < list.size());

        list
                .stream()
                .forEach(e ->
                {
            System.out.println(e);
        }
        );

        list
                .stream()
                .forEach(System.out::println);


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println(list1);

        list1.set(1, 10);

        System.out.println(list1);

        list1.remove(1);
        System.out.println(list1);

        list1.clear();

        System.out.println(list1);


        List<Student> students = new ArrayList<>();

        // v.1
        students.add(new Student(1L, "Vasya", "Pypkin", 23));

        // v.2
        Student student = new Student();
        student.setId(2L);
        student.setFirstName("Ivan");
        student.setLastName("Pepkin");
        student.setAge(21);

        students.add(student);

        // v.3

        Student student1 = new Student(3L, "Ivanka", "Pyp", 28);
        students.add(student1);


        System.out.println(students);
        students.add(new Student(4L, "Vasya", "Pypkin", 23));
        students.remove(3);
        System.out.println(students);


        List<Student> studentsSorted =  students
                .stream()
                .sorted(Comparator.comparing(Student::getAge))
                .collect(Collectors.toList());

        List<Student> studentsSorted1 =  students
                .stream()
                .sorted(Comparator.comparing(Student::getAge))
                .toList();

        studentsSorted.stream().forEach(System.out::println);

        Student studentMinAge = students
                .stream()
                .min(Comparator.comparing(Student::getAge))
                .get();

        System.out.println(studentMinAge);

        int ageMax = students.stream()
                .max(Comparator.comparing(Student::getAge))
                .get()
                .getAge();

        System.out.println(ageMax);

    }

}
