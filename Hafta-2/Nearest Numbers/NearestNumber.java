import java.util.Scanner;

public class NearestNumber {
    public static void findNearestNumbers(int[] array, int number) {
        int smallerNumber = Integer.MIN_VALUE;
        int largerNumber = Integer.MAX_VALUE;

        for (int i : array) {
            if (i < number && i > smallerNumber) {
                smallerNumber = i;
            }
            if (i > number && i < largerNumber) {
                largerNumber = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + smallerNumber);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + largerNumber);
    }

    public static void main(String[] args) {
        int[] numbers = { 15, 12, 788, 1, -1, -778, 2, 0 };

        Scanner scanner = new Scanner(System.in);

        int targetNumber = scanner.nextInt();

        findNearestNumbers(numbers, targetNumber);
    }
}
