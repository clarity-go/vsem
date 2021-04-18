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
  @class  CleanedGlossary
  @version  1.0.0 
  @since 18.04.2021 - 15.03
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

public class CleanedGlossary {
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

        // Create iterator 'items' to be able to switch to next sortedByCount map element from the beginning
        Iterator<Map.Entry<String, Integer>> items = sortedByCount.entrySet().iterator();

        // Define a path where first 20 pairs and proper names will be written
        Path path = Paths.get("C:\\Users\\Lenovo\\Desktop\\MY\\Java\\test.txt");

        // Write first 20 pairs of the most commonly used distinct words to the file test.txt
        for (int i = 0; i < 20; i++)
        {
            // Get next item
            Map.Entry<String, Integer> pair = items.next();

            System.out.println("Word: " + pair.getKey() + ", occurrences: " + pair.getValue());

            // Write occurrence pair to the file
            Files.write(path, ("Word: " + pair.getKey() + ", occurrences: " + pair.getValue() + "\n")
                            .getBytes(), StandardOpenOption.APPEND);
        }

        // ------------------------------- Proper Names -------------------------------

        // Find all proper names in the text
        List<String> allProperNames = new ArrayList<>();
        Matcher matchingWord = Pattern.compile("\\b[A-Z][a-z]{4,}\\b").matcher(text);
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

        // Print first 20 distinct proper names
        System.out.println("\tProper Names: ");
        for (int i = 0; i < 20; i++) {
            System.out.println(distinctProperNames.get(i));
        }

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
Word: the, occurrences: 3628
Word: and, occurrences: 1919
Word: to, occurrences: 1855
Word: a, occurrences: 1688
Word: he, occurrences: 1527
Word: of, occurrences: 1259
Word: harry, occurrences: 1214
Word: was, occurrences: 1186
Word: it, occurrences: 1025
Word: in, occurrences: 964
Word: his, occurrences: 937
Word: you, occurrences: 862
Word: said, occurrences: 794
Word: had, occurrences: 702
Word: i, occurrences: 652
Word: on, occurrences: 635
Word: at, occurrences: 625
Word: that, occurrences: 601
Word: they, occurrences: 597
Word: as, occurrences: 526

Proper names amount: 861

	Proper Names:
Harry
Potter
Sorcerer
Stone
Dursley
Privet
Drive
Grunnings
Dursleys
Dudley
Potters
Tuesday
Little
There
People
Harvey
Harold
Sorry
Rejoice
Muggles

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
