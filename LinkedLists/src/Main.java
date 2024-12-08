import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int posicion;

    public static void main(String[] args) {
        LinkedList<PlacesToVisit> myLinkedList = new LinkedList<>();
        posicion = 1;
        myLinkedList.push(new PlacesToVisit("Resistencia", 0));
        boolean bandera = true;
        while (bandera) {
            System.out.println("#".repeat(5) + "-".repeat(50) + "#".repeat(5));
            String opcionElegida = Menu();
            switch (opcionElegida) {
                case "A" -> avanzar(myLinkedList);
                case "R" -> retroceder(myLinkedList);
                case "L" -> listarLugares(myLinkedList);
                case "P" -> myLinkedList = agregarLugar(myLinkedList);
                case "S" -> bandera = false;
                default -> System.out.println("Error");
            }
        }
        System.out.println("Gracias por elegirnos!");
    }
    public static void listarLugares(LinkedList<PlacesToVisit> miListaDeEnlaces) {
        int i = 0;
        for(PlacesToVisit elemento : miListaDeEnlaces) {
            System.out.println(i + " : " + elemento.getPlace());
            i++;
        }
    }
    public static void avanzar(LinkedList<PlacesToVisit> miListaDeEnlaces) {
        ListIterator<PlacesToVisit> iterador = miListaDeEnlaces.listIterator(posicion);
        if (iterador.hasNext()) {
            var lugar = iterador.next();
            posicion += 1;
            System.out.println("El siguiente lugar es : " + lugar.getPlace());
        } else {
            System.out.println("No se pudo obtener el siguiente lugar porque es el final de la lista.");
        }
    }
    public static void retroceder(LinkedList<PlacesToVisit> miListaDeEnlaces) {
        ListIterator<PlacesToVisit> iterador = miListaDeEnlaces.listIterator(posicion);
        if (iterador.hasPrevious()) {
            var lugar = iterador.previous();
            posicion -= 1;
            System.out.println("El anterior lugar es : " + lugar.getPlace());
        } else {
            System.out.println("No se pudo obtener el anterior lugar porque es el inicio de la lista.");
        }
    }
    public static String Menu() {
        String menu = """
        Acciones disponibles (Ingrese letra)
        (A)vanzar
        (R)etroceder
        (L)istar Lugares
        (P)or visitar / Agregar lugar
        (S)alir""";
        System.out.println(menu);
        String opcionElegida = scanner.nextLine().toUpperCase();
        return opcionElegida;
    }
    public static LinkedList<PlacesToVisit> agregarLugar(LinkedList<PlacesToVisit> miListaDeEnlaces) {
        while (true) {
            System.out.println("Ingrese el lugar: ");
            String lugar = scanner.nextLine();
            System.out.println("Ingrese la distancia de donde esta hacia el lugar");
            int distancia = scanner.nextInt();
            scanner.nextLine();  // Consumir el carácter de nueva línea restante, por esto es que me estaba dejando
            // pasar el ultimo scanner y lo ignoraba

            boolean exists = false;
            for (PlacesToVisit element : miListaDeEnlaces) {
                if (element.getPlace().toUpperCase().equals(lugar.toUpperCase())) {
                    System.out.println("El lugar ya está en la lista.");
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                miListaDeEnlaces.addLast(new PlacesToVisit(lugar, distancia));
            }

            System.out.println("S - Volver al menú principal; A - Agregar otro item");
            String opcion = scanner.nextLine();
            if (opcion.toUpperCase().equals("S")) {
                break;
            }
        }
        return miListaDeEnlaces;
    }
}
