import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb1 = new JButton("Button1");
        JButton jb2 = new JButton("Button2");
        JButton jb3 = new JButton("Button3");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
