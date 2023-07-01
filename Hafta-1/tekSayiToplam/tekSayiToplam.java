import java.util.Scanner;

public class tekSayiToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, toplam;
        toplam = 0;
        do {
            System.out.println("Bir Sayi giriniz, tek sayi girdiginizde program duracaktir.");
            n = input.nextInt();

            if (n % 4 == 0) {
                toplam += n;
            }

        } while (n % 2 == 0);

        System.out.println("Tek sayi girdiniz, girdiginiz sayilarin 4'un kati olan sayilarin toplami: " + toplam);
    }
}
