package kash.edu.theory;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Exam
  @version  1.0.0 
  @since 16.04.2021 - 19.03
*/

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exam {
    public static  int[] deleteDuplicates(int[] array){

        // convert array into list and using distinct sort out distinct numbers
        List<Integer> list = Arrays.stream(array).boxed()
                .distinct().collect(Collectors.toList());

        int[] array2 = new int[list.size()];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) list.get(i);
        }

        // Not Working Variants:
        // List<Integer> list = (List<Integer>) Arrays.stream(array).distinct().collect(Collectors.toList());
        // List<Integer> list = Arrays.stream(array).map(item -> Integer.valueOf(item)).distinct().collect(Collectors.toList());
        // List<Integer> list = Arrays.asList(array);
        // List<Integer> list = new ArrayList<>(
        //         Arrays.asList(array)
        // );

        return array2;
    }

    public static void main(String[] args) {
        int[] array = {1, 6, 9, 5, 6};
        System.out.println(deleteDuplicates(array));
        // convert array to string
        System.out.println(Arrays.toString(deleteDuplicates(array))); // Expected output: [1, 6, 9, 5]
        // can not sout array, because it can not be transformed to the String
    }
}
