package by.htp.patterns.controller;

import by.htp.patterns.command.Command;
import by.htp.patterns.command.CommandProvider;

public class Controller {
    private CommandProvider provider = new CommandProvider();

    public String doAction(String request) {
        String[] params = request.split("\\s+");
        String response;
        Command command = provider.getCommand(Integer.parseInt(params[0]));
        try {
            response = command.execute(request);
        } catch (NullPointerException e) {
            response = "Wrong input";
        }
        return response;
    }
}
