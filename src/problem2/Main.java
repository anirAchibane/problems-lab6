package problem2;

public class Main {
    public static void main(String[] args){
        Bank bank = new Bank("BMCE");
        Customer customer1 = new Customer("Anir");
        Customer customer2 = new Customer("Mohammed");

        // Adding customers to bank:
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Performing transaction:
        bank.addTransaction(customer1,customer2,5000.0);
    }
}
