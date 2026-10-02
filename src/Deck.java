import java.util.ArrayList;

public class Deck {

    private ArrayList<Flashcard> flashcards;

    public Deck(){
        this.flashcards = new ArrayList<>();
    }

    public void addCard(Flashcard card){
        flashcards.add(card);
    }

    public void displayAllCards(){
        for (Flashcard fc : flashcards){
            System.out.println(fc);
        }
    }

}
