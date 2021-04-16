package kash.edu.theory.module3try;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  harryCols
  @version  1.0.0 
  @since 06.04.2021 - 19.27
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class harryColsEXAM {
    public static void main(String[] args) throws IOException {

        // Download a text of a novel about Harry Potter to string
        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\harry.txt")));

        // Clean the words from a punctuation signs and convert to lowercase
        text = text.toLowerCase().replaceAll("[^A-Za-z ']", "");

        // Split the novel into an array of words
        String[] wordsArray = text.split(" +");

        // Convert array into list
        List<String> list = Arrays.stream(wordsArray).collect(Collectors.toList());

        // Get distinct words using collections and streams
        // Set<String> distincts = list.stream().collect(Collectors.toSet());
        // OR List<String> distincts = list.stream().distinct().collect(Collectors.toList());
        // Set is different from List only by that it doesn't have two same objects, but distincts are not in order

        Map<String, Integer> map = new HashMap<>();
        // "String" is a key, "HashMap" searches by comparing by hash code
        // not in the order (only can be ordered by the number when was added)

        // Calculate the number of mentioning of unique(distinct) words
        Integer value = 0;

        for (int i = 0; i < wordsArray.length; i++) {
            if (!map.containsKey(wordsArray[i])) {
                map.put(wordsArray[i], 1);
            } else {
                value = map.get(wordsArray[i]);
                map.put(wordsArray[i], ++value);
            }
        }

        // map.entrySet().stream().limit(100).forEach(System.out::println);

        // sort it by value to define which words are mostly used
        Map<String, Integer> sorted = new LinkedHashMap<>(); // use LinkedHashMap because it has order, HashMap don't have
        map.entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .forEachOrdered(entry -> sorted.put(entry.getKey(), entry.getValue()));

        // sort by alphabet
/*
        map.entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByKey())
                .forEachOrdered(entry -> sorted.put(entry.getKey(), entry.getValue()));

*/
        sorted.entrySet().stream().limit(100).forEach(System.out::println);
    }
}
