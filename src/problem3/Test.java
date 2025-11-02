package problem3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // Input size of library
        System.out.println("Choose size of library: ");
        int n = scan.nextInt();

        // creating library of size n and initializing first 2 documents:
        Library library = new Library(n);
        library.add(new Book("book1","author1",300));
        library.add(new Dictionary("frenchDict","french"));
        // Interactive loop:
        boolean loop = true;
        int choice;
        while (loop){
            System.out.println("Choose option:");
            System.out.println("0 : Exit");
            System.out.println("1 : Display");
            System.out.println("2 : Add Document");
            System.out.println("3 : Delete");
            System.out.println("4 : Document");
            System.out.println("5 : Authors");
            choice = scan.nextInt();
            switch(choice){
                case 0:
                    loop = false;
                    break;
                case 1:
                    library.displayDocuments();
                    break;
                case 2:
                    scan.nextLine();
                    String type;
                    System.out.print("Enter Document type: ");
                    type = scan.nextLine();
                    System.out.print("Enter title: ");
                    String title = scan.nextLine();
                    String author;
                    int nbrPages;
                    // adding document based on type:
                    switch (type){
                        case "Document":
                            library.add(new Document(title));
                            break;
                        case "Dictionary":
                            System.out.print("Enter language : ");
                            String language = scan.nextLine();
                            library.add(new Dictionary(title,language));
                            break;
                        case "Magazine":
                            System.out.print("Enter month: ");
                            String month = scan.nextLine();
                            System.out.print("Enter year: ");
                            int year = scan.nextInt();
                            scan.nextLine();
                            library.add(new Magazine(title,month,year));
                            break;
                        case "Book":
                            System.out.print("Enter author: ");
                            author = scan.nextLine();
                            System.out.print("Enter nbrPages: ");
                            nbrPages = scan.nextInt();
                            scan.nextLine();
                            library.add(new Book(title,author,nbrPages));
                            break;
                        case "TextBook":
                            System.out.print("Enter author: ");
                            author = scan.nextLine();
                            System.out.print("Enter nbrPages: ");
                            nbrPages = scan.nextInt();
                            scan.nextLine();
                            System.out.print("Enter Level: ");
                            String level = scan.nextLine();
                            library.add(new Textbook(title,author,nbrPages,level));
                            break;
                        case "Novel":
                            System.out.print("Enter author: ");
                            author = scan.nextLine();
                            System.out.print("Enter nbrPages: ");
                            nbrPages = scan.nextInt();
                            scan.nextLine();
                            System.out.print("Enter price: ");
                            int price = scan.nextInt();
                            scan.nextLine();
                            library.add(new Novel(title,author,nbrPages,price));
                            break;
                        default: break;
                    }
                    System.out.println("Document added to library!");
                    break;
                case 3:
                    System.out.print("Enter record number of document to delete: ");
                    int numberRecord = scan.nextInt();
                    library.deleteDocument(library.document(numberRecord));
                    break;
                case 4:
                    System.out.print("Enter record number of document: ");
                    numberRecord = scan.nextInt();
                    System.out.println(library.document(numberRecord));
                    break;
                case 5:
                    library.displayAuthors();
                    break;
                default:
                    loop = false;
                    break;
            }
        }
    }
}