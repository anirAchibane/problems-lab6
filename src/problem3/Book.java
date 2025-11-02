package problem3;

public class Book extends Document{
    protected String author;
    protected int nbrPages;

    // Constructor:
    public Book(String title, String author, int nbrPages) {
        super(title);
        this.author = author;
        this.nbrPages = nbrPages;
    }

    // ToString redefinition
    @Override
    public String toString(){
        return "[Book: " + title + ", author: " + author + ", nbrPages: " + nbrPages +"]";
    }

    // getters and setters:
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNbrPages() {
        return nbrPages;
    }
    public void setNbrPages(int nbrPages) {
        this.nbrPages = nbrPages;
    }
}
