package kash.edu.theory.testing;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  RightShift
  @version  1.0.0 
  @since 19.04.2021 - 18.04
*/

// 2. RightShift: Develop a method to realize right shift in an array.

import java.util.Arrays;

public class RightShift {
    public static int[] rightShift(int[] array, int step){

/*        //Rotate the given array by a particular number of steps toward right
        for(int i = 0; i < step; i++){
            int n, last;
            //Store the last element of array
            last = array[array.length-1];

            for(n = array.length-1; n > 0; n--){
                //Shift the elements of the array by one
                array[n] = array[n-1];
            }
            //Last element of the array will be added to the beginning
            array[0] = last;
        }*/


        // --------------

        for (int i = 0; i < step; i++) {
            // take out the last element
            int temp = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                // shift the array elements towards right by one place
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }


/*
// create temp array of size d
        int temp[] = new int[array.length - step];

        // copy first N-D element in array temp
        for (int i = 0; i < array.length - step; i++)
            temp[i] = array[i];

        // move the rest element to index
        // zero to D
        for (int i = array.length - step; i < array.length; i++) {
            array[i - step - 1] = array[i];
        }

        // copy the temp array element
        // in origninal array
        for (int i = 0; i < array.length - step; i++) {
            array[i + step] = temp[i];
        }

*/
// ----------------------------

/*
        for (int i = 0; i < step; i++) {
            int last = array[array.length - 1];
            for (int j = array.length - 2; j >= 0; j--) {
                array[j + 1] = array[j];
            }
            array[0] = last;
        }
*/


        return array;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(Arrays.toString(rightShift(array, 1))); // [30, 10, 20]

        int[] array2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(rightShift(array2, 2))); // [40, 50, 10, 20, 30]

        System.out.println(Arrays.toString(rightShift(array2, 21))); // [50, 10, 20, 30, 40]
    }
}
