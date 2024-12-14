public class InventoryItem {
    private Product product;
    private int qtyTotal;
    private int qtyReserved;
    private int qtyReordered;   // este se ocupa cuando el qtyLow es alcanzado en qtyReserved.
    private int qtyLow;
    private double salesPrice;

    // Dsp vamos a tener algun que otro metodo que se van a llamar
    // reserveItem, releseItem, sellItem

    public void placeIngentoryOrder() {
        if (qtyReserved <= qtyLow) {
            System.out.println("More " + product.getName() + " it's being ordered.");
        }
    }

    public boolean sellItem(int qty) {
        if (qty >= qtyTotal) {
            System.out.println("Ups! not enough stock! Please, try again.");
            qtyTotal += 50;
            qtyReserved -= 50;
            return false;
        } else {
            qtyTotal -= qty;
            System.out.println("Added " + qty + " to the inventory successfully.");
            return true;
        }
    }

    public Product getProduct() {
        return product;
    }
}
