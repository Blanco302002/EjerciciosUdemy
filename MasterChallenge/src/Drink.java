public class Drink {
    protected String type;
    protected String size;
    protected double price;
    public Drink() {
    }

    public Drink(String type, String size) {
        this.type = type;
        switch (type) {
            case "water" -> this.price = 10;
            case "soda" -> this.price = 5;
            default -> { this.price = 5; this.type = "soda"; }
        };
        this.size = size;
        switch (size) {
            case "small" -> this.price += 5.00;
            case "medium" -> this.price += 10.00;
            case "big" -> this.price += 15.00;
            default -> {this.price += 5.00; this.size = "small"; }
        }
    }

    @Override
    public String toString() {
        return "Drink " +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price;
    }

    public double getPrice() {
        return price;
    }
}
