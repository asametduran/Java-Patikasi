import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfımızı tanımladır
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan giriş al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();


        System.out.print("fizik Notunuz: ");
        fizik = inp.nextInt();

        

        System.out.print("kimya Notunuz: ");
        kimya = inp.nextInt();

        

        System.out.print("turkce Notunuz: ");
        turkce = inp.nextInt();

        

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Muzik Notunuz: ");
        muzik = inp.nextInt();

        double ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6;


            //if kullanmadan ders durumu
        while(ortalama>=60){
            System.out.print("Derslerden gectiniz ortalamaniz:" + ortalama);
            break;
        }
        while(ortalama<60){
            System.out.print("Derslerden kaldiniz ortalamaniz:" + ortalama);
            break;
        }
    }
}
