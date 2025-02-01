//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {
            int[] unsortedArray = {6, 5, 3, 1, 8, 7, 2, 4};

            SortingAlgorithm Bsorter = new BubbleSortClass();
            int[] BubbleSorted = Bsorter.sorty(unsortedArray);

            System.out.print("Bubble Sort: ");
            for (int num : BubbleSorted) {
                System.out.print(num + " ");
            }

            SortingAlgorithm Isorter = new InsertionSortClass();
            int[] InsertionSorted = Isorter.sorty(unsortedArray);
            System.out.print("\nInsertion Sort: ");
            for (int num : InsertionSorted) {
                System.out.print(num + " ");
            }
        }
    }