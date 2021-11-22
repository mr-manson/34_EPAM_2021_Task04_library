package by.epamtc.nikalaichanka.task04.library.controller;

import by.epamtc.nikalaichanka.task04.library.controller.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, Command> commands = new HashMap<>();

    CommandProvider(){
        commands.put(CommandName.AUTHORIZATION, new Authorization());
        commands.put(CommandName.REGISTRATION, new Registration());
        commands.put(CommandName.ADD_BOOK, new AddBook());
        commands.put(CommandName.FIND_BY_TITLE, new FindByTytle());
        commands.put(CommandName.FIND_BY_AUTHOR, new FindByAuthor());
    }

    public Command getCommand(String commandNameStr) {
        CommandName commandName;
        Command command;

        commandName = CommandName.valueOf(commandNameStr.toUpperCase());
        command = commands.get(commandName);

        return command;
    }
}
