package problem5;

public class Main {
    public static void main(String[] args){
        System.out.println("=== Stack Test ===");
        BookStack bookStack = new BookStack();
        // Adding books to stack:
        bookStack.push(new Book("The Hobbit","J.R.R Tolkien",1937));
        bookStack.push(new Book("1984","George Orwell",1949));
        bookStack.push(new Book("Clean Code","Robert C. Martin",2008));
        // Displaying stack content:
        bookStack.display();
        // Popping last added element:
        Book book = bookStack.pop();
        System.out.println("Popped: " + book);
        // Peeking at the next element in stack:
        System.out.println("Top: " + bookStack.peek());
        // Displaying stack content:
        bookStack.display();

        System.out.println("=== Queue Test ===");
        BookQueue bookQueue = new BookQueue();
        // Adding books to queue:
        bookQueue.enqueue(new Book("The Hobbit","J.R.R Tolkien",1937));
        bookQueue.enqueue(new Book("1984","George Orwell",1949));
        bookQueue.enqueue(new Book("Clean Code","Robert C. Martin",2008));
        // Displaying queue content:
        bookQueue.display();
        // Removing first content:
        book = bookQueue.dequeue();
        System.out.println("Dequeued: " + book);
        // Peeking at next element in queue:
        System.out.println("Front: " + bookQueue.peek());
        // Displaying queue content:
        bookQueue.display();

    }
}
