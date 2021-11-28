package by.epamtc.nikalaichanka.task04.library.controller;

import by.epamtc.nikalaichanka.task04.library.service.ServiceException;

import java.io.FileNotFoundException;

public class Controller {
    private final CommandProvider provider = new CommandProvider();

    public String run(String request) throws ServiceException, FileNotFoundException {
        String[] splitRequest;
        Command command;

        splitRequest = request.split(" ");
        command = provider.getCommand(splitRequest[0]);
        return command.execute(splitRequest[0]);
    }

}
