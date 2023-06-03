package lab20;

import java.util.Arrays;
import java.util.Comparator;

public class Planets {

    public static void main(String[] args) {
        String[] planets = {"Słońce", "Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};
        Arrays.sort(planets, new LastLetterComparator()); //domyślne sortowanie alfabetyczne
        System.out.println(Arrays.toString(planets));
    }

    private static class LastLetterComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            char lastChar1 = s1.charAt(s1.length() - 1);
            char lastChar2 = s2.charAt(s2.length() - 1);
            return Character.compare(lastChar1, lastChar2);
        }
    }
}

