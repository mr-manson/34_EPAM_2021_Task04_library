package by.epamtc.nikalaichanka.task04.library.view;

import by.epamtc.nikalaichanka.task04.library.controller.Controller;
import by.epamtc.nikalaichanka.task04.library.service.ServiceException;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws ServiceException, FileNotFoundException {
        Controller controller = new Controller();
        String response = "";

        String request = "registration test test test test READER";

        response = controller.run(request);

        System.out.println(response);

    }
}
