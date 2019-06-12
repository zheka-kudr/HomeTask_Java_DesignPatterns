package by.htp.patterns.dao;

import java.util.List;

public interface TreasureDAO {
    List<String> readFile(String fileName);
}
