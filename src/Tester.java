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

    public double SingleTestKSorted(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        array = generateKSorted(array);
        long timeStart = System.nanoTime();
        sortingAlgo.sorty(array);
        long timeEnd = System.nanoTime();
        return (double)(timeEnd - timeStart) / 1000000;
    }

    public double test(int iteration, int size) {
        double avgTime = 0;
        for (int i = 0; i < iteration; i++) {
            avgTime += SingleTest(size);
        }
        avgTime /= iteration;
        avg = avgTime;
        return avg;
    }

    public double testKSorted(int iteration, int size) {
        double avgTime = 0;
        for (int i = 0; i < iteration; i++) {
            avgTime += SingleTestKSorted(size);
        }
        avgTime /= iteration;
        avg = avgTime;
        return avg;
    }

    public int [] generateKSorted (int[] array) {
        int size = array.length;
        int tmp;
        for( int gap = size / 10; gap > 0; gap = 0)
            for( int i = gap; i < size; ++i ){
                tmp = array[i]; int j;
                for(j = i; j >= gap && tmp < array[j - gap]; j-=gap){
                    array[j] = array[ j - gap ];
                }
                array[j] = tmp;
            }
        return array;
    }

    public double getAvg() {
        return avg;
    }
}
