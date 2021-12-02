package by.epamtc.nikalaichanka.task04.library.util;

import by.epamtc.nikalaichanka.task04.library.entity.Book;
import by.epamtc.nikalaichanka.task04.library.entity.Role;
import by.epamtc.nikalaichanka.task04.library.entity.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TakeDataFromFile {

    public static final String USERS_PATH = "src/resources/users.txt";
    public static final String BOOKS_PATH = "src/resources/books.txt";

    public static List<User> takeUsersFromFile() throws FileNotFoundException {
        List<User> users = new ArrayList<User>();

        Scanner sc;
        try (FileReader reader = new FileReader(USERS_PATH)) {
            sc = new Scanner(reader);
            while (sc.hasNextLine()) {
                String userData = sc.nextLine();
                Pattern p = Pattern.compile("'.*?'");
                Matcher m = p.matcher(userData);
                List<String> allMatches = new ArrayList<String>();
                while (m.find()) {
                    allMatches.add(userData.substring(m.start() + 1, m.end() - 1));
                }
                    String log = allMatches.get(1);
                    String pass = allMatches.get(2);
                    String fName = allMatches.get(3);
                    String lName = allMatches.get(4);
                    Role uRole = Role.valueOf(allMatches.get(5).toUpperCase());
                    User user = new User(log, pass, fName, lName, uRole);
                    users.add(user);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return users;
    }
     public static long takeUsersQuantity() throws FileNotFoundException {
         List<User> tmpUsers = new ArrayList<User>();
         tmpUsers = takeUsersFromFile();
         int usersQuantity = tmpUsers.size();
         return usersQuantity;
     }

    public static List<Book> takeBooksFromFile() throws FileNotFoundException {
        List<Book> books = new ArrayList<Book>();

        FileReader reader = new FileReader(BOOKS_PATH);
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(reader);

        while (sc.hasNextLine()) {
            String bookData = sc.nextLine();
            Pattern p = Pattern.compile("'.*?'");
            Matcher m = p.matcher(bookData);
            List<String> allMatches = new ArrayList<String>();
            while (m.find()) {
                allMatches.add(bookData.substring(m.start() + 1, m.end() - 1));
            }
            String title = allMatches.get(1);
            String author = allMatches.get(2);
            Book book = new Book(title, author);
            books.add(book);
        }
        return books;
    }

    public static long takeBooksQuantity() throws FileNotFoundException {
        List<Book> tmpBooks = new ArrayList<Book>();
        tmpBooks = takeBooksFromFile();
        int booksQuantity = tmpBooks.size();
        return booksQuantity;
    }
}
