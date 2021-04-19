package kash.edu.theory.testing;/*
  @author   Alona Kashpruk
  @project   vsem
  @class  CleanedGlossary2
  @version  1.0.0 
  @since 19.04.2021 - 20.36
*/

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CleanedGlossary2 {
    public static void main(String[] args) throws IOException {
        // Get a text of a novel about Harry Potter from the file
        String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\harry.txt")));

        // Clean the words from a punctuation signs, convert to lowercase
        // and split the novel into an array of words
        String[] wordsArray = text.toLowerCase()
                .replaceAll("[^A-Za-z ']", "")
                .split(" +");

        // ------------------------------- Distinct Words -------------------------------

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

        // Sort distinct words in the DESC mode by the number of occurrence
        Map<String, Integer> sortedByCount = new LinkedHashMap<>();
        wordMapCount.entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .forEachOrdered(entry -> sortedByCount.put(entry.getKey(), entry.getValue()));

        // Define a path where first 20 pairs and proper names will be written
        Path path = Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\test.txt");

        // Create a fine header for the file
        String sortedPairs = " ✦✦✦--------✦✦✦ " + "Final Task" + " ✦✦✦--------✦✦✦ " + "\n";

        // Write first 20 pairs of the most commonly used distinct words to the file test.txt
        int counter = 0;
        for(Map.Entry<String, Integer> entry : sortedByCount.entrySet()){
            counter++;
            sortedPairs += "Word: " + entry.getKey() + ", the number of occurrences: " + entry.getValue() + '\n';
            if (counter == 20) break;
        }

        // String sortedToString = sorted20.toString();
        Files.write(path, sortedPairs.toString().getBytes(StandardCharsets.UTF_8));

        // ------------------------------- Proper Names -------------------------------

        // Find all proper names in the text
        List<String> allProperNames = new ArrayList<>();
        Matcher matchingWord = Pattern.compile("\\b[A-Z][a-z]{4,}\\b").matcher(text);
        // Matcher matchingWord = Pattern.compile("\\b[A-Z][a-z]{4,}\\b").matcher(text);
        while (matchingWord.find())
        {
            allProperNames.add(matchingWord.group());
        }

        // Find distinct proper names in the text
        List<String> distinctProperNames = allProperNames.stream()
                .distinct().collect(Collectors.toList());

        // Count the number of distinct proper names
        int properNamesAmountDistinct = distinctProperNames.size();
        System.out.println("Proper names amount: " + properNamesAmountDistinct);

        // Sort proper names in alphabetic order
        Collections.sort(distinctProperNames);

        // Write first 20 proper names to the file test.txt
        System.out.println("\n\tProper Names in Alphabetic Order: ");
        for (int i = 0; i < 20; i++) {
            System.out.println(distinctProperNames.get(i));
            Files.write(path, (distinctProperNames.get(i) + "\n").getBytes(), StandardOpenOption.APPEND);
        }
    }
}
/*
✦✦✦--------✦✦✦ Final Task ✦✦✦--------✦✦✦
Word: the, the number of occurrences: 3628
Word: and, the number of occurrences: 1919
Word: to, the number of occurrences: 1855
Word: a, the number of occurrences: 1688
Word: he, the number of occurrences: 1527
Word: of, the number of occurrences: 1259
Word: harry, the number of occurrences: 1214
Word: was, the number of occurrences: 1186
Word: it, the number of occurrences: 1025
Word: in, the number of occurrences: 964
Word: his, the number of occurrences: 937
Word: you, the number of occurrences: 862
Word: said, the number of occurrences: 794
Word: had, the number of occurrences: 702
Word: i, the number of occurrences: 652
Word: on, the number of occurrences: 635
Word: at, the number of occurrences: 625
Word: that, the number of occurrences: 601
Word: they, the number of occurrences: 597
Word: as, the number of occurrences: 526

Proper names amount: 861

Proper Names in Alphabetic Order:
Aargh
Abbott
About
Absolutely
According
Adalbert
Adrian
Africa
African
After
Against
Agrippa
Ahead
Ahern
Alberic
Albus
Algie
Alicia
Alley
Alohomora
*/
