package by.htp.patterns.command.impl;

import by.htp.patterns.command.Command;
import by.htp.patterns.entity.Treasure;
import by.htp.patterns.service.ServiceProvider;
import by.htp.patterns.service.TreasureService;

import java.util.List;

public class TreasuresViewCommand implements Command {
    @Override
    public String execute(String params) {
        String fileName = "C:\\Users\\Admin\\IdeaProjects\\DesignPatterns\\src\\by\\htp\\patterns\\resources\\treasures.txt";
        String response = null;
        ServiceProvider provider = ServiceProvider.getInstance();
        TreasureService treasureService = provider.getTreasureService();

        List<String> stringList;
        stringList = treasureService.readFile(fileName);
        if (stringList.size() > 0) {
            List<Treasure> treasure = treasureService.createTreasures(stringList);
            response = treasureService.getResult(treasure);
        } else {
            response = "File is empty?";
        }

        return response;
    }
}
