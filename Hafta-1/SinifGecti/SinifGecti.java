import java.util.Scanner;

public class SinifGecti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matematikNot, turkceNot, muzikNot, fizikNot, kimyaNot, toplam;
        double ortalama;

        toplam = 0;

        System.out.println("Matematik notunu giriniz: ");
        matematikNot = input.nextInt();
        if (matematikNot >= 0 && matematikNot <= 100)
            toplam += matematikNot;

        System.out.println("Turkce notunu giriniz: ");
        turkceNot = input.nextInt();
        if (turkceNot >= 0 && turkceNot <= 100)
            toplam += turkceNot;

        System.out.println("Fizik notunu giriniz: ");
        fizikNot = input.nextInt();
        if (fizikNot >= 0 && fizikNot <= 100)
            toplam += fizikNot;

        System.out.println("Muzik notunu giriniz: ");
        muzikNot = input.nextInt();
        if (muzikNot >= 0 && muzikNot <= 100)
            toplam += muzikNot;

        System.out.println("Kimya notunu giriniz: ");
        kimyaNot = input.nextInt();
        if (kimyaNot >= 0 && kimyaNot <= 100)
            toplam += kimyaNot;

        ortalama = toplam / 5;

        System.out.println("Ortalamaniz: " + ortalama);
    }
}
