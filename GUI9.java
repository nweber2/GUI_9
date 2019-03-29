/*
 * GUI9 is like GUI8 except that the "stub functionality" is replaced by real 
 */
package gui;

import frames.KFrame9;
import javax.swing.SwingUtilities;

/**
 *
 * @author nicho
 */
public class GUI9 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ThreadForGUI());
    }

    private static class ThreadForGUI implements Runnable {

        public void run() {
            GUI9 gui = new GUI9();
        }
    }

    public GUI9() {
        KFrame9 frame = new KFrame9("GUI 9");
    }
}
