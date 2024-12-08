public class Burger {
    protected String type;
    protected double price;
    public Burger() {
        this("regular");
    }
    public Burger(String type) {
        switch (type) {
            case "regular" -> this.price = 200;
            case "double" -> this.price = 250;
            case "deluxe" -> this.price = 600;
            default -> { this.price = 200; this.type = "regular"; }
        }
        this.type = type;
    }

    @Override
    public String toString() {
        return "Burger " +
                "type ='" + type + '\'' +
                ", price =" + price;
    }

    public double getPrice() {
        return price;
    }
}
