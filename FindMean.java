public class FindMean {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 2, 5};

        // Calculate the sum
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Calculate the mean
        double mean = (double) sum / array.length;

        // Print the mean
        System.out.println("Mean: " + mean);
    }
}
