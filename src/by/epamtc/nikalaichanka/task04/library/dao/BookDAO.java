package by.epamtc.nikalaichanka.task04.library.dao;

import by.epamtc.nikalaichanka.task04.library.entity.Book;

import java.io.FileNotFoundException;
import java.util.List;

public interface BookDAO {

    void addBook(Book newBook) throws DAOException, FileNotFoundException;
    Book findByTitle(String title) throws DAOException;
    List<Book> findByAuthor(String author) throws DAOException;
}
