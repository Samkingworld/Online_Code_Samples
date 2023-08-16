package Online_Code_Samples.Week4;

import OffLine.ConnectionDetails;
import OffLine.thread.ThreadColor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManipulation {

    private final String TABLE_NAME = "registered_users";

    private String getTABLE_NAME() {
        return TABLE_NAME;
    }

    private Connection connection;

    public boolean createTable(String tableName, String name, String age, String location, String techSkill) {
        connection = connectDatabase();
        tableName = getTABLE_NAME();
        String query = String.format("CREATE TABLE IF NOT EXISTS %s (%s Text, %s integer, %s Text, %s Text)", tableName, name, age, location, techSkill);
        try {
            assert connection != null;
            Statement statement = connection.createStatement();
            statement.execute(query);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            if (connection != null) {
                try {
                    closeDatabase();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    private Connection connectDatabase() {
        ConnectionDetails connectionDetails = new ConnectionDetails();
        try {
            connection = DriverManager.getConnection(connectionDetails.getDB_URL(),
                    connectionDetails.getUSERNAME(), connectionDetails.getPASSWORD());
            return connection;
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }

    private void closeDatabase() {

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public boolean updateRecord(String name, int age) {
        Connection connection = connectDatabase();
        try {
            assert connection != null;
            Statement statement = connection.createStatement();
            String update = String.format("UPDATE %s SET age=%d WHERE name=%s", getTABLE_NAME(), age, name);
            statement.execute(update);
            return true;
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public boolean updateRecord(String name, int age, String techSkill) {
        Connection connection = connectDatabase();
        try {
            assert connection != null;
            Statement statement = connection.createStatement();
            String update = String.format("UPDATE %s SET age=%d, techSkill=%s WHERE name=%s", getTABLE_NAME(), age, techSkill, name);
            statement.execute(update);
            return true;
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public boolean updateRecord(String name, int age, String techSkill, String location) {
        Connection connection = connectDatabase();
        try {
            assert connection != null;
            Statement statement = connection.createStatement();
            String update = String.format("UPDATE %s SET age=%d, teck_skill='%s', location='%s' WHERE name='%s'", getTABLE_NAME(), age, techSkill, location, name);
            if (statement.execute(update))
                return true;
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
        return false;
    }

    public boolean deleteRecord(String name) {
        Connection connection = connectDatabase();
        assert connection != null;
        try (Statement statement = connection.createStatement()) {
            String query = String.format("DELETE FROM %s WHERE name='%s'", getTABLE_NAME(), name);
            statement.execute(query);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean insertRecord(String name, int age, String location, String techSkill) {
        Connection connection = connectDatabase();
        assert connection != null;
        try (Statement statement = connection.createStatement()) {
            String query = String.format("INSERT INTO %s (name, age, location, teck_skill) VALUES('%s', %d, '%s', '%s')", getTABLE_NAME(), name, age, location, techSkill);
            statement.execute(query);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


    public boolean transferFile(File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
             Connection connection = connectDatabase()) {
            String readLine;
            while ((readLine = bufferedReader.readLine()) != null) {
                String[] parts = readLine.substring(0, readLine.lastIndexOf('#')).split(",");
                insertRecord(parts[0].trim(), Integer.parseInt(parts[1].trim()), parts[2].trim(), parts[3].trim());

            }
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


    public static void main(String[] args) {

        File file = new File("C:\\Users\\Davidson Adepoju\\Desktop\\Projects\\Ingryd Codes Sample\\src\\Online_Code_Samples\\Week4\\assignment.txt");
        DatabaseManipulation manipulation = new DatabaseManipulation();

//        boolean createTable = manipulation.createTable(manipulation.getTABLE_NAME(), "name", "age", "location", "teck_skill");
//        System.out.println(createTable);
//        boolean transfer = manipulation.transferFile(file);
//        System.out.println(transfer);

//        boolean delete = manipulation.deleteRecord("Doris You");
//        System.out.println(delete);

        boolean update = manipulation.updateRecord("Mike Poo", 47, "Web 3" , "Abidjan");
        if(update)
        System.out.println(String.valueOf(true) + ThreadColor.ANSI_GREEN);
        else
            System.out.println(String.valueOf(false) + ThreadColor.ANSI_RED);
    }


}
