package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo {
    public static void main(String[] args) {

        Connection conn = null;
        String rollno = "05";
        String name = "Shera";
        String age = "48";
        String query = "INSERT INTO student VALUES (?,?,?)";
        String selectQuery = "SELECT * FROM student";
        try {
            // load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // url
            String url = "jdbc:mysql://localhost:3306/test";
            // user
            String user = "root";
            // password
            String password = "Admin123";

            // create the connection
            conn = DriverManager.getConnection(url, user, password);

            // execute the query with the help of prepared statement
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setString(1, rollno);
            psmt.setString(2, name);
            psmt.setString(3, age);
            psmt.executeUpdate();

            System.out.println("Query executed successfully..");

            PreparedStatement selectStmt = conn.prepareStatement(selectQuery);
            ResultSet rs = selectStmt.executeQuery();
            while (rs.next()) {
                String resultRoll = rs.getString("rollno");
                String resultName = rs.getString("name");
                String resultAge = rs.getString("age");
                System.out
                        .println("Roll No: " + resultRoll + "\t" + "Name: " + resultName + "\t" + "Age: " + resultAge);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
