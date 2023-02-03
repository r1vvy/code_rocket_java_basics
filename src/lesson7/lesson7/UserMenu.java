package lesson7;
import java.math.BigDecimal;
import java.util.List;

public class UserMenu {
    private final UserInput userInput;
    private final List<MenuAction> menuActions;

    public UserMenu(UserInput userInput, List<MenuAction> actions) {
        this.userInput = userInput;
        this.menuActions = actions;
    }

    private void printOutMenu() {
        for (int i = 0; i < this.menuActions.size(); i++) {
            System.out.println(i + 1 + ". " + this.menuActions.get(i).getName());
        }
    }

    public void startMenu() {
        System.out.println("Welcome to the Temperature Conversion App!");
        while(true) {
            printOutMenu();
            int choice = userInput.getNumber() - 1;
            MenuAction menuAction = menuActions.get(choice);

            if(choice >= 0 && choice <= this.menuActions.size() - 1) {
                menuAction.doAction();
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }
    }
}