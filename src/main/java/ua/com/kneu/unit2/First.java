package ua.com.kneu.unit2;

public class First {

    static int a = 5;
    static int b = 10;
    public static void main(String[] args) {

//        int a = 3;
//        int b = 5;

        int c = a + b;

        System.out.println(c);

        int d = sum(1,2);

        System.out.println(d);

        System.out.println(sum(3, 4));

        print();

        printSum(5,6);

    }

    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }

    public static void print(){
        System.out.println(a+b);
    }

    public static void printSum(int a, int b){
        System.out.println(a+b);
    }

}
