package problem3;

public class Textbook extends Book{
    public String level;

    public Textbook(String title, String author, int nbrPages, String level) {
        super(title, author, nbrPages);
        this.level = level;
    }

    // ToString redefinition
    @Override
    public String toString(){
        return "[TextBook: " + title
                + ", author: " + author
                + ", nbrPages: " + nbrPages
                + ", level: " + level +"]";
    }
}
