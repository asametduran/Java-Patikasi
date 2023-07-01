import java.util.Scanner;

public class HavaDurumu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int heat;

        System.out.println("Hava sicakligi kac derece?");
        heat = input.nextInt();

        if (heat > 25) {
            System.out.println("Yuzmeye gidebilirsin!");
        } else if (heat > 15) {
            System.out.println("Piknige gidebilirsin!");
        } else if (heat > 5) {
            System.out.println("Sinemaya gidebilirsin!");
        } else {
            System.out.println("Kayaga gidebilirsin!");
        }
    }
}
