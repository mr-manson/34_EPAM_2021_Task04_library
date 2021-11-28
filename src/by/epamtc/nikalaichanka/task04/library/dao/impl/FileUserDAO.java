package by.epamtc.nikalaichanka.task04.library.dao.impl;

import by.epamtc.nikalaichanka.task04.library.dao.DAOException;
import by.epamtc.nikalaichanka.task04.library.dao.UserDAO;
import by.epamtc.nikalaichanka.task04.library.entity.User;
import by.epamtc.nikalaichanka.task04.library.dao.util.TakeDataFromFile;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.List;

public class FileUserDAO implements UserDAO {

    public User authorization(String login, String password) throws DAOException {
        try {
            List<User> users = TakeDataFromFile.takeUsersFromFile();
            for (User user : users) {
                if (login.equals(user.getUserLogin()) && password.equals(user.getUserPassword())) {
                    return user;
                }
            }
        } catch (FileNotFoundException e) {
            throw new DAOException("Wrong login or password", e);
        }
        return null;
    }

    public void registration(User newUser) throws DAOException {
        try (FileWriter writer = new FileWriter(TakeDataFromFile.USERS_PATH)) {
            long newUserID = TakeDataFromFile.takeUsersQuantity() + 1;
            writer.append("userID='" + newUserID + "' " + newUser.toString());
        } catch (Exception e) {
            throw new DAOException("Target file not found", e);
        }
    }
}

