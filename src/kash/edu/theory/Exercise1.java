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

        // # - hash
        // package of 10 bytes: "Hello wo" - 8, other 2 bytes - hashes
        // code of letter 'H' + 'e' + ... - previously calculated in this way
        String string = "Hello, world!";
        System.out.println(string.hashCode());

        // convert int to string
        int firstType = 1234;
        String c = String.valueOf(firstType);
        System.out.println(c + 666);

        // convert string to int
        String stringType = "1234";
        int secondInt = Integer.valueOf(stringType);
        int addedNumber = secondInt + 1000;
        System.out.println(addedNumber);

        Integer b = 567; // class оббертка

        int[] arrInt = {4, 8, 9, 3, 11};
        Arrays.sort(arrInt);
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }

        // ASC - по возрастанию
        // DESC - по убыванию
        Integer[] arrInt2 = {5, 6, 7, 8, 9};
        Arrays.sort(arrInt2, Collections.reverseOrder());

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
