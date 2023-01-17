package lesson2.task23;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        AnagramChecker anagramChecker = new AnagramChecker();
        boolean checkedValue = anagramChecker.checkAnagram("Clint Eastwood", "old west action");
        System.out.println(checkedValue);
    }
    public boolean checkAnagram(String firstWord, String secondWord) {
        firstWord = firstWord.replaceAll("[^a-zA-Z]+","");
        secondWord = secondWord.replaceAll("[^a-zA-Z]+", "");
        // Convert strings to lowercase
        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();

        // Sort the characters of both strings
        char[] firstWordChars = firstWord.toCharArray();
        char[] secondWordChars = secondWord.toCharArray();
        Arrays.sort(firstWordChars);
        Arrays.sort(secondWordChars);

        // Compare the sorted arrays
        return Arrays.equals(firstWordChars, secondWordChars);
    }
}
