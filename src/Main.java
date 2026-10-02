public class Main {

    public static void main(){
        FileIO io = new FileIO();
        Deck deck = new Deck();

        io.readData("data/flashcards.csv", deck);

        deck.displayAllCards();
    }

}
