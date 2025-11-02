package problem3;

public class Dictionary extends Document{
    private String language;

    //Constructor
    public Dictionary(String title, String language) {
        super(title);
        this.language = language;
    }

    // ToString redefinition
    @Override
    public String toString(){
        return "[Dictionary: " + title + ", Language: " + language +"]";
    }
}
