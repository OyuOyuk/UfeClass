import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class StudentUI {

    private JFrame frame;
    private JPanel cardPanel;
    private JPanel studentPanel;
    private JPanel teacherPanel;

    private JLabel studentName;
    private JLabel studentID;
    private JLabel studentGrade;
    private JLabel studentPhoto;
    private JTable scheduleTab;

    public StudentUI() {

        frame = new JFrame("Student UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());


        cardPanel = new JPanel(new CardLayout());

        studentPanel = new JPanel(new BorderLayout());

        studentName = new JLabel("Student Name:");
        studentID = new JLabel("Student ID:");
        studentGrade = new JLabel("Student Grade:");


        ImageIcon icon = new ImageIcon("images/portrait.jpg");
        Image img = icon.getImage();
        Image scaled = img.getScaledInstance(150, 200, Image.SCALE_SMOOTH);
        studentPhoto = new JLabel(new ImageIcon(scaled));


        JPanel imgPanel = new JPanel();
        imgPanel.setLayout(new BoxLayout(imgPanel, BoxLayout.Y_AXIS));
        imgPanel.setBackground(Color.GRAY);
        imgPanel.setBorder(new EmptyBorder(50, 30, 50, 30));

        Dimension dim = new Dimension(0, 30);

        imgPanel.add(studentID);
        imgPanel.add(Box.createRigidArea(dim));
        imgPanel.add(studentName);
        imgPanel.add(Box.createRigidArea(dim));
        imgPanel.add(studentPhoto);
        imgPanel.add(Box.createRigidArea(dim));
        imgPanel.add(studentGrade);

        JPanel schedulePanel = new JPanel();
        schedulePanel.setLayout(new BoxLayout(schedulePanel, BoxLayout.Y_AXIS));
        schedulePanel.setBackground(Color.LIGHT_GRAY);

        String[][] data = {
                {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"},
                {"1", "2", "3", "4", "5", "6", "7"},
                {"1", "2", "3", "4", "5", "6", "7"},
                {"1", "2", "3", "4", "5", "6", "7"},
                {"1", "2", "3", "4", "5", "6", "7"},
                {"1", "2", "3", "4", "5", "6", "7"}
        };
        String[] datacol = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        scheduleTab = new JTable(data, datacol);
        schedulePanel.add(scheduleTab);

        JButton nextButton1 = new JButton("Next");
        nextButton1.addActionListener(e -> nextCard());
        schedulePanel.setLayout(new BoxLayout(schedulePanel, BoxLayout.Y_AXIS));
        schedulePanel.add(nextButton1);

        frame.add(imgPanel, BorderLayout.WEST);
        studentPanel.add(schedulePanel, BorderLayout.CENTER);

        teacherPanel = new JPanel();
        teacherPanel.setLayout(new BoxLayout(teacherPanel, BoxLayout.Y_AXIS));

        JButton nextButton2 = new JButton("Next");
        nextButton2.addActionListener(e -> nextCard());

        teacherPanel.add(new JLabel("Teacher Panel"));
        teacherPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        teacherPanel.add(nextButton2);


        cardPanel.add(studentPanel, "student");
        cardPanel.add(teacherPanel, "teacher");

        frame.add(cardPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    private void nextCard() {
        CardLayout layout = (CardLayout) cardPanel.getLayout();
        layout.next(cardPanel);
    }

    public static void main(String[] args) {
        new StudentUI();
    }
}
