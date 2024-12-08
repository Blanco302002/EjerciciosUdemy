import java.util.TreeSet;

public class Theatre {
    private final String name;
    private int rows;

    private TreeSet<Seat> mySeats;
    public static class Seat implements Comparable<Seat> {
        private char rowCaracter;
        private int seatNumber;
        private boolean reserved;
        public Seat(char rowCaracter, int seatNumber) {
            this.rowCaracter = rowCaracter;
            this.seatNumber = seatNumber;
            this.reserved = false;
        }

        @Override
        public String toString() {
            return rowCaracter + ((seatNumber >= 100) ? "" : (seatNumber < 10) ? "00" : "0") + seatNumber;
        }

        @Override
        public int compareTo(Seat otherSeat) {
            // estos comparadores son los que no me salen.
            int rowComparison = Character.compare(this.rowCaracter, otherSeat.rowCaracter);
            if (rowComparison != 0) {
                return rowComparison;
            }
            // Si rowCaracter es igual, comparar por seatNumber
            return Integer.compare(this.seatNumber, otherSeat.seatNumber);
        }
    }
    public Theatre(String name, int rows, int totalSeats) {
        this.name = name;
        this.rows = Math.min(rows, 26);
        mySeats = new TreeSet<>();
        int seatsPerRow = totalSeats / rows;
        char rowCaracter = 65;
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                Seat seat = new Seat(rowCaracter, j);
                mySeats.add(seat);
            }
            rowCaracter += 1;
        }
    }

    public String getName() {
        return name;
    }

    public TreeSet<Seat> getMySeats() {
        return mySeats;
    }


    public String printedSeatMap() {
        char rowCaracter = 66;
        // linea, titulo, linea
        StringBuilder myString = new StringBuilder(("-").repeat(50) + "\n"+ name + "\n" + ("-").repeat(50) + "\n");
        int seatCount = 0;

        // imprime los asientos con caracter y nro
        for(Seat seat : mySeats) {
            String seatPrint = "[" + seat.toString() + " " + ((seat.reserved) ? "✓" : "✗") + "] ";
            myString.append(seatPrint);
            seatCount++;
            // cuando llegue a nro de asientos por columa, escribe salto de linea para la siguiente fila que es B, y asi
            if (seatCount == (mySeats.size() / rows)) {
                myString.append("\n");
                seatCount = 0;
            }
        }
        // devuelvo el String
        return myString.toString();
    }

    public TreeSet<Seat> AgentReservations(int reservationsRequested, char initialRow, char endRow, int initialSeat, int endSeat) {
        // hago los contorles necesarios para corroborar que me pasan datos correctos, sino devuelvo null;
        if (reservationsRequested > mySeats.size()) { return null; }
        if (initialRow > (rows + 64) || endRow > (rows + 64)) { return null; }
        if (initialSeat > mySeats.size() / rows || endSeat > mySeats.size() / rows) { return null; }

        // tratamiento de reserva
        for (char j = initialRow; j <= endRow; j++) {
            for (int i = 0; i <= endSeat; i++) {
                setSeat(j, i);
            }
        }
        return mySeats;
    }

    private void setSeat(char row, int seatNumber) {
        for (Seat seat : mySeats) {
            if (seat.rowCaracter == row && seat.seatNumber == seatNumber) {
                seat.reserved = true;
            }
        }
    }

}
