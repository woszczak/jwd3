package lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class PlanetsLambda {
    public static void main(String[] args) {
        String[] planets = {"Słońce", "Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};

//asdddddddddddddddddddddddddddddddddddddddddd
        System.out.println("mata".charAt("mata".length() - 1) - "rower".charAt("rower".length() - 1));
        Arrays.sort(planets, (o1, o2) -> o1.charAt(o1.length() - 1) - o2.charAt(o2.length()) - 1);



//dfsssssssssssssssssssssssssssssssss
        Arrays.sort(planets); //domyślne sortowanie alfabetyczne
        System.out.println(Arrays.toString(planets));

        //sortowanie ze względu na długość nazwy:


//       zamienic na lambde:
//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };
//        System.out.println(Arrays.toString(planets));


        Arrays.sort(planets, (o1, o2) -> o1.length() - o2.length());
        Arrays.asList(planets).forEach(s -> System.out.println(s));


//        Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length();
//        Arrays.sort(planets, comparator);
    }
}
