package lesson2.task48;

public class Main {
    public static void main(String[] args) {
        String input = "AIEEE";
        System.out.println(allVowels(input));
    }
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    
    public static boolean allVowels(String input) {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!isVowel(ch)) {
                return false;
            }
        }
        return true;
    }
}
