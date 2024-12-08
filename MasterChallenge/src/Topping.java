public class Topping {
    private String type;
    private double price;

    public Topping(String type) {
        switch (type) {
            case "bacon" -> this.price = 2.00;
            case "jalapenos" -> this.price = 3.00;
            case "ranch" -> this.price = 5.00;
            case "barbecue" -> this.price = 3;
            case "cheddar" -> this.price = 4.00;
            default -> {this.type = ""; this.price = 0; }
        }
        this.type = type;
    }

    @Override
    public String toString() {
        return "{ " +
                "type = '" + type + '\'' +
                ", price = " + price +
                " }";
    }
}
