package lesson2.task18;

public class DeleteConsonants {
    public static void main(String[] args) {
        String input = "Hello, have a good day";
        DeleteConsonants deleteConsonants = new DeleteConsonants(input);
        String output = deleteConsonants.deleteConsonants();
        System.out.println(output);
    }
    private String input;

    public DeleteConsonants(String input) {
        this.input = input;
    }

    public String deleteConsonants() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isLetter(ch) || !isConsonant(ch)) {
                output.append(ch);
            }
        }
        return output.toString();
    }

    private boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}
