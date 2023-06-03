package Lab2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserCollector {


    public static void main(String[] args) {

        Map<String, String> users = new HashMap<>();

//        users.put("Jan Kowalski", "54");
//        users.put("Adam Kowalski", "33");
//        users.put("Marek Mały", "96");
//        users.put("Kamil Wielki", "12");



        Set<String> keys = users.keySet();
        System.out.println(keys);

        System.out.println(users.containsKey("Marcin"));

        for (String key : users.keySet()) {
            System.out.println(key + " -> " + users.get(key));


            UserCollector collector = new UserCollector();

        }
    }

}





