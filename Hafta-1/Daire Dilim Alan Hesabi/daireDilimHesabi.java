import java.util.Scanner;

public class daireDilimHesabi {
    public static void main(String args[]){
        int r =0;
        double pi = 3.14;
        int aci = 0;

        Scanner input = new Scanner (System.in);

        System.out.print("Dairenin yari capini giriniz: ");
        r = input.nextInt();

        System.out.print("Dairenin acisini giriniz: ");
        aci = input.nextInt();

        double alan = pi * r *r;
        double cevre = 2* pi * r;
        double aciAlan = (pi * (r*r)*aci)/360;

        System.out.println("Dairelinin Alani: " + alan + " Dairenin Cevresi: "+ cevre + "Daire diliminin alani: "+aciAlan);


    }
}
