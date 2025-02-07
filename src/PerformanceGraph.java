
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
        String chartTitle = "Algorithms Performance Comparison";
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
        XYSeries BSort = new XYSeries("Bubble Sort");
        XYSeries ISort = new XYSeries("Insertion Sort");
        XYSeries MSort = new XYSeries("Merge Sort");
        XYSeries SSort1 = new XYSeries("Selection Sort");
        XYSeries QSort = new XYSeries("Quick Sort");
        XYSeries SSort2 = new XYSeries("Shell Sort");

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

        return dataset;
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
