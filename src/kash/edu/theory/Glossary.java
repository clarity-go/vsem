package kash.edu.theory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.Map.Entry;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  Glossary
  @version  1.0.0 
  @since 18.04.2021 - 13.23
**/
/* 1. GLOSSARY - 10 points
        1.1. Download a text about Harry Potter.
        1.2. For each distinct word in the text calculate the number of occurrence.
        1.3. Use RegEx.
        1.4. Sort in the DESC mode by the number of occurrence.
        1.5. Find the first 20 pairs.
        1.6  Find all the proper names.
        1.7. Count them and arrange in alphabetic order.
        1.8. First 20 pairs and names write into to a file test.txt.
        1.9. Create a fine header for the file.
        1.10 Use Java Collections to demonstrate your experience (Map, List).

        Program Output:
        First 20 pairs:
        Word: the, occurences: 3314
        Word: to, occurences: 1850
        Word: and, occurences: 1812
        Word: a, occurences: 1581
        Word: of, occurences: 1250
        Word: Harry, occurences: 1213
        Word: was, occurences: 1178
        Word: he, occurences: 1034
        Word: in, occurences: 935
        Word: his, occurences: 896
        Word: it, occurences: 805
        Word: said, occurences: 793
        Word: you, occurences: 736
        Word: had, occurences: 697
        Word: I, occurences: 654
        Word: on, occurences: 619
        Word: that, occurences: 582
        Word: at, occurences: 581
        Word: He, occurences: 494
        Word: him, occurences: 494

        Proper names amount: 1521
        Harry
        Potter
        Sorcerer
        Stone
        Dursley
        Privet
        Drive
        They
        Dursley
        Grunnings
        Dursley
        Dudley
        They
        Potters
        Potter
        Dursley
        Dursleys
*/

public class Glossary {
    public static void main(String[] args) throws IOException {
        // Get a text of a novel about Harry Potter from the file
        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\harry.txt")));

        // Clean the words from a punctuation signs, convert to lowercase
        // and split the novel into an array of words
        String[] wordsArray = text.toLowerCase()
                .replaceAll("[^A-Za-z ']", "")
                .split(" +");

        // Convert array into list
        // List<String> list = Arrays.stream(wordsArray).collect(Collectors.toList());

        // Get distinct words using collections and streams
        // Set<String> distincts = list.stream().collect(Collectors.toSet());
        // List<String> distincts = list.stream().distinct().collect(Collectors.toList());
        // Set is different from List only by that it doesn't have two same objects, but distincts are not in order

        // For each distinct word in the text calculate the number of occurrence
        Map<String, Integer> wordMapCount = new HashMap<>();

        for (String word: wordsArray)
        {
            if (wordMapCount.containsKey(word))
            {
                // If map contains the word key -> increment its count by 1
                wordMapCount.put(word, wordMapCount.get(word) + 1);
            } else {
                // If map doesn't have mapping for word -> add one with count = 1
                wordMapCount.put(word, 1);
            }
        }
// ---------------------------------------- 1 -------------------------------------------------------------
        // Sort distinct words in the DESC mode by the number of occurrence
/*
        Map<String, Integer> sortedByCount = new LinkedHashMap<>();
        wordMapCount.entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .forEachOrdered(entry -> sortedByCount.put(entry.getKey(), entry.getValue()));

        System.out.println(sortedByCount);


        String str = "";
        StringBuilder sb = new StringBuilder(str);

        Files.lines(Paths.get(file))
                .filter(log -> log.contains("ERROR"))
                // .filter(log -> log.contains("2019"))
                .forEach(log -> sb.append(log + '\n'));



        // Write first 20 pairs to the file test.txt
        String fileOutput = "C:\\Users\\Lenovo\\Desktop\\MY\\Java\\" + "test.txt";
        Files.write(Paths.get(fileOutput), ("Word: " + sortedByCount.getKey() + ", occurrences: " + sortedByCount.getValue() + "\n")
                .getBytes());



        for (int i = 0; i < 20; i++)
        {
            Map.Entry<String, Integer> pair = items.next(); // get next item
            // System.out.format("Word: %s, occurrences: %d%n", pair.getKey(), pair.getValue());
            System.out.println("Word: " + pair.getKey() + ", occurrences: " + pair.getValue());
            // Write occurrence pair to the file
            Files.write(path, ("Word: " + pair.getKey() + ", occurrences: " + pair.getValue() + "\n")
                    .getBytes(), StandardOpenOption.APPEND);
        }

*/

/*      String str = "";
        StringBuilder sb = new StringBuilder(str);

        Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .filter(log -> log.contains("ERROR"))
                // .filter(log -> log.contains("2019"))
                .forEach(log -> sb.append(log + '\n'));*/

// ---------------------------------------- 2 -------------------------------------------------------------


        //Sort in the DESC mode by the number of occurrence.
        final Map<String, Integer> sortedByCount = wordMapCount.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        // Create iterator 'items' to be able to switch to next sortedByCount map elements from the beginning
        Iterator<Map.Entry<String, Integer>> items = sortedByCount.entrySet().iterator();

        // Define a path where first 20 pairs will be written
        //Path path = Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\test.txt");

        // Write first 20 pairs to the file test.txt
        for (int i = 0; i < 20; i++)
        {
            Map.Entry<String, Integer> pair = items.next(); // get next item
            // System.out.format("Word: %s, occurrences: %d%n", pair.getKey(), pair.getValue());
            // System.out.println("Word: " + pair.getKey() + ", occurrences: " + pair.getValue());
            // Write occurrence pair to the file
            Files.write(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\" + "test.txt"),
                    ("Word: " + pair.getKey() + ", occurrences: " + pair.getValue() + "\n")
                    .getBytes(), StandardOpenOption.APPEND);
        }


// ---------------------------------------- PROPER NAMES -------------------------------------------------------------
/*
        //Find all the proper names
        List<String> names = new ArrayList<>();

        Pattern p = Pattern.compile("\\b[A-Z][a-z]{4,}\\b");
        Matcher m = p.matcher(text);
        while (m.find())
        {
            String word = m.group();
            names.add(word);
        }

        // Count proper names and arrange them in alphabetic order
        Collections.sort(names); // sort properNames in alphabetic order
        int properNamesAmount = names.size(); // count proper names
        System.out.println("Proper names amount: " + properNamesAmount);

        // Write first 20 proper names to the file test.txt
        for (int i = 0; i < 20; i++) {
            Files.write(path, (names.get(i) + "\n").getBytes(), StandardOpenOption.APPEND);
        }

        */


        // Create a fine header for the file





        // Find the first 20 pairs

        //System.out.println("First 20 pairs:");




        // sort by alphabet
/*
        map.entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByKey())
                .forEachOrdered(entry -> sorted.put(entry.getKey(), entry.getValue()));

*/
        // Find the first 20 pairs
        // sortedByCount.entrySet().stream().limit(100).forEach(System.out::println);

    }
}
