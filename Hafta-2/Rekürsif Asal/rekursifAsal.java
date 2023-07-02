import java.util.Scanner;

public class rekursifAsal {

    static boolean isPrime(int number, int divisor) {
        if (number <= 2)
            return (number == 2);
        if (number % divisor == 0)
            return false;
        if (divisor * divisor > number)
            return true;
        return isPrime(number, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        int number = scan.nextInt();

        boolean isPrime = isPrime(number, 2);

        if (isPrime)
            System.out.println(number + " sayisi ASALDIR !");
        else
            System.out.println(number + " sayisi ASAL degildir !");
    }
}
