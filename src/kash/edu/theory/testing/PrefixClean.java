package kash.edu.theory.testing;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  PrefixClean
  @version  1.0.0 
  @since 19.04.2021 - 20.04
*/

// 4. Common prefix

public class PrefixClean {
    public static String prefix(String[] array) {
    String commonPrefix = array[0];

    for (int i = 1; i < array.length; i++) {
        while (array[i].indexOf(commonPrefix) != 0) {
            commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
        }
    }
        return commonPrefix;
}

    public static void main(String[] args) {

        String[] array = {"abc", "abcd", "abfce", "abcac"};

        System.out.println(prefix(array));  // ab

        String[] array2 = {"abc", "abcd", "abce", "abcac"};

        System.out.println(prefix(array2)); // abc

    }
}
