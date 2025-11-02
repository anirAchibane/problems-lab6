package problem2;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    // Constructor:
    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    // add transaction method
    public void addTransaction(double amount){
        transactions.add(amount);
    }

    // getter and setter for name:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
