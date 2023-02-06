package lesson7;
public class ExitMenuAction implements MenuAction {
    @Override
    public String getName() {
        return "Exit";
    }
 
    @Override
    public void doAction() {
        System.out.println("Exiting...");
        System.exit(0);
    }
}
