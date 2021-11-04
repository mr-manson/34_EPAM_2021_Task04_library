package by.epamtc.nikalaichanka.task04.library.dao.impl;

import by.epamtc.nikalaichanka.task04.library.dao.DAOException;
import by.epamtc.nikalaichanka.task04.library.dao.UserDAO;
import by.epamtc.nikalaichanka.task04.library.entity.User;

import java.io.FileNotFoundException;

public class UserDAOImpl implements UserDAO {

    @Override
    public boolean authorization(String login, String password) throws DAOException, FileNotFoundException {


        return false;
    }

    @Override
    public boolean registration(User newUser) throws DAOException, FileNotFoundException {


        return false;
    }

    @Override
    public boolean remove(int userID) throws DAOException, FileNotFoundException {


        return false;
    }
}
