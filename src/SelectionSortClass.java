public class SelectionSortClass implements SortingAlgorithm {
    @Override
    public int[] sorty(int[] inputArr) {
        int n = inputArr.length;
        int[] a = inputArr.clone(); // Clone input to avoid modifying the original array

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) { // Start from i+1
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            swap(a, i, minIndex);
        }
        return a; // Return the sorted array
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
