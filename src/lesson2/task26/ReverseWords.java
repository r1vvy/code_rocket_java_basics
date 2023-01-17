package lesson2.task26;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "www.google.com";
        ReverseWords reverseWords = new ReverseWords(input);
        System.out.println(reverseWords.reverse());
    }
    private String input;

    public ReverseWords(String input) {
        this.input = input;
    }
    public String reverse() {
        StringBuilder reversedString = new StringBuilder();
        Matcher matcher = Pattern.compile("[^.,\\s]+|[.,\\s]").matcher(this.input);
        while (matcher.find()) {
            String word = matcher.group();
            if(word.matches("[^.,\\s]+")) {
                reversedString.append(new StringBuilder(word).reverse().toString());
            } else {
                reversedString.append(word);
            }
        }
        return reversedString.toString();
    }

}
