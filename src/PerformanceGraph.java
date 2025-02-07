
import javax.swing.*;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.awt.*;

// Source Code: https://www.codejava.net/java-se/graphics/using-jfreechart-to-draw-xy-line-chart-with-xydataset
public class PerformanceGraph extends JFrame{
    public PerformanceGraph() {
        super("XY Line Chart Example with JFreechart");

        JPanel chartPanel = createChartPanel();
        add(chartPanel, BorderLayout.CENTER);

        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private JPanel createChartPanel() {
        String chartTitle = "Algorithms Performance Comparison K-Sorted Version";
       // String chartTitle2 = "Algorithms Performance Comparison K-Sorted Version";

        String xAxisLabel = "Size";
        String yAxisLabel = "Average Time";

        XYDataset dataset = createDataset();

        JFreeChart chart = ChartFactory.createXYLineChart(chartTitle,
                xAxisLabel, yAxisLabel, dataset);

        return new ChartPanel(chart);
    }

    private XYDataset createDataset() {
        int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeriesCollection dataset2 = new XYSeriesCollection();

        XYSeries BSort = new XYSeries("Bubble Sort");
        XYSeries ISort = new XYSeries("Insertion Sort");
        XYSeries MSort = new XYSeries("Merge Sort");
        XYSeries SSort1 = new XYSeries("Selection Sort");
        XYSeries QSort = new XYSeries("Quick Sort");
        XYSeries SSort2 = new XYSeries("Shell Sort");

        XYSeries BSortKVer = new XYSeries("Bubble Sort-KVer");
        XYSeries ISortKVer = new XYSeries("Insertion Sort-KVer");
        XYSeries MSortKVer = new XYSeries("Merge Sort-KVer");
        XYSeries SSort1KVer = new XYSeries("Selection Sort-KVer");
        XYSeries QSortKVer = new XYSeries("Quick Sort-KVer");
        XYSeries SSort2KVer = new XYSeries("Shell Sort-KVer");

        //plug-in data points for Bubble Sort
        for (int size : sizes) {
           BSort.add(size, new Tester(new BubbleSortClass()).test(20, size));
        }
        //plug-in data points for Insertion Sort
        for (int size : sizes) {
            ISort.add(size, new Tester(new InsertionSortClass()).test(20, size));
        }
        //plug-in data points for Merge Sort
        for (int size : sizes) {
            MSort.add(size, new Tester(new MergeSortClass()).test(20, size));
        }

        //plug-in data points for Selection Sort
        for (int size : sizes) {
            SSort1.add(size, new Tester(new SelectionSortClass()).test(20, size));
        }

        //plug-in data points for Quick Sort
        for (int size : sizes) {
            QSort.add(size, new Tester(new QuickSortClass()).test(20, size));
        }

        //plug-in data points for Shell Sort
        for (int size : sizes) {
            SSort2.add(size, new Tester(new ShellSortClass()).test(20, size));
        }

        dataset.addSeries(BSort);
        dataset.addSeries(ISort);
        dataset.addSeries(MSort);
        dataset.addSeries(SSort1);
        dataset.addSeries(SSort2);
        dataset.addSeries(QSort);

    //KVersion Graph plots
        for (int size : sizes) {
            BSortKVer.add(size, new Tester(new BubbleSortClass()).testKSorted(20, size));
        }
        //plug-in data points for Insertion Sort
        for (int size : sizes) {
            ISortKVer.add(size, new Tester(new InsertionSortClass()).testKSorted(20, size));
        }
        //plug-in data points for Merge Sort
        for (int size : sizes) {
            MSortKVer.add(size, new Tester(new MergeSortClass()).testKSorted(20, size));
        }

        //plug-in data points for Selection Sort
        for (int size : sizes) {
            SSort1KVer.add(size, new Tester(new SelectionSortClass()).testKSorted(20, size));
        }

        //plug-in data points for Quick Sort
        for (int size : sizes) {
            QSortKVer.add(size, new Tester(new QuickSortClass()).testKSorted(20, size));
        }

        //plug-in data points for Shell Sort
        for (int size : sizes) {
            SSort2KVer.add(size, new Tester(new ShellSortClass()).test(20, size));
        }

        dataset2.addSeries(BSortKVer);
        dataset2.addSeries(ISortKVer);
        dataset2.addSeries(MSortKVer);
        dataset2.addSeries(SSort1KVer);
        dataset2.addSeries(SSort2KVer);
        dataset2.addSeries(QSortKVer);

    //Return one or another to get each graph.
        return dataset2;

        //return data;

    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PerformanceGraph().setVisible(true);
            }
        });
    }
}
