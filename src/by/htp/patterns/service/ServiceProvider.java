package by.htp.patterns.service;

import by.htp.patterns.service.impl.TreasureServiceImpl;

public class ServiceProvider {
    private final static ServiceProvider PROVIDER = new ServiceProvider();

    private TreasureService treasureService = new TreasureServiceImpl();

    private ServiceProvider() {
    }

    public static ServiceProvider getInstance() {
        return PROVIDER;
    }

    public TreasureService getTreasureService() {
        return treasureService;
    }
}
