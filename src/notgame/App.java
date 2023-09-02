package notgame;

public class App {
    public static void main(String[] args) {
        // a) Instantiate a Deck and two Players
        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Call shuffle method on the deck
        deck.shuffle();

        // b) Draw cards for each player
        for (int i = 0; i < 52; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        // c) Flip cards for each player
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            // Describe and display the flipped cards
            System.out.println("Player 1 draws: " + card1);
            System.out.println("Player 2 draws: " + card2);

            // d) Compare and increment score
            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println("Player 1 wins and gets " + card1.getValue() + " points.");
            } else if (card2.getValue() > card1.getValue()) {
                player2.incrementScore();
                System.out.println("Player 2 wins and gets " + card2.getValue() + " points.");
            } else {
                System.out.println("It's a draw!");
            }
        }

        // e) Compare final scores
        int score1 = player1.score;
        int score2 = player2.score;

        // f) Print final scores and winner/draw
        System.out.println("Final Score:");
        System.out.println("Player 1: " + score1);
        System.out.println("Player 2: " + score2);

        if (score1 > score2) {
            System.out.println("Player 1 wins!");
        } else if (score2 > score1) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
