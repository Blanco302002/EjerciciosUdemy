import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userOption;
        ArrayList<GroceryItem> grocerylist = new ArrayList<>();
        while (true) {
            while (true) {
                System.out.println("Ingrese una de las siguientes opciones");
                System.out.println("0 - Salir \n" +
                        "1 - Agregar item(s) a la lista (comma delimited list)\n" +
                        "2 - Eliminar algun item (comma delimeted list)\n" +
                        "Ingrese un numero para que accion quiere realizar: ");
                try {
                    userOption = Integer.parseInt(scanner.nextLine());
                    if (userOption > 2 || userOption < 0) {
                        System.out.println("Invalid option, please try again.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid option, please try again.");
                }
            }
            if (userOption == 0) {
                break;
            }
            switch (userOption) {
                case 1 -> grocerylist = addItem(grocerylist);
                case 2 -> grocerylist = deleteItem(grocerylist);
                default -> System.out.println("invalid option");
            }
            // grocerylist.sort(Comparator.naturalOrder());
            System.out.println(grocerylist);
        }
        System.out.println("Thanks for choosing us!!");
    }
    public static String readInput(String input) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in " + input);
        return scanner.nextLine();
    }

    public static ArrayList addItem(ArrayList<GroceryItem> groceryList) {
        String name, type;
        int amount;
        while (true) {
            System.out.println("###-------ADD ITEM-------###");
            System.out.println("1 - Name + amount + type\n" +
                    "2 - Name");
            int option = Integer.parseInt(readInput("option"));
            switch (option) {
                case 1 -> {
                    name = readInput("name");
                    type = readInput("type");
                    amount = Integer.parseInt(readInput("amount"));
                    if (searchFor(groceryList, name)) {
                        System.out.println("The object was found in the list");
                        break;
                    }
                    groceryList.add(new GroceryItem(amount, name, type));
                }
                case 2 -> {
                    name = readInput("name");
                    if (searchFor(groceryList, name)) {
                        System.out.println("The object was found in the list, not adding it...");
                        break;
                    }
                    groceryList.add(new GroceryItem(name));
                }
                default -> System.out.println("Error input");
            }
            System.out.println("1 - Main menu\n" +
                    "2 - Add item");
            option = Integer.parseInt(readInput("option"));
            if(option == 1) {
                break;
            }

        }
        return groceryList;
    }
    public static boolean searchFor(ArrayList<GroceryItem> groceryList, String name) {
        for (GroceryItem element : groceryList) {
            if (element.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
    public static ArrayList deleteItem(ArrayList<GroceryItem> groceryList) {

        while (true) {
            boolean bandera = false;
            String wishedDeletedItem = readInput("the name of the item you would like to delete");
            for (GroceryItem element : groceryList) {
                if (element.getName().equalsIgnoreCase(wishedDeletedItem)) {
                    groceryList.remove(element);
                    bandera = true;
                    break;
                }
            }
            System.out.println("The element was " + ((bandera) ? "succesfully removed" : "not found on the list"));
            System.out.println("1 - Main menu; 2 - Remove another item");
            try {
                if (Integer.parseInt(readInput("option")) == 1) {
                    return groceryList;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input error... Returning to main menu");
                return groceryList;
            }
        }
    }
}
