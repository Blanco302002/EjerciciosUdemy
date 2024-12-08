public class Printer {
    private int tonerLevel;
    private int pagesPinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }
    public int addToner(int toner) {
        return (tonerLevel - toner > 100 || tonerLevel - toner < 100) ? -1 : tonerLevel;
    }
    public int printPages(int pagesToBePrinted) {
        System.out.println((duplex) ? "Its a duplex printer" : "It's not a duplex printer.");
        int jobPages = (duplex) ? (pagesToBePrinted / 2) + 1 : (pagesToBePrinted / 2);
        return jobPages;
    }
}
