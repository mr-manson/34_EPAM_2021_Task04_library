package by.epamtc.nikalaichanka.task04.library.service.impl;

import by.epamtc.nikalaichanka.task04.library.dao.DAOException;
import by.epamtc.nikalaichanka.task04.library.dao.UserDAO;
import by.epamtc.nikalaichanka.task04.library.entity.User;
import by.epamtc.nikalaichanka.task04.library.dao.DAOProvider;
import by.epamtc.nikalaichanka.task04.library.service.ServiceException;
import by.epamtc.nikalaichanka.task04.library.service.UserService;

import java.io.FileNotFoundException;

public class UserServiceImpl implements UserService {

    DAOProvider daoProvider = DAOProvider.getInstance();
    UserDAO userDao = daoProvider.getUserDao();

    public User authorization(String login, String password) throws ServiceException, FileNotFoundException {
        User user;
        try {
            if (login == null || login.isEmpty()) { // добавить валидатор
                throw new ServiceException("Login is empty");
            }
            if (password == null || password.isEmpty()) { // добавить валидатор
                throw new ServiceException("Password is empty");
            }
            user = userDao.authorization(login, password);

        }catch (DAOException e) {
            throw new ServiceException("Wrong login or password", e);
        }
        return user;
    }


    public void registration(User newUser) throws ServiceException, FileNotFoundException {
        try {
            if (newUser == null){
                throw new ServiceException("Empty value");
            }
            userDao.registration(newUser);

        }catch (DAOException e) {
            throw new ServiceException("Registration fail", e);
        }
    }
}
