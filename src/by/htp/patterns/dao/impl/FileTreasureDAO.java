package by.htp.patterns.dao.impl;

import by.htp.patterns.dao.TreasureDAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTreasureDAO implements TreasureDAO {
    @Override
    public List<String> readFile(String fileName) {
        List<String> tempStr = new ArrayList<>();

        try {
            String line;
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            while ((line = bufferedReader.readLine()) != null) {
                tempStr.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tempStr;
    }
}
