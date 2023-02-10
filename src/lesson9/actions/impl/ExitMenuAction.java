package lesson9.actions.impl;

import lesson9.actions.MenuAction;

public class ExitMenuAction implements MenuAction {
    @Override
    public String getName() {
        return "Exit";
    }

    @Override
    public void execute() {
        System.out.println("Bye-bye");
        System.exit(0);
    }
}
