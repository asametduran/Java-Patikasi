import java.util.Scanner;

public class KDVOdevi{
    public static void main(String[] args) throws Exception {

        /*KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
*/

        Scanner input = new Scanner(System.in);

        double fiyat = 0;
        double kdv = 0.18; 
        double kdvFiyat = 0;

        System.out.println("Urunun fiyatini giriniz:");
        fiyat = input.nextInt();

        

        if(fiyat<1000 && fiyat>0){
            kdvFiyat = fiyat + (fiyat*kdv);

        System.out.println("Urunun KDV fiyati :"+kdvFiyat);
        System.out.println("KDV orani :"+kdv);
        }
        else{
            kdv = 0.08;
            kdvFiyat = fiyat + (fiyat*kdv);

        System.out.println("Urunun KDV fiyati :"+kdvFiyat);
        System.out.println(" KDV orani :"+kdv);
        }

    }
}