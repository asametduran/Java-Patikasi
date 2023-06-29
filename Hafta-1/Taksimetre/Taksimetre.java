import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args){

        int km = 0;

        double perKm = 2.20, total = 10;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();

        total += (km*perKm);
        
        total = (total<20) ? 20 : total;

        System.out.println("toplam tutar: "+ total);
    }
}
