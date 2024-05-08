import java.util.Arrays;

public class FindMedian {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 2, 5};

        // Sort the array
        Arrays.sort(array);

        // Find the median
        double median;
        if (array.length % 2 == 0) {
            median = (array[array.length / 2 - 1] + array[array.length / 2]) / 2.0;
        } else {
            median = array[array.length / 2];
        }

        // Print the median
        System.out.println("Median: " + median);
    }
}
