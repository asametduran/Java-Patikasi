import java.util.Scanner;

public class onIkiyeBolunen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Girdiginiz sayiya kadar 12'nin katlari yazilacaktir.");
        n = input.nextInt();

        for (int i = 12; i <= n;) {
            System.out.println(i);
            i += 12;
        }
    }
}
