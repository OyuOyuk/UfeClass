import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Border Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("NORTH");
        JButton button2 = new JButton("SOUTH");
        JButton button3 = new JButton("EAST");
        JButton button4 = new JButton("WEST");
        JButton button5 = new JButton("CENTER");

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(button, BorderLayout.NORTH);
        panel.add(button2, BorderLayout.SOUTH);
        panel.add(button3, BorderLayout.EAST);
        panel.add(button4, BorderLayout.WEST);
        panel.add(button5, BorderLayout.CENTER);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
