package lesson2.task31;

import java.util.ArrayList;
import java.util.List;

public class WordCount {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        WordCount wordCount = new WordCount(input);
        System.out.println("Number of words in the string: " + wordCount.WordsInString());
    }
    private String input;

    public WordCount(String input) {
        this.input = input;
    }

    public int WordsInString() {
        String[] wordList;
        wordList = input.split("\\s");
        return wordList.length;
    }


}
