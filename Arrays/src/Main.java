import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*  int[] myArray = generateRandomArray();
        System.out.println("before > "+ Arrays.toString(myArray));
        Arrays.sort(myArray);
        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = myArray[i] * -1;
        }
        System.out.println("After > " + Arrays.toString(myArray));
*/
        // aca empiezo a ejecutar mi codigo
        int[] userIntegerArray = readIntegers();
        System.out.println("The array is >> " + Arrays.toString(userIntegerArray));
        System.out.println("The minimum element in the array is >> " + findMin(userIntegerArray));

    }
    private static int[] generateRandomArray() {
        Random random = new Random();
        int[] newArray = new int[10];
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(100) * -1;
        }
        return newArray;
    }

    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! enter the numbers you would like comma delimited");
        String userInput = scanner.nextLine();
        String[] splitStrings = userInput.split(",");
        int[] integerArray = new int[splitStrings.length];
        for (int i = 0; i < splitStrings.length; i++) {
            integerArray[i] = Integer.parseInt(splitStrings[i]);
        }
        return integerArray;
    }
    public static int findMin(int[] argumentArray) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < argumentArray.length; i++) {
            if (argumentArray[i] < minValue) {
                minValue = argumentArray[i];
            }
        }
        return minValue;
    }
}