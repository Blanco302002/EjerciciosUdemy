import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Card> deck = new LinkedList<>();
        Card.createDeck(deck);
        Collections.shuffle(deck);
        // okay, tengo 2 jugadores, cada uno tiene 3 cartas, voy a hacer una y una como de costumbre.
        // NOTA: Las listas generadas por List.of() son INMUTABLES
        Player facundo = new Player("Facundo", new ArrayList<>(List.of(deck.get(39), deck.get(38), deck.get(37))));
        Player pablo = new Player("Pablo", new ArrayList<>(List.of(deck.get(36), deck.get(35), deck.get(34))));

        // lo ordeno primero para poder comparar con la anterior carta al mto de realizar envido
        Player.ordenar(facundo);
        Player.ordenar(pablo);

        System.out.println(facundo.getMyCards());
        System.out.println(pablo.getMyCards());
        // ya tengo la mano de cada uno
        Player.envido(facundo);
        Player.envido(pablo);


    }
}
