//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {
            int[] unsortedArray = {6, 5, 3, 1, 8, 7, 2, 4};

            SortingAlgorithm BubbleSorter = new BubbleSortClass();
            int[] BubbleSorted = BubbleSorter.sorty(unsortedArray);
            System.out.print("Bubble Sort: ");
            for (int num : BubbleSorted) {
                System.out.print(num + " ");
            }

            SortingAlgorithm InsertionSorter = new InsertionSortClass();
            int[] InsertionSorted = InsertionSorter.sorty(unsortedArray);
            System.out.print("\nInsertion Sort: ");
            for (int num : InsertionSorted) {
                System.out.print(num + " ");
            }

            SortingAlgorithm SelectSorter = new SelectionSortClass();
            int[] SelectionSorted = SelectSorter.sorty(unsortedArray);
            System.out.print("\nSelection Sort: ");
            for (int num : SelectionSorted) {
                System.out.print(num + " ");
            }

            SortingAlgorithm ShellSorter = new ShellSortClass();
            int[] ShellSorted = ShellSorter.sorty(unsortedArray);
            System.out.print("\nShell Sort: ");
            for (int num : ShellSorted) {
                System.out.print(num + " ");
            }

            SortingAlgorithm MergeSorter = new MergeSortClass();
            int[] MergeSorted = MergeSorter.sorty(unsortedArray);
            System.out.print("\nMerge Sort: ");
            for (int num : MergeSorted) {
                System.out.print(num + " ");
            }
        }
    }