package lesson10.libraryapp.author;

import lesson10.libraryapp.MenuAction;

import java.util.Scanner;

public class CreateAuthorMenuAction implements MenuAction {
    @Override
    public String getName() {
        return "Create author.";
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        //...
    }
}
