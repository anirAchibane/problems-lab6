package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    // Constructor:
    public Bank(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    // add customer:
    public void addCustomer(Customer customer){
        if (!(customers.contains(customer))){
            customers.add(customer);
        }
    }

    // add transaction from customerA to customerB:
    public void addTransaction(Customer customerA, Customer customerB, Double amount){
        // unboxing is automatic in java,
        // but we explicitly unbox the amount variable for the exercise:
        customerA.addTransaction(- amount.doubleValue());
        customerB.addTransaction(amount.doubleValue());
        System.out.println("Made Transaction from " + customerA.getName()
                           + " to " + customerB.getName()
                           + ", amount = $" + amount);
    }
}
