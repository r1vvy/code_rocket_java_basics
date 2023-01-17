package lesson2.task17;

public class CountCharactersDemo {
    public static void main(String[] args) {
        CountCharacters countCharacters = new CountCharacters();
        String name = "Hell0 W0rld";
        countCharacters.count(name);
        countCharacters.printInfo();
    }
}
