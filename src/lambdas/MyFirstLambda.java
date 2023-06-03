package lambdas;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;


// x -> x * x
// () -> "some result value"
// (Integer x, Long y) ->   System.out.println(x * y)
// (Integer x) -> {if (x > 2) return x else 0};

public class MyFirstLambda {
    public static void main(String[] args) {

        //wykorzystanie własnych interfejsów

//      Multiplayer multiplayer = (int x) -> {return x * x;}; // upraszczamy
        Multiplayer multiplayer = x -> x * x;
        System.out.println(multiplayer.perform(3));

        Introducer introducer = name -> System.out.println(" Cześć! Mam na imię " + name + ".");
        introducer.run("Agata");


        //wykrorzystanie interfejsów z JDK
        UnaryOperator<Integer> uo = o -> o * o;
        System.out.println(uo.apply(2));

        Consumer<String> consumer = s -> System.out.println(" Cześć! Mam na imię " + s + ".");
        consumer.accept("Wojtek");
    }
}

@FunctionalInterface
interface Multiplayer {
    int perform(int x);
}

@FunctionalInterface
interface Introducer {
    void run(String name);
}