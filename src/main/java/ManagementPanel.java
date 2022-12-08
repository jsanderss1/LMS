import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagementPanel extends JFrame {
    private JPanel secPanel;
    private JScrollPane scrollPanel;
    private JTable bookTable;
    private JTextField timeTextField;
    private JTextField searchTextField;
    private JButton deleteButton;
    private JComboBox sortComboBox;
    private JButton searchButton;
    private JButton exitButton;
    private JButton editButton;
    private JButton addButton;
    private JPanel mainPanel;

    public ManagementPanel() {
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        setContentPane(mainPanel);
        setTitle("Management System");
        setSize(700,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createUIComponents() {
        Object[] cols = {"ID", "Title", "AuthorID", "Year", "PublisherID", "Subject"};
        bookTable = new JTable(new DefaultTableModel(cols, 0));
        scrollPanel = new JScrollPane(bookTable);
    }

   /* public static void main(String[] args) {
        ManagementPanel mainForm = new ManagementPanel();
    }*/
}
