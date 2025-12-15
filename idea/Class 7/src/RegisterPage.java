import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class RegisterPage {

    private JFrame frame;

    private JPanel loginPanel;

    private JTextField usernamef;
    private JPasswordField passwordf;
    private JButton loginButton;
    private JButton goToRegister;

    private JPanel registerPanel;

    private JTextField email;
    private JTextField password2;
    private JTextField username2;
    private JButton registerButton;
    private JButton goToLogin;

    private JPanel StuffPanel;

    public  RegisterPage() {

        Connection connection;
        String connectionUrl = "jdbc:postgresql://localhost:5432/postgres";

        String username = "postgres";
        String password = "12345678";


        frame = new JFrame("Register Page");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        CardLayout layout = new CardLayout();
        frame.setLayout(layout);
        loginPanel = new JPanel();
        loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));

        Dimension fieldSize = new Dimension(500, 30);

        usernamef = new JTextField();
        usernamef.setMaximumSize(fieldSize);

        passwordf = new JPasswordField();
        passwordf.setMaximumSize(fieldSize);

        email = new JTextField();
        password2 = new JPasswordField();
        username2 = new JTextField();

        registerButton = new JButton("Register");
        loginButton = new JButton("Login");
        goToLogin = new JButton("Go To Login");
        goToLogin.addActionListener(e -> layout.show(frame.getContentPane(), "login") );
        goToRegister = new JButton("Go To Register");
        goToRegister.addActionListener(e -> layout.show(frame.getContentPane(), "register") );
        loginPanel.add(new JLabel("Username:"));
        loginPanel.add(usernamef);

        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(passwordf);


        loginPanel.add(loginButton);
        loginPanel.add(goToRegister);

        StuffPanel = new JPanel();
        registerPanel = new JPanel();

        registerPanel.setLayout(new BoxLayout(registerPanel, BoxLayout.Y_AXIS));
        email.setMaximumSize(fieldSize);
        registerPanel.add(new JLabel("Email:"));
        registerPanel.add(email);
        username2.setMaximumSize(fieldSize);
        registerPanel.add(new JLabel("Username:"));
        registerPanel.add(username2);
        password2.setMaximumSize(fieldSize);
        registerPanel.add(new JLabel("Password:"));
        registerPanel.add(password2);
        registerButton.addActionListener(e -> layout.show(frame.getContentPane(), "register") );
        goToLogin.addActionListener(e -> layout.show(frame.getContentPane(), "login") );
        registerPanel.add(registerButton);
        registerPanel.add(goToLogin);


        frame.add(loginPanel, "login");
        frame.add(registerPanel, "register");
        frame.add(StuffPanel, "stuff");
        frame.setVisible(true);

    }
    private void register(Connection connection, String connectionUrl, String username, String password) {
        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(connectionUrl,username,password);


            if (connection != null) {
                System.out.println("Connected to database successfully");
                Statement statement = connection.createStatement();
                statement.executeUpdate("CREATE TABLE testtable(id int primary key, name varchar(25), address text)");
                statement.close();
                String insertQuery = "INSERT INTO testtable VALUES(?,?,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
                preparedStatement.setInt(1, 1);
                preparedStatement.setString(2, "test");
                preparedStatement.setString(3, "test");
                System.out.println(preparedStatement);
                preparedStatement.executeUpdate();

                preparedStatement.close();
                connection.close()
                ;
            }else{
                System.out.println("Failed to connect to database");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    static void main(String[] args){
        new RegisterPage();
    }
}
