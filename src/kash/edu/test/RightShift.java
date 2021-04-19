package kash.edu.test;

import java.util.Arrays;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  RightShift
  @version  1.0.0 
  @since 19.04.2021 - 20.47
**/

// TASK 2: RightShift: Develop a method to realize right shift in an array

public class RightShift {
    public static int[] rightShift(int[] array, int step) {

        for (int i = 0; i < step; i++) {
            // take out the last element
            int temp = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                // shift the array elements towards right by one step
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(Arrays.toString(rightShift(array, 1))); // [30, 10, 20]

        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array2, 2))); // [40, 50, 10, 20, 30]

        int[] array3 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array3, 21))); // [50, 10, 20, 30, 40]
    }
}
/*
----------------- OUTPUT: -----------------
[30, 10, 20]
[40, 50, 10, 20, 30]
[50, 10, 20, 30, 40]
*/
