package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;


    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public LibraryDatabase getLibraryDatabase() {
        return libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksWithCondition2(String titleFragment) {
        if (titleFragment.length() < 3) {
            return new ArrayList<>();
        }

        final List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);

        if (resultList.size() > 20) {
            return new ArrayList<>();
        }

        return resultList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> libraryUserBooksInHandsOf = libraryDatabase.listBooksInHandsOf(libraryUser);

        return libraryUserBooksInHandsOf;
    }
}