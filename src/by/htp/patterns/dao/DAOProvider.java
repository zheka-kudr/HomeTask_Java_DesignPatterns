package by.htp.patterns.dao;

import by.htp.patterns.dao.impl.FileTreasureDAO;

public class DAOProvider {
    private final static DAOProvider PROVIDER = new DAOProvider();

    private TreasureDAO treasureDAO = new FileTreasureDAO();

    private DAOProvider() {
    }

    public static DAOProvider getInstance() {
        return PROVIDER;
    }

    public TreasureDAO getTreasureDAO() {
        return treasureDAO;
    }
}
