import javax.swing.*;
public class Main {
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
                ManagementPanel panelShow= new ManagementPanel();
                panelShow.setVisible(true);
            }
        });
    }

}
