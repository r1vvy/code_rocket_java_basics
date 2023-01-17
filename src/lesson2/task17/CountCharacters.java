package lesson2.task17;

public class CountCharacters {
    private int vowelSum;
    private int consonantSum;
    private int digitSum;
    private int whiteSpaceSum;
    public void count(String input) {
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                this.vowelSum++;
            } else if (Character.isDigit(ch)) {
                digitSum++;
            } else if (Character.isWhitespace(ch)) {
                whiteSpaceSum++;
            } else if (Character.isLetter(ch)) {
                consonantSum++;
            }
        }
    }
    public void printInfo() {
        System.out.printf("Vowels: %d \n" +
                        "Consonants: %d \n" +
                        "Digits: %d \n" +
                        "White spaces: %d \n",
                this.vowelSum,
                this.consonantSum,
                this.digitSum,
                this.whiteSpaceSum
        );
    }
}
