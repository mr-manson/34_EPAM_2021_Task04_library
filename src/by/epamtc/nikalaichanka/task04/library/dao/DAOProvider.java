package by.epamtc.nikalaichanka.task04.library.dao;

import by.epamtc.nikalaichanka.task04.library.dao.impl.FileBookDAO;
import by.epamtc.nikalaichanka.task04.library.dao.impl.FileUserDAO;

public class DAOProvider {

        private static final DAOProvider instance = new DAOProvider();

        private DAOProvider() {}

        private UserDAO userDAO = new FileUserDAO();
        private BookDAO bookDAO = new FileBookDAO();

        public static DAOProvider getInstance() {
            return instance;
        }

        public UserDAO getUserDao() {
            if (userDAO == null) {
                userDAO = new FileUserDAO();
                    }
            return userDAO;
        }

        public BookDAO getBookDao() {
            if (bookDAO == null) {
                bookDAO = new FileBookDAO();
                    }
            return bookDAO;
        }
}
