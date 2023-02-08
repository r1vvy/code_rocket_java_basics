package lesson9;

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
                int choice = userInput.getNumber();
                if (choice < 0 || choice >= actions.size()) {
                    throw new IllegalArgumentException("Invalid choice");
                } else {
                    MenuAction action = actions.get(choice);
                    // TODO: do some calculations with chosen shape.
                    /*if(action.getName().equalsIgnoreCase("Calculate")) {

                    }*/
                    action.execute();
                }
            } catch (IllegalArgumentException | InputMismatchException e) {
                if(e.getMessage() != null) {
                    System.err.println(e.getMessage());
                }
                System.err.println("Try again!");
            }
        }
    }

    private void printMenu() {
        for (int i = 0; i < actions.size(); i++) {
            System.out.println(i + "." + actions.get(i).getName());
        }
    }
}
