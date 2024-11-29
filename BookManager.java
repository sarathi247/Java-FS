package Class28;

import java.util.ArrayList;
import java.util.Scanner;

// Book class to represent a book
class Book {
    int id;
    String name;
    String author;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Author: " + author;
    }
}

// Main class
public class BookManager {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Book Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. View All Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: // Add Book
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter Book Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();

                    books.add(new Book(id, name, author));
                    System.out.println("Book added successfully!");
                    break;

                case 2: // Remove Book
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = scanner.nextInt();
                    boolean removed = books.removeIf(book -> book.id == removeId);
                    if (removed) {
                        System.out.println("Book removed successfully!");
                    } else {
                        System.out.println("Book with ID " + removeId + " not found!");
                    }
                    break;

                case 3: // View All Books
                    System.out.println("\n--- Book List ---");
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (Book book : books) {
                            System.out.println(book);
                        }
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}