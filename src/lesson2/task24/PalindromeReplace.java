package lesson2.task24;

import lesson2.task20.PalindromeChecker;

import java.util.*;

public class PalindromeReplace {
    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        String input = "bob has a radar plane";
        List<String> inputWords = new ArrayList<String>();
        inputWords = Arrays.asList(input.split(" "));

        for (int i = 0; i < inputWords.size(); i++) {
            String wordAtIndex = inputWords.get(i);
            if(wordAtIndex.length() >= 3) {

                palindromeChecker.setInput(wordAtIndex);

                if (palindromeChecker.isPalindrome()) {
                    inputWords.set(i, wordAtIndex.replaceAll("[a-zA-Z]", "*"));
                }
            }
        }
        System.out.println(inputWords.toString());
    }

}
