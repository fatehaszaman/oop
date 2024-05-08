import java.util.Arrays;

    public class RemoveDuplicatesArray {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 2, 4, 5, 6, 4};
            int length = array.length;

            // Sorting the array
            Arrays.sort(array);

            // Checking for duplicates and removing them
            int j = 0;
            for (int i = 0; i < length - 1; i++) {
                if (array[i] != array[i + 1]) {
                    array[j++] = array[i];
                }
            }
            array[j++] = array[length - 1];

            // Printing the array without duplicates
            System.out.println("Array with duplicates removed:");
            for (int i = 0; i < j; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }


