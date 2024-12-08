public class CoffeeMaker {
    private boolean hasWorkToDo;
    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Coffee is being brewed.");
            hasWorkToDo = false;
        }
    }
    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
