public class QuickSortClass implements SortingAlgorithm {
    @Override
    public int[] sorty(int[] inputArr) {
        int[] numbers = inputArr.clone(); // Avoid modifying the original array
        quickSort(numbers, 0, numbers.length - 1);
        return numbers;
    }

    private void quickSort(int[] numbers, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = partition(numbers, startIndex, endIndex);

            // Recursively sort elements before and after partition
            quickSort(numbers, startIndex, pivotIndex);
            quickSort(numbers, pivotIndex + 1, endIndex);
        }
    }

    private int partition(int[] numbers, int startIndex, int endIndex) {
        int midpoint = startIndex + (endIndex - startIndex) / 2;
        int pivot = numbers[midpoint];

        int low = startIndex;
        int high = endIndex;
        boolean done = false;

        while (!done) {
            while (numbers[low] < pivot) {
                low++;
            }
            while (pivot < numbers[high]) {
                high--;
            }
            if (low >= high) {
                done = true;
            } else {
                int temp = numbers[low];
                numbers[low] = numbers[high];
                numbers[high] = temp;
                low++;
                high--;
            }
        }
        return high; // "high" is the last index of the left segment
    }
}
