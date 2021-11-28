package by.epamtc.nikalaichanka.task04.library.controller.impl;

import by.epamtc.nikalaichanka.task04.library.controller.Command;
import by.epamtc.nikalaichanka.task04.library.entity.Book;
import by.epamtc.nikalaichanka.task04.library.service.BookService;
import by.epamtc.nikalaichanka.task04.library.service.ServiceException;
import by.epamtc.nikalaichanka.task04.library.service.ServiceProvider;

import java.io.FileNotFoundException;

public class AddBook implements Command {

    public String execute(String request) throws ServiceException, FileNotFoundException {
        String[] splitRequest = request.split(" ");
        String bookTitle = splitRequest[1];
        String bookAuthor = splitRequest[2];

        String response = "Book added successfully";

        ServiceProvider serviceFactory = ServiceProvider.getInstance();
        BookService bookService = serviceFactory.getBookService();

        Book newBook = new Book(bookAuthor, bookTitle);

        bookService.addBook(newBook);

        return response;
    }
}
