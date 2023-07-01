import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class UcakBileti {
    public static void main(String[] args) {
        /*
         * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı
         * yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş)
         * bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak
         * uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye
         * aşağıdaki indirimleri uygulayın ;
         * 
         * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
         * yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya
         * "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
         * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
         * Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
         * Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
         * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20
         * indirim uygulanır.
         * 
         * 
         * 
         */

        Scanner input = new Scanner(System.in);
        int yas, yolculukTipi, km;
        double fiyat, indirimliFiyat;

        System.out.println("Kac yasindasiniz?");
        yas = input.nextInt();

        System.out.println("Kac Km yol gideceksiniz?");
        km = input.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Y\u00F6n , 2 => Gidi\u015F D\u00F6n\u00FC\u015F ):");
        yolculukTipi = input.nextInt();

        fiyat = 0.10 * km;
        if (yas < 12) {
            indirimliFiyat = fiyat * 0.5;
            if (yolculukTipi == 2) {
                indirimliFiyat *= 0.8;
                System.out.println("Tutariniz: " + indirimliFiyat);
            } else {
                System.out.println("Tutariniz: " + indirimliFiyat);
            }
        } else if (yas <= 24 && yas >= 12) {
            indirimliFiyat = fiyat * 0.9;
            if (yolculukTipi == 2) {
                indirimliFiyat *= 0.8;
                System.out.println("Tutariniz: " + indirimliFiyat);
            } else {
                System.out.println("Tutariniz: " + indirimliFiyat);
            }
        } else if (yas > 24 && yas <= 65) {
            if (yolculukTipi == 2) {
                fiyat *= 0.8;
                System.out.println("Tutariniz: " + fiyat);
            } else {
                System.out.println("Tutariniz: " + fiyat);
            }
        } else if (yas > 65) {
            indirimliFiyat = fiyat * 0.7;
            if (yolculukTipi == 2) {
                indirimliFiyat *= 0.8;
                System.out.println("Tutariniz: " + indirimliFiyat);
            } else {
                System.out.println("Tutariniz: " + indirimliFiyat);
            }
        } else {
            System.out.println("Hatali Giris!!!");
        }

    }
}
