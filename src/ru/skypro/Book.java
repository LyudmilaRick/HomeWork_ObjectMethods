package ru.skypro;

import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int publicationYear;

    public Book(String bookName, Author author, int publicationYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    @Override
    public String toString() {
        return  bookName  +", "+ author + ". Год издания - "+ publicationYear;
    }

    @Override
    public boolean equals(Object next) {
        if (this == next) return true;
        if (next == null || getClass() != next.getClass()) return false;
        Book book = (Book) next;
        return Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }
}
