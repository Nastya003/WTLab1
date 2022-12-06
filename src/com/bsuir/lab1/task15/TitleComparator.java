package com.bsuir.lab1.task15;

import com.bsuir.lab1.task12and14.Book;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {

    public int compare(Book a, Book b){
        return a.getTitle().compareTo(b.getTitle());
    }
}
