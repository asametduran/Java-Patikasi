import java.util.Scanner;

public class desen {

    static void recursiveFunction(int n, int original) {
        System.out.print(n + " ");

        if (n <= 0) {
            if (n == 0) {
                recursiveFunction(n + 5, original);
            } else {
                System.out.println();
                return;
            }
        } else {
            recursiveFunction(n - 5, original);
        }

        if (n != original) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N Sayisi: ");
        int n = scan.nextInt();

        recursiveFunction(n, n);

        n = scan.nextInt();
    }
}
