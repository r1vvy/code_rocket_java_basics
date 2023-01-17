package lesson2.task35;

public class CharactersBetween {
    public static void main(String[] args) {
        CharactersBetween charactersBetween = new CharactersBetween();
        charactersBetween.printCharactersBetween('A', 'P');
    }
    
    public void printCharactersBetween(char start, char end) {
        int counter = 0;
        for (char i = start; i <= end; i++) {
            System.out.print(i + " ");
            counter++;
            if (counter % 20 == 0) {
                System.out.println();
            }
        }
    }
}
