package ua.com.kneu.lecture2;

import java.util.LinkedList;
import java.util.Queue;

public class MyFiFo {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        int a = queue.peek();
        System.out.println(a + ":" + queue);

        int b = queue.poll();
        System.out.println(b+":" + queue);

        int c = queue.poll();
        System.out.println(c + ":" + queue);





    }

}
