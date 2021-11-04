package by.epamtc.nikalaichanka.task04.library.dao;

import java.io.FileNotFoundException;

public interface BookDAO {

    boolean addBook(String bookAuthor, String bookTitle) throws DAOException, FileNotFoundException;
}
