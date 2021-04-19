package kash.edu.theory.testing;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  DuplicatesClean
  @version  1.0.0 
  @since 19.04.2021 - 20.44
*/

import java.util.Arrays;

public class DuplicatesClean {
    public  static  boolean hasDuplicates(int[] array){
        Arrays.sort(array);
        int numberOfIntersections = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == array[i + 1]){
                numberOfIntersections++;
            }
        }
        return (numberOfIntersections == 0) ? false : true;
    }

    public static void main(String[] args) {
        int[] array = {1,5,3,6,2,9,33,21};
        System.out.println(hasDuplicates(array));  // false
        array[5] = 1;
        System.out.println(hasDuplicates(array)); // true
    }
}
