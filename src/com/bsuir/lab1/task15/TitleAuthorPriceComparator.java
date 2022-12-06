package com.bsuir.lab1.task15;

import com.bsuir.lab1.task12and14.Book;

import java.util.Comparator;

public class TitleAuthorPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book b) {
        int AuthorCompare = o1.getAuthor().compareTo(b.getAuthor());
        int TitleCompare = o1.getTitle().compareTo(b.getTitle());
        int PriceCompare = o1.getPrice() - b.getPrice();

        if (AuthorCompare == 0){
            return (TitleCompare == 0) ? PriceCompare : TitleCompare;
        }
        return AuthorCompare;
    }
}
