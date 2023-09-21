package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930,
                "Dorothy Sayers", "Robert Eustace");

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        BookComparator bookComparator = new BookComparator();
        Collections.sort(books, bookComparator);

        books.forEach(currentBook -> {
            System.out.printf("Title: %s written in %d\n",currentBook.getTitle(), currentBook.getYear());
        });
    }
}


