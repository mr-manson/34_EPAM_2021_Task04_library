package by.epamtc.nikalaichanka.task04.library.dao;

import by.epamtc.nikalaichanka.task04.library.dao.impl.BookDAOImpl;
import by.epamtc.nikalaichanka.task04.library.dao.impl.UserDAOImpl;

public class DAOProvider {

        private static final DAOProvider instance = new DAOProvider();

        private DAOProvider() {}

        private UserDAO userDAO = new UserDAOImpl();
        private BookDAO bookDAO = new BookDAOImpl();

        public static DAOProvider getInstance() {
            return instance;
        }

        public UserDAO getUserDao() {
            if (userDAO == null) {
                synchronized (UserDAO.class) {
                    if (userDAO == null) {
                        userDAO = new UserDAOImpl();
                    }
                }
            }
            return userDAO;
        }

        public BookDAO getBookDao() {
            if (bookDAO == null) {
                synchronized (BookDAO.class) {
                    if (bookDAO == null) {
                        bookDAO = new BookDAOImpl();
                    }
                }
            }
            return bookDAO;
        }
}
