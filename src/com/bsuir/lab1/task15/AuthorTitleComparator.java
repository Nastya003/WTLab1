package com.bsuir.lab1.task15;

import com.bsuir.lab1.task12and14.Book;

import java.util.Comparator;

public class AuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        int AuthorCompare = a.getAuthor().compareTo(b.getAuthor());
        int TitleCompare = a.getTitle().compareTo(b.getTitle());
        int PriceCompare = a.getPrice() - b.getPrice();

        if (AuthorCompare == 0){
            return (TitleCompare == 0) ? PriceCompare : TitleCompare;
        }
        return AuthorCompare;
    }
}
