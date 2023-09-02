package notgame;

public class Card {
    private int value;
    private String suit;
    
    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getSuit() {
        return suit;
    }
    
    public String describe() {
        String valueString;
        if (value >= 11) {
            switch (value) {
                case 11:
                    valueString = "Jack";
                    break;
                case 12:
                    valueString = "Queen";
                    break;
                case 13:
                    valueString = "King";
                    break;
                case 14:
                    valueString = "Ace";
                    break;
                default:
                    valueString = "Unknown";
            }
        } else {
            valueString = Integer.toString(value);
        }
        
        return valueString + " of " + suit;
    }
    
    @Override
    public String toString() {
        return describe();
    }
}
