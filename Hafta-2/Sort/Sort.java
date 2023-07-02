import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu n: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            array[i] = scanner.nextInt();
        }

        // Sıralama işlemi
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("Sıralama: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
