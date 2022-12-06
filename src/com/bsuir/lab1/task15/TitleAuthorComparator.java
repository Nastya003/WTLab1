package com.bsuir.lab1.task15;

import com.bsuir.lab1.task12and14.Book;

import java.util.Comparator;

public class TitleAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        int AuthorCompare = a.getAuthor().compareTo(b.getAuthor());
        int TitleCompare = a.getTitle().compareTo(b.getTitle());

        return (TitleCompare == 0) ? AuthorCompare : TitleCompare;
    }
}
