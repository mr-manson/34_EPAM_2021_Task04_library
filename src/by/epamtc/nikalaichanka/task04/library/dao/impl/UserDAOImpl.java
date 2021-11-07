package by.epamtc.nikalaichanka.task04.library.dao.impl;

import by.epamtc.nikalaichanka.task04.library.dao.DAOException;
import by.epamtc.nikalaichanka.task04.library.dao.UserDAO;
import by.epamtc.nikalaichanka.task04.library.entity.User;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDAOImpl implements UserDAO {



    @Override
    public User authorization(String login, String password) throws DAOException, FileNotFoundException {
        List<User> users = getDataFromFile();

        for (User user : users) {
            if (login.equals(user.getUserLogin()) && password.equals(user.getUserPassword())) {
                return user;
            }

        }
        return null; //TEST
    }


    @Override
    public boolean registration(User newUser) throws DAOException, FileNotFoundException {


        return false;
    }

    @Override
    public boolean remove(int userID) throws DAOException, FileNotFoundException {
        

        return false;
    }


    private List<User> getDataFromFile() throws FileNotFoundException {
        List<User> users = new ArrayList<User>();
        FileReader reader = new FileReader("users.txt");
        Scanner sc = new Scanner(reader);

        while (sc.hasNextLine()) {
            String u = sc.nextLine();
            String log = u.substring(1, 5); //TEST
            String pass = u.substring(10, 15); //TEST
            String fName = u.substring(20, 25); //TEST
            String lName = u.substring(30, 35); //TEST
            String uRole = u.substring(40, 45); //TEST
            User user = new User(log, pass, fName, lName, uRole);
            users.add(user);
        }
        return users;
    }



    /*
    String a = "userID='111' userLogin='many' userPassword='test'"; // TEST
    Pattern p = Pattern.compile("\'.*?\'");
    Matcher m = p.matcher(a);
    List<String> allMatches = new ArrayList<String>();
	    while(m.find()){
            allMatches.add(a.substring(m.start()+1,m.end()-1));
        }
    */
    }
