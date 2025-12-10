import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankUI {
    private JFrame loginFrame;
    private JLabel usernameLabel;
    private JTextField usernameTf;
    private JLabel passwordLabel;
    private JTextField passwordTf;
    private JButton loginButton;
    private JButton registerButton;
    private JFrame registerFrame;

    public BankUI() {
        loginFrame = new JFrame("Sum example");
        loginFrame.setSize(400, 400);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLayout(null);

        registerFrame = new JFrame("Sum example");
        registerFrame.setSize(400, 400);
        registerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registerFrame.setLayout(null);

        usernameLabel = new JLabel("Username: ");
        usernameTf = new JTextField();
        passwordLabel = new JLabel("Password: ");
        passwordTf = new JPasswordField();
        loginButton = new JButton("Login");
        registerButton = new JButton("Register");
        usernameLabel.setBounds(10, 10, 100, 30);
        passwordLabel.setBounds(10, 100, 100, 30);
        loginButton.setBounds(10, 200, 100, 30);
        registerButton.setBounds(10, 300, 100, 30);


        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (registerFrame.isVisible()){

                }else{
                    registerFrame.add(loginButton);
                    registerFrame.add(registerButton);
                    registerFrame.add(usernameLabel);
                    registerFrame.add(usernameTf);
                    registerFrame.setVisible(true);
                    loginFrame.setVisible(false);
                }


            }

        });
        loginFrame.add(usernameLabel);
        loginFrame.add(usernameTf);
        loginFrame.add(passwordLabel);
        loginFrame.add(passwordTf);
        loginFrame.add(loginButton);
        loginFrame.add(registerButton);
        loginFrame.setVisible(true);

    }
    public static void main(String[] args) {
        new BankUI();
    }
}
