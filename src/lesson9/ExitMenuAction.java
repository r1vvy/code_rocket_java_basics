package lesson9;

public class ExitMenuAction implements MenuAction{
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
