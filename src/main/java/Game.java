import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players;
    private Deck deck;

    public Game(ArrayList<Player> players) {
        this.players = players;
        this.deck = new Deck();
        this.deck.populate();
        this.deck.shuffleCards();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Deck getDeck() {
        return deck;
    }

    public int countPlayers() {
        return players.size();
    }

    public void dealCards(int numberOfCards) {
        for (Player player : players) {
            for (int i = 0; i < numberOfCards; i++) {
                player.takeCard(this.deck.dealCard());
            }
        }
    }

//    public Player checkWinner(){
//
//    }
}
