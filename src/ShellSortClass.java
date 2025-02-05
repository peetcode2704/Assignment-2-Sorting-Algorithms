public class ShellSortClass implements SortingAlgorithm{
    @Override
    public int[] sorty(int[] inputArr) {
        int[] a = inputArr.clone();
        int n = a.length;
        int tmp;
        for( int gap = n / 2; gap > 0; gap /= 2 )
            for( int i = gap; i < n; ++i ){
                tmp = a[i]; int j;
                for(j = i; j >= gap && tmp < a[j - gap]; j-=gap){
                    a[j] = a[ j - gap ];
                }
                a[j] = tmp;
        }
        return a;
    }
}
