package problem3;

public class Magazine extends Document{
    private String month;
    private int year;

    //Constructor
    public Magazine(String title, String month, int year) {
        super(title);
        this.month = month;
        this.year = year;
    }

    // ToString redefinition
    @Override
    public String toString(){
        return "[Magazine: " + title + ", month: " + month + ", year: " + year +"]";
    }
}
