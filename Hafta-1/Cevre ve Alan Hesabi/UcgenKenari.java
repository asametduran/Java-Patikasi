import java.util.Scanner;

public class UcgenKenari {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a,b;
        int c = 0;
        System.out.println("A kenarini giriniz:");
        a = input.nextInt();

        System.out.println("B kenarini giriniz:");
        b = input.nextInt();

        System.out.println("C kenarini giriniz:");
        c = input.nextInt();

        int u = 0;

        u = (a+b+c)/2;

        int cevre =0;
        double alan = 0;

        cevre = 2*u;
        alan = Math.sqrt(u * (u-a)* (u-b) * (u-c));

        System.out.println("Cevre: "+cevre+"Alan: "+ alan);

    }
}
