package by.epamtc.nikalaichanka.task04.library.controller.impl;

import by.epamtc.nikalaichanka.task04.library.controller.Command;
import by.epamtc.nikalaichanka.task04.library.service.BookService;
import by.epamtc.nikalaichanka.task04.library.service.ServiceException;
import by.epamtc.nikalaichanka.task04.library.service.ServiceProvider;

public class FindByAuthor implements Command {

    public String execute(String request) throws ServiceException {
        String[] splitRequest = request.split(" ");
        String bookAuthor = splitRequest[1];

        ServiceProvider provider = ServiceProvider.getInstance();
        BookService bookService = provider.getBookService();

        return "Search result: " + bookService.findByAuthor(bookAuthor);

        }
}
