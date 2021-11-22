package by.epamtc.nikalaichanka.task04.library.service;

import by.epamtc.nikalaichanka.task04.library.entity.User;

import java.io.FileNotFoundException;

public interface UserService {

    User authorization(String login, String password) throws ServiceException, FileNotFoundException;
    void registration(User newUser) throws ServiceException, FileNotFoundException ;
}
