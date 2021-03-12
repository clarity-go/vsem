package kash.edu.module1;

/**
  @author   Alona Kashpruk
  @project   vsem
  @class  HarryPotter
  @version  1.0.0
  @since 10.03.2021 - 19.41
 **/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/*                           Task:
        1.  Find in the net and download a text version of a novel about Harry Potter.
        For instance,  "Harry Potter and the Sorcerer's Stone".
        2. Split the novel into an array of words.
        3. Clean the words from a punctuation signs.
        4. Create another array containing distinct words.
        5. Order the words in alphabetic order.
*/

public class HarryPotter {

    public static void main(String[] args) throws IOException {

        // Download a text of a novel about Harry Potter to string
        String text = new String();
        text = new String(Files.readAllBytes(Paths.get("D:\\harry.txt")));

        // Clean the words from a punctuation signs
        text = text.replaceAll("[^A-Za-z ']", "");

        // Split the novel into an array of words
        String[] words = text.split(" +");
        String stringOfDistincts = "";

        // Select distinct words and insert into stringOfDistincts
        for (int i = 0; i < words.length; i++) {
            if(!stringOfDistincts.contains(words[i])) {
                stringOfDistincts += words[i] + " ";
            }
        }

        // Create another array containing distinct words (unique words)
        String[] distinctWords = stringOfDistincts.split(" ");

        // Order the words in alphabetic order
        Arrays.sort(distinctWords);
        System.out.println("Number of distincts: " + distinctWords.length);
        for (int i = 0; i < 100; i++) {
            System.out.println(distinctWords[i]);
        }
    }
}
/* OUTPUT:
ALBUS
ALL
ALLEY
ALLOWED
AM
AND
ANYTHING
AT
Aaah
Aargh
Abbott
Abou'
About
Absolutely
According
Adalbert
Add
Adrian
Africa
African
After
Against
Ages
Agrippa
Ah
Aha
Ahead
Ahem
Ahern
Alas
Alberic
Albus
Algie
Alicia
All
Alley
Although
Always
Am
An'
And
Angelina
Another
AntiCheating
AntiDark
Anyone
Anythin'
Anything
Anyway
Apothecary
Are
Aren't
Argus
Around
Arsenius
Arts
As
Asked
Astronomy
At
Ate
August
Aunt
Auntie
BC
BED
BEHIND
*/
