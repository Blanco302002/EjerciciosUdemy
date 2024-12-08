public class SmartKitchen {
    CoffeeMaker brewMaster;
    DishWasher dishWasher;
    Refrigerator iceBox;

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }
    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }
    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }
    public void setKitchenState(boolean value1, boolean value2, boolean value3) {
        brewMaster.setHasWorkToDo(value1);
        iceBox.setHasWorkToDo(value2);
        dishWasher.setHasWorkToDo(value3);
    }
    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
