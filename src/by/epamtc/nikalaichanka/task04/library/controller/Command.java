package by.epamtc.nikalaichanka.task04.library.controller;

import by.epamtc.nikalaichanka.task04.library.service.ServiceException;

public interface Command {

    String execute(String request) throws ServiceException;
}
