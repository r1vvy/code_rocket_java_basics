package lesson9;

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
            int choice = userInput.getNumber();
            if (0 > choice || choice > actions.size()) {
                throw new IllegalArgumentException("Invalid choice");
            } else {
                MenuAction action = actions.get(choice);
                action.execute();
            }
        }
    }

    private void printMenu() {
        for (int i = 0; i < actions.size(); i++) {
            System.out.println(i + "." + actions.get(i).getName());
        }
    }
}
