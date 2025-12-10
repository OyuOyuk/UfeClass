import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class SimpleNotebook extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem;
    public SimpleNotebook() {
        setTitle("Simple Notebook");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");

        newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(this);
        fileMenu.add(newMenuItem);

        openMenuItem = new JMenuItem("Open");
        openMenuItem.addActionListener(this);
        fileMenu.add(openMenuItem);

        saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(this);
        fileMenu.add(saveMenuItem);

        exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(this);
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newMenuItem) {
            textArea.setText("");
        }else if (e.getSource() == openMenuItem) {
            JFileChooser fileChooser = new JFileChooser();
            int returnVal = fileChooser.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
                    String line;
                    while ((line = reader.readLine()) != null){
                        textArea.append(line + "\n");
                    }
                    reader.close();
                }catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }else if (e.getSource() == saveMenuItem) {
            JFileChooser fileChooser = new JFileChooser();
            int returnVal = fileChooser.showSaveDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile));
                    writer.write(textArea.getText());
                    writer.close();
                }catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
public void main(String[] args) {
    new SimpleNotebook();
}
