public class MergeSortClass implements SortingAlgorithm {
    @Override
    public int[] sorty(int[] input) {
        int[] numbers = input.clone();
        mergeSort(numbers, 0, numbers.length - 1);
        return numbers;
    }

    private void mergeSort(int[] numbers, int begin, int end) {
        if (begin < end) {
            int mid = (begin + end) / 2;

            mergeSort(numbers, begin, mid);
            mergeSort(numbers, mid + 1, end);

            merge(numbers, begin, mid, end);
        }
    }

    private void merge(int[] numbers, int begin, int mid, int end) {
        int mergedSize = end - begin + 1;
        int[] mergedNumbers = new int[mergedSize];
        int mergePos = 0;
        int leftPos = begin;
        int rightPos = mid + 1;

        while (leftPos <= mid && rightPos <= end) {
            if (numbers[leftPos] <= numbers[rightPos]) {
                mergedNumbers[mergePos] = numbers[leftPos];
                leftPos++;
            } else {
                mergedNumbers[mergePos] = numbers[rightPos];
                rightPos++;
            }
            mergePos++;
        }

        while (leftPos <= mid) {
            mergedNumbers[mergePos] = numbers[leftPos];
            leftPos++;
            mergePos++;
        }

        while (rightPos <= end) {
            mergedNumbers[mergePos] = numbers[rightPos];
            rightPos++;
            mergePos++;
        }

        for (mergePos = 0; mergePos < mergedSize; mergePos++) {
            numbers[begin + mergePos] = mergedNumbers[mergePos];
        }
    }
}
