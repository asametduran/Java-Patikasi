import java.util.Scanner;

public class BurcProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month, day;

        System.out.println("Dogdunuzu ayi giriniz:");
        month = input.nextInt();

        System.out.println("Dogdugunuz gunu giriniz: ");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 21) {
                System.out.println("Oglak Burcu");
            } else {
                System.out.println("Kova Burcu");
            }
        }
        if (month == 2) {
            if (day >= 1 && day <= 19) {
                System.out.println("Kova Burcu");
            } else {
                System.out.println("Balık Burcu");
            }
        }
        if (month == 3) {
            if (day >= 1 && day <= 20) {
                System.out.println("Balik Burcu");
            } else {
                System.out.println("Koc Burcu");
            }
        }
        if (month == 4) {
            if (day >= 1 && day <= 20) {
                System.out.println("Koc Burcu");
            } else {
                System.out.println("Boga Burcu");
            }
        }
        if (month == 5) {
            if (day >= 1 && day <= 21) {
                System.out.println("Boga Burcu");
            } else {
                System.out.println("Ikizler Burcu");
            }
        }
        if (month == 6) {
            if (day >= 1 && day <= 22) {
                System.out.println("Ikizler Burcu");
            } else {
                System.out.println("Yengec Burcu");
            }
        }
        if (month == 7) {
            if (day >= 1 && day <= 22) {
                System.out.println("Yengec Burcu");
            } else {
                System.out.println("Aslan Burcu");
            }
        }
        if (month == 8) {
            if (day >= 1 && day <= 22) {
                System.out.println("Aslan Burcu");
            } else {
                System.out.println("Basak Burcu");
            }
        }
        if (month == 9) {
            if (day >= 1 && day <= 22) {
                System.out.println("Basak Burcu");
            } else {
                System.out.println("Terazi Burcu");
            }
        }
        if (month == 10) {
            if (day >= 1 && day <= 22) {
                System.out.println("Terazi Burcu");
            } else {
                System.out.println("Akrep Burcu");
            }
        }
        if (month == 11) {
            if (day >= 1 && day <= 21) {
                System.out.println("Akrep Burcu");
            } else {
                System.out.println("Yay Burcu");
            }
        }
        if (month == 12) {
            if (day >= 1 && day <= 21) {
                System.out.println("Yay Burcu");
            } else {
                System.out.println("Oglak Burcu");
            }
        }
    }
}
