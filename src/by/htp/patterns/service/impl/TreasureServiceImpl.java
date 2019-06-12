package by.htp.patterns.service.impl;

import by.htp.patterns.dao.DAOProvider;
import by.htp.patterns.dao.TreasureDAO;
import by.htp.patterns.entity.Treasure;
import by.htp.patterns.service.TreasureService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.max;

public class TreasureServiceImpl implements TreasureService {
    @Override
    public String getTreasure(Treasure treasure) {
        return treasure.getId() + " " + treasure.getName() + " " + treasure.getCost();
    }

    @Override
    public Treasure findMostExpensive(List<Treasure> treasures) {
        return max(treasures, Comparator.comparingInt(Treasure::getCost));
    }

    @Override
    public List<String> readFile(String fileName) {
        DAOProvider daoProvider = DAOProvider.getInstance();
        TreasureDAO treasureDAO = daoProvider.getTreasureDAO();
        List<String> list = treasureDAO.readFile(fileName);
        return list;
    }

    @Override
    public List<Treasure> findToLimit(List<Treasure> treasures, int limit) {
        int sum = 0;
        List<Treasure> result = new ArrayList<>();

        for (Treasure tempTreasure : treasures) {
            if (tempTreasure.getCost() > limit) {
                continue;
            }
            if (sum + tempTreasure.getCost() > limit) {
                continue;
            }
            sum += tempTreasure.getCost();
            result.add(tempTreasure);
        }
        return result;
    }

    public String getResult(List<Treasure> treasure) {
        String result = "";
        for (Treasure value : treasure) {
            result += value+"\n";
        }
        return result;
    }

    public List<Treasure> createTreasures(List<String> listStr) {
        List<Treasure> treasure = new ArrayList<>();
        for (String tempLine : listStr) {
            int id = Integer.parseInt(tempLine.split(",")[0]);
            String name = tempLine.split(",")[1];
            int cost = Integer.parseInt(tempLine.split(",")[2]);

            Treasure treas = new Treasure(id, name, cost);
            treasure.add(treas);
        }
        return treasure;
    }
}
