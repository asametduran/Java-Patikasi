public class visitedNumbers {
    public static void main(String[] args) {
        int[] array = { 10, 20, 20, 10, 10, 20, 5, 20 };

        int[] visited = new int[array.length]; // Her elemanın ziyaret durumunu takip etmek için bir dizi oluşturuyoruz

        for (int i = 0; i < array.length; i++) {
            if (visited[i] == 1) { // Eğer eleman daha önce ziyaret edildiyse, atla
                continue;
            }

            int count = 1; // Elemanın frekansını tutmak için sayaç

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++; // Elemanın tekrar sayısını artır
                    visited[j] = 1; // Elemanı ziyaret edildi olarak işaretle
                }
            }

            System.out.println(array[i] + " sayısı " + count + " kere tekrar edildi.");
        }
    }
}
