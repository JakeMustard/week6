package game;

    import java.util.ArrayList;
    import java.util.List;

    public class Player {
         List<Card> hand = new ArrayList<>();
         int score;
         String name;

        public Player(String name) {
            this.name = name;
            this.score=0;          
        }

        public void describe() {
            System.out.println(name + "'s hand:");
            for (Card card : hand) {
                card.describe();
            }
        }

        public Card flip() {
          if (hand.isEmpty()) {
              // Handle the case where there are no cards to flip.
              // For example, you can return null or take other appropriate actions.
              return null;
          }

          Card flippedCard = hand.get(0);
          hand.remove(0);
          return flippedCard;
      }

            // Implement flip logic here
        

        public void draw(Deck deck) {
          Card drawnCard = deck.draw();
          if (drawnCard != null) {
              hand.add(drawnCard);
          }
      }
        // Implement drawing logic here
        

        public void incrementScore() {
            score++;
        }
      }
        
        
    

