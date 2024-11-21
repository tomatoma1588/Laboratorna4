public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {7, 8, 9, 10, 11};
        printArray(reverseArray(array1));
        printArray(reverseArray(array2));
    }
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
    public static void printArray(int[] array) {
        for (int element : array) { // цикл for-each
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
