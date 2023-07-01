import java.util.Scanner;

public class usProblemi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Girdiginiz sayiya kadar 4 ve 5'in usleri gosterilecektir: ");
        n = input.nextInt();

        System.out.println("Once 4'un katlari:");

        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }
        System.out.println("Ardindan 5'in katlari: ");
        for (int j = 1; j <= n; j *= 5) {
            System.out.println(j);
        }
    }
}
