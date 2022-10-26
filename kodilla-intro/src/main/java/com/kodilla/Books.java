package com.kodilla;

public class Books {
    private String author;
    private String title;

public Books (String author, String title){
    this.author = author;
    this.title = title;


}
public static Books of(String author, String title){
    Books books = new Books(author,title);
    return books;
    }
}
