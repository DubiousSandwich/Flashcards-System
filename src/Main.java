import java.util.Scanner;

public class Main {

    public static void main(){
        FileIO io = new FileIO();
        Deck deck = new Deck();
        Scanner scan = new Scanner(System.in);

        io.readData("data/flashcards.csv", deck);

        //deck.displayAllCards();

        boolean running = true;
        while (running){
            deck.displayNextCard();
            System.out.println("\n1) flip\n2) next\n3) quit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 -> deck.flipCard();
                case 2 -> deck.displayNextCard();
                case 3 ->  running = false;
                default -> System.out.println("Prøv igen");
            }
            System.out.println("====================================");
        }

    }

}
