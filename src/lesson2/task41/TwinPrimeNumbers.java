package lesson2.task41;

public class TwinPrimeNumbers {
    public static void main(String[] args) {
        findPrimes(100);
    }

    private static void findPrimes(int range) {
        for (int i = 2; i < range; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                printTwinPrimes(i);
            }
        }
    }

    private static void printTwinPrimes(int firstPrime) {
        System.out.println("(" + firstPrime + ", " + (firstPrime + 2) + ")");
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
