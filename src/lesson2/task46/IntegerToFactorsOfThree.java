package lesson2.task46;

public class IntegerToFactorsOfThree {
    public static void main(String[] args) {
        System.out.println(integerToFactorsOfThree(81));
    }
    public static String integerToFactorsOfThree(int number) {
        String result = number + " = ";
        int i = 1;
        while (number / i != 0) {
            i *= 3;
            result += 3 + " * ";
        }
        result += "1";

        return result;
    }
}
