package librarySystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        // Create a list to store books
        List<Book> books = new ArrayList<>();

        // Create book objects and add them to the list
        Book book1 = new Book(101, "The C Programming Language", "Dennis Ritchie", 1, true);
        Book book2 = new Book(102, "JavaScript: The Good Parts", "Douglas Crockford", 1, true);
        Book book3 = new Book(103, "Python Crash Course", "Eric Matthes", 1, true);
        Book book4 = new Book(104, "Ruby on Rails Tutorial", "Michael Hartl", 1, true);
        Book book5 = new Book(105, "Effective Java", "Joshua Bloch", 1, true);
        Book book6 = new Book(106, "Learning Perl", "Randal L. Schwartz", 1, true);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        // Display a list of all books in the library
        System.out.println("A list of all books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println("===========================================================================");

        // Create a scanner for user input
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Press 1 to find a book by title");
            System.out.println("Press 2 to borrow a book");
            System.out.println("Press 3 For A list of all books in the library:");
            System.out.println("Press 4 For Exite");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            if (choice == 1) {
                System.out.println("Search for a book by its title:");
                String title = sc.nextLine();
                // Use stream to filter books by title
                List<Book> foundBooks = books.stream()
                        .filter(book -> book.getName().equalsIgnoreCase(title))
                        .toList();

                if (!foundBooks.isEmpty()) {
                    System.out.println("Book found:");
                    System.out.println(foundBooks.get(0));
                    System.out.println("===========================================================================");
                } else {
                    System.out.println("Book not found.");
                    System.out.println("===========================================================================");
                }
            } else if (choice == 2) {
                System.out.println("Enter the title of the book to borrow:");
                String title = sc.nextLine();
                // Use stream to filter books by title
                List<Book> foundBooks = books.stream()
                        .filter(book -> book.getName().equalsIgnoreCase(title))
                        .toList();

                if (!foundBooks.isEmpty()) {
                    Book bookToBorrow = foundBooks.get(0);
                    if (bookToBorrow.isStatus()) {
                        bookToBorrow.setStatus(false);
                        System.out.println("Book is issued.");
                        System.out.println("===========================================================================");
                    } else {
                        System.out.println("Book is already borrowed.");
                        System.out.println("===========================================================================");
                    }
                } else {
                    System.out.println("Book not found.");
                    System.out.println("===========================================================================");
                }
                
            }if(choice==3) {
            	 System.out.println("A list of all books in the library:");
                 for (Book book : books) {
                     System.out.println(book);
                 }
                 System.out.println("===========================================================================");
            	
            }
            else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
