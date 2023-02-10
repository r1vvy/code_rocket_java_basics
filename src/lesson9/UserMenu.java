package lesson9;

import lesson9.actions.MenuAction;

import java.util.InputMismatchException;
import java.util.List;

public class UserMenu {
    private final UserInput userInput;
    private final List<MenuAction> actions;

    public UserMenu(UserInput userInput, List<MenuAction> actions) {
        this.userInput = userInput;
        this.actions = actions;
    }

    public void start() {
        while (true) {
            printMenu();
            try {
                int choice = userInput.getIntInput();

                MenuAction action = actions.get(choice);
                action.execute();
            } catch(IllegalArgumentException | InputMismatchException | ArrayIndexOutOfBoundsException e) {
                System.err.println("Invalid input!");
            }
        }
    }

    private void printMenu() {
        System.out.println("====================================");
        for (int i = 0; i < actions.size(); i++) {
            System.out.println(i + "." + actions.get(i).getName());
        }
        System.out.println("====================================");

    }
}
