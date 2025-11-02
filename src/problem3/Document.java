package problem3;

public class Document {
    private static int numEnreg = 0;
    protected int numRec;
    protected String title;

    // Constructor:

    public Document(String title) {
        this.title = title;
        numRec = numEnreg;
        numEnreg++;
    }

    // ToString redefinition
    @Override
    public String toString(){
        return "[Document: " + title + "]";
    }
    // getters and setters:
    public int getNumRec() {
        return numRec;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
