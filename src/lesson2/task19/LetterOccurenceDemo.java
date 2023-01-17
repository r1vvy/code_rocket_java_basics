package lesson2.task19;

public class LetterOccurenceDemo {
    public static void main(String[] args) {
        String input = "Hello, Word 22! 210 My name is Lorem Ipsum";
        LetterOccurenceCounter letterOccurrenceCounter = new LetterOccurenceCounter(input);

        letterOccurrenceCounter.printInfo();
    }
}
