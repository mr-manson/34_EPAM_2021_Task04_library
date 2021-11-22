package by.epamtc.nikalaichanka.task04.library.controller;

import by.epamtc.nikalaichanka.task04.library.service.ServiceException;

import java.io.FileNotFoundException;

public class Controller {
    private final CommandProvider provider = new CommandProvider();

    public String toDo (String request) throws ServiceException, FileNotFoundException {
        String[] incomingData;
        Command command;

        incomingData = request.split(" ");
        command = provider.getCommand(incomingData[0]);
        return command.execute(request);
    }

}
