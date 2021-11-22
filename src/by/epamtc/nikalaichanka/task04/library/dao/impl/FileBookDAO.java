package by.epamtc.nikalaichanka.task04.library.dao.impl;

import by.epamtc.nikalaichanka.task04.library.dao.BookDAO;
import by.epamtc.nikalaichanka.task04.library.dao.DAOException;
import by.epamtc.nikalaichanka.task04.library.dao.util.TakeDataFromFile;
import by.epamtc.nikalaichanka.task04.library.entity.Book;
import by.epamtc.nikalaichanka.task04.library.entity.User;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileBookDAO implements BookDAO {

    public void addBook(Book newBook) throws DAOException {
        try (FileWriter writer = new FileWriter(TakeDataFromFile.BOOKS_PATH)) {
            long newBookID = TakeDataFromFile.takeBooksQuantity() + 1;
            writer.append("bookID='" + newBookID + "' " + newBook.toString());
        } catch (Exception e) {
            throw new DAOException("Target file not found", e);
        }
    }

    public Book findByTitle(String title) throws DAOException {
        try {
            List<Book> books = TakeDataFromFile.takeBooksFromFile();
            for (Book book : books) {
                if (title.equals(book.getBookTitle())) {
                    return book;
                }
            }
        } catch (Exception e) {
            throw new DAOException("No book found", e);
        }
        return null;
    }

    public List<Book> findByAuthor(String author) throws DAOException {
        try {
            List<Book> books = TakeDataFromFile.takeBooksFromFile();
            List<Book> tmpBook = new ArrayList<Book>();
            for (Book book : books) {
                if (author.equals(book.getBookAuthor())) {
                    tmpBook.add(book);
                }
                return tmpBook;
            }
        } catch (Exception e) {
            throw new DAOException("No book found", e);
        }
        return null;
    }
}
