package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();
    String[] suits = {"clubs", "diamonds", "hearts", "spades"};

    /**
     * The constructor for the Deck class - adding cards to the deck.
     */
    public Deck() {
        for (String suit : suits) {
            for (int value = 2; value <= 14; value++) {
                cards.add(new Card(value, suit));
            }
        }
    }

    public Card draw() {
        if (cards.isEmpty()) {
            return null;
        } else {
            Card drawnTopCard = cards.get(0);
            cards.remove(0);
            return drawnTopCard;
        }
    }

    // Shuffle method shuffles cards.
    public void shuffle() {
        Collections.shuffle(cards);
    }
}