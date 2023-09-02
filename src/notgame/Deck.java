package notgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();
 String[]array = {"clubs", "diamonds", "hearts", "spades"}; 
 
 /**
  * The constructor for Deck class - adding cards to deck
  * 'n' for loop made for cardName which are suits in the deck
  * 'v' for loop made for cardValue which are values of cards in deck
  */
 public Deck() {
   String[] suits = {"clubs", "diamonds", "hearts", "spades"};

   for (String suit : suits) {
       for (int value = 2; value <= 14; value++) {
           cards.add(new Card(value, suit));
       }
   }
}
      
    

    public Card draw() {
      if (cards.isEmpty()){
          return null; 
      } else {
          Card drawnTopCard = cards.get(0);
          cards.remove(0);
          return drawnTopCard;
      }
  }
  
//shuffle method shuffles cards over 52 iterations
  public void shuffle() {
      Collections.shuffle(cards);
      
  } 
}




	
	
	

