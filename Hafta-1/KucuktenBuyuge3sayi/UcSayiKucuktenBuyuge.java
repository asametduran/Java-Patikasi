import java.util.Scanner;

public class UcSayiKucuktenBuyuge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.println("1.Sayi: ");
        a = input.nextInt();

        System.out.println("2.Sayi: ");
        b = input.nextInt();

        System.out.println("3.Sayi: ");
        c = input.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("c<b<a");
            } else {
                System.out.println("b<c<a");
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("c<a<b");
            } else {
                System.out.println("a<c<b");
            }
        } else {
            if (a > b) {
                System.out.println("b<a<c");
            } else {
                System.out.println("a<b<c");
            }
        }

    }
}
