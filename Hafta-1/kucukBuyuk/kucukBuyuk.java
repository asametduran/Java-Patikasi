import java.util.Scanner;

public class kucukBuyuk {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayac, sayi, kucuk = 32520, buyuk = -32520;

        System.out.println("Kac tane sayi girilecek?");
        sayac = input.nextInt();

        while (sayac != 0) {

            System.out.println("Sayiyi giriniz");
            sayi = input.nextInt();

            if (sayi > buyuk) {
                buyuk = sayi;
            } else if (sayi < kucuk) {
                kucuk = sayi;
            }
            sayac--;
        }

        System.out.println("en kucuk: " + kucuk);
        System.out.println("en buyuk: " + buyuk);
    }
}
