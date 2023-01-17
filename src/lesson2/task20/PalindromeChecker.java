package lesson2.task20;

public class PalindromeChecker {
    private String input;

    public PalindromeChecker() {
    }

    public void setInput(String input) {
        this.input = input;
    }

    public PalindromeChecker(String input) {
        this.input = input;
    }
    public boolean isPalindrome() {
        int left = 0;
        int right = input.length() - 1;
        while (right > left) {
            if (input.charAt(right) != input.charAt(left)) {
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
