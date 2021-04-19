package kash.edu.theory.testing;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Duplicates
  @version  1.0.0 
  @since 19.04.2021 - 17.58
*/

// 3. Duplicates: Check the existence of duplicates in an array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {
    public  static  boolean hasDuplicates(int[] array){

        // Create the initial list
        List<Integer> initialList = new ArrayList<Integer>(array.length);
        for (int i : array) { initialList.add(i); }

        // Delete the duplicates in the list
        List<Integer> list2 = Arrays.stream(array).boxed()
                .distinct().collect(Collectors.toList());

        // return true or false depending on the compared sizes of the lists
        return initialList.size() == list2.size() ? false : true;
    }

    public static void main(String[] args) {
        int[] array = {1,5,3,6,2,9,33,21};
        System.out.println(hasDuplicates(array));  // false
        array[5] = 1;
        System.out.println(hasDuplicates(array)); // true
    }
}

