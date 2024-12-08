public class Main {
    public static void main(String[] args) {
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);
        Car Tesla = new ElectricCar("2022 Red Tesla model 3", 568, 78);
        runRace(Tesla);
        Car ferrariHybrid = new HybridCar("2022 Black ferrari SF90 Stradale", 16, 8, 8);
        runRace(ferrariHybrid);
    }
    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }

}