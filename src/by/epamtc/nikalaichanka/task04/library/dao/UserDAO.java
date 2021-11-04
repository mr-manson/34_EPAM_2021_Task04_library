package by.epamtc.nikalaichanka.task04.library.dao;

import by.epamtc.nikalaichanka.task04.library.entity.User;
import java.io.FileNotFoundException;

public interface UserDAO {

    boolean authorization(String login, String password) throws DAOException, FileNotFoundException;
    boolean registration(User newUser) throws DAOException, FileNotFoundException ;
    boolean remove(int userID) throws DAOException, FileNotFoundException ;

}
