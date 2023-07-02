public class HarmonicAverage {
    public static double calculateHarmonicAverage(int[] array) {
        int n = array.length;
        double harmonicSum = 0;

        for (int i = 0; i < n; i++) {
            harmonicSum += 1.0 / array[i];
        }

        return n / harmonicSum;
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 7, 12, 3, 8 };
        double harmonicAverage = calculateHarmonicAverage(numbers);

        System.out.println("Dizinin harmonik ortalamasi: " + harmonicAverage);
    }
}
