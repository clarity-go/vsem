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

/*
    1. HASH (#) CODE, PARADIGMS
    2. ADDITION OF DIFFERENT TYPES
    3. CASTING
    4. OPERATIONS: + - * / && || !=  == a++\
    5. ARRAYS
    6. BOXED TYPE (CLASS ОБЕРТКА)
*/
// Ctrl + Shift + ?  --- comment a couple lines of code

public class Exercise1 {
    public static void main(String[] args) {

        //------------------- 1. HASH (#) CODE -------------------
        // package of 10 bytes: "Hello wo" - 8, other 2 bytes - hashes
        // code of letter 'H' + 'e' + ... - previously calculated in this way
        String string = "Hello, world!";
        System.out.println("Hash code: " + string.hashCode());

        //------------------- 1. PARADIGMS -------------------
        // 1st paradigm: Data types
        // 2nd paradigm: Increment: a++; ++a; a += 1;
        // 3nd paradigm: Cycle loop: fori, for (), while
        // 4nd paradigm: IF: if (true){}
        // 5th paradigm: Arrays

        // the conditional (ternary) operator
        // return (reversed.equals(text)) ? true : false;


        //------------------- 2. ADDITION OF DIFFERENT TYPES -------------------
        //int + int and int + double
        int a = 2;
        int b = 3;
        System.out.println(a + b); // 5
        double c = 6;
        System.out.println(a + c); // 8.0

        //char + char: SCII: code of num 5 ('53') + code of number 9
        char d = '5';
        char e = '9';
        System.out.println(d + e); // 110 - code of letter 'n'

        // string + string
        String f = "5";
        String g = "9";
        System.out.println(f + g); // 59


        //------------------- 3. CASTING -------------------
        // casting int to char
        int h = 115;
        char l = (char) h; // s

        // casting int to String
        int firstInt = 1234;
        String firstStr = String.valueOf(firstInt);
        System.out.println(firstStr + 666); // 1234666
        System.out.println(firstStr.length()); // 4

        // casting String to int
        String stringType = "1234";
        int secondInt = Integer.valueOf(stringType);
        int addedNumber = secondInt + 1000;
        System.out.println(addedNumber); // 2234


        //------------------- 4. OPERATIONS -------------------
        // + - * /
        System.out.println(31 / 2); // 15
        System.out.println(31 % 2); // 1
        a = 5;
        b = 2;
        System.out.println( (double) a / 2); // 2.5

        //logical AND, && - 'конъюнкция' 'conjunction'
        System.out.println((3 > 2) && (4 > 10));

        //logical OR, || - 'дизъюнкция' 'disjunction'
        System.out.println((3 > 2) || (4 > 10));

        // !=  ==
        System.out.println((b != 2) && (a == 5));


        //------------------- 5. ARRAYS -------------------
        // Array of int
        int[] arrayInt = {44, 43, 42, 49};
        arrayInt[3] = 666; // change the value of the element

        // sort the array
        Arrays.sort(arrayInt);
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        } // 42; 43; 44; 666

        int[] array2 = new int[6]; // creation of array for 7 elements

        // Array of String
        String[] words = {"heights", "length", "width"};
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }


        //------------------- 6. BOXED TYPE (CLASS ОБЕРТКА) -------------------
        Integer s = 567; // s - экземпляр класса Integer, a не объект

        // sort the array ASC - по возрастанию
        int[] arrInt = {4, 8, 9, 3, 11};
        Arrays.sort(arrInt);
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }

        // sort the array DESC - по убыванию
        Integer[] arrInt2 = {5, 6, 7, 8, 9};
        Arrays.sort(arrInt2, Collections.reverseOrder()); // collections can not hold primitive types

        // boxed types
        Byte b2 = 2;
        Short shortType = 7;
        Long longType = 77l;
        Double doubleType = 89.0;
        Boolean bolleanType = true;
        Character characterType = '?';
        shortType = null;
        bolleanType = false;
    }
}
