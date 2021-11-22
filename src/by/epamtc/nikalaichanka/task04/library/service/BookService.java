package by.epamtc.nikalaichanka.task04.library.service;

import by.epamtc.nikalaichanka.task04.library.entity.Book;

import java.io.FileNotFoundException;
import java.util.List;

public interface BookService {
    void addBook(Book newBook) throws ServiceException, FileNotFoundException;
    Book findByTitle(String title) throws ServiceException;
    List<Book> findByAuthor(String author) throws ServiceException;
}
