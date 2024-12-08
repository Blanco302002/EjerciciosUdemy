public class DeluxeBurger extends MealOrder {
    private double price;
    public DeluxeBurger(Drink drink, SideItem sideItem, Burger burger, String details) {
        super(drink, sideItem, burger, details);
        this.price = 500.00;
    }
}
