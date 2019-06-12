package by.htp.patterns.view;

import by.htp.patterns.controller.Controller;

import java.util.Scanner;

public class View {
    private Controller controller;

    public View() {
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    private int getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void startDragonTreasure() {
        boolean isRunning = true;
        //String response = null;
        int result;
        String menu = "1.Show all treasures.\n2.Find most expensive treasure.\n3.Find tresures by cost limit\n4.Exit.";

        while (isRunning) {
            System.out.println(menu);
            result = getInput();
            String response = "";
            switch (result) {
                case 1:
                    response = controller.doAction("1");
                    break;
                case 2:
                    response = controller.doAction("2");
                    break;
                case 3:
                    System.out.println("Enter limit");
                    int temp = getInput();
                    response = controller.doAction(result + " " + temp);
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    response = "Wrong input!";
            }
            System.out.println(response);
            System.out.println();
        }
    }
}
