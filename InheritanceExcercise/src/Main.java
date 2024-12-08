public class Main {
    public static void main(String[] args) {
        SalariedEmployee max = new SalariedEmployee("max", "10/04/1987", "5/08/2020", 100, "02/03/2015", 40000.00, false);
        System.out.println("max's age is >> " + max.getAge());
        System.out.println(max.collectPay());
        System.out.println(max.retire());

    }

}
