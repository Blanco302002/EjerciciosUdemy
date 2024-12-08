public class Main {
    public static void main(String[] args) {
        MealOrder regularPa = new MealOrder(new Drink("soda", "medium"), new SideItem("chicken nuggets", "big"), new Burger("double"), "without lettuce", new Topping("cheddar"));
        // System.out.println(regularPa.toString());

        MealOrder tachiHamburguesa = new MealOrder(new Drink("soda", "medium"), new SideItem("fires", "big"), new Burger("regular"), "", new Topping("cheddar"), new Topping("bacon"));
        System.out.println(tachiHamburguesa.toString());
    }
}