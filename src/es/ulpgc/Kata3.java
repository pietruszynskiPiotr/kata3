package es.ulpgc;

public class Kata3 {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayHistogram("Histogram").execute();
            }
        });
    }

}
