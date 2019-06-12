package by.htp.patterns.command;

import by.htp.patterns.command.impl.FindMostExpensiveCommand;
import by.htp.patterns.command.impl.FindToLimitCommand;
import by.htp.patterns.command.impl.TreasuresViewCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {

    private Map<Integer, Command> commands = new HashMap<>();

    public CommandProvider() {
        commands.put(1, new TreasuresViewCommand());
        commands.put(2, new FindMostExpensiveCommand());
        commands.put(3, new FindToLimitCommand());
    }

    public Command getCommand(Integer commandsNum) {
        Command command;
        command = commands.get(commandsNum);
        return command;
    }
}
