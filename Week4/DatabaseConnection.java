package Online_Code_Samples.Week4;

import java.sql.*;

public class DatabaseConnection {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users_db", "root", "Ol@mide007");
             Statement statement = connection.createStatement()) {

            String st = "CREATE TABLE IF NOT EXISTS user_details(name TEXT, username TEXT, password TEXT, access TEXT)";
            statement.execute(st);
            statement.execute("INSERT INTO user_details(name, username, password, access) " +
                    "VALUES('Adepoju Akinade', 'davidson', 'davidson', 'Admin User')" );
            try{
                ResultSet resultSet = statement.executeQuery("SELECT * from users.user_details");

                while( resultSet.next() ){
                    String name = resultSet.getString("name");
                    String username = resultSet.getString("username");
                    String access = resultSet.getString("access");

                    System.out.printf("Name: %s, Username: %s, Access: %s%n", name, username, access);
                }


                resultSet.close();

            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        } catch (SQLException e) {
            System.out.println("Unable to create Database " + e.getMessage());
        }


    }
}
