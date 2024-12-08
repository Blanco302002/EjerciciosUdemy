import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class methodReferences {
    public static void main(String[] args) {
        final String[] names = new String[]{"Facundo", "Anna", "Cleopatra", "Morena", "Pablo", "Mate"};


        Supplier<Random> random = Random::new;


        Function<String, String> upperCase = String::toUpperCase;
        Function<String, String> reverseName = (s) -> s.concat(" " + new StringBuilder(s).reverse());
        Function<String, String> addLetter = (s) -> s.concat(s.charAt(new Random().nextInt(s.length())) + ". " + s);
        Function<String, String> replaceAs = (s) -> s.replaceAll("A", "#");

        List<Function<String, String>> list = new ArrayList<>(List.of(upperCase, reverseName, addLetter, replaceAs));
        // Aplicar todas las transformaciones a cada nombre en el array
        for (int i = 0; i < names.length; i++) {
            for (Function<String, String> func : list) {
                names[i] = func.apply(names[i]);
            }
        }

        // Mostrar el resultado
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Transformation 1 = " + names[1].transform(upperCase));
    }
}
