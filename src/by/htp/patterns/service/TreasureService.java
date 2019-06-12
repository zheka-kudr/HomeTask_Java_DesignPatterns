package by.htp.patterns.service;

import by.htp.patterns.entity.Treasure;

import java.util.List;

public interface TreasureService {
    String getTreasure(Treasure treasure);

    Treasure findMostExpensive(List<Treasure> treasures);

    List<String> readFile(String fileName);

    List<Treasure> findToLimit(List<Treasure> treasures, int limit);

    List<Treasure> createTreasures(List<String> listStr);

    String getResult(List<Treasure> treasure);

}
