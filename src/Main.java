//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {
            int[] unsortedArray = {6, 5, 3, 1, 8, 7, 2, 4};

            SortingAlgorithm Bubblesorter = new BubbleSortClass();
            int[] BubbleSorted = Bubblesorter.sorty(unsortedArray);
            System.out.print("Bubble Sort: ");
            for (int num : BubbleSorted) {
                System.out.print(num + " ");
            }

            SortingAlgorithm Insertionsorter = new InsertionSortClass();
            int[] InsertionSorted = Insertionsorter.sorty(unsortedArray);
            System.out.print("\nInsertion Sort: ");
            for (int num : InsertionSorted) {
                System.out.print(num + " ");
            }

            SortingAlgorithm Selectsorter = new SelectionSortClass();
            int[] SelectionSorted = Selectsorter.sorty(unsortedArray);
            System.out.print("\nSelection Sort: ");
            for (int num : SelectionSorted) {
                System.out.print(num + " ");
            }

            SortingAlgorithm Shellsorter = new ShellSortClass();
            int[] ShellSorted = Shellsorter.sorty(unsortedArray);
            System.out.print("\nShell Sort: ");
            for (int num : ShellSorted) {
                System.out.print(num + " ");
            }
        }
    }