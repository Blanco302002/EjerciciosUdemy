public class Employee extends Worker {
    private long empolyeed;
    private String hireDate;
    public Employee() {

    }
    public Employee(long empolyeed, String hireDate) {
        this.empolyeed = empolyeed;
        this.hireDate = hireDate;
    }

    public Employee(String name, String birthDate, String endDate, long empolyeed, String hireDate) {
        super(name, birthDate, endDate);
        this.empolyeed = empolyeed;
        this.hireDate = hireDate;
    }
}
