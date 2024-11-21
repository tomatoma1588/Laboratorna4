public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, -2, 5, 3, -1, 4};
        System.out.println("Result: " + calculateGeometricMean(array));
    }
    public static double calculateGeometricMean(int[] array) {
        int product = 1;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                product *= (i + 1); // номер элемента
                count++;
            }
        }
        if (count == 0) {
            throw new IllegalArgumentException("No positive elements in the array.");
        }
        return Math.pow(product, 1.0 / count);
    }
}
