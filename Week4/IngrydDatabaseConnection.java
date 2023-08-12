package Online_Code_Samples.Week4;

import java.sql.*;

public class IngrydDatabaseConnection {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ingryd", "root", "Ol@mide007");
            statement = connection.createStatement();

            String createTable = "CREATE TABLE IF NOT EXISTS users(firstName TEXT, lastName TEXT, age Integer, password TEXT)";
            statement.execute(createTable);

            String insertInfo = "INSERT INTO users(firstName, lastName, age, password) VALUES('David', 'Doe', 23, '1234abcd')";

//            String updateInfo = "UPDATE users SET age=23 WHERE firstName='Israel'";

//            statement.execute(insertInfo);

            try{
                ResultSet resultSet = statement.executeQuery("SELECT * from users");

                while(resultSet.next()){
                    String firstName = resultSet.getString(1);
                    String lastName = resultSet.getString(2);
                    int age = Integer.parseInt(resultSet.getString(3));
                    String password = resultSet.getString("password");

                    System.out.printf("First name: %s, Last name: %s, Age: %d, Password: %s\n", firstName, lastName, age, password);

                }

            } catch (SQLException exception) {
                System.out.println(exception.getMessage());
            }
        } catch (SQLException exception){
            System.out.println(exception.getMessage());
        } finally{
            if( connection != null ){
                try{
                    connection.close();
                } catch (SQLException exception){
                    System.out.println(exception.getMessage());
                }
            }
        }

    }
}

