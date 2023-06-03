package Lab1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BookAnalyzer {

    public static void main(String[] args) {

//        wczytaj do listy wszystkie wiersze książki “Hrabia Monte Christo”,

            String filePath = "src/Lab1/crsto10.txt";
            List<String> lines = readLinesFromFile(filePath);



//        wyznacz liczbę wszystkich wierszy, tworząc metodę, która przyjmuje obiekty typu List i zwraca liczbę typu int (liczba elementów listy),

        int lineCount = countLines(lines);
            System.out.println("Liczba wierszy: " + lineCount);



//        napisz metodę, która wyświetli na ekranie co setny wiersz książki,
            displayEvery100thLine(lines);




//        napisz metodę, która znajdzie i wyświetli najdłuższy wers z książki wielkimi literami.
            String longestUpperCaseLine = findLongestUpperCaseLine(lines);
            System.out.println("Najdłuższy wers z książki wielkimi literami: " + longestUpperCaseLine);
        }

        private static List<String> readLinesFromFile(String filePath) {
            List<String> lines = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    lines.add(line);
                }
            } catch (IOException e) {
                System.out.println("Błąd podczas wczytywania pliku: " + e.getMessage());
            }

            return lines;
        }

        private static int countLines(List<String> lines) {
            return lines.size();
        }

        private static void displayEvery100thLine(List<String> lines) {
            for (int i = 0; i < lines.size(); i++) {
                if ((i + 1) % 100 == 0) {
                    System.out.println(lines.get(i));
                }
            }
        }

        private static String findLongestUpperCaseLine(List<String> lines) {
            String longestUpperCaseLine = "";

            for (String line : lines) {
                if (line.matches(".*[A-Z].*") && line.length() > longestUpperCaseLine.length()) {
                    longestUpperCaseLine = line;
                }
            }

            return longestUpperCaseLine;
        }
    }





