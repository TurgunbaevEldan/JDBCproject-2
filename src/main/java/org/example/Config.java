package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    private final static String url = "jdbc:postgresql://localhost:5432/movieTask";
    private final static String userName = "postgres";
    private final static String password = "1234";


    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection= DriverManager.getConnection(url, userName, password);
            System.out.println("Connection to database");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}

