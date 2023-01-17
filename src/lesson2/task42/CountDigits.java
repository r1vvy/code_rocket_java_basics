package lesson2.task42;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countOccurencesOfDigit(12541, 2));
    }
    public static int countOccurencesOfDigit(int number, int digit) {
        int count = 0;
        while (number > 0) {
            if (number % 10 == digit) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}
