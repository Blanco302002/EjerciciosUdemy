import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ChallengeClass190 {
    public static void main(String[] args) {
        final String[] names = new String[]{"Facundo", "Anna", "Cleopatra", "Morena", "Pablo", "Bob"};
        System.out.println(Arrays.toString(names));
        Arrays.setAll(names, (i) -> names[i] = names[i].toUpperCase());
        System.out.println(Arrays.toString(names));
        Arrays.setAll(names, (i) -> names[i] += " " + new StringBuilder(names[i]).reverse());
        System.out.println(Arrays.toString(names));
        Arrays.setAll(names, (i) -> names[i] = names[i].charAt(new Random().nextInt(names[i].length())) + ". " + names[i]);
        System.out.println(Arrays.toString(names));

        List<String> listNames = new ArrayList<>(Arrays.asList(names));
        // -----> NO PUEDE SER LO QUE ACABO DE DESCUBRIR <------
        // Podes utilizar el metodo forEach en un arreglo primero envolviendolo en una lista, asi como sigue.
        // Arrays.asList(names).forEach( # Aca pasamos la lambda expression);


        listNames.removeIf((n) -> {
            String[] nameParts = n.split(" ");
            return nameParts[1].equals(nameParts[2]);
        });
        System.out.println(listNames);


    }

}
