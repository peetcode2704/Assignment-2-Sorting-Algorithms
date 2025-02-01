public class InsertionSortClass implements SortingAlgorithm{
    @Override
    public int[] sorty(int[] input) {
        int n = input.length;
        int[] a = input.clone();
        int tmp;
        for (int p = 1; p < a.length; ++p) {
            tmp = a[p];
            int j;
            for (j = p; j > 0 && tmp < a[j - 1]; j--) {
                a[j] = a[j - 1];
            }
            a[j] = tmp;
        }
        return a;
    }
}
