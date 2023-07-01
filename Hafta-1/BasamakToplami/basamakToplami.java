import java.util.Scanner;

public class basamakToplami {
    public static void main(String[] args) {
        int sayi, rakam, toplam = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir Sayi giriniz:");
        sayi = input.nextInt();

        while (sayi > 0) {
            rakam = sayi % 10;
            toplam += rakam;
            sayi /= 10;
        }
        System.out.println("Toplam: " + toplam);
    }
}
