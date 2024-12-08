public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public double getAnnualSalary() {
        return annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public SalariedEmployee(double annualSalary, boolean isRetired) {
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public SalariedEmployee(String name, String birthDate, String endDate, long empolyeed, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, empolyeed, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }
    public String retire() {
        this.isRetired = true;
        return "You;ve finally retired!";
    }
}
