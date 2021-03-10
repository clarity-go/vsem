package kash.edu.theory;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Arrays
  @version  1.0.0 
  @since 10.03.2021 - 19.49
*/

public class Arrays {
    public static void main(String[] args) {
        int[] arrayInt = {44, 43, 42, 41};
        arrayInt[3] = 666;
        System.out.println(arrayInt[3]);

        int[] array2 = new int[6]; // creation of array for 7 elements
        String[] words = {"heights", "length", "width"};

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
