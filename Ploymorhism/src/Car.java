public class Car {
    private String description;
    public void startEngine() {
        System.out.println("The engine does brum brum");
    }
    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }
    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }
    public Car() {}
    public Car(String description) {
        this.description = description;
    }

}
