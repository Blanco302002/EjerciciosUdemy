public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee(long empolyeed, String hireDate, double hourlyPayRate) {
        super(empolyeed, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public HourlyEmployee(String name, String birthDate, String endDate, long empolyeed, String hireDate, double hourlyPayRate) {
        super(name, birthDate, endDate, empolyeed, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay() {
        System.out.println("You've called the method getDoublePay!");
    }
}
