public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker() {

    }
    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge() {
        return 40;
    }
    public double collectPay() {
        return 40000.00;
    }
    public void terminate(String endDate) {

    }

}
