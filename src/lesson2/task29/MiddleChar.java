package lesson2.task29;

public class MiddleChar {
    public static void main(String[] args) {
        MiddleChar middleChar = new MiddleChar("3500");
        System.out.println("The middle character in the string: " + middleChar.getMiddleChar());
    }
    private String input;

    public MiddleChar(String input) {
        this.input = input;
    }
    public String getMiddleChar() {
        int middle = this.input.length() / 2;
        if (this.input.length() % 2 == 0) {
            return this.input.charAt(middle-1) + "" + this.input.charAt(middle);
        }
        else {
            return (Character.toString(this.input.charAt(middle)));
        }
    }
}
