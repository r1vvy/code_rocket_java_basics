package lesson2.task19;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LetterOccurenceCounter {
    private String input;
    private Map<Character, Integer> letterCounter;
    private Map<Character, Integer> maxValue;
    public LetterOccurenceCounter(String input) {
        this.input = input.toLowerCase();
        this.letterCounter = new HashMap<>();
        this.maxValue = new HashMap<>();
        countLetters();
        setMaxValue();
    }

    public void countLetters() {
        for (char c : input.toCharArray()) {
            if (!Character.isLetter(c)) continue;
            letterCounter.put(c, letterCounter.getOrDefault(c, 0) + 1);
        }
    }

    public void setMaxValue() {
        int maxOccurrence = Collections.max(letterCounter.values());
        for (Map.Entry<Character, Integer> entry : letterCounter.entrySet()) {
            if (entry.getValue() == maxOccurrence) {
                maxValue.put(entry.getKey(), maxOccurrence);
            }
        }
    }

    public void printInfo() {
        for (Map.Entry<Character, Integer> entry : letterCounter.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("Max value: " + maxValue);
    }
}
