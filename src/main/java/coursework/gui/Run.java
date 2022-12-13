package coursework.gui;

import javax.swing.*;
public class Run {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();}
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                App panelShow = new App();
                panelShow.setVisible(true);
            }
        });
    }

}
