package lesson2.task20;

public class PalindromeCheckerDemo {
    public static void main(String[] args) {
        String input = "aba";
        PalindromeChecker palindromeChecker = new PalindromeChecker(input);
        System.out.println(palindromeChecker.isPalindrome());
    }
}
