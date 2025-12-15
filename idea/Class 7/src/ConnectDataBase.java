import java.sql.*;

public class ConnectDataBase {
    public ConnectDataBase(){
        Connection connection;
        String connectionUrl = "jdbc:postgresql://localhost:5432/postgres";

        String username = "postgres";
        String password = "12345678";

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
    public static void main(String[] args) {
        new ConnectDataBase();
    }
}
