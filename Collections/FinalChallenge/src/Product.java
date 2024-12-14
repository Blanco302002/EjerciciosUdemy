public class Product {
    // la información de aca no es mutable, entonces cual es el mejor tipo de dato para ocupar?
    // un record, no necesariamente, solo una clase que no tenga seters está bien

    private String name;
    private int sku; // sku = StockKeepingUnit, me faltaria un nombre para esto nomas
    private Category category;
    private String manufacturer;  // Esto va a tener el nombre del proveedor

    public Product(String name, int sku, Category category, String manufacturer) {
        this.name = name;
        this.sku = sku;
        this.category = category;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public String toString() {
        return "%s #%d Category:%s".formatted(name, sku, category);
    }
}
