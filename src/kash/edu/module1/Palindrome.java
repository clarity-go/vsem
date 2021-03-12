package kash.edu.module1;
/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Palindrome
  @version  1.0.0 
  @since 08.03.2021 - 18.14
**/

import java.util.Locale;

// Task: Check a string as a palindrome.

public class Palindrome {

    // First method: For-Loop
    public static boolean isPalindrome1(String text) {
        // remove garbage
        text = text.replaceAll("[^A-Za-zА-Яа-я]", "");
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
        // remove garbage
        text = text.replaceAll("[^A-Za-zА-Яа-я]", "");
        text = text.toLowerCase();
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed.equals(text);
    }

    // Third method: StringBuilder
    public static boolean isPalindrome3(String text) {
        // remove garbage
        text = text.replaceAll("[^A-Za-zА-Яа-я]", "");
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
        String text = "No lemon, no melon";

        System.out.println(" The 1st way:");
        System.out.println(text + ". Is a palindrome: " + isPalindrome1(text));

        System.out.println(" The 2nd way:");
        System.out.println(text + ". Is a palindrome: " + isPalindrome2(text));

        System.out.println(" The 3rd way:");
        System.out.println(text + ". Is a palindrome: " + isPalindrome3(text));
    }
}
/*
*       The 1st way:
*  No lemon, no melon. Is a palindrome: true
*      The 2nd way:
*  No lemon, no melon. Is a palindrome: true
*      The 3rd way:
*  No lemon, no melon. Is a palindrome: true
*/