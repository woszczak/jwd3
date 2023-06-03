import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {

    public static void main(String[] args) {

        //wczytanie wierszy

        try {
            System.out.println(Files.readAllLines(Paths.get("src/data.txt"))); // w notacji windowsowej są dwa backslashe
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

/*

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("bbb");
        list.add("ccc");

        System.out.println(Collections.frequency(list, "bbb"));


        System.out.println(list);

        Collections.shuffle(list);  //mieszanie
        System.out.println(list);
    }*/
