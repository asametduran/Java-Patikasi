import java.util.Scanner;

public class ManavProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         * Manav Kasa Programı
         * Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram
         * değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
         * 
         * Meyveler ve KG Fiyatları
         * 
         * Armut : 2,14 TL
         * Elma : 3,67 TL
         * Domates : 1,11 TL
         * Muz: 0,95 TL
         * Patlıcan : 5,00 TL
         * Örnek Çıktı;
         * 
         * 
         */

        System.out.println("Armut : 2,14 TL\r\n" + //
                "Elma : 3,67 TL\r\n" + //
                "Domates : 1,11 TL\r\n" + //
                "Muz: 0,95 TL\r\n" + //
                "Patlican : 5,00 TL");

        double sayiArmut, sayiElma, sayiDomates, sayiMuz, sayiPatlican, fiyatArmut, fiyatElma, fiyatDomates, fiyatMuz,
                fiyatPatlican, total = 0;

        System.out.println("Kac tane armut almak istersiniz?");
        sayiArmut = input.nextDouble();
        fiyatArmut = sayiArmut * 2.14;

        System.out.println("Kac tane elma almak istersiniz?");
        sayiElma = input.nextDouble();
        fiyatElma = sayiElma * 3.67;

        System.out.println("Kac tane domates almak istersiniz?");
        sayiDomates = input.nextDouble();
        fiyatDomates = sayiDomates * 1.11;

        System.out.println("Kac tane Muz almak istersiniz?");
        sayiMuz = input.nextDouble();
        fiyatMuz = sayiMuz * 0.95;

        System.out.println("Kac tane patlican almak istersiniz?");
        sayiPatlican = input.nextDouble();
        fiyatPatlican = sayiPatlican * 5.00;

        total = fiyatArmut + fiyatDomates + fiyatElma + fiyatMuz + fiyatPatlican;
        System.out.println("Tutar: " + total);
    }
}
