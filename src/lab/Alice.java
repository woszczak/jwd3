package lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Alice {

    public static void main(String[] args) {
        List allLines = loadTextFile("src/lab/alice30.txt");
        Set words = divideIntoWordsAndClean(allLines);

        Map<Character, Integer> startLetterStats = creatStartLetterStats(words);
        Map.Entry<Character, Integer> startLetterEntry = findStartLetter(startLetterStats);


        System.out.println("Liczba różnych wyrazów w książce: " + words.size() + ".");
        System.out.println("Litera na jaką zaczyna się najwięcej wyrazów to \"" + startLetterEntry.getKey() + "\", jest ich " + startLetterEntry.getValue() + ".");

        System.out.println(startLetterStats);

    }

    public static List loadTextFile(String textFileName) {
        try {
            return Files.readAllLines(Paths.get(textFileName));
        } catch (IOException e) {
            System.out.println("Coś poszło nie tak przy wczytywaniu pliku: " + e.getMessage());
        }

        return null;
    }

    public static void showAllLines(List<String> allLines) {
        for (String line : allLines) {
            System.out.println(line);
        }
    }

    public static Set divideIntoWordsAndClean(List<String> allLines) {
        Set words = new TreeSet();

        for (String line : allLines) {
            String[] lineWords = line.split(" |--");
            for (String word : lineWords) {
                word = cleanWord(word);
                if (!word.isEmpty()) {
                    words.add(word.toLowerCase());
                }
            }
        }

        return words;
    }

    public static String cleanWord(String word) {
//        return word.replace(",", "").replace("(", "").replace(")", "");
        return word.replaceAll("\\p{Punct}|\\d", "");
    }

    public static Map<Character, Integer> creatStartLetterStats(Set<String> words) {
        Map<Character, Integer> startLetterStats = new TreeMap<>();
        for (String word : words) {
            Character startLetter = word.charAt(0);
            if (startLetterStats.containsKey(startLetter)) {
                startLetterStats.put(startLetter, startLetterStats.get(startLetter) + 1);
            } else {
                startLetterStats.put(startLetter, 1);
            }
        }
        return startLetterStats;
    }

    public static Map.Entry<Character, Integer> findStartLetter(Map<Character, Integer> startLetterStats) {
        Map.Entry<Character, Integer> startLetterEntry = null;

        for (Map.Entry<Character, Integer> entry : startLetterStats.entrySet()) {
            if (startLetterEntry == null || entry.getValue() > startLetterEntry.getValue()) {
                startLetterEntry = entry;
            }
        }

        return startLetterEntry;
    }


}
