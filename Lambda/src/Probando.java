import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

public class Probando {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("alpha", "bravo",
                "charlie", "delta"));
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("--------");
        list.forEach((var myString) -> System.out.println(myString));
        System.out.println("----------");
        String prefix = "nato";
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(prefix + myString + " means " + first);
        });

        var coords = Arrays.asList(
                new double[]{37.2160, -95.327},
                new double[]{21.143, -84.234},
                new double[]{83.234, -23.932});

        BiConsumer<Double, Double> p1 = (lat, lng) ->
                System.out.printf("[lat>%.3f lon>%.3f]%n", lat, lng);
        var firstPoint = coords.get(0);
        processPoint(firstPoint[0], firstPoint[1], p1);
        coords.forEach(s -> processPoint(s[0], s[1], p1));

        String myString = "Facundo es mi nombre".trim();
        System.out.println(myString);
    }
    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }
    public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer) {
        consumer.accept(t1, t2);
    }
}
