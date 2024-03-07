package ua.com.kneu.lecture2;

import java.util.Arrays;

public class MyArray {

    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        // arr[3] = 4;

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(arr1));

        int[][] arr2 = {{1,2,3,4},{2,3,4,5}};

        for (int i = 0; i < arr2.length; i++) {
            Arrays.toString(arr2[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + ", ");
            }
            System.out.println();
        }

    }

}
