package es.ulpgc;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

import javax.swing.*;
import java.awt.*;

public class DisplayHistogram extends ApplicationFrame {

    private ChartPanel jPanel;

    public DisplayHistogram(String title) {
        super(title);
        jPanel = new ChartPanel(null);
        jPanel.setPreferredSize(new Dimension(500, 400));
        setContentPane(jPanel);
        initialize();
    }

    public void execute() {
        JFreeChart chart = createChart();
        jPanel.setChart(chart);
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        pack();
    }

    private JFreeChart createChart() {
        return ChartFactory.createBarChart("Histogram JFreeChart", "Dominios email", "N* de emails", createDataset(), PlotOrientation.VERTICAL, false, false, false);
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset defaultCategoryDataset = new DefaultCategoryDataset();
        defaultCategoryDataset.addValue(10, "", "gmail.com");
        defaultCategoryDataset.addValue(1, "", "wp.pl");
        defaultCategoryDataset.addValue(5, "", "ulpgc.es");
        defaultCategoryDataset.addValue(5, "", "hotmail.com");
        defaultCategoryDataset.addValue(2, "", "pw.pl");
        return defaultCategoryDataset;
    }

}
