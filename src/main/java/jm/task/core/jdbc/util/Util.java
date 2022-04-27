package jm.task.core.jdbc.util;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class Util {
    private String sqlUrl = "jdbc:mysql://localhost:3306/kataschema";
    private String sqlUser = "root";
    private String sqlPassword = "12345zZ!";

    {
        try (Connection connection = DriverManager.getConnection(sqlUrl, sqlUser, sqlPassword)) {
            System.out.println("Соединение с MySQL успешно");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}