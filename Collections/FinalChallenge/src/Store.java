import java.time.LocalDate;
import java.util.*;

public class Store {
    private Collection<InventoryItem> inventory;
    private Collection<Cart> Carts;
    private HashMap<Category, InventoryItem> aisleInventory;

    public Store() {
        inventory = new HashSet<InventoryItem>();
        Carts = new TreeSet<Cart>();
        aisleInventory = new HashMap<>();

    }

    public String abandonCart() {
        if (Carts.isEmpty()) {
            return "No carts found";
        }
        List<Cart> carrosEliminados = new LinkedList<>();
        Carts.forEach(cart -> {
            if (!cart.getDate().isEqual(LocalDate.now())) {
                carrosEliminados.add(cart);
            }
        });
        Carts.removeAll(carrosEliminados);
        if (carrosEliminados.isEmpty()) {
            return "No hay carros para abandonar";
        } else {
            System.out.println("Se han eliminado los siguientes carros");
            carrosEliminados.forEach(System.out::println);
        }
        return "Se han eliminado lo sisguientes carros ";
    }

}

