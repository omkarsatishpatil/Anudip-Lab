//Write a Java program to create a class called "Book" with attributes for title,
//author, and ISBN, and methods to add and remove books from a collection.

package com.javacore.demo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Creating the Book class
public class Book {
    // Declaring attributes for title, author, and ISBN
    private String title;
    private String author;
    private String ISBN;

    // Constructor to initialize title, author, and ISBN
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getter and setter methods for title, author, and ISBN
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

     // Inner class to manage a collection of books
    public static class BookCollection {
        private List<Book> books = new ArrayList<>();

        // Method to add a book to the collection
        public void addBook(Book book) {
            books.add(book);
        }

        // Method to remove a book from the collection
        public void removeBook(Book book) {
            books.remove(book);
        }
        // Method to get the list of books in the collection
        public List<Book> getBooks() {
            return books;
        }
    }

    public static void main(String[] args) {
        
        // Creating a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        // Creating an instance of BookCollection to manage books
        BookCollection collection = new BookCollection();

        // Add a book
        System.out.print("Enter the title of the book to add: ");
        String title = scanner.nextLine();  // Reading title input

        System.out.print("Enter the author of the book to add: ");
        String author = scanner.nextLine(); // Reading author input

        System.out.print("Enter the ISBN of the book to add: ");
        String ISBN = scanner.nextLine();   // Reading ISBN input

        // Creating a new book with the provided details
        Book newBook = new Book(title, author, ISBN);
        collection.addBook(newBook);     // Adding the new book to the collection
        System.out.println("New Book added - Title: " + newBook.getTitle() + ", Author: " + newBook.getAuthor() + ", ISBN: " + newBook.getISBN());

        // Remove a book
        System.out.print("Enter the title of the book to remove: ");
        String titleToRemove = scanner.nextLine();  // Reading title to remove input

        // Iterating through the book collection to find the book to remove
        for (Book book : collection.getBooks()) {
            if (book.getTitle().equals(titleToRemove)) {
                collection.removeBook(book);    // Removing the book from the collection
                System.out.println("Book removed: " + book.getTitle());
                break;
            }
        }

        // Closing the scanner object
        scanner.close();
    }
}
/*
Program starts and prompts the user to add a book.
User inputs title "The Great Gatsby", author "F. Scott Fitzgerald", and ISBN "1234567890".
Book object newBook is created and added to collection.
Program prints details of the added book.
Program prompts the user to remove a book.
User inputs title "The Great Gatsby".
Program finds and removes the book from collection.
Program prints details of the removed book.
Scanner object is closed.
*/

