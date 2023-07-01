import java.util.Scanner;

public class harmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("N sayisini giriniz");
        n = input.nextInt();

        double sonuc = 0;

        for (double i = 1; i <= n; i++) {
            sonuc += (1 / i);
        }
        System.out.println(sonuc);

    }
}
