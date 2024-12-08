public class ChallengeMain {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("GALATEA", 5, 100);
        System.out.println(theatre.printedSeatMap());

        theatre.AgentReservations(10,'A', 'C', 20, 20);
        System.out.println(theatre.printedSeatMap());

//        System.out.println(theatre.getRows());


    }
}
