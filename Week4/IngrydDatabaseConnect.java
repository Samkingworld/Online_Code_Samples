package Online_Code_Samples.Week4;

import java.sql.*;
import java.time.LocalDate;

public class IngrydDatabaseConnect {
    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ingryd", "root", "Ol@mide007");
            Statement statement = connection.createStatement()){

            statement.execute("CREATE TABLE IF NOT EXISTS student(studentName varchar(255), regNo Integer, department TEXT, enrollmentYear TEXT)");

//            statement.execute("INSERT INTO student(studentName, regNo, department, enrollmentYear) VALUES('John Wick', 1004, 'Java Dep', '2003')");
//            statement.execute("INSERT INTO student(studentName, regNo, department, enrollmentYear) VALUES('Mike Pence', 1001, 'Java Dep', '2003')");
//            statement.execute("INSERT INTO student(studentName, regNo, department, enrollmentYear) VALUES('Will Smith', 1007, 'Java Dep', '2003')");
//            statement.execute("INSERT INTO student(studentName, regNo, department, enrollmentYear) VALUES('Benz', 1009, 'Java Dep', '2003')");

            boolean ins = insert("MusaBaa", 1045, "Java Dev", "2020");
            System.out.println(ins);
            System.out.println(statement.getUpdateCount());
            System.out.println();
            LocalDate date = LocalDate.now();
            System.out.println(date.getYear() );

            statement.execute("DELETE FROM student WHERE regNo=1009");
            System.out.println(statement.getUpdateCount());

            statement.execute("UPDATE student set enrollmentYear=2022 WHERE regNo=1007");
            System.out.println(statement.getUpdateCount());

            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

            while(resultSet.next()){
                String studentName = resultSet.getString(1);
                int regNo = Integer.parseInt(resultSet.getString(2));
                String department = resultSet.getString(3);
                int dateValue = date.getYear();
                int numberOfEnrolledYears = dateValue - Integer.parseInt(resultSet.getString(4));
                System.out.printf("Name: %s, Reg. No: %d, Dept: %s, Years Enrolled: %d\n", studentName, regNo, department, numberOfEnrolledYears);
            }

            resultSet.close();

        } catch(SQLException exception){
            System.out.println(exception.getMessage());
        }
    }

    public static boolean insert(String name, int reg, String dept, String year){
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ingryd", "root", "Ol@mide007");
            Statement statement = connection.createStatement()){

            statement.execute("INSERT INTO student(studentName, regNo, department, enrollmentYear)" +
                    "VALUES(\"" + name + "\"," + reg + ",\"" + dept + "\"," + "\"" + year + "\")");

            return true;

        } catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }

    }
}





/*
Create a table of Users called user_db in your ingryd database
    Table name: user_db
    Fields: name Text, location Text, phoneNumber Integer, dateEnrolled Date

    Methods:
    insert user object in a user_db
    update user object
    delete user object
 */





















