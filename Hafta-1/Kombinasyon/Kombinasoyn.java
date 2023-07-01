import java.util.Scanner;

public class Kombinasoyn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r, nFak = 1, rFak = 1, farkFak = 1, sonuc = 0;

        System.out.println(
                "Kombinasyonu hesaplanacak sayilari giriniz C(n,r) Once n sayisini giriniz, ardindan r sayisini giriniz:");
        n = input.nextInt();
        r = input.nextInt();
        for (int i = n; i > 0; i--) {
            nFak *= i;
        }
        for (int j = r; j > 0; j--) {
            rFak *= j;
        }
        for (int k = (n - r); k > 0; k--) {
            farkFak *= k;
        }
        sonuc = nFak / (rFak * farkFak);
        System.out.println("Kombinasyon sonucu: " + sonuc);
    }
}
