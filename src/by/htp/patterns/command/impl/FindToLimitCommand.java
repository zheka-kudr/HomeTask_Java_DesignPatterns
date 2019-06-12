package by.htp.patterns.command.impl;

import by.htp.patterns.command.Command;
import by.htp.patterns.entity.Treasure;
import by.htp.patterns.service.ServiceProvider;
import by.htp.patterns.service.TreasureService;

import java.util.List;

public class FindToLimitCommand implements Command {
    @Override
    public String execute(String params) {
        int limit = Integer.parseInt(params.split("\\s+")[1]);
        String fileName = "C:\\Users\\Admin\\IdeaProjects\\DesignPatterns\\src\\by\\htp\\patterns\\resources\\treasures.txt";
        String error = "Nothing was found.";
        String response;
        ServiceProvider provider = ServiceProvider.getInstance();
        TreasureService treasureService = provider.getTreasureService();

        List<String> stringList;
        stringList = treasureService.readFile(fileName);
        if (stringList.size() > 0) {
            List<Treasure> treasure = (treasureService.createTreasures(stringList));
            List<Treasure> collection = treasureService.findToLimit(treasure, limit);

            if (collection.size() <= 0) {
                response = error;
            } else {
                response = treasureService.getResult(collection);
            }
        } else {
            response = "File is empty?";
        }
        return response;
    }
}
