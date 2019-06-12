package by.htp.patterns;

import by.htp.patterns.controller.Controller;
import by.htp.patterns.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        View view = new View();
        view.setController(controller);
        view.startDragonTreasure();
    }
}
