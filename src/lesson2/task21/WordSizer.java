package lesson2.task21;

public class WordSizer {
    private String input;
    private String largestWord;
    private String smallestWord;
    public WordSizer(String input) {
        this.input = input;
        findLargestAndSmallest();
    }

    private void findLargestAndSmallest() {
        String[] words = input.split(" ");
        this.largestWord = words[0];
        this.smallestWord = words[0];

        for (String word : words) {
           if(word.length() > largestWord.length())
               this.largestWord = word;
           if (word.length() < smallestWord.length())
               this.smallestWord = word;
        }
        var endTime = System.currentTimeMillis();
    }
    public void printInfo() {
        System.out.printf(
                "Largest word: %s \n" +
                "Smallest word: %s \n",
                this.largestWord,
                this.smallestWord
        );
    }
}
