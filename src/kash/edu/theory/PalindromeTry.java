package kash.edu.theory;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  PalindromeTry
  @version  1.0.0 
  @since 12.03.2021 - 22.08
*/

public class PalindromeTry {
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
        text = text.replaceAll("[^A-Za-zА-Яа-я]", "").toLowerCase();;

        boolean result = true;

        StringBuilder builder = new StringBuilder(text);
        String reversed = builder.reverse().toString();

        if (!text.equals(reversed)) {
            result = false;
        }
        return result;
    }
    //      Optimized version:
    //      return(builder.reverse().toString().equals(text));

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
