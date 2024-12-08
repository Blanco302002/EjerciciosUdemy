import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Probando2 {
    public static void main(String[] args) {
        /*Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };*/
        Consumer<String> printTheParts = ((sentence) -> {
            Arrays.asList(sentence.split(" ")).forEach((part) -> System.out.println(part));
        });

        Function<String, String> l1 = (source) -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
        System.out.println(everySecondCharacter(l1, "1234567890"));

        Supplier<String> iLoveJava = () -> {
            return "I love Java";
        };
        String myString = iLoveJava.get();
        System.out.println(myString);

    }
    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for(int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }
    public static String everySecondCharacter (Function<String, String> myLambda, String source) {
        return myLambda.apply(source);
    }

}
