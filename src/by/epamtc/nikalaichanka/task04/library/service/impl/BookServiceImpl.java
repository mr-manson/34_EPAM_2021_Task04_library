package by.epamtc.nikalaichanka.task04.library.service.impl;

import by.epamtc.nikalaichanka.task04.library.dao.BookDAO;
import by.epamtc.nikalaichanka.task04.library.dao.DAOException;
import by.epamtc.nikalaichanka.task04.library.dao.DAOProvider;
import by.epamtc.nikalaichanka.task04.library.entity.Book;
import by.epamtc.nikalaichanka.task04.library.service.BookService;
import by.epamtc.nikalaichanka.task04.library.service.ServiceException;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {

    DAOProvider daoProvider = DAOProvider.getInstance();
    BookDAO bookDao = daoProvider.getBookDao();

    public void addBook(Book newBook) throws ServiceException, FileNotFoundException {
        try {
            if (newBook == null){ // добавить валидатор
                throw new ServiceException("Empty value");
            }
            bookDao.addBook(newBook);

        }catch (DAOException e) {
            throw new ServiceException("Book not added", e);
        }
    }

    public Book findByTitle(String title) throws ServiceException {
        Book book;
        try {
            if (title == null) { // добавить валидатор
                throw new ServiceException("Title is empty");
            }
            book = bookDao.findByTitle(title);

        }catch (DAOException e) {
            throw new ServiceException("Book not found", e);
        }
        return book;
    }

    public List<Book> findByAuthor(String author) throws ServiceException {
        List <Book> tmpBook = new ArrayList<Book>();
        try {
            if (author == null) { // добавить валидатор
                throw new ServiceException("Author name is empty");
            }
            tmpBook = bookDao.findByAuthor(author);

        }catch (DAOException e) {
            throw new ServiceException("Book not found", e);
        }
        return tmpBook;
    }
}
