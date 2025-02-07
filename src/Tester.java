import java.util.Random;

public class Tester {
    SortingAlgorithm sortingAlgo;
    double avg;
    public Tester (SortingAlgorithm sa) {
        sortingAlgo = sa;
    }

    public double SingleTest(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        long timeStart = System.nanoTime();
        sortingAlgo.sorty(array);
        long timeEnd = System.nanoTime();
        return (double)(timeEnd - timeStart) / 1000000;
    }

    public void test(int iteration, int size) {
        double avgTime = 0;
        for (int i = 0; i < iteration; i++) {
            avgTime += SingleTest(size);
        }
        avgTime /= iteration;
        avg = avgTime;
        System.out.println(avgTime);
    }

    public double getAvg() {
        return avg;
    }
}
