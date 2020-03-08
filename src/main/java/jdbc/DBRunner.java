package jdbc;

import java.sql.*;

public class DBRunner {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/business";
        DBConnection dbConnection = new DBConnection(url);
        Statement statement = dbConnection.getStatement();

    }
}
