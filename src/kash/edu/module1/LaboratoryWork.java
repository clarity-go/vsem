package kash.edu.module1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  LaboratoryWork
  @version  1.0.0 
  @since 15.03.2021 - 17.59
**/
/*
        1.  Find the longest word in the above text.
        2.  Count the LINES where the word "Harry" is met.
        3.  Take  the array of distinct words from Harry Potter.
        4.  How many distinct words begin from the letter "C".
        5.  Create an array of hashes.
        6.  Count the intersections of hashes.
*/

public class LaboratoryWork {
    public static void main(String[] args) throws IOException {

        // Download a text of a novel about Harry Potter to string
        String text = new String();

        text = new String(Files.readAllBytes(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\harry.txt")));

        // Clean the words from a punctuation signs
        text = text.replaceAll("[^A-Za-z ']", "");

        // Split the novel into an array of words
        String[] words = text.split(" +");

        // Take  the array of distinct words from Harry Potter.
        String stringOfDistincts = "";

        for (int i = 0; i < words.length; i++) {
            if (!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }

        String[] distinctWords = stringOfDistincts.split(" ");


        // How many distinct words begin from the letter "C".
        int numberOfWordsWithC = 0;
        for (int l = 0; l < distinctWords.length; l++) {
            if (words[l].charAt(0) == 'C') {
                numberOfWordsWithC++;
            }
        }
        System.out.println(numberOfWordsWithC);
        // Output: 8


        // Find the longest word in the above text.
        String longestWord = "";

        for(int n = 0; n < distinctWords.length; n++){
            if(distinctWords[n].length() > longestWord.length()){
                longestWord = distinctWords[n];
            }
        }
        System.out.println(longestWord);
        // Output: interestinglooking


        // Count the LINES where the word "Harry" is met.

        String[] linesOfText = text.split("/n");
        for (int k = 0; k < linesOfText.length; k++) {
            if("Harry"){

            }
        }


        System.out.println(Arrays.toString(linesOfText).length());








        /*

        for (int i = 0; i < distinctWords.length; i++) {

        }


        // Create an array of hashes.
        int[] arrayOfHashes = new int[distinctWords.length];

        for (int i = 0; i < distinctWords.length; i++) {
        arrayOfHashes[i] = distinctWords[i].hashCode();
        }







*/





//        int[] arrayOfHashes = new int[words.length];
//
//        for (int i = 0; i < words.length; i++) {
//            arrayOfHashes[i] = words[i].hashCode();
//        }

        // Count the intersections of hashes.

//        int intersectionsOfHashes = 0;
//        for (int i = 0; i < arrayOfHashes.length; i++) {
//            if arrayOfHashes[i] =
//        }


        // Count the number of words with a specific number of letters
//        int counter = 0;
/*        int numberOfLetters = 16;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == numberOfLetters) {
                System.out.println(words[i]);
                counter++;
            }
        }
        System.out.println("Words with " + numberOfLetters +
                " letters: " + counter);*/


    }
}

