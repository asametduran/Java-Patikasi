import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        System.out.println("Yili giriniz:");
        year = input.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("Artik yildir");
            } else {
                System.out.println("Artik yil degildir!");
            }
        } else if (year % 4 == 0) {
            System.out.println("Artik yildir!");
        } else {
            System.out.println("Artik yil degildir");
        }
    }
}
