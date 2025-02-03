public class BubbleSortClass implements SortingAlgorithm {
    @Override
    public int[] sorty(int[] inputArr) {
        int n = inputArr.length;
        int[] a = inputArr.clone();
        int tmp;
        for (int i = 0; i < n - 1; i++) { // number of elements sorted
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j + 1] < a[j]) { // compare neighbors
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        return a;
    }
}