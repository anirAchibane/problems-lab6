package problem3;

public class Novel extends Book{
    public double price;

    // Constructor:
    public Novel(String title, String author, int nbrPages, double price) {
        super(title, author, nbrPages);
        this.price = price;
    }


    // ToString redefinition
    @Override
    public String toString(){
        return "[Novel: " + title
                + ", author: " + author
                + ", nbrPages: " + nbrPages
                +", price: " + price +"]";
    }
}
