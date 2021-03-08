package kash.edu.module1;
/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Palindrome
  @version  1.0.0 
  @since 08.03.2021 - 18.14
*/

import java.util.Locale;

public class Palindrome {

    // First method: for-loop
    public static boolean isPalindrome1(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", ""); // remove garbage
        text = text.toLowerCase();

        boolean result = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }

    // Second method: Reverse String
    public static boolean isPalindrome2(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", ""); // remove garbage
        text = text.toLowerCase();
        boolean result = true;
    // write code here
        return result;
    }

    // Third method: StringBuilder usage
    public static boolean isPalindrome3(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", ""); // remove garbage
        text = text.toLowerCase();
        boolean result = true;

        StringBuilder builder = new StringBuilder(text);
        String reversed = builder.reverse().toString();

        if (!text.equals(reversed)) {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        String text = "Кинь лед зебре, бобер бездельник!";

        System.out.println(" The first way");
        System.out.println(text + " Is a palindrome? " + isPalindrome1(text));

        System.out.println(" The second way");
        System.out.println(text + " Is a palindrome? " + isPalindrome2(text));

        System.out.println(" The third way");
        System.out.println(text + " Is a palindrome? " + isPalindrome3(text));
    }
}
