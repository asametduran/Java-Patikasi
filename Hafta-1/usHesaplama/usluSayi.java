import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, us, taban, sonuc = 1;
        System.out.println("Tabani giriniz:");
        taban = input.nextInt();
        System.out.println("Ussu giriniz:");
        us = input.nextInt();

        for (i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println("Sonuc:" + sonuc);

    }
}
