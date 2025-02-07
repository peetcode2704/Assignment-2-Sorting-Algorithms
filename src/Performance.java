import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Performance {
    static Tester testerObj;


    public static void main(String[] args) {
        // Sorting algorithms to test
        SortingAlgorithm[] algorithms = {
                new BubbleSortClass(),
                new InsertionSortClass(),
                new SelectionSortClass(),
                new ShellSortClass(),
                new QuickSortClass(),
                new MergeSortClass()
        };

        // Array sizes to test
        int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};

        // Run performance tests and generate report
        try (PrintWriter writer = new PrintWriter(new FileWriter("performance_report.txt"))) {
            for (SortingAlgorithm algorithm : algorithms) {
                writer.println("Sorting algorithm – " + algorithm.getClass().getSimpleName());

                for (int size : sizes) {
                    testerObj = new Tester(algorithm); // Use algorithm directly
                    testerObj.test(20, size);
                    testerObj.testKSorted(20,size);
                    double avgTime = testerObj.getAvg(); // 20 iterations
                    writer.printf("Sorted %d elements in %.2f ms (avg)%n", size, avgTime);
                }
                writer.println();
            }
            System.out.println("Performance report generated: performance_report.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (PrintWriter writer2 = new PrintWriter(new FileWriter("performance_report_KsortVer.txt"))) {
            for (SortingAlgorithm algorithm : algorithms) {
                writer2.println("Sorting algorithm – KSorted" + algorithm.getClass().getSimpleName());

                for (int size : sizes) {
                    testerObj = new Tester(algorithm); // Use algorithm directly
                    testerObj.testKSorted(20,size);
                    double avgTime = testerObj.getAvg(); // 20 iterations
                    writer2.printf("Sorted %d elements in %.2f ms (avg)%n", size, avgTime);
                }
                writer2.println();
            }
            System.out.println("Performance report generated: performance_report_KsortVert.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

