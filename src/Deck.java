import java.util.ArrayList;
import java.util.Scanner;

public class Deck {

    private ArrayList<Flashcard> flashcards;
    private static int count = 0;
    private Flashcard currentCard;

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

    public void displayNextCard(){
        currentCard = flashcards.get(count);
        count++;
        System.out.println(currentCard.getTerm());
    }

    public void flipCard(){

        System.out.println(currentCard.getDescription());
    }



    /*
    public void displayNextCard(){
        for (Flashcard card : flashcards){
            Scanner scan = new Scanner(System.in);
            System.out.println("========================================");
            System.out.println(card.getTerm());
            System.out.println("Press 1 to continue");
            int input = scan.nextInt();
            System.out.println(card.getDescription());
        }
    }

     */


}
