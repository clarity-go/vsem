package kash.edu.theory;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Exercise1
  @version  1.0.0 
  @since 12.03.2021 - 19.00
*/
import java.util.Arrays;
import java.util.Collections;

public class Exercise1 {
    public static void main(String[] args) {
        String string = "Hello world!";

        Integer b = 567; // class оббертка
        String str3 = " 1234";
        int d = Integer.valueOf(str3);

        int[] arrInt = {4, 8, 9, 3, 11};
        Arrays.sort(arrInt);
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }

        // ASC - по возрастанию
        // DESC - по убыванию
        Integer[] arrInt2 = {5, 6, 7, 8, 9};
        Arrays.sort(arrInt, Collections.reverseOrder());

        byte b1 = 2;
        Byte b2 = 2;
        Short shortType = 7;
        Long longType = 77l;
        Double doubleType = 89.0;
        Boolean bolleanType = true;
        char charType = '&';
        Character characterType = '?';
        shortType = null;
        bolleanType = false;

    }
}
