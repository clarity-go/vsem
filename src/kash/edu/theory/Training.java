package kash.edu.theory;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  Training
  @version  1.0.0 
  @since 14.03.2021 - 20.22
*/

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Training {
    public static void main(String[] args) throws IOException {
        String text = new String();
        text = new String(Files.readAllBytes(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\harry.txt")));

        // Clean the words from a punctuation signs
        text = text.replaceAll("[^A-Za-z ']", "");

        // Split the novel into an array of words
        String[] words = text.split(" +");

        // --------------------------- ALL WORDS ---------------------------
/*
        //print a String representation of an array's contents
//        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
//            System.out.println(words[i]);
            String eachWord = words[i];
//            System.out.println(eachWord);
            int hashCode = eachWord.hashCode();
            System.out.println(eachWord + ": " + hashCode);
        }

        // OPTIMIZED: print first 100 words with their hash codes
        for (int i = 0; i < 100; i++) {
            System.out.println(words[i] + ": " + words[i].hashCode());
        }
*/


        // --------------------------- DISTINCT WORDS ---------------------------
/*
        // Create another array containing distinct words (unique words)
        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {
            if(!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }

        // Print number + distinct word + hash number
        String[] distinctWords = stringOfDistincts.split(" ");

        int[] arrayOfHashes = new int[distinctWords.length];
        for (int i = 0; i < distinctWords.length; i++) {
            String eachWord = distinctWords[i];
//            System.out.println(eachWord);
            int hashCode = eachWord.hashCode();
            System.out.println(i+1 + ". " + eachWord + ": " + hashCode);
        }
*/

        // ----------------- DISTINCT WORDS IN ALPHABETICAL ORDER -----------------


        // Create another array containing distinct words (unique words)
        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {
            if(!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }

        String[] distinctWords = stringOfDistincts.split(" ");

        // Order the words in alphabetic order
        Arrays.sort(distinctWords);


        // Print number + distinct word + hash number
        for (int i = 0; i < distinctWords.length; i++) {
            String eachWord = distinctWords[i];
            int hashCode = eachWord.hashCode();
            System.out.println(i+1 + ". " + eachWord + ": " + hashCode);

        }



        // ----------------- DISTINCT WORDS: SORT BY HASH CODE AS STRING -----------------

/*
        // Create another array containing distinct words (unique words)
        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {
            if(!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }

        String[] distinctWords = stringOfDistincts.split(" ");
        String fullString = "";

        int[] arrayOfHashes = new int[distinctWords.length];
        for (int i = 0; i < distinctWords.length; i++) {
            String eachWord = distinctWords[i];
            arrayOfHashes[i] = eachWord.hashCode();
            System.out.println(distinctWords[i] + ": " + eachWord.hashCode());
            fullString += eachWord.hashCode() + ":" + distinctWords[i] + " ";
        }

        String[] arrayOfFullString = fullString.split(" ");
        Arrays.sort(arrayOfFullString);
        System.out.println(Arrays.toString(arrayOfFullString));
*/

        // ----------------- DISTINCT WORDS: SORT BY HASH CODE -----------------
/*
        // Create another array containing distinct words (unique words)
        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {
            if(!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }

        String[] distinctWords = stringOfDistincts.split(" ");
        int[] arrayOfHashes = new int[distinctWords.length];

        for (int i = 0; i < distinctWords.length; i++) {
            arrayOfHashes[i] = distinctWords[i].hashCode();
        }

        Arrays.sort(arrayOfHashes);
        String wordOfHash = "";

        for (int i = 0; i < arrayOfHashes.length; i++) {
            System.out.print(arrayOfHashes[i] + ": ");
            for (int j = 0; j < arrayOfHashes.length; j++) {
                if(arrayOfHashes[i] == distinctWords[j].hashCode()){
                    wordOfHash = distinctWords[j];
                    System.out.println(wordOfHash);
                    break;
                }
            }
        }
        */
    }
}
