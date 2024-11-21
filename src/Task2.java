public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {-1, 2, -5, 7, 10, -3, 4, 0, -9, 6, -2};
        int[] array2 = {1, 2, 3, 4, 5}; // виключення
        int[] array3 = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        System.out.println("Result 1: " + calculateNegativeProduct(array1));
        System.out.println("Result 2: " + calculateNegativeProduct(array3));
        try {
            System.out.println("Result 3: " + calculateNegativeProduct(array2));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
    public static int calculateNegativeProduct(int[] array) {
        int product = 1;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (i % 5 == 0 && array[i] < 0) {
                product *= array[i];
                found = true;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("No negative elements at indices multiple of 5.");
        }
        return product;
    }
}
