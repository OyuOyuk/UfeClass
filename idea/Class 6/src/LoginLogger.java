import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.time.LocalDateTime;

public class LoginLogger{

    private JTextField userField;
    private JLabel resultLabel;
    private JFrame frame;
    public LoginLogger() {
        frame = new JFrame();
        frame.setSize(300, 150);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);

        userField = new JTextField(15);
        JButton loginBtn = new JButton("Login");
        resultLabel = new JLabel(" ");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Username:"));
        panel.add(userField);
        panel.add(loginBtn);
        panel.add(resultLabel);

        frame.add(panel);

        loginBtn.addActionListener(e -> logLogin());
        frame.setVisible(true);
    }

    private void logLogin() {
        String user = userField.getText();

        try {
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("logins.txt", true));

            writer.write(user + " - " + LocalDateTime.now());
            writer.newLine();
            writer.close();

            int count = countLogins();
            resultLabel.setText("Total logins: " + count);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private int countLogins() throws IOException {
        BufferedReader reader =
                new BufferedReader(new FileReader("logins.txt"));

        int count = 0;
        while (reader.readLine() != null) {
            count++;
        }
        reader.close();
        return count;
    }

    public static void main(String[] args) {
        new LoginLogger();
    }
}
