import java.util.Arrays;
public class One {
    public static int[] insert(int[] arr, int index, int value) {
        if (index < 0 || index > arr.length) {
            System.out.println("Index is too long.");
            return arr;
        }
        int[] result = new int[arr.length + 1];
        System.arraycopy(arr, 0, result, 0, index);
        result[index] = value;
        System.arraycopy(arr, index, result, index + 1, arr.length - index);
        return result;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original array: " + Arrays.toString(numbers));

        int[] newNumbers = insert(numbers, 2, 99);

        System.out.println("Updated array:  " + Arrays.toString(newNumbers));
    }
}