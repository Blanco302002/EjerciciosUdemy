public class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;
    public GasPoweredCar(String description) {
        super(description);
    }
    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description); // inheritance
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
    public void coolCar() {
        System.out.println("Hello! This is a maserati, pretty cool right?");
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }
}
