public record GroceryItem (int amount, String name, String type) {
    public GroceryItem(String name) {
        this(1, name, "DIARY");
    }
    public String getName() {
        return name;
    }
}
