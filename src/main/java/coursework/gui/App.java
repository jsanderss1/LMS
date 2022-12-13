package coursework.gui;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class App extends JFrame {
    private JPanel mainPanel;
    private JTabbedPane tabbedPanel;
    private JPanel bookPanel;
    private JScrollPane scrollPanel;
    private JTable bookTable;
    private JTextField yearTextField;
    private JTextField subjectTextField;
    private JTextField bookTextField;
    private JTextField searchTextField;
    private JButton deleteButton;
    private JComboBox sortComboBox;
    private JButton sortButton;
    private JButton editButton;
    private JButton exitButton;
    private JButton addButton;
    private JComboBox authorComboBox;
    private JComboBox publisherComboBox;
    private JPanel authorPanel;
    private JTextField textField1;
    private JPanel publisherPanel;
    private JTextField textField2;
    private JScrollPane authorScrollPanel;
    private JTable authorTable;
    private JButton addButton1;
    private JTable publisherTable;

    public App() {


        setContentPane(mainPanel);
        setTitle("Management System");
        //setSize(700,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    private void createUIComponents() {
        Object[] cols = {"ID", "Title", "AuthorID", "Year", "PublisherID", "Subject"};
        bookTable = new JTable(new DefaultTableModel(cols, 0));
        scrollPanel = new JScrollPane(bookTable);
    }

}
