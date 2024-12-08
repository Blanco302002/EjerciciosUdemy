import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Player {
    private String nombre;
    private List<Card> myCards;

    public Player(String nombre, List<Card> myCards) {
        this.nombre = nombre;
        this.myCards = myCards;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Card> getMyCards() {
        return myCards;
    }

    public static boolean ordenar (Player jugador) {
        var comparador = Comparator.comparing(Card::getType);
        Collections.sort(jugador.getMyCards(), comparador);
        return true;
    }
    public static void envido(Player jugador) {
        int mismoTipo = 0;
        int cuenta = 20;
        List<Integer> figuras = List.of(10, 11, 12);
        CardType tipo = jugador.getMyCards().get(0).getType();
        for(Card carta : jugador.getMyCards()) {
            if (mismoTipo == 0) {
                mismoTipo++;
                continue;
            }
            if (tipo == carta.getType()) {
                mismoTipo++;
                cuenta += (figuras.contains(carta.getNumber())) ? 10 : carta.getNumber();
            }
            tipo = carta.getType();
        }
        System.out.println(cuenta);
        System.out.println((mismoTipo > 2) ? "Flor" : ((cuenta > 25) ? "Real Envido" : "Envido"));
    }
}
