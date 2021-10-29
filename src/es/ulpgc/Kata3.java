package es.ulpgc;

import java.util.HashMap;

public class Kata3 {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Histogram<String> histogram = new Histogram<>();
                histogram.increment("gmail.com");
                histogram.increment("gmail.com");
                histogram.increment("gmail.com");
                histogram.increment("gmail.com");
                histogram.increment("gmail.com");
                histogram.increment("gmail.com");
                histogram.increment("gmail.com");
                histogram.increment("wp.pl");
                histogram.increment("wp.pl");
                histogram.increment("wp.pl");
                histogram.increment("wp.pl");
                histogram.increment("wp.pl");
                histogram.increment("ulpgc.es");
                histogram.increment("ulpgc.es");
                histogram.increment("ulpgc.es");
                histogram.increment("ulpgc.es");
                histogram.increment("ulpgc.es");
                histogram.increment("ulpgc.es");
                histogram.increment("ulpgc.es");
                histogram.increment("ulpgc.es");
                histogram.increment("ulpgc.es");
                histogram.increment("pw.pl");
                histogram.increment("pw.pl");
                histogram.increment("pw.pl");
                histogram.increment("pw.pl");
                histogram.increment("pw.pl");
                new DisplayHistogram("Histogram", histogram).execupte();
            }
        });
    }

}
