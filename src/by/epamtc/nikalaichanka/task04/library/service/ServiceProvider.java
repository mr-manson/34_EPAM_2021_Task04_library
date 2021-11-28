package by.epamtc.nikalaichanka.task04.library.service;

import by.epamtc.nikalaichanka.task04.library.dao.BookDAO;
import by.epamtc.nikalaichanka.task04.library.service.impl.BookServiceImpl;
import by.epamtc.nikalaichanka.task04.library.service.impl.UserServiceImpl;

public class ServiceProvider {
    private static final ServiceProvider instance = new ServiceProvider();

    private ServiceProvider() {}

    private UserService userService = new UserServiceImpl();
    private BookService bookService = new BookServiceImpl();

    public static ServiceProvider getInstance() {
        return instance;
    }

    public UserService getUserService() {
        if (userService == null) {
            userService = new UserServiceImpl();
        }
        return userService;
    }

    public BookService getBookService() {
        if (bookService == null) {
            bookService = new BookServiceImpl();
        }
        return bookService;
    }
}
