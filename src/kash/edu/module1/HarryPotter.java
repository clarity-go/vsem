package kash.edu.module1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  HarryPotter
  @version  1.0.0 
  @since 10.03.2021 - 19.41
**/

//        Create another array containing distinct words
//        Order the words in alphabetic order

public class HarryPotter {

    public static void main(String[] args) throws IOException {

        // Download a text of a novel about Harry Potter to string
        // C:\Users\Lenovo\Desktop\MY
        String text = new String();

        text = new String(Files.readAllBytes(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java")));
        text.substring(0, 100);
        System.out.println(text.length()); // count the number of symbols

        // Clean the words from a punctuation signs
        text = text.replaceAll("[^A-Za-z ']", "");

        // Split the novel into an array of words
        String[] words = text.split(" ");
        System.out.println(words.length); // count number of words

        for  (int i = 0; i < 100; i++){
            System.out.println(words[i]);
        }
        // Clean the words from a punctuation signs


    }
}
