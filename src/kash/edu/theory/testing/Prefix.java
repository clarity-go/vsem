package kash.edu.theory.testing;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Prefix
  @version  1.0.0 
  @since 19.04.2021 - 18.03
*/

// 4. Common prefix

public class Prefix {
    public static String prefix(String[] array) {

        String prefix = array[0];
        for (int i = 1; i < array.length; i++) {
            while (array[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.equals("")) return "";
            }
        }
        return prefix;


        /*
        String commonPrefix = "";
        if (array.length > 0) {
            commonPrefix = array[0];
        }
        for (int i = 1; i < array.length; i++) {
            String analyze = array[i];
            int j = 0;
            for (; j < Math.min(commonPrefix.length(), array[i].length()); j++) {
                if (commonPrefix.charAt(j) != analyze.charAt(j)) {
                    break;
                }
            }
            commonPrefix = array[i].substring(0, j);
        }
        return commonPrefix;
        */
    }

    public static void main(String[] args) {
        String[] array = {"abc", "abcd", "abfce", "abcac"};

        System.out.println(prefix(array));  // ab

        String[] array2 = {"abc", "abcd", "abce", "abcac"};

        System.out.println(prefix(array2)); // abc
    }
}

