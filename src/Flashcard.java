public class Flashcard {

    private String term;
    private String description;

    public Flashcard(String term, String description){
        this.term = term;
        this.description = description;
    }

    @Override
    public String toString(){
        return term + ", " + description;
    }

}
