import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Cart implements Comparable<Cart> {

    public enum Type {PHYSICAL, VIRTUAL;}
    private int id;
    private Set<Product> products;
    private LocalDate date;
    private Type Type;
    public Cart(Type type) {
        products = new HashSet<>();
        date = LocalDate.now();
        Type = type;
        id = products.hashCode();
    }

    @Override
    public int compareTo(Cart other) {
        return this.date.compareTo(other.date); // Compara por fecha
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean addProduct(Product product) {
        products.add(product);
        return true;
    }
    public boolean removeProduct(Product product) {
        products.remove(product);
        return true;
    }
    public void printSalesSlip() {
        // esto sería como el toString del hashmap, tengo que imprimir el compobante de venta
        System.out.println("SALES SLIP");
        System.out.println("-".repeat(20));
        products.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", products=" + products +
                ", date=" + date +
                ", Type=" + Type +
                '}';
    }
}
