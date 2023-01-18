package lesson3.task8;

import java.util.Scanner;

public class CharValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input an alphabet: ");
        String input = sc.nextLine();
        isInputAnAlphabeticVowelOrConsonant(input);

    }

    private static void isInputAnAlphabeticVowelOrConsonant(String input) {
        if(input.length() < 2) {
            char chTemp = input.charAt(0);
            if(Character.isAlphabetic(chTemp)) {
                CharValidation charValidation = new CharValidation();
                if(charValidation.isVowel(chTemp)) {
                    System.out.println("Input letter is a vowel");
                } else {
                    System.out.println("Input letter is a consonant");
                }
            } else {
                System.err.println("Character is not alphabetic");
            }
        }
    }

    public boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}
