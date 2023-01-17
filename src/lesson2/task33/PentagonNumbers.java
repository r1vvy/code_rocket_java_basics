package lesson2.task33;

public class PentagonNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.print(getPentagonNumber(i) + " ");
            // for every 10th number, print a new line
            if (i % 10 == 0) {
                System.out.println();
            }
        }   
    }
    public static int getPentagonNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
