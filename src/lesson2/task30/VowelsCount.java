package lesson2.task30;

public class VowelsCount {
    public static void main(String[] args) {
        String input = "w3resource";
        VowelsCount vowelsCount = new VowelsCount(input);
        System.out.println("Number of Vowels in the string: " + vowelsCount.vowelCount());
    }
    private String input;
    public VowelsCount(String input) {
        this.input = input;
    }

    public int vowelCount() {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char charAtIndex = this.input.charAt(i);
            if(charAtIndex == 'a' || charAtIndex == 'e' || charAtIndex == 'i' || charAtIndex == 'o' || charAtIndex == 'u')
            {
                sum++;
            }
        }
        return sum;
    }
}
