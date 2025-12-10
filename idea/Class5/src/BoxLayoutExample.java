import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BoxLayoutExample {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        BoxLayout layout = new BoxLayout(panel, BoxLayout.X_AXIS);

        panel.setLayout(layout);
        panel.setBorder(new EmptyBorder(new Insets(50, 80, 50, 80)));

        JButton jb1 = new JButton("Button");
        JButton jb2 = new JButton("Button");
        JButton jb3 = new JButton("Button");

        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }
}
