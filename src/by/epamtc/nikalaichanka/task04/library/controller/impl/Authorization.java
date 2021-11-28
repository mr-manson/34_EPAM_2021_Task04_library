package by.epamtc.nikalaichanka.task04.library.controller.impl;

import by.epamtc.nikalaichanka.task04.library.controller.Command;
import by.epamtc.nikalaichanka.task04.library.service.ServiceException;
import by.epamtc.nikalaichanka.task04.library.service.ServiceProvider;
import by.epamtc.nikalaichanka.task04.library.service.UserService;

import java.io.FileNotFoundException;

public class Authorization implements Command {

    public String execute(String request) throws ServiceException, FileNotFoundException {
        String[] splitRequest = request.split(" ");
        String login = splitRequest[1];
        String password = splitRequest[2];

        ServiceProvider provider = ServiceProvider.getInstance();
        UserService userService = provider.getUserService();

        userService.authorization(login, password);
        // ROLE !!!!!!!!!!!!!

        return "Welcome " + login;
        }
}
