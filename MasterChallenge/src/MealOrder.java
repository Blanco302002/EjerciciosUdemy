import java.util.ArrayList;
import java.util.List;

public class MealOrder {
    private Drink drink;
    private SideItem sideItem;
    private Burger burger;
    private String details;
    private double price;
    List<Topping> toppingsList = new ArrayList<>();

    public MealOrder() {
        this.drink = new Drink();
        this.sideItem = new SideItem();
        this.burger = new Burger();
        this.details = "No Details";
        this.price = drink.getPrice() + sideItem.getPrice() + burger.getPrice();
    }
    public MealOrder(Drink drink, SideItem sideItem, Burger burger, String details, Topping topping1) {
        this(drink, sideItem, burger, details);
        toppingsList.add(topping1);
    }
    public MealOrder(Drink drink, SideItem sideItem, Burger burger, String details, Topping topping1, Topping topping2) {
        this(drink, sideItem, burger, details);
        toppingsList.add(topping1);
        toppingsList.add(topping2);
    }
    public MealOrder(Drink drink, SideItem sideItem, Burger burger, String details, Topping topping1, Topping topping2, Topping topping3) {
        this(drink, sideItem, burger, details);
        toppingsList.add(topping1);
        toppingsList.add(topping2);
        toppingsList.add(topping3);
    }
    public MealOrder(Drink drink, SideItem sideItem, Burger burger, String details) {
        this.drink = drink;
        this.sideItem = sideItem;
        this.burger = burger;
        this.details = details;
        this.price = drink.getPrice() + sideItem.getPrice() + burger.getPrice();
    }

    @Override
    public String toString() {
        return "###----------| MealOrder |----------### \n" +
                "Drink    ---> " + drink.toString() +
                "\nSideItem ---> " + sideItem.toString() +
                " \nBurger   ---> " + burger.toString() +
                " \nDetails  ---> " + details +
                " \nToppings ---> " + toppingsList +
                " \n# Total  ---> $ " + Math.round(price);
    }

}
