import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("N1 Sayisini giriniz: ");
        int n1 = input.nextInt();

        System.out.println("N2 Sayisini giriniz: ");
        int n2 = input.nextInt();

        int i = 1;
        int ebob = 1;
        int k = n1;
        while (k >= 1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                break;
            }

            k--;
        }

        while (i <= (n1 * n2)) {

            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
        System.out.println("ebob: " + ebob);
        System.out.println("ekok: " + (n1 * n2) / ebob);

    }
}
