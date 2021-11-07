package by.epamtc.nikalaichanka.task04.library.entity;

import java.util.Objects;

public class Book {

    private int bookID;
    private String bookAuthor;
    private String bookTitle;


    public Book () {
    }

    public Book (int bookID, String bookAuthor, String bookTitle) {
        this.bookID = bookID;
        this.bookAuthor = bookAuthor;
        this.bookTitle = bookTitle;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookAuthor(){
        return bookAuthor;
    }

    public void setBookAuthor(){
        this.bookAuthor = bookAuthor;
    }

    public String getBookTitle(){
        return bookTitle;
    }

    public void setBookTitle(){
        this.bookTitle = bookTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookID == book.bookID && Objects.equals(bookAuthor, book.bookAuthor)
                                     && Objects.equals(bookTitle, book.bookTitle);
    }

    @Override
    public int hashCode() { // ECLIPSE
        int result = 1;
        result = 31 * result + (bookTitle == null ? 0 : bookTitle.hashCode());
        result = 31 * result + (bookAuthor == null ? 0 : bookAuthor.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                " bookAuthor='" + bookAuthor + '\'' +
                " bookTitle='" + bookTitle + '\'' +
                '}';
    }
}