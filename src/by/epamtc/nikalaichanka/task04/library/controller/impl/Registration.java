package by.epamtc.nikalaichanka.task04.library.controller.impl;

import by.epamtc.nikalaichanka.task04.library.controller.Command;
import by.epamtc.nikalaichanka.task04.library.entity.Role;
import by.epamtc.nikalaichanka.task04.library.entity.User;
import by.epamtc.nikalaichanka.task04.library.service.ServiceException;
import by.epamtc.nikalaichanka.task04.library.service.ServiceProvider;
import by.epamtc.nikalaichanka.task04.library.service.UserService;

import java.io.FileNotFoundException;

public class Registration implements Command {

    public String execute(String request) throws FileNotFoundException, ServiceException {
        String[] splitRequest = request.split(" ");
        String login = splitRequest[1];
        String password = splitRequest[2];
        String firstName = splitRequest[3];
        String lastName = splitRequest[4];
        Role userRole = Role.valueOf(splitRequest[5]);

        ServiceProvider serviceFactory = ServiceProvider.getInstance();
        UserService userService = serviceFactory.getUserService();

        User newUser = new User(login, password, firstName, lastName, userRole);

        userService.registration(newUser);

        return "Registration successfully";
    }
}
