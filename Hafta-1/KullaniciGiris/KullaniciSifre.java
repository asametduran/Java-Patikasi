import java.util.Scanner;

public class KullaniciSifre {
    public static void main(String[] args) {

        String userName, password, newPassword;
        int choice;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici adiniz: ");
        userName = input.nextLine();

        System.out.println("Sifreniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giris Yapildi!!!");
        } else {
            System.out.println("Bilgileriniz yanlis! Yeni sifre olusturmak ister misiniz? (Evet icin " + " 1 "
                    + " Hayir icin " + " 2 " + " giriniz: )");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Yeni sifrenizi giriniz fakat eski sifre ile ayni olmasin!:");
                newPassword = input.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Girdiginiz sifre eski sifre ayni!");
                }
            } else {
                System.out.println("Sifre yenilenmeyecektir!");
            }
        }
    }

}
