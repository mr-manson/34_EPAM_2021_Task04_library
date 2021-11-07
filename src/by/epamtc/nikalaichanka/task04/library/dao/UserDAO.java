package by.epamtc.nikalaichanka.task04.library.dao;

import by.epamtc.nikalaichanka.task04.library.entity.User;
import java.io.FileNotFoundException;

public interface UserDAO {

    User authorization(String login, String password) throws DAOException, FileNotFoundException;
    User registration(User newUser) throws DAOException, FileNotFoundException ;
    User remove(int userID) throws DAOException, FileNotFoundException ;

}
