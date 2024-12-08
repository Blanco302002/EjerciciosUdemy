public class SideItem {
    private String type;
    private String size;
    private double price;

    public SideItem() {

    }

    public SideItem(String type, String size) {
        switch (type) {
            case "fries" -> this.price = 5.00;
            case "onion rings " -> this.price = 15.00;
            case "chicken nuggets" -> this.price = 45.00;
            default -> {this.type = "fries"; this.price = 10.00;}
        }
        switch (size) {
            case "small" -> this.price += 5.00;
            case "medium" -> this.price += 10.00;
            case "big" -> this.price += 15.00;
            default -> {this.price += 5.00; this.size = "small"; }
        }
        this.type = type;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "SideItem " +
                "type = " + type +
                ", size = " + size +
                ", price = " + price;
    }
}