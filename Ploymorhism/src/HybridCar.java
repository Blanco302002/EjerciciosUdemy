public class HybridCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;
    public HybridCar(String description) {
        super(description);
    }
    public HybridCar(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(description); // inheritance
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up, Ready%n", cylinders);
        System.out.printf("Gybrid -> switch $d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage exceeds the average: %.2f %n", avgKmPerLitre);

    }
}
