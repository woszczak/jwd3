package lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;

public class MonteChristo {

    public static void main(String[] args) {
        MonteChristo mc = new MonteChristo();
        List<String> allLines = mc.loadTextFile("src/lab/crsto10.txt");
        mc.showAllLines(allLines);
        System.out.println("Wczytywany plik zawiera: " + mc.countLines(allLines) + " linii.");
        mc.showEveryHundredthLine(allLines);
        mc.showTheLongestVerse(allLines);
    }


    List<String> loadTextFile(String textFileName) {
        try {
            return Files.readAllLines(Paths.get(textFileName));
        } catch (IOException e) {
            System.out.println("Coś poszło nie tak przy wczytywaniu pliku: " + e.getMessage());
        }

        return null;
    }


    void showAllLines(List<String> allLines) {
        for (String line : allLines) {
            System.out.println(line);
        }
    }

    int countLines(List allLines) {
        return allLines.size();
    }


    void showEveryHundredthLine(List<String> allLines) {

        System.out.println();
        for (int i = 0; i < allLines.size(); i++) {

            if (i % 100 == 0) {
                System.out.println(i + " " + allLines.get(i));
            }
        }
    }

    void showTheLongestVerse(List<String> allLines) {
        String longestLine = "";
        for (String line : allLines) {
            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }
        System.out.println("\nNajdłuższy wiersz w książce zawiera: " + longestLine.length() + " znaki/znaków - " + longestLine.toUpperCase());
    }

}


