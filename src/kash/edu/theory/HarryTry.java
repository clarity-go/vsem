package kash.edu.theory;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  HarryTry
  @version  1.0.0 
  @since 10.03.2021 - 21.53
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class HarryTry {

    public static void main(String[] args) throws IOException {

        // Download a text of a novel about Harry Potter to string
        String text = new String();

        text = new String(Files.readAllBytes(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\harry.txt")));
        text.substring(0, 100);
        System.out.println(text.length()); // count the number of symbols

        // Clean the words from a punctuation signs
        text = text.replaceAll("[^A-Za-z ']", "");

        // Split the novel into an array of words
        String[] words = text.split(" +");
        System.out.println(words.length); // count number of words

        // Print first 20 words
        for  (int i = 0; i < 20; i++){
            System.out.println(words[i]);
        }

        // Count the number of words with a specific number of letters
        int counter = 0;
        int numberOfLetters = 16;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == numberOfLetters) {
                System.out.println(words[i]);
                counter++;
            }
        }
        System.out.println("Words with " + numberOfLetters +
                " letters: " + counter);

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
        System.out.println(distinctWords.length);
        for (int i = 0; i < 100; i++) {
            System.out.println(distinctWords[i]);
        }
    }
}

