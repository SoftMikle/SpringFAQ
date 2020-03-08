package jdbc;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class DBConnection {
    private String url;
    private Connection connection;
    private Statement statement;

    public DBConnection(String url) {
        this.url = url;
    }

    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(url, "root", "1qaz2wsx");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public Statement getStatement(){
        try {
            statement = getConnection().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }

}
