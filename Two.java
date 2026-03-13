import java.util.Arrays;
public class Two {
    public static int[] delete(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index.");
            return arr;
        }
        int[] result = new int[arr.length - 1];
        System.arraycopy(arr, 0, result, 0, index);
        System.arraycopy(arr, index + 1, result, index, arr.length - index - 1);
        return result;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int indexToDelete = 2;
        System.out.println("Original array: " + Arrays.toString(numbers));
        int[] updatedNumbers = delete(numbers, indexToDelete);
        System.out.println("Updated array:  " + Arrays.toString(updatedNumbers));
    }
}
