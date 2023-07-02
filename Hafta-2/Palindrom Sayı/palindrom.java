import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " bir Palindrom Sayidir.");
        } else {
            System.out.println(number + " bir Palindrom Sayi değildir.");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reverse;
    }
}
