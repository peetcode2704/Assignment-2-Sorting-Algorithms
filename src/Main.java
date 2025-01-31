//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {
            int[] unsortedArray = {6, 5, 3, 1, 8, 7, 2, 4};

            SortingAlgorithm sorter = new BubbleSortClass();
            int[] sortedArray = sorter.sorty(unsortedArray);

            for (int num : sortedArray) {
                System.out.print(num + " ");
            }
        }

}