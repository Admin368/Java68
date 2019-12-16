class Card {
    private String suit,rank;
    Card(String x, String y){
        rank=x;
        suit=y;
    }
    void setRank(String a){
        rank=a;
    }
    String getRank(){
        String x=rank;
        return x;
    }
    void setSuit(String y){
        suit=y;
    }
    String getSuit(){
        String y=suit;
        return y;
    }
    public String toString(){
        return rank+"of"+suit;
    }

}

public class TestCard{
    public static void main(String[] args) {
        Card game= new Card("heart","diamond");
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "6", "3", "8", "5", "2", "7", "9", "4", "10", "Jack", "Queen", "King"};

        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        // Display the selected cards
        for (int i = 0; i < 5; i++) {
            game.setSuit(suits[deck[i] / 13]);
            game.setRank(ranks[deck[i] % 13]);
            System.out.println( game.getRank() + " of " + game.getSuit());
        }
    }
}
