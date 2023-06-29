import java.util.Scanner;

public class vkiHesapla {
    public static void main(String[] args) {

        /*
         * Vücut Kitle İndeksi Hesaplama
         * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
         * Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp
         * ekrana yazdırın.
         * 
         * Formül
         * Kilo (kg) / Boy(m) * Boy(m)
         * 
         * Çıktısı
         * Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
         * Lütfen kilonuzu giriniz : 105
         * Vücut Kitle İndeksiniz : 35.49215792320173
         */

        int kg;
        double vki, boy;
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen boyunuzu giriniz: ");
        boy = input.nextInt();

        System.out.println("Lutfen kilonuzu giriniz: ");
        kg = input.nextInt();

        boy = boy / 100;

        vki = kg / (boy * boy);

        System.out.println("Vucut Kitle Indeksiniz: " + vki);

    }
}
