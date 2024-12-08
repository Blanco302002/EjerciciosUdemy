import java.util.List;

public class Card {
    private CardType type;
    private int number;
    public static List<Card> createDeck(List<Card> deck) {
        for (CardType tipo : CardType.values()) {
            for (int valor = 1; valor <= 12; valor++) {
                if (valor != 8 && valor != 9) { // Excluimos el 8 y 9
                    deck.add(new Card(tipo, valor));
                }
            }
        }
        return deck;
    }

    public Card(CardType type, int number) {
        this.type = type;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (getNumber() != card.getNumber()) return false;
        return getType() == card.getType();
    }

    @Override
    public int hashCode() {
        int result = getType() != null ? getType().hashCode() : 0;
        result = 31 * result + getNumber();
        return result;
    }

    public CardType getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Card{" +
                "type=" + type +
                ", number=" + number +
                '}';
    }
}
